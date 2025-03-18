package Televisor;

public class Pantalla {
    private double tamanoPulgadas;
    private String resolucion;
    private boolean smart;
    private boolean encendida;  // Atributo para el estado de la pantalla

    public Pantalla(double tamanoPulgadas, String resolucion, boolean smart) {
        this.tamanoPulgadas = tamanoPulgadas;
        this.resolucion = resolucion;
        this.smart = smart;
        this.encendida = false; // Por defecto, apagada
    }

    public double getTamanoPulgadas() {
        return tamanoPulgadas;
    }

    public void setTamanoPulgadas(double tamanoPulgadas) {
        this.tamanoPulgadas = tamanoPulgadas;
    }

    public String getResolucion() {
        return resolucion;
    }

    public void setResolucion(String resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isSmart() {
        return smart;
    }

    public void setSmart(boolean smart) {
        this.smart = smart;
    }

    public boolean isEncendida() {
        return encendida;
    }

    public void encender() {
        encendida = true;
    }

    public void apagar() {
        encendida = false;
    }

    // Método para mostrar la información de la pantalla
    public String mostrarInformacionPantalla() {
        String smartText = smart ? "Smart" : "No Smart";
        String estado = encendida ? "Encendida" : "Apagada";
        return tamanoPulgadas + " pulgadas -- " + resolucion + " -- " + smartText + " -- " + estado;
    }

    @Override
    public String toString() {
        return mostrarInformacionPantalla();
    }
}
