public class Inventario {
    //Atributos
    public String nombre;
    public int cantidad;
     //Constructor
    public Inventario(String nombre, int cantidad) {
        this.nombre = nombre;
        this.cantidad = cantidad;
    }
    //Metodos
    public void existencia() {
        System.out.println("Hay " + cantidad + " unidades de " + nombre + ".");
    }

    public void donaciones() {
        System.out.println("No hay donaciones disponibles por el momento.");
    }
}

