 import java.util.Scanner;

public class EdificioVista{
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
        System.out.println("\nMenu del orfanato");
        System.out.println("1. Ver existencia de inventario");
        System.out.println("2. Ver donaciones");
        System.out.println("3. Ver camas en la habitación");
        System.out.println("4. Ver personas en la habitación");
        System.out.println("5. Ver datos del edificio");
        System.out.println("6. Ver número de niños");
        System.out.println("7. Ver número de pisos");
        System.out.println("8. Ver número de cuarto");
        System.out.println("9. Ver ropa en inventario"); 
        System.out.println("10. Salir");
    }
    public int pedirOpcion() {
        return pedirEntero ("Elija una opción: ");
    }
    public static void main(String[] args) {
        EdificioVista vista = new EdificioVista();
        EdificioControler controlador = new EdificioControler(vista);
        controlador.ejecutarMenu();
    }
}
