public class Main {

    static String[] nombres = {
        "Juan Perez", "Ana Lopez", "Carlos Ruiz", "Maria Diaz", "Luis Marte"
    };

    static String[] correos = {
        "juan@ucne.edu", "ana@gmail.com", "carlos@ucne.edu",
        "maria@yahoo.com", "luis@ucne.edu"
    };

    static double[] parcial1 = {8.5, 9.0, 6.3, 4.5, 7.8};
    static double[] parcial2 = {7.0, 8.5, 5.9, 6.0, 9.2};
    static double[] parcial3 = {9.0, 7.5, 4.8, 8.0, 6.5};

    public static void main(String[] args) {

        double suma = 0, mayor = 0, menor = 10;
        String mejor = "", peor = "";
        int aprobados = 0, reprobados = 0;

        System.out.println("NOMBRE\t\tPROMEDIO\tESTADO");
        System.out.println("--------------------------------------");

        for (int i = 0; i < nombres.length; i++) {

            double promedio = (parcial1[i] + parcial2[i] + parcial3[i]) / 3;
            String estado = promedio >= 6 ? "Aprobado" : "Reprobado";

            System.out.printf("%-16s %.2f\t\t%s%n",
                    nombres[i], promedio, estado);

            suma += promedio;

            if (promedio > mayor) {
                mayor = promedio;
                mejor = nombres[i];
            }

            if (promedio < menor) {
                menor = promedio;
                peor = nombres[i];
            }

            if (promedio >= 6)
                aprobados++;
            else
                reprobados++;
        }

        System.out.println("\nPromedio general: " + suma / nombres.length);
        System.out.println("Promedio más alto: " + mejor);
        System.out.println("Promedio más bajo: " + peor);
        System.out.println("Aprobados: " + aprobados);
        System.out.println("Reprobados: " + reprobados);

        System.out.println("\nEstudiantes con correo institucional:");

        for (int i = 0; i < correos.length; i++) {
            if (correos[i].endsWith("@ucne.edu"))
                System.out.println(nombres[i].toUpperCase() + "  " + correos[i]);
        }

        int pos = buscarEstudiante(nombres, "lopez");

        if (pos != -1) {
            System.out.println("\nEstudiante encontrado:");
            System.out.println("Nombre: " + nombres[pos]);
            System.out.println("Correo: " + correos[pos]);
            System.out.println("Parcial 1: " + parcial1[pos]);
            System.out.println("Parcial 2: " + parcial2[pos]);
            System.out.println("Parcial 3: " + parcial3[pos]);
        }
    }

    static int buscarEstudiante(String[] nombres, String busqueda) {
        for (int i = 0; i < nombres.length; i++)
            if (nombres[i].toLowerCase().contains(busqueda.toLowerCase()))
                return i;

        return -1;
    }
}