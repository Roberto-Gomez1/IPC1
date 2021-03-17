
package proyecto1;

import Ventanas.Cursos;
import Ventanas.Persona;
import Ventanas.Ventana;


public class Proyecto1 {
    static Persona[] personas = new Persona[300];
    static Cursos[] inCursos = new Cursos[50];
    static int cPersonas = 0;
    static int cCursos = 0;



    public static void main(String[] args) {
        Ventana admin = new Ventana();
    }
    

    
    public static Object[][] arreglo = new Object[50][6];
    public static Object[][] convertirDatos(){
        int filas = cPersonas;
        for (int i = 0; i < filas; i++) {
            arreglo[i][0] = personas[i].getCodigo();
            arreglo[i][1] = personas[i].getNombre();
            arreglo[i][2] = personas[i].getApellido();
            arreglo[i][3] = personas[i].getCorreo();
            arreglo[i][4] = personas[i].getGenero();
            arreglo[i][5] = "1234";

        }
        return arreglo;
    }

    public static void AgregarPersona(Persona nuevo) {
        if(cPersonas < personas.length){
            personas[cPersonas] = nuevo;
            cPersonas++;
        }else{
            System.out.println("Ya llegaste al limite de Profesores");
        }
    }
    
    
    public static Object[][] cursos = new Object[50][5];
    public static Object[][] convertirDatosCursos(){
        int filas = cCursos;
        for (int i = 0; i < filas; i++) {
            cursos[i][0] = inCursos[i].getCodigo();
            cursos[i][1] = inCursos[i].getNombre();
            cursos[i][2] = inCursos[i].getCreditos();
            cursos[i][3] = inCursos[i].getAlumnos();
             for (int j = 0; j < arreglo.lenght; j++) {
                
            }
            cursos[i][4] = inCursos[i].getProfesor();

        }
        return cursos;
    }

    public static void AgregarCursos(Cursos nuevo1) {
        if(cCursos < cursos.length){
            inCursos[cCursos] = nuevo1;
            cCursos++;
        }else{
            System.out.println("Ya llegaste al limite de Cursos");
        }
    }

}
