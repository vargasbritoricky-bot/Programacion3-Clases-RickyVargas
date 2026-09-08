public class Main {

    public static void main(String[] args) {

        // Crear 5 vehículos
        Vehiculo[] vehiculos = new Vehiculo[5];

        vehiculos[0] = new Automovil(
                "A001", "Toyota", "Corolla",
                2022, 80, 4
        );

        vehiculos[1] = new Automovil(
                "A002", "Honda", "Civic",
                2023, 70, 4
        );

        vehiculos[2] = new Motocicleta(
                "M001", "Yamaha", "FZ",
                2021, 60, 150
        );

        vehiculos[3] = new Motocicleta(
                "M002", "Suzuki", "GSX",
                2022, 90, 250
        );

        vehiculos[4] = new Camion(
                "C001", "Volvo", "FH",
                2020, 50, 10000, 3000
        );

        // Recorrer el arreglo
        System.out.println("========== INFORMACIÓN DE VEHÍCULOS ==========");

        for (Vehiculo vehiculo : vehiculos) {

            System.out.println("\nTipo real: " + vehiculo.getClass().getSimpleName());

            System.out.println(vehiculo);

            System.out.print("Acción: ");
            vehiculo.conducir();

            // Detectar si implementa Cargable
            if (vehiculo instanceof Cargable) {
                System.out.println("Este vehículo implementa la interfaz Cargable.");
            } else {
                System.out.println("Este vehículo no implementa Cargable.");
            }
        }

        // Operación de carga y descarga sobre el camión
        System.out.println("\n========== OPERACIÓN DEL CAMIÓN ==========");

        Camion camion = (Camion) vehiculos[4];

        System.out.println("\nDatos iniciales:");
        System.out.println(camion);

        System.out.println("\nCargando 2000 kg...");
        camion.cargar(2000);

        System.out.println("\nDatos después de cargar:");
        System.out.println(camion);

        System.out.println("\nDescargando camión...");
        camion.descargar();

        System.out.println("\nDatos después de descargar:");
        System.out.println(camion);
    }
}