public abstract class Empleado {

    private String codigo;
    private String nombre;
    private String apellido;
    private double salario;

    public Empleado(String codigo, String nombre, String apellido, double salario) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.salario = salario;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public double getSalario() {
        return salario;
    }

    public abstract void trabajar();

    @Override
    public String toString() {
        return "Codigo: " + codigo +
               ", Nombre: " + nombre +
               ", Apellido: " + apellido +
               ", Salario: $" + salario;
    }
}