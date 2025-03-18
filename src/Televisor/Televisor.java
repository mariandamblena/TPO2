package Televisor;

public class Televisor {

    private String marca;
    private String modelo;
    private int anioDeFabricacion;
    private TipoTelevisor tipo;
    private Pantalla pantalla;  // Componente compartido
    private boolean encendido;  // Estado del televisor

    public Televisor(String marca, String modelo, TipoTelevisor tipo, int anioDeFabricacion, Pantalla pantalla) {
        this.marca = marca;
        this.modelo = modelo;
        this.tipo = tipo;
        this.anioDeFabricacion = anioDeFabricacion;
        this.pantalla = pantalla;
        this.encendido = false; // Inicialmente apagado
    }

    // Getters y setters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnioDeFabricacion() {
        return anioDeFabricacion;
    }

    public void setAnioDeFabricacion(int anioDeFabricacion) {
        this.anioDeFabricacion = anioDeFabricacion;
    }

    public TipoTelevisor getTipo() {
        return tipo;
    }

    public void setTipo(TipoTelevisor tipo) {
        this.tipo = tipo;
    }

    public Pantalla getPantalla() {
        return pantalla;
    }

    public void setPantalla(Pantalla pantalla) {
        this.pantalla = pantalla;
    }

    public boolean isEncendido() {
        return encendido;
    }

    // Método para encender el televisor (y su pantalla)
    public void encender() {
        encendido = true;
        pantalla.encender();
    }

    // Método para apagar el televisor (y su pantalla)
    public void apagar() {
        encendido = false;
        pantalla.apagar();
    }

    // Método para mostrar la información del televisor
    public String mostrarInformacion() {
        String estadoTv = encendido ? "Encendido" : "Apagado";
        return marca + " " + modelo + " -- " + pantalla.mostrarInformacionPantalla() + " -- Televisor: " + estadoTv;
    }

    @Override
    public String toString() {
        return mostrarInformacion();
    }
}
