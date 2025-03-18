package Televisor;

public class Televisor {

    private String marca;
    private String modelo;
    private int anioDeFabricacion;
    private TipoTelevisor tipo;
    private double tamanoPulgadas;
    private String resolucion;
    private boolean smart;

    public Televisor(String marca, String modelo, TipoTelevisor tipo, int anioDeFabricacion,
                     double tamanoPulgadas, String resolucion, boolean smart) {
        this.marca = marca;
        this.modelo = modelo;
        this.tipo = tipo;
        this.anioDeFabricacion = anioDeFabricacion;
        this.tamanoPulgadas = tamanoPulgadas;
        this.resolucion = resolucion;
        this.smart = smart;
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

    // Método para mostrar la información del televisor en el formato solicitado
    public String mostrarInformacion() {
        String smartText = smart ? "Smart" : "No Smart";
        /* es lo mismo que el condicional f
        * String smartText;
            if (smart) {
            smartText = "Smart";
            } else {
            smartText = "No Smart";
            }
        * */
        return marca + " " + modelo + " -- " + tamanoPulgadas + " pulgadas -- " + resolucion + " -- " + smartText;
    }
}
