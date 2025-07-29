public class Trabajadores {
    //Atributos
    public String nombre;
    public String puesto;
    private float salario;
     //Constructor
    public Trabajadores(String nombre, String puesto, float salario) {
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
    }
    //Metodos
    public void verInfo() {
        System.out.println("Nombre: " + nombre + ", Puesto: " + puesto);
    }

    public void verSalario() {
        System.out.println("El salario de " + nombre + " es: " + salario+"Q");
    }
}

