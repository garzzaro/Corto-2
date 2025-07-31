public class Edificio {
    //Atributos
    private String nombreOrfanato;
    private int numeroNinos;
    private int pisos;
    private String ubicacionOrfanato;
    //Constructor
    public Edificio(String nombreOrfanato, String ubicacionOrfanato, int numeroNinos, int pisos) {
        this.nombreOrfanato = nombreOrfanato;
        this.ubicacionOrfanato = ubicacionOrfanato;
        this.numeroNinos = numeroNinos;
        this.pisos = pisos;
    }
    //Metodos
    public void verDatos() {
        System.out.println("Nombre del orfanato: " + nombreOrfanato);
        System.out.println("Ubicación: " + ubicacionOrfanato);
    }

    public void getNumeroNinos() {
        System.out.println("Número de niños en el orfanato: " + numeroNinos);
    }
    public void getPisos () {
        System.out.println("El orfanato tiene:"+ pisos + " pisos.");
    }
}
