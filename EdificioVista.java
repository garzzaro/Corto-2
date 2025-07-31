 Edificio edificio = new Edificio(nombreOrfanato, ubicacionOrfanato, numeroNinos);

        int opcion;
        do {
            System.out.println("\n Menu del orfanato");
            System.out.println("1. Ver existencia de inventario");
            System.out.println("2. Ver donaciones");
            System.out.println("3. Ver camas en la habitación");
            System.out.println("4. Ver personas en la habitación");
            System.out.println("5. Ver datos del edificio");
            System.out.println("6. Ver número de niños");
            System.out.println("7. Terminar");
            System.out.print("Elija una opción: ");
            opcion = scanner.nextInt();