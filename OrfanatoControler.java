public class OrfanatoControler {
    // Atributos
    private Ninios ninios;
    private Trabajadores trabajadores;
    private OrfanatoVista vista;

    // Constructor
    public OrfanatoControler(OrfanatoVista vista) {
        this.vista = vista;
        inicializarOrfanato();
    }

    private void inicializarOrfanato() {
      
        String nombreninos = vista.pedirTexto("Ingrese el nombre del niño: ");
        int edadninos = vista.pedirEntero("Ingrese la edad del niño: ");
        ninios = new Ninios(nombreninos, edadninos);

        String nombreTrabajador = vista.pedirTexto("Ingrese el nombre del trabajador: ");
        String cargoTrabajador = vista.pedirTexto("Ingrese el cargo del trabajador: ");
        float salarioTrabajador = vista.pedirEntero("Ingrese el salario del trabajador: ");
        int edadTrabajador = vista.pedirEntero("Ingrese la edad del trabajador: ");
        trabajadores = new Trabajadores(nombreTrabajador, cargoTrabajador, salarioTrabajador, edadTrabajador);
            
    }

    public void ejecutarMenu() {
        int opcion;
        do {
            vista.mostrarMenu();
            opcion = vista.pedirOpcion();

            switch (opcion) {
                case 1:
                    ninios.verUbicacion();
                    break;
                case 2:
                    ninios.caminarrapido();
                    break;
                case 3:
                    ninios.caminarlento();
                    break;
                case 4:
                    trabajadores.verInfo();
                    break;
                case 5:
                    trabajadores.verSalario();
                    break;
                case 6:
                    trabajadores.verEdad();
                    break;
                case 7:
                    ninios.presentarse();
                    break;
                case 8:
                    trabajadores.verpresupuesto();
                    break;
                case 9:
                    trabajadores.hablarninio();
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
