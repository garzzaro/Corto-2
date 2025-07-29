public class Ninios {
    //Atributos
    private String nombre; 
    public int edad; 
    public String nacionalidad; 

    // Constructor
    public Ninios(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Métodos
    public void verUbicacion() {
        System.out.println(nombre + " está en el patio del orfanato.");
    }

    public void caminarrapido() {
        System.out.println(nombre + " está caminando rápido.");
    }

    public void caminarlento() {
        System.out.println(nombre + " está caminando lento.");
    }
}
