public abstract class Vehiculo {

    private String codigo;
    private String marca;
    private String modelo;
    private int anio;
    private double velocidadActual;

    public Vehiculo(String codigo, String marca, String modelo, int anio, double velocidadActual) {
        this.codigo = codigo;
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.velocidadActual = velocidadActual;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAnio() {
        return anio;
    }

    public double getVelocidadActual() {
        return velocidadActual;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public void setVelocidadActual(double velocidadActual) {
        this.velocidadActual = velocidadActual;
    }

    public abstract void conducir();

    @Override
    public String toString() {
        return "Código: " + codigo
                + ", Marca: " + marca
                + ", Modelo: " + modelo
                + ", Año: " + anio
                + ", Velocidad actual: " + velocidadActual + " km/h";
    }
}