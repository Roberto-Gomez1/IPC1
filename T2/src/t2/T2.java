package t2;

import java.util.*;
import java.io.*;
import t2.Objetos.Alimentos;
import t2.Objetos.Entrenadores;
import t2.Objetos.Pokemon;
import t2.Objetos.Pokeballs;
import t2.Objetos.Gimnasios;

public class T2 {

    static Scanner sc = new Scanner(System.in);
    static String ruta, ruta1, ruta2, ruta3, ruta4;

    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        int op = 0;
        do {
            System.out.println("================Bienvenido al programa===================");
            System.out.println("||\t\tIngrese su opcion\t               ||");
            System.out.println("||\t\t1. Cargar Pokémons\t               ||");
            System.out.println("||\t\t2. Cargar Entrenadores\t               ||");
            System.out.println("||\t\t3. Poké Ball\t\t\t       ||");
            System.out.println("||\t\t4. Gimnasios\t\t\t       ||");
            System.out.println("||\t\t5. Alimentos\t\t\t       ||");
            System.out.println("||\t\t6. Asignar Pokémons\t               ||");
            System.out.println("||\t\t7. Asignar Poké Ball\t               ||");
            System.out.println("||\t\t8. Asignar Actividad de comida\t       ||");
            System.out.println("||\t\t9. Asignar Actividad de pelea\t       ||");
            System.out.println("||\t\t10. Generar reportes\t               ||");
            System.out.println("||\t\t11. Salir\t\t\t       ||");
            System.out.println("=========================================================");
            try {
                sc = new Scanner(System.in);
                op = sc.nextInt();
                switch (op) {
                    case 1:
                        //System.out.println("Ingrese la ruta de los Pokémons");
                        //ruta = sc.nextLine();
                        carpok();
                        break;
                    case 2:
                        //System.out.println("Ingrese la ruta de los Entrenadores");
                        //ruta1 = sc.nextLine();
                        entrenadores();
                        break;
                    case 3:
                        //System.out.println("Ingrese la ruta de las Poké Ball");
                        //ruta2 = sc.nextLine();
                        pokeballs();
                        break;
                    case 4:
                        //System.out.println("Ingrese la ruta de los Gimnasios");
                        //ruta3 = sc.nextLine();
                        gimnasios();
                        break;
                    case 5:
                        //System.out.println("Ingrese la ruta de los Alimentos");
                       // ruta4 = sc.nextLine();
                        alimentos();
                        break;
                    case 6:
                        asignarP();
                        break;
                    case 7:
                        asignarPb();
                        break;
                    case 8:
                        asignarA();
                        
                        break;
                    case 9:
                        break;
                    case 10:
                        break;
                    case 11:
                        System.out.println("Gracias por preferirnos");
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Ingrese una opcion valida");

                }
            } catch (Exception e) {

            }

        } while (op != 11);

    }

    static int rowsPokemons, columnsPokemons;
    static Pokemon[] pokemon = new Pokemon[150];
    public static void carpok() {
        int id;
        String tipo;
        String nombre;
        double vida;
        double puntosda;
        boolean capturado;
        boolean estado;
        String aux, aux1;
        String a, b;

        try {
            //File csv = new File(ruta);
            File csv = new File("Pokemon.csv");
            Scanner sc = new Scanner(csv);
            String data = "";
            while (sc.hasNextLine()) {
                data += sc.nextLine() + "\n";
            }
            String rows[] = data.split("\n");
            rowsPokemons = rows.length;

            String columns[] = rows[0].split(",");
            columnsPokemons = columns.length;

            for (int i = 1; i < rowsPokemons; i++) {
                columns = rows[i].split(",");

                id = Integer.parseInt(columns[0]);
                tipo = columns[1];
                nombre = columns[2];
                vida = Double.parseDouble(columns[3]);
                puntosda = Double.parseDouble(columns[4]);
                aux = columns[5].toLowerCase();
                if (aux.equals("capturado")) {
                    capturado = true;
                } else {
                    capturado = false;
                }

                aux1 = columns[6].toLowerCase();
                if (aux1.equals("vivo")) {
                    estado = true;
                } else {
                    estado = false;
                }
                pokemon[i - 1] = new Pokemon(id, tipo, nombre, vida, puntosda, capturado, estado,0);
            }

            System.out.println("\nFueron ingresados: " + (rowsPokemons - 1) + " pokémons.");

            for (int i = 0; i < rowsPokemons - 1; i++) {
                if (String.valueOf(pokemon[i].isCapturado()).equals("true")) {
                    a = "Capturado";

                } else {
                    a = "Salvaje";
                }

                if (String.valueOf(pokemon[i].isEstado()).equals("true")) {
                    b = "Vivo";

                } else {
                    b = "Muerto";
                }
                System.out.print(String.valueOf(pokemon[i].getId_pokemon()) + "," + String.valueOf(pokemon[i].getTipo()) + "," + String.valueOf(pokemon[i].getNombre()) + "," + String.valueOf(pokemon[i].getVida()) + "," + String.valueOf(pokemon[i].getPuntosda()) + "," + a + "," + b + "\n");
                //System.out.println("Tipo: "+String.valueOf(pokemon[i].getTipo()));
                //System.out.println("Nombre: "+String.valueOf(pokemon[i].getNombre()));
                //System.out.println("Vida: "+String.valueOf(pokemon[i].getVida()));
                //System.out.println("Puntos de ataque: "+String.valueOf(pokemon[i].getPuntosda()));
                //System.out.println("Capturado: "+String.valueOf(pokemon[i].isCapturado()));
                //System.out.println("Estado: "+String.valueOf(pokemon[i].isEstado()) + "\n");
            }
        } catch (Exception e) {
            System.out.println("error " + e);
        }

    }

    static int rowsEntrenador, columnsEntrenador;
    static Entrenadores[] entrenadores = new Entrenadores[25];
    public static void entrenadores() {
        int id_entrenador;
        String entrenador;
        try {
            // File csv = new File(ruta);
            File csv = new File("Entrenadores.csv");
            Scanner sc = new Scanner(csv);
            String data = "";
            while (sc.hasNextLine()) {
                data += sc.nextLine() + "\n";
            }

            String rows[] = data.split("\n");
            rowsEntrenador = rows.length;

            String columns[] = rows[0].split(",");
            columnsEntrenador = columns.length;
            System.out.println("\nFueron ingresados: " + (rowsEntrenador - 1) + " entrenadores.");
            for (int i = 1; i < rowsEntrenador; i++) {
                columns = rows[i].split(",");

                id_entrenador = Integer.parseInt(columns[0]);
                entrenador = columns[1];

                entrenadores[i - 1] = new Entrenadores(id_entrenador, entrenador,0,0,0,0,0);
            }

            for (int i = 0; i < rowsEntrenador - 1; i++) {
                System.out.println(String.valueOf(entrenadores[i].getId_entrenador()) + "," + String.valueOf(entrenadores[i].getEntrenador()));
            }
        } catch (Exception e) {
            System.out.println("Prueba " + e);
        }
    }

    static int rowsPokeballs, columnsPokeballs;
    static Pokeballs[] pokeballs = new Pokeballs[150];
    public static void pokeballs() {
        int id_pb;
        String pokeball;
        try {
            // File csv = new File(ruta);
            File csv = new File("Pokeballs.csv");
            Scanner sc = new Scanner(csv);
            String data = "";
            while (sc.hasNextLine()) {
                data += sc.nextLine() + "\n";
            }

            String rows[] = data.split("\n");
            rowsPokeballs = rows.length;

            String columns[] = rows[0].split(",");
            columnsPokeballs = columns.length;

            System.out.println("\nFueron ingresados: " + (rowsPokeballs - 1) + " pokeballs.");
            for (int i = 1; i < rowsPokeballs; i++) {
                columns = rows[i].split(",");

                id_pb = Integer.parseInt(columns[0]);
                pokeball = columns[1];

                pokeballs[i - 1] = new Pokeballs(id_pb, pokeball);
            }

            for (int i = 0; i < rowsPokeballs - 1; i++) {
                System.out.println(String.valueOf(pokeballs[i].getId_pb()) + "," + String.valueOf(pokeballs[i].getPokeball()));

            }

        } catch (Exception e) {

        }
    }
    
    static int rowsGimnasio, columnsGimnasio;
    static Gimnasios[] gimnasios = new Gimnasios[25];
    public static void gimnasios() {
        int id_g;
        String Gimnasios;

        try {
            File csv = new File("pruebaGimnasios.txt");
            Scanner sc = new Scanner(csv);
            String data = "";

            while (sc.hasNextLine()) {
                data += sc.nextLine() + "\n";
            }
        
            String rows[] = data.split("\n");
            rowsGimnasio = rows.length;

            String columns[] = rows[0].split(",");
            columnsGimnasio = columns.length;
            System.out.println("\nFueron ingresados: " + (rowsGimnasio - 1) + " Gimnasios.");
            for (int i = 1; i < rowsGimnasio; i++) {
                columns = rows[i].split(",");

                id_g = Integer.parseInt(columns[0]);
                Gimnasios = columns[1];

                gimnasios[i - 1] = new Gimnasios(id_g, Gimnasios);
            }
            for (int i = 0; i < rowsGimnasio; i++) {
                System.out.println(String.valueOf(gimnasios[i].getId_g()) + "," + String.valueOf(gimnasios[i].getGimnasios()));
            }

        } catch (Exception e) {

        }
    }

    static int rowsAlimentos, columnsAlimentos;
    static Alimentos[] alimentos = new Alimentos[15];
    public static void alimentos() {
        int id_ali;
        String nombre;
        double Vida;
        
        try{
            File csv = new File("Alimento.csv");
             Scanner sc = new Scanner(csv);
             String data ="";
             
             while(sc.hasNextLine()){
                 data+=sc.nextLine() +"\n";
             }
             String rows[] = data.split("\n");
             rowsAlimentos = rows.length;
             
             String columns[] = rows[0].split(",");
             columnsAlimentos = columns.length;
               
             System.out.println("");
      
            for (int i = 1; i < rowsAlimentos; i++) {
                columns = rows[i].split(",");

                id_ali = Integer.parseInt(columns[0]);
                nombre = columns[1];
                Vida = Double.parseDouble(columns[2]);
                
                alimentos[i-1] = new Alimentos(id_ali,nombre,Vida,0,0,0,0,0);
            }
            
            for (int i = 0; i < rowsAlimentos; i++) {
                System.out.println(String.valueOf(alimentos[i].getId_ali())+","+String.valueOf(alimentos[i].getNombre())+","+String.valueOf(alimentos[i].getVida()));
            }
        }catch(Exception e){
            
        }
    }
    
    static int rowsAsignar, columnsAsignar;
    public static void asignarP(){
        int asignarpokeball, asignarpokemon;
        int aux = 0;
        int aux1 = 0;
        int contador = 0;
        try {
            //File csv = new File(ruta);
            File csv = new File("AsignacionPokemon.csv");
            Scanner sc = new Scanner(csv);
            String data = "";
            while (sc.hasNextLine()) {
                data += sc.nextLine() + "\n";
            }
            String rows[] = data.split("\n");
            rowsAsignar = rows.length;
            
            String columns[] = rows[0].split(",");
            columnsAsignar = columns.length;
            
            for (int i = 1; i < rowsAsignar; i++) {
                aux = 0;
                aux1 = 0;
                columns = rows[i].split(",");

                asignarpokeball = Integer.parseInt(columns[0]);
                asignarpokemon = Integer.parseInt(columns[1]);

                for (int j = 1; j < rowsPokemons; j++) {

                    if (pokemon[j-1].getId_pokemon() == asignarpokemon) {
                        aux = 1;
                        contador = j-1;
                        break;
                    }

                }

                for (int j = 1; j < rowsPokeballs; j++) {
                    if (pokeballs[j-1].getId_pb() == asignarpokeball) {
                        aux1 = 1;
                        break;
                    }
                }
                
                if (aux == 1 && aux1 == 1) {
                    pokemon[contador].setId_pokeball(asignarpokeball);
                }
            }
            for (int i = 0; i < rowsPokemons; i++) {
                System.out.println("Pokeball "+pokemon[i].getId_pokeball()+", Pokemon: "+pokemon[i].getId_pokemon());
            }

        } catch (Exception e) {

        }
    }
    
    static int rowsAsignarPb,columnsAsignarPb;
    public static void asignarPb() {
        int asignarE, asignarPb;
        int aux = 0;
        int aux1 = 0;
        int contador = 0;
        int cubo=-1;
        try {
            //File csv = new File(ruta);
            File csv = new File("AsignacionPokeball.csv");
            Scanner sc = new Scanner(csv);
            String data = "";

            while (sc.hasNextLine()) {
                data += sc.nextLine() + "\n";
            }

            String rows[] = data.split("\n");
            rowsAsignarPb = rows.length;

            String columns[] = rows[0].split(",");
            columnsAsignarPb = columns.length;

            for (int i = 1; i < rowsAsignarPb; i++) {
                aux = 0;
                aux1 = 0;
                columns = rows[i].split(",");

                asignarE = Integer.parseInt(columns[0]);
                asignarPb = Integer.parseInt(columns[1]);
                
                
                for (int j = 1; j < rowsEntrenador; j++) {
                    if (entrenadores[j - 1].getId_entrenador() == asignarE) {
                        aux1 = 1;
                        if ((contador != j - 1) && j-1!=0) {
                            cubo = -1;
                        }
                        contador = j - 1;
                        break;
                    }
                }
                for (int j = 1; j < rowsPokeballs; j++) {
                    if (pokeballs[j - 1].getId_pb() == asignarPb) {
                        aux = 1;
                        cubo++;
                        break;
                    }
                }
                

                if (aux == 1 && aux1==1){
                    if(cubo==0){
                    entrenadores[contador].setId_pb(asignarPb);
                }
                    if(cubo==1){
                    entrenadores[contador].setId_pb1(asignarPb);
                }
                    if(cubo==2){
                    entrenadores[contador].setId_pb2(asignarPb);
                }
                    if(cubo==3){
                    entrenadores[contador].setId_pb3(asignarPb);
                }
                    if(cubo==4){
                    entrenadores[contador].setId_pb4(asignarPb);
                }
                }
                
            }
            for (int i = 0; i < rowsEntrenador; i++) {
                System.out.println("Entrenador: "+entrenadores[i].getId_entrenador()+" Pokeball 1:"+entrenadores[i].getId_pb()+" Pokeball 2:"+entrenadores[i].getId_pb1()+" Pokeball 3:"+entrenadores[i].getId_pb2()+" Pokeball 4:"+entrenadores[i].getId_pb3()+" Pokeball 5:"+entrenadores[i].getId_pb4());
                
            }
            /*for (int j = 1; j < rowsEntrenador; j++) {
                    if (entrenadores[j-1].getId_entrenador() == asignarE) {
                        aux = 1;
                        contador = j - 1;
                        break;
                    }
                }
                for (int j = 1; j < rowsPokeballs; j++) {
                    if (pokeballs[j-1].getId_pb() == asignarPb) {
                        aux1 = 1;
                        break;
                    }
                }
                if (aux == 1 && aux1 == 1) {
                    entrenadores[contador].setId_entrenador(asignarE);
                }*/
            //}
            /*for (int i = 0; i < rowsEntrenador; i++) {
                System.out.println("Entrenador: " + entrenadores[i].getId_entrenador() + " Pokeball:" + entrenadores[i].getId_pb());
            }*/

        } catch (Exception e) {

        }
    }
    
    static int rowsasignarA, columnsasignarA;
    public static void asignarA(){
        int id_ali, id_pokemon;
        int aux=0;
        int aux1=0;
        int conteo= 0;
        int cubo=0;
        try{
            File csv = new File("AsignacionComida.csv");
            Scanner sc = new Scanner(csv);
            String data = "";
            
            while(sc.hasNextLine()){
                data += sc.nextLine()+("\n");
            }
            
            String []rows = data.split("\n");
            rowsasignarA = rows.length;
     
            String[] columns = rows[0].split(",");
            columnsasignarA = columns.length;

            for (int i = 1; i < rowsasignarA; i++) {
                aux=0;
                aux1=0;
                columns = rows[i].split(",");

                id_ali = Integer.parseInt(columns[0]);
                id_pokemon = Integer.parseInt(columns[1]);
                
                for (int j = 1; j < rowsAlimentos; j++) {               
                if(alimentos[j-1].getId_ali() == id_ali){
                    aux=1;                        
                    if ((conteo != j - 1) && j-1!=0) {
                            cubo = -1;
                        }
                        conteo = j - 1;
                    break;
                }
            }
                for (int j = 1; j < rowsPokemons; j++) {
                    if (pokemon[j-1].getId_pokemon()==id_pokemon) {
                        aux1=1;
                        cubo++;
                        break;
                    }
                }
                
                if (aux == 1 && aux1 == 1) {
                    if (cubo == 0) {
                        alimentos[conteo].setId_pokemon(id_pokemon);
                    }
                    if (cubo == 1) {
                        alimentos[conteo].setId_pokemon1(id_pokemon);
                    }
                    if (cubo == 2) {
                        alimentos[conteo].setId_pokemon2(id_pokemon);
                    }
                    if (cubo == 3) {
                        alimentos[conteo].setId_pokemon3(id_pokemon);
                    }
                    if (cubo == 4) {
                        alimentos[conteo].setId_pokemon4(id_pokemon);
                    }
                }
            }
            for (int i = 0; i < rowsAlimentos; i++) {
                System.out.println("Alimento: "+alimentos[i].getId_ali()+" Pokemon 1: "+alimentos[i].getId_pokemon()+" Pokemon 2: "+alimentos[i].getId_pokemon1()+" Pokemon 3: "+alimentos[i].getId_pokemon2()+" Pokemon 4: "+alimentos[i].getId_pokemon3()+" Pokemon 5: "+alimentos[i].getId_pokemon4());
            }
        }catch(Exception e){
            
        }
    }
}
