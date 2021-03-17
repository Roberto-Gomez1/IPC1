package Ventanas;


public class Cursos {
    private int codigo;
    private String nombre;
    private int creditos;
    private int alumnos;
    private int profesor;

    public Cursos(int codigo, String nombre, int creditos,int alumnos, int profesor) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.creditos = creditos;
        this.alumnos = alumnos;
        this.profesor = profesor;
    }


    public int getCodigo() {
        return codigo;
    }


    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }


    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public int getCreditos() {
        return creditos;
    }


    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }


    public int getAlumnos() {
        return alumnos;
    }


    public void setAlumnos(int alumnos) {
        this.alumnos = alumnos;
    }


    public int getProfesor() {
        return profesor;
    }


    public void setProfesor(int profesor) {
        this.profesor = profesor;
    }
    
    

}
