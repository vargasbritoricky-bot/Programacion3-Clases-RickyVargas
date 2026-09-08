public class Motocicleta extends Vehiculo {

    private double cilindrada;

    public Motocicleta(String codigo, String marca, String modelo,
                       int anio, double velocidadActual, double cilindrada) {

        super(codigo, marca, modelo, anio, velocidadActual);
        this.cilindrada = cilindrada;
    }

    public double getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(double cilindrada) {
        this.cilindrada = cilindrada;
    }

    @Override
    public void conducir() {
        System.out.println("La motocicleta está conduciendo por la carretera.");
    }

    @Override
    public String toString() {
        return super.toString()
                + ", Cilindrada: " + cilindrada + " cc";
    }
}