package t2.Objetos;

public class Entrenadores {

    private int id_entrenador;
    private String entrenador;
    private int id_pb;
    private int id_pb1;
    private int id_pb2;
    private int id_pb3;
    private int id_pb4;

    public Entrenadores(int id_entrenador, String entrenador, int id_pb, int id_pb1, int id_pb2, int id_pb3, int id_pb4) {
        this.id_entrenador = id_entrenador;
        this.entrenador = entrenador;
        this.id_pb = id_pb;
        this.id_pb1 = id_pb1;
        this.id_pb2 = id_pb2;
        this.id_pb3 = id_pb3;
        this.id_pb4 = id_pb4;

    }

    public int getId_entrenador() {
        return id_entrenador;
    }

    public void setId_entrenador(int id_entrenador) {
        this.id_entrenador = id_entrenador;
    }

    public String getEntrenador() {
        return entrenador;
    }

    public void setEntrenador(String entrenador) {
        this.entrenador = entrenador;
    }

    public int getId_pb() {
        return id_pb;
    }

    public void setId_pb(int id_pb) {
        this.id_pb = id_pb;
    }

    public int getId_pb1() {
        return id_pb1;
    }

    public void setId_pb1(int id_pb1) {
        this.id_pb1 = id_pb1;
    }

    public int getId_pb2() {
        return id_pb2;
    }

    public void setId_pb2(int id_pb2) {
        this.id_pb2 = id_pb2;
    }

    public int getId_pb3() {
        return id_pb3;
    }

    public void setId_pb3(int id_pb3) {
        this.id_pb3 = id_pb3;
    }

    public int getId_pb4() {
        return id_pb4;
    }

    public void setId_pb4(int id_pb4) {
        this.id_pb4 = id_pb4;
    }
}
