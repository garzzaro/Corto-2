public class Habitaciones {
    //Atributos
    public int numCuarto;
    public int personasHabitacion;
    public int camas;
     //Constructor
    public Habitaciones(int numCuarto, int personasHabitacion, int camas) {
        this.numCuarto = numCuarto;
        this.personasHabitacion = personasHabitacion;
        this.camas = camas;
    }
    //Metodos
    public void getCamas() {
        System.out.println("El cuarto #" + numCuarto + " tiene " + camas + " camas.");
    }

    public void getPersonasHabitacion() {
        System.out.println("Hay " + personasHabitacion + " personas en el cuarto #" + numCuarto + ".");
    }
}

