import model.Ninios;
import model.Inventario;
import model.Habitaciones;
import model.Trabajadores;
import model.Orfanato;

import java.util.ArrayList;

public class OrfanatoController {

    public static void main(String[] args) {
        // Crear una lista para almacenar a los niños
        ArrayList<Ninios> listaNinios = new ArrayList<>();

        // Crear objetos de tipo Ninios
        Ninios nino1 = new Ninios("Luis", 7);
        nino1.nacionalidad = "Guatemalteco";

        Ninios nino2 = new Ninios("Sofía", 6);
        nino2.nacionalidad = "Hondureña";

        Ninios nino3 = new Ninios("Carlos", 8);
        nino3.nacionalidad = "Salvadoreño";

        // Agregar los niños a la lista
        listaNinios.add(nino1);
        listaNinios.add(nino2);
        listaNinios.add(nino3);

        // Mostrar la información y ejecutar acciones
        for (Ninios n : listaNinios) {
            System.out.println("Nombre: " + n.getNombre());
            System.out.println("Edad: " + n.edad);
            System.out.println("Nacionalidad: " + n.nacionalidad);
            n.verUbicacion();
            n.caminarrapido();
            System.out.println();
        }
    }
}
