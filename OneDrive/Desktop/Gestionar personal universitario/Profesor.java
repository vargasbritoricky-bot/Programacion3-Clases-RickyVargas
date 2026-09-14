public class Profesor extends Empleado implements Bonificable {

    private String asignatura;
    private int horasClase;

    public Profesor(String codigo, String nombre, String apellido,
                    double salario, String asignatura, int horasClase) {

        super(codigo, nombre, apellido, salario);
        this.asignatura = asignatura;
        this.horasClase = horasClase;
    }

    @Override
    public void trabajar() {
        System.out.println("El profesor esta impartiendo clases de " + asignatura);
    }

    @Override
    public double calcularBono() {
        return getSalario() * 0.10;
    }

    @Override
    public String toString() {
        return super.toString() +
               ", Asignatura: " + asignatura +
               ", Horas: " + horasClase;
    }
}