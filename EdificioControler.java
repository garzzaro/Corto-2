public class EdificioControler {
    //Atributos
    private  Inventario Inventario;
    private Habitaciones Habitaciones;
    private Edificio Edificio;
    private EdificioVista vista; 

    public EdificioControler(EdificioVista vista){
        this.vista = vista;
        inicializarEdificio();

    }
    private void inicializarEdificio(){
        Inventario
        Habitaciones
        Edificio
    }

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
