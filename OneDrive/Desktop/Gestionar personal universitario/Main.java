public class Main {

    public static void main(String[] args) {

        Empleado[] empleados = new Empleado[8];

        empleados[0] = new Profesor(
                "P001", "Juan", "Perez",
                45000, "Java", 20);

        empleados[1] = new Profesor(
                "P002", "Maria", "Lopez",
                50000, "Matematica", 25);

        empleados[2] = new Profesor(
                "P003", "Pedro", "Gomez",
                40000, "Base de Datos", 18);

        empleados[3] = new Administrativo(
                "A001", "Ana", "Rodriguez",
                35000, "Recursos Humanos", "Encargada");

        empleados[4] = new Administrativo(
                "A002", "Carlos", "Diaz",
                30000, "Contabilidad", "Asistente");

        empleados[5] = new Mantenimiento(
                "M001", "Jose", "Martinez",
                25000, "Edificio A");

        empleados[6] = new Mantenimiento(
                "M002", "Luis", "Ramirez",
                28000, "Laboratorio");

        empleados[7] = new Mantenimiento(
                "M003", "Pedro", "Sanchez",
                22000, "Biblioteca");


        System.out.println("===== TODOS LOS EMPLEADOS =====");

        for (Empleado empleado : empleados) {
            System.out.println(empleado);
            System.out.println();
        }


        System.out.println("===== TRABAJO DE LOS EMPLEADOS =====");

        for (Empleado empleado : empleados) {
            empleado.trabajar();
        }


        System.out.println("\n===== TIPO REAL =====");

        for (Empleado empleado : empleados) {
            System.out.println(
                empleado.getNombre() + " -> " +
                empleado.getClass().getSimpleName()
            );
        }


        System.out.println("\n===== BONOS =====");

        for (Empleado empleado : empleados) {

            if (empleado instanceof Bonificable) {

                Bonificable empleadoBono = (Bonificable) empleado;

                System.out.println(
                    empleado.getNombre() +
                    " recibe un bono de $" +
                    empleadoBono.calcularBono()
                );
            }
        }


        // 5. Total de salarios
        double totalSalarios = 0;

        for (Empleado empleado : empleados) {
            totalSalarios += empleado.getSalario();
        }

        System.out.println("\n===== TOTAL DE SALARIOS =====");
        System.out.println("Total: $" + totalSalarios);


        Empleado mayorSalario = empleados[0];

        for (Empleado empleado : empleados) {

            if (empleado.getSalario() > mayorSalario.getSalario()) {
                mayorSalario = empleado;
            }
        }

        System.out.println("\n===== SALARIO MAS ALTO =====");
        System.out.println(mayorSalario);


        int profesores = 0;
        int administrativos = 0;
        int mantenimiento = 0;

        for (Empleado empleado : empleados) {

            if (empleado instanceof Profesor) {
                profesores++;
            }

            if (empleado instanceof Administrativo) {
                administrativos++;
            }

            if (empleado instanceof Mantenimiento) {
                mantenimiento++;
            }
        }

        System.out.println("\n===== CANTIDAD POR TIPO =====");
        System.out.println("Profesores: " + profesores);
        System.out.println("Administrativos: " + administrativos);
        System.out.println("Mantenimiento: " + mantenimiento);
    }
}