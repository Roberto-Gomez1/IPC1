
package Ventanas;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;
import proyecto1.Proyecto1;


public class Ventana extends JFrame implements ActionListener, MouseListener {
    static JButton registrar, inicio, crear, cmasiva, actualizar, eliminar, exportar, agregarpro,bActualizarpro,buscarcodigo,bEliminarpro,eliminaprof;
    static JButton crear1,cmasiva1,actualizar1,eliminar1,exportar1,agregarcur,agregarpro1;
    static JLabel usuario, contraseña, general;
    static JTextField us, codigopro, nombrepro, apellidopro, correopro, contraseñapro,generopro,codigoact, nombreact,buscarcodigoact, apellidoact, correoact, contraseñaact,generoact, buscarcodigoeli, codigoeli,nombreeli,apellidoeli,correoeli,contraseñaeli,generoeli;
    static JTextField codigocur,nombrecur,creditos;
    static JPasswordField con;
    static JComboBox profesor;
    static String usua = "";
    static String contra = "";
    static String contenido = "";
    static String contenido1 = "";
    static String c ="";
    static String d ="";
    static String e ="";
    static String f ="";
    static String g ="";
    static String h ="";
    static int auxiliar= 0;
    static File archivo,archivo1;
    static FileReader fr, fr1;
    static BufferedReader br,br1;
    static JFrame admin, crearpro, actualizarpro, eliminarpro, crearcur;
    
    
    
    public Ventana(){
        usuario = new JLabel("Usuario: ");
        usuario.setBounds(35, 10, 50, 50);
        usuario.setVisible(true);
        this.add(usuario);
        
        contraseña = new JLabel("Contraseña: ");
        contraseña.setBounds(35, 30, 100, 100);
        usuario.setVisible(true);
        this.add(contraseña);
        
        us = new JTextField();
        us.setBounds(190, 25, 132, 25);
        this.add(us);
        
        con = new JPasswordField();
        con.setBounds(190, 70, 132, 25);
        this.add(con);
        
        inicio = new JButton("Iniciar sesion");
        inicio.setBounds(110, 125, 150, 40);
        inicio.addActionListener(this);
        this.add(inicio);
        
        this.setTitle("Administrador");
        this.getContentPane().setBackground(Color.yellow);
        this.setBounds(350, 100, 375, 225);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setVisible(true);
    }

    static DefaultTableModel modelo,modelo1;
    public void Administrador(){
        admin = new JFrame();
        admin.setTitle("Inicio de administrador");
        admin.getContentPane().setBackground(Color.yellow);
        admin.setBounds(300, 100, 900, 900);
        JTabbedPane pestaña = new JTabbedPane();
        
        //////////////////////////////////////////////////////////
        
        JPanel panel1 = new JPanel();
        panel1.setBackground(Color.yellow);
        pestaña.addTab("Profesores", panel1);
        
        JLabel a = new JLabel("Listado Oficial");
        a.setBounds(30,5,125,75);
        panel1.add(a);
        

        crear = new JButton("Crear");
        crear.setBounds(500,70, 150, 40);
        crear.addActionListener(this);
        panel1.add(crear);
        
        cmasiva = new JButton("Carga Masiva");
        cmasiva.setBounds(700, 70, 150, 40);
        cmasiva.addActionListener(this);
        panel1.add(cmasiva);
        
        actualizar = new JButton("Actualizar");
        actualizar.setBounds(500, 140, 150, 40);
        actualizar.addActionListener(this);
        panel1.add(actualizar);
        
        eliminar = new JButton("Eliminar");
        eliminar.setBounds(700, 140, 150, 40);
        eliminar.addActionListener(this);
        panel1.add(eliminar);
        
        exportar = new JButton("Exportar Listado a PDF");
        exportar.setBounds(575, 210, 200, 40);
        exportar.addActionListener(this);
        panel1.add(exportar);
        

        Object[][] datos= Proyecto1.arreglo;
        
        String[]columnas = {"Código", "Nombre", "Apellido", "Correo", "Genero"};
        modelo = new DefaultTableModel(datos, columnas);
        JTable tabla = new JTable(datos, columnas);
        JScrollPane barra = new JScrollPane(tabla);
        barra.setVisible(true);
        barra.setBounds(20, 70, 465, 700);
        panel1.setLayout(null);
        panel1.add(barra);

        /////////////////////////////////////////////////////////////
        
        
        ////////////////////////////////////////////////////////////
        System.out.println("aca");
        JPanel panel2 = new JPanel();
        panel2.setBackground(Color.yellow);
        pestaña.addTab("Cursos", panel2);

        
        a = new JLabel("Listado Oficial");
        a.setBounds(30,5,125,75);
        panel2.add(a);
        

        crear1 = new JButton("Crear");
        crear1.setBounds(500,70, 150, 40);
        crear1.addActionListener(this);
        panel2.add(crear1);

        cmasiva1 = new JButton("Carga Masiva");
        cmasiva1.setBounds(700, 70, 150, 40);
        cmasiva1.addActionListener(this);
        panel2.add(cmasiva1);
        
        actualizar1 = new JButton("Actualizar");
        actualizar1.setBounds(500, 140, 150, 40);
        actualizar1.addActionListener(this);
        panel2.add(actualizar1);
        
        eliminar1 = new JButton("Eliminar");
        eliminar1.setBounds(700, 140, 150, 40);
        eliminar1.addActionListener(this);
        panel2.add(eliminar1);

        exportar1 = new JButton("Exportar Listado a PDF");
        exportar1.setBounds(575, 210, 200, 40);
        exportar1.addActionListener(this);
        panel2.add(exportar1);
        

        Object[][] datos1= Proyecto1.cursos;
        
        String[]columnas1 = {"Código", "Nombre", "Creditos", "Alumnos", "Profesores"};
        modelo1 = new DefaultTableModel(datos1, columnas1);
        JTable tabla1 = new JTable(datos1, columnas1);
        JScrollPane barra1 = new JScrollPane(tabla1);
        barra1.setVisible(true);
        barra1.setBounds(20, 70, 465, 700);
        panel2.setLayout(null);
        panel2.add(barra1);

        
        //////////////////////////////////////////////////////////////////////
        
        
        /////////////////////////////////////////////////////////////////////

        JPanel panel3 = new JPanel();
        pestaña.addTab("Alumnos", panel3);
        
        
        /////////////////////////////////////////////////////////////////////
        
        
        admin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        admin.getContentPane().add(pestaña);
        admin.setVisible(true);

    }
    
    public void leerArchivos() {
        try {
            JFileChooser fc = new JFileChooser();
            int op = fc.showOpenDialog(this);
            if (op == JFileChooser.APPROVE_OPTION) {
                archivo = fc.getSelectedFile();
            }

            fr = new FileReader(archivo);
            br = new BufferedReader(fr);
            String linea;
            while ((linea = br.readLine()) != null) {
                contenido += linea;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (null != fr) {
                    fr.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }
    
    public void leerArchivos1() {
        try {
            JFileChooser fc = new JFileChooser();
            int op = fc.showOpenDialog(this);
            if (op == JFileChooser.APPROVE_OPTION) {
                archivo1 = fc.getSelectedFile();
            }

            fr1 = new FileReader(archivo1);
            br1 = new BufferedReader(fr1);
            String linea;
            while ((linea = br.readLine()) != null) {
                contenido1 += linea;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (null != fr) {
                    fr.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }
    
    public void crearpro() {
        crearpro = new JFrame();
        crearpro.setTitle("Agregar profesor");
        crearpro.setBounds(300, 100, 280, 350);
        crearpro.getContentPane().setBackground(Color.yellow);
        general = new JLabel("Agregar nuevo profesor");
        general.setBounds(50, 5, 150, 75);
        crearpro.add(general);

        general = new JLabel("Código");
        general.setBounds(5, 30, 125, 75);
        crearpro.add(general);

        codigopro = new JTextField();
        codigopro.setBounds(100, 55, 125, 25);
        crearpro.add(codigopro);

        general = new JLabel("Nombre");
        general.setBounds(5, 60, 125, 75);
        crearpro.add(general);

        nombrepro = new JTextField();
        nombrepro.setBounds(100, 85, 125, 25);
        crearpro.add(nombrepro);

        general = new JLabel("Apellido");
        general.setBounds(5, 90, 125, 75);
        crearpro.add(general);

        apellidopro = new JTextField();
        apellidopro.setBounds(100, 115, 125, 25);
        crearpro.add(apellidopro);

        general = new JLabel("Correo");
        general.setBounds(5, 120, 125, 75);
        crearpro.add(general);

        correopro = new JTextField();
        correopro.setBounds(100, 145, 125, 25);
        crearpro.add(correopro);

        general = new JLabel("Contraseña");
        general.setBounds(5, 150, 125, 75);
        crearpro.add(general);

        contraseñapro = new JTextField();
        contraseñapro.setBounds(100, 175, 125, 25);
        crearpro.add(contraseñapro);

        general = new JLabel("Género");
        general.setBounds(5, 180, 125, 75);
        crearpro.add(general);

        generopro = new JTextField();
        generopro.setBounds(100, 210, 125, 25);
        crearpro.add(generopro);

        agregarpro = new JButton("Crear");
        agregarpro.setBounds(45, 245, 150, 40);
        agregarpro.addActionListener(this);
        crearpro.add(agregarpro);

        crearpro.setLayout(null);
        crearpro.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        crearpro.setVisible(true);
    }

    private void crearcur() {

        crearcur = new JFrame();
        crearcur.setTitle("Agregar curso");
        crearcur.setBounds(300, 100, 280, 350);
        crearcur.getContentPane().setBackground(Color.yellow);
        general = new JLabel("Agregar nuevo curso");
        general.setBounds(50, 5, 150, 75);
        crearcur.add(general);

        general = new JLabel("Código");
        general.setBounds(5, 30, 125, 75);
        crearcur.add(general);

        codigocur = new JTextField();
        codigocur.setBounds(100, 55, 125, 25);
        crearcur.add(codigocur);

        general = new JLabel("Nombre");
        general.setBounds(5, 60, 125, 75);
        crearcur.add(general);

        nombrecur = new JTextField();
        nombrecur.setBounds(100, 85, 125, 25);
        crearcur.add(nombrecur);

        general = new JLabel("Creditos");
        general.setBounds(5, 90, 125, 75);
        crearcur.add(general);

        creditos = new JTextField();
        creditos.setBounds(100, 115, 125, 25);
        crearcur.add(creditos);

        general = new JLabel("Profesor");
        general.setBounds(5, 120, 125, 75);
        crearcur.add(general);

        String[] list = {"1","1"};
        profesor = new JComboBox(list);
        profesor.setBounds(100, 145, 125, 25);
        crearcur.add(profesor);

        agregarcur = new JButton("Agregar");
        agregarcur.setBounds(45, 185, 150, 40);
        agregarcur.addActionListener(this);
        crearcur.add(agregarcur);

        crearcur.setLayout(null);
        crearcur.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        crearcur.setVisible(true);
    }
    
    public void actualizarpro(){
        actualizarpro = new JFrame();
        actualizarpro.setTitle("Actualizar profesor");
        actualizarpro.setBounds(300, 100, 280, 425);
        actualizarpro.getContentPane().setBackground(Color.yellow);
        general = new JLabel("Ingrese el codigo del profesor");
        general.setBounds(35, 1, 180, 75);
        actualizarpro.add(general);

        buscarcodigoact = new JTextField();
        buscarcodigoact.setBounds(50, 55, 125, 25);
        actualizarpro.add(buscarcodigoact);

        buscarcodigo = new JButton("Buscar");
        buscarcodigo.setBounds(35, 90, 150, 20);
        buscarcodigo.addActionListener(this);
        actualizarpro.add(buscarcodigo);

        general = new JLabel("Actualizar datos profesor");
        general.setBounds(50, 85, 150, 75);
        actualizarpro.add(general);

        general = new JLabel("Código");
        general.setBounds(5, 115, 125, 75);
        actualizarpro.add(general);

        codigoact = new JTextField(c);
        codigoact.setEnabled(false);
        codigoact.setBounds(100, 142, 125, 25);
        actualizarpro.add(codigoact);

        general = new JLabel("Nombre");
        general.setBounds(5, 145, 125, 75);
        actualizarpro.add(general);

        nombreact = new JTextField(d);
        nombreact.setBounds(100, 172, 125, 25);
        actualizarpro.add(nombreact);

        general = new JLabel("Apellido");
        general.setBounds(5, 175, 125, 75);
        actualizarpro.add(general);

        apellidoact = new JTextField(e);
        apellidoact.setBounds(100, 202, 125, 25);
        actualizarpro.add(apellidoact);

        general = new JLabel("Correo");
        general.setBounds(5, 205, 125, 75);
        actualizarpro.add(general);

        correoact = new JTextField(f);
        correoact.setBounds(100, 232, 125, 25);
        actualizarpro.add(correoact);

        general = new JLabel("Contraseña");
        general.setBounds(5, 235, 125, 75);
        actualizarpro.add(general);

        contraseñaact = new JTextField(g);
        contraseñaact.setBounds(100, 262, 125, 25);
        actualizarpro.add(contraseñaact);

        general = new JLabel("Género");
        general.setBounds(5, 265, 125, 75);
        actualizarpro.add(general);

        generoact = new JTextField(h);
        generoact.setBounds(100, 291, 125, 25);
        actualizarpro.add(generoact);
        
        bActualizarpro = new JButton("Actuailzar");
        bActualizarpro.setBounds(45, 325, 150, 40);
        bActualizarpro.addActionListener(this);
        actualizarpro.add(bActualizarpro);

        actualizarpro.setLayout(null);
        actualizarpro.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        actualizarpro.setVisible(true);
        
    }
    
    
    public void eliminarProf(){
        eliminarpro = new JFrame();
        eliminarpro.setTitle("Eliminar profesor");
        eliminarpro.setBounds(300, 100, 280, 425);
        eliminarpro.getContentPane().setBackground(Color.yellow);
        general = new JLabel("Ingrese el codigo del profesor");
        general.setBounds(35, 1, 180, 75);
        eliminarpro.add(general);

        buscarcodigoeli = new JTextField();
        buscarcodigoeli.setBounds(50, 55, 125, 25);
        eliminarpro.add(buscarcodigoeli);

        eliminaprof = new JButton("Buscar profesor");
        eliminaprof.setBounds(35, 90, 150, 20);
        eliminaprof.addActionListener(this);
        eliminarpro.add(eliminaprof);

        general = new JLabel("Eliminar datos profesor");
        general.setBounds(50, 85, 150, 75);
        eliminarpro.add(general);

        general = new JLabel("Código");
        general.setBounds(5, 115, 125, 75);
        eliminarpro.add(general);

        codigoeli = new JTextField(c);
        codigoeli.setBounds(100, 142, 125, 25);
        eliminarpro.add(codigoeli);

        general = new JLabel("Nombre");
        general.setBounds(5, 145, 125, 75);
        eliminarpro.add(general);

        nombreeli = new JTextField(d);
        nombreeli.setBounds(100, 172, 125, 25);
        eliminarpro.add(nombreeli);

        general = new JLabel("Apellido");
        general.setBounds(5, 175, 125, 75);
        eliminarpro.add(general);

        apellidoeli = new JTextField(e);
        apellidoeli.setBounds(100, 202, 125, 25);
        eliminarpro.add(apellidoeli);

        general = new JLabel("Correo");
        general.setBounds(5, 205, 125, 75);
        eliminarpro.add(general);

        correoeli = new JTextField(f);
        correoeli.setBounds(100, 232, 125, 25);
        eliminarpro.add(correoeli);

        general = new JLabel("Contraseña");
        general.setBounds(5, 235, 125, 75);
        eliminarpro.add(general);

        contraseñaeli = new JTextField(g);
        contraseñaeli.setBounds(100, 262, 125, 25);
        eliminarpro.add(contraseñaeli);

        general = new JLabel("Género");
        general.setBounds(5, 265, 125, 75);
        eliminarpro.add(general);

        generoeli = new JTextField(h);
        generoeli.setBounds(100, 291, 125, 25);
        eliminarpro.add(generoeli);
        
        bEliminarpro = new JButton("Eliminar");
        bEliminarpro.setBounds(45, 325, 150, 40);
        bEliminarpro.addActionListener(this);
        eliminarpro.add(bEliminarpro);

        eliminarpro.setLayout(null);
        eliminarpro.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        eliminarpro.setVisible(true);
    }
    
    public static void buscarProfesor() {
        for (int i = 0; i < 300; i++) {
            if (a.equals(String.valueOf(Proyecto1.arreglo[i][0]))) {
                c = String.valueOf(Proyecto1.arreglo[i][0]);
                d = String.valueOf(Proyecto1.arreglo[i][1]);
                e = String.valueOf(Proyecto1.arreglo[i][2]);
                f = String.valueOf(Proyecto1.arreglo[i][3]);
                h = String.valueOf(Proyecto1.arreglo[i][4]);
                g = String.valueOf(Proyecto1.arreglo[i][5]);
                break;
            }
        }
    }
    
    public static void buscarProfesorEliminar() {
        for (int i = 0; i < 300; i++) {
            if (b.equals(String.valueOf(Proyecto1.arreglo[i][0]))) {
                c = String.valueOf(Proyecto1.arreglo[i][0]);
                d = String.valueOf(Proyecto1.arreglo[i][1]);
                e = String.valueOf(Proyecto1.arreglo[i][2]);
                f = String.valueOf(Proyecto1.arreglo[i][3]);
                h = String.valueOf(Proyecto1.arreglo[i][4]);
                g = String.valueOf(Proyecto1.arreglo[i][5]);
                break;
            }
        }
    }
    
    public static void actualizarProfesor() {
        for (int i = 0; i < 300; i++) {
            if (b.equals(String.valueOf(Proyecto1.arreglo[i][0]))) {
                 Proyecto1.arreglo[i][0] = codigoact.getText();
                 Proyecto1.arreglo[i][1] = nombreact.getText();
                 Proyecto1.arreglo[i][2] = apellidoact.getText();
                 Proyecto1.arreglo[i][3] = correoact.getText();
                 Proyecto1.arreglo[i][4] = generoact.getText();
                 Proyecto1.arreglo[i][5] = contraseñaact.getText();
                break;
            }
        }
    }
    
    public static void eliminarProfesor() {
        for (int i = 0; i < 300; i++) {
            if (b.equals(String.valueOf(Proyecto1.arreglo[i][0]))) {
                Proyecto1.arreglo[i][0] = null;
                Proyecto1.arreglo[i][1] = null;
                Proyecto1.arreglo[i][2] = null;
                Proyecto1.arreglo[i][3] = null;
                Proyecto1.arreglo[i][4] = null;
                Proyecto1.arreglo[i][5] = null;
                auxiliar = i;
                break;
            }
        }
        
        for (int i = auxiliar; i < 300; i++) {
            if (Proyecto1.arreglo[auxiliar + 1][0] != null) {
                Proyecto1.arreglo[auxiliar][0] = Proyecto1.arreglo[auxiliar + 1][0];
                Proyecto1.arreglo[auxiliar][1] = Proyecto1.arreglo[auxiliar + 1][1];
                Proyecto1.arreglo[auxiliar][2] = Proyecto1.arreglo[auxiliar + 1][2];
                Proyecto1.arreglo[auxiliar][3] = Proyecto1.arreglo[auxiliar + 1][3];
                Proyecto1.arreglo[auxiliar][4] = Proyecto1.arreglo[auxiliar + 1][4];
                Proyecto1.arreglo[auxiliar][5] = Proyecto1.arreglo[auxiliar + 1][5];
            }
        }
    }

    
    
    static String a,b;
    @Override
    public void actionPerformed(ActionEvent ae) {

        if(ae.getSource() == inicio){
            usua = us.getText();
            contra = con.getText();
            if (usua.equals("admin") && contra.equals("admin")) {
                Ventana.this.dispose();
                Administrador();
            }
        }
        if (ae.getSource() == cmasiva) {
            leerArchivos();
            System.out.println(contenido);
            JsonParser parser = new JsonParser();
            JsonArray arreglo = parser.parse(contenido).getAsJsonArray();
            System.out.println("Cantidad de Objetos: " + arreglo.size());

            for (int i = 0; i < arreglo.size(); i++) {

                JsonObject objeto = arreglo.get(i).getAsJsonObject();

                int codigo = objeto.get("codigo").getAsInt();
                String nombre = objeto.get("nombre").getAsString();
                String apellido = objeto.get("apellido").getAsString();
                String correo = objeto.get("correo").getAsString();
                String genero = objeto.get("genero").getAsString();

                Persona nuevo = new Persona(codigo,nombre,apellido,correo, genero,"1234");                
                Proyecto1.AgregarPersona(nuevo);
            }
            Proyecto1.convertirDatos();
            admin.dispose();
            Administrador();
        }
        
        if (ae.getSource() == cmasiva1) {
            leerArchivos1();
            System.out.println(contenido1);
            JsonParser parser1 = new JsonParser();
            JsonArray arreglo1 = parser1.parse(contenido1).getAsJsonArray();
            System.out.println("Cantidad de Objetos: " + arreglo1.size());

            for (int i = 0; i < arreglo1.size(); i++) {

                JsonObject objeto1 = arreglo1.get(i).getAsJsonObject();

                int codigo = objeto1.get("codigo").getAsInt();
                String nombre = objeto1.get("nombre").getAsString();
                int creditos1 = objeto1.get("creditos").getAsInt();
                int profesor1 = objeto1.get("profesor").getAsInt();

                Cursos nuevo1 = new Cursos(codigo,nombre,creditos1,0,profesor1);                
                Proyecto1.AgregarCursos(nuevo1);
            }
            Proyecto1.convertirDatosCursos();
            admin.dispose();
            Administrador();
        }
        
        if (ae.getSource() == crear) {
            admin.dispose();
            crearpro();
        }
        if (ae.getSource() == crear1) {
            admin.dispose();
            crearcur();
        }
        
        if (ae.getSource() == agregarpro) {

            int codigo = Integer.parseInt(codigopro.getText());
            String nombre = nombrepro.getText();
            String apellido = apellidopro.getText();
            String correo = correopro.getText();
            String genero = generopro.getText();
            String contraseñaa = contraseñapro.getText();

            Persona agregarpersona = new Persona(codigo, nombre, apellido, correo, genero, contraseñaa);
            Proyecto1.AgregarPersona(agregarpersona);
            Proyecto1.convertirDatos();
            crearpro.dispose();
            Administrador();
        }
        if (ae.getSource() == agregarpro1) {

            int codigo = Integer.parseInt(codigocur.getText());
            String nombre = nombrecur.getText();
            int creditos = Integer.parseInt(codigocur.getText());
            int Profesor = Integer.parseInt(codigocur.getText());

            Cursos agregarpersona = new Cursos(codigo, nombre, creditos,0,Profesor);
            Proyecto1.AgregarCursos(agregarpersona);
            Proyecto1.convertirDatosCursos();
            crearcur.dispose();
            Administrador();
        }

        
        if(ae.getSource() == actualizar){
            admin.dispose();
            actualizarpro();
        }
        
        
        if(ae.getSource()== buscarcodigo){
            a = buscarcodigoact.getText();
            buscarProfesor();
            actualizarpro.dispose();
            actualizarpro();

        }

        if (ae.getSource() == bActualizarpro) {
            actualizarProfesor();
            actualizarpro.dispose();
            Administrador();
        }
        
        if(ae.getSource() == eliminar ){
            admin.dispose();
            eliminarProf();
        }
        
        if(ae.getSource() == eliminaprof){
            b = buscarcodigoeli.getText();
            buscarProfesorEliminar();
            eliminarpro.dispose();
            eliminarProf();
        }
        
        if(ae.getSource() ==bEliminarpro){
            eliminarProfesor();
            eliminarpro.dispose();
            Administrador();
        }
        
        
    }

    
    @Override
    public void mouseClicked(MouseEvent me) {
    }

    @Override
    public void mousePressed(MouseEvent me) {
    }

    @Override
    public void mouseReleased(MouseEvent me) {
    }

    @Override
    public void mouseEntered(MouseEvent me) {
    }

    @Override
    public void mouseExited(MouseEvent me) {
    }



}
