 import java.util.Scanner;

public class OrfanatoVista{
    private Scanner scanner = new Scanner(System.in);
    
    public String pedirTexto(String mensaje) {
        System.out.print(mensaje);
        return scanner.nextLine();
    }
    public int pedirEntero(String mensaje){
        System.out.print(mensaje); 
        int valor = scanner.nextInt();
        scanner.nextLine(); 
        return valor;   
    }
    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }       
    public void mostrarMenu() {
        System.out.println("\n--- Menú del Orfanato ---");
        System.out.println("1. Ver ubicación del niño");
        System.out.println("2. Niño camina rápido");
        System.out.println("3. Niño camina lento");
        System.out.println("4. Ver información del trabajador");
        System.out.println("5. Ver salario del trabajador");
        System.out.println("6. Ver edad del trabajador");
        System.out.println("7. Niño se presenta");
        System.out.println("8. Ver presupuesto del orfanato");
        System.out.println("9. Trabajador habla con los niños");
        System.out.println("10. Salir");
    }
    public int pedirOpcion() {
        return pedirEntero ("Elija una opción: ");
    }
    public static void main(String[] args) {
        OrfanatoVista vista = new OrfanatoVista();
        OrfanatoControler controlador = new OrfanatoControler(vista);
        controlador.ejecutarMenu();
    }
}
