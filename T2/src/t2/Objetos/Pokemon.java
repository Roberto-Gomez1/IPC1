package t2.Objetos;

public class Pokemon {

    private int id_pokemon;
    private String tipo;
    private String nombre;
    private double vida;
    private double puntosda;
    private boolean capturado;
    private boolean estado;
    private int id_pokeball;
    public Pokemon(int id_pokemon, String tipo, String nombre, double vida, double puntosda, boolean capturado, boolean estado, int id_pokeball) {
        this.id_pokemon = id_pokemon;
        this.tipo = tipo;
        this.nombre = nombre;
        this.vida = vida;
        this.puntosda = puntosda;
        this.capturado = capturado;
        this.estado = estado;
        this.id_pokeball = id_pokeball;
    }

    public int getId_pokemon() {
        return id_pokemon;
    }

    public void setId_pokemon(int id_pokemon) {
        this.id_pokemon = id_pokemon;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getVida() {
        return vida;
    }

    public void setVida(double vida) {
        this.vida = vida;
    }

    public double getPuntosda() {
        return puntosda;
    }

    public void setPuntosda(double puntosda) {
        this.puntosda = puntosda;
    }

    public boolean isCapturado() {
        return capturado;
    }

    public void setCapturado(boolean capturado) {
        this.capturado = capturado;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public int getId_pokeball() {
        return id_pokeball;
    }

    public void setId_pokeball(int id_pokeball) {
        this.id_pokeball = id_pokeball;
    }
}
