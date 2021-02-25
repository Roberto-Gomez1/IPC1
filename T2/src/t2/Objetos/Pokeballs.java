package t2.Objetos;

public class Pokeballs {

    private int id_pb;
    private String pokeball;

    public Pokeballs(int id_pb, String pokeball) {
        this.id_pb = id_pb;
        this.pokeball = pokeball;
    }

    public int getId_pb() {
        return id_pb;
    }

    public void setId_pb(int id_pb) {
        this.id_pb = id_pb;
    }

    public String getPokeball() {
        return pokeball;
    }

    public void setPokeball(String pokeball) {
        this.pokeball = pokeball;
    }
}
