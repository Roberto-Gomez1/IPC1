package t2.Objetos;


public class Alimentos {

    private int id_ali;
    private String nombre;
    private double Vida;
    private int id_pokemon;
    private int id_pokemon1;
    private int id_pokemon2;
    private int id_pokemon3;
    private int id_pokemon4;
    
    public Alimentos(int id_ali, String nombre, double Vida, int id_pokemon,int id_pokemon1,int id_pokemon2,int id_pokemon3,int id_pokemon4) {
        this.id_ali = id_ali;
        this.nombre = nombre;
        this.Vida = Vida;
        this.id_pokemon = id_pokemon;
        this.id_pokemon1 = id_pokemon1;
        this.id_pokemon2 = id_pokemon2;
        this.id_pokemon3 = id_pokemon3;
        this.id_pokemon4 = id_pokemon4;
        
    }

    public int getId_ali() {
        return id_ali;
    }

    public void setId_ali(int id_ali) {
        this.id_ali = id_ali;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getVida() {
        return Vida;
    }

    public void setVida(double Vida) {
        this.Vida = Vida;
    }
    
    public int getId_pokemon() {
        return id_pokemon;
    }

    public void setId_pokemon(int id_pokemon) {
        this.id_pokemon = id_pokemon;
    }

    public int getId_pokemon1() {
        return id_pokemon1;
    }

    public void setId_pokemon1(int id_pokemon1) {
        this.id_pokemon1 = id_pokemon1;
    }

    public int getId_pokemon2() {
        return id_pokemon2;
    }

    public void setId_pokemon2(int id_pokemon2) {
        this.id_pokemon2 = id_pokemon2;
    }

    public int getId_pokemon3() {
        return id_pokemon3;
    }

    public void setId_pokemon3(int id_pokemon3) {
        this.id_pokemon3 = id_pokemon3;
    }

    public int getId_pokemon4() {
        return id_pokemon4;
    }

    public void setId_pokemon4(int id_pokemon4) {
        this.id_pokemon4 = id_pokemon4;
    }
}
