public class Automovil extends Vehiculo {

    private int cantidadPuertas;

    public Automovil(String codigo, String marca, String modelo,
                     int anio, double velocidadActual, int cantidadPuertas) {

        super(codigo, marca, modelo, anio, velocidadActual);
        this.cantidadPuertas = cantidadPuertas;
    }

    public int getCantidadPuertas() {
        return cantidadPuertas;
    }

    public void setCantidadPuertas(int cantidadPuertas) {
        this.cantidadPuertas = cantidadPuertas;
    }

    @Override
    public void conducir() {
        System.out.println("El automóvil está conduciendo por la carretera.");
    }

    @Override
    public String toString() {
        return super.toString()
                + ", Cantidad de puertas: " + cantidadPuertas;
    }
}