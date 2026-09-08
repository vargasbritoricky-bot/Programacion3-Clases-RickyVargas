public class Camion extends Vehiculo implements Cargable {

    private double capacidadMaximaCarga;
    private double cargaActual;

    public Camion(String codigo, String marca, String modelo,
                  int anio, double velocidadActual,
                  double capacidadMaximaCarga, double cargaActual) {

        super(codigo, marca, modelo, anio, velocidadActual);

        this.capacidadMaximaCarga = capacidadMaximaCarga;
        this.cargaActual = cargaActual;
    }

    public double getCapacidadMaximaCarga() {
        return capacidadMaximaCarga;
    }

    public double getCargaActual() {
        return cargaActual;
    }

    public void setCapacidadMaximaCarga(double capacidadMaximaCarga) {
        this.capacidadMaximaCarga = capacidadMaximaCarga;
    }

    public void setCargaActual(double cargaActual) {
        this.cargaActual = cargaActual;
    }

    @Override
    public void conducir() {
        System.out.println("El camión está conduciendo transportando mercancía.");
    }

    @Override
    public void cargar(double peso) {

        if (peso <= 0) {
            System.out.println("El peso debe ser mayor que cero.");
        } else if (cargaActual + peso <= capacidadMaximaCarga) {
            cargaActual += peso;
            System.out.println("Se cargaron " + peso + " kg.");
            System.out.println("Carga actual: " + cargaActual + " kg.");
        } else {
            System.out.println("No se puede cargar. Se supera la capacidad máxima.");
        }
    }

    @Override
    public void descargar() {
        cargaActual = 0;
        System.out.println("El camión ha sido descargado.");
    }

    @Override
    public String toString() {
        return super.toString()
                + ", Capacidad máxima: " + capacidadMaximaCarga + " kg"
                + ", Carga actual: " + cargaActual + " kg";
    }
}