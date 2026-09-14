public class Administrativo extends Empleado implements Bonificable {

    private String departamento;
    private String cargo;

    public Administrativo(String codigo, String nombre, String apellido,
                           double salario, String departamento, String cargo) {

        super(codigo, nombre, apellido, salario);
        this.departamento = departamento;
        this.cargo = cargo;
    }

    @Override
    public void trabajar() {
        System.out.println("El administrativo esta trabajando en el departamento de " + departamento);
    }

    @Override
    public double calcularBono() {
        return getSalario() * 0.05;
    }

    @Override
    public String toString() {
        return super.toString() +
               ", Departamento: " + departamento +
               ", Cargo: " + cargo;
    }
}