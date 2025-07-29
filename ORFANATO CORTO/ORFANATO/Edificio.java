public class Edificio {
    //Atributos
    public String nombreOrfanato;
    public int numeroNinos;
    public String ubicacionOrfanato;
    //Constructor
    public Edificio(String nombreOrfanato, String ubicacionOrfanato, int numeroNinos) {
        this.nombreOrfanato = nombreOrfanato;
        this.ubicacionOrfanato = ubicacionOrfanato;
        this.numeroNinos = numeroNinos;
    }
    //Metodos
    public void verDatos() {
        System.out.println("Nombre del orfanato: " + nombreOrfanato);
        System.out.println("Ubicación: " + ubicacionOrfanato);
    }

    public void getNumeroNinos() {
        System.out.println("Número de niños en el orfanato: " + numeroNinos);
    }
}
