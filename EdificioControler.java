public class EdificioControler {
    // Atributos
    private Inventario inventario;
    private Habitaciones habitaciones;
    private Edificio edificio;
    private EdificioVista vista;

    // Constructor
    public EdificioControler(EdificioVista vista) {
        this.vista = vista;
        inicializarEdificio();
    }

    private void inicializarEdificio() {
      
        String nombreOrfanato = vista.pedirTexto("Ingresar el nombre del orfanato: ");
        String ubicacionOrfanato = vista.pedirTexto("Ingresar la ubicación del orfanato: ");
        int numeroNinos = vista.pedirEntero("Ingresar el número de niños en el orfanato: ");
        int pisos = vista.pedirEntero("Ingresar el número de pisos del orfanato: ");
        edificio = new Edificio(nombreOrfanato, ubicacionOrfanato, numeroNinos, pisos);
    
        String nombre = vista.pedirTexto("Ingresar alimento o artículo: ");
        int cantidadInventario = vista.pedirEntero("Ingresar la cantidad: ");
        inventario = new Inventario(nombre, cantidadInventario);

        int numCuarto = vista.pedirEntero("Ingrese el número de cuarto: ");
        int personasHabitacion = vista.pedirEntero("Ingrese número de personas en la habitación: ");
        int camas = vista.pedirEntero("Ingrese número de camas: ");
        habitaciones = new Habitaciones(numCuarto, personasHabitacion, camas);
    }

    public void ejecutarMenu() {
        int opcion;
        do {
            vista.mostrarMenu();
            opcion = vista.pedirOpcion();

            switch (opcion) {
                case 1:
                    inventario.existencia();
                    break;
                case 2:
                    inventario.donaciones();
                    break;
                case 3:
                    habitaciones.getCamas();
                    break;
                case 4:
                    habitaciones.getPersonasHabitacion();
                    break;
                case 5:
                    edificio.verDatos();
                    break;
                case 6:
                    edificio.getNumeroNinos();
                    break;
                case 7:
                    edificio.getPisos();
                    break;
                case 8:
                    habitaciones.getNumCuarto();
                    break;
                case 9:
                    inventario.getRopa();
                    break;
                case 10:
                    System.out.println("Saliendo del menú...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
        } while (opcion != 10);
    }
}
