/**
 * La clase la he decidido hacer abstracta porque no tendria sentido instanciarla por si sola
 */
public abstract class SmartDevice {
    private String modelo;
    private String OS;
    private int bateria;
    private double voltaje;


    public SmartDevice() {
    }

    public SmartDevice(String modelo, String OS, int bateria, double voltaje) {
        this.modelo = modelo;
        this.OS = OS;
        this.bateria = bateria;
        this.voltaje = voltaje;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getOS() {
        return OS;
    }

    public void setOS(String OS) {
        this.OS = OS;
    }

    public int getBateria() {
        return bateria;
    }

    public void setBateria(int bateria) {
        this.bateria = bateria;
    }

    public double getVoltaje() {
        return voltaje;
    }

    public void setVoltaje(double voltaje) {
        this.voltaje = voltaje;
    }

    @Override
    public String toString() {
        return  "modelo='" + modelo + '\'' +
                ", OS='" + OS + '\'' +
                ", bateria=" + bateria +
                ", voltaje=" + voltaje ;
    }
}
