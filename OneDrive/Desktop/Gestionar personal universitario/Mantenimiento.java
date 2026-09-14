public class Mantenimiento extends Empleado {

    private String areaAsignada;

    public Mantenimiento(String codigo, String nombre, String apellido,
                          double salario, String areaAsignada) {

        super(codigo, nombre, apellido, salario);
        this.areaAsignada = areaAsignada;
    }

    @Override
    public void trabajar() {
        System.out.println("El personal de mantenimiento trabaja en el area de " + areaAsignada);
    }

    @Override
    public String toString() {
        return super.toString() +
               ", Area asignada: " + areaAsignada;
    }
}