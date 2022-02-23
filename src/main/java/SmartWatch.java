public class SmartWatch extends SmartDevice{

    private boolean medidorFrecuenciaCardiaca;
    private boolean medidorOxigeno;
    private String colorCorrea ;
    private int horasModoDeporte;
    private int horasReposo;

    public SmartWatch() {
    }

    public SmartWatch(String modelo, String OS, int bateria, double voltaje, boolean medidorFrecuenciaCardiaca, boolean medidorOxigeno, String colorCorrea, int horasModoDeporte, int horasReposo) {
        super(modelo, OS, bateria, voltaje);
        this.medidorFrecuenciaCardiaca = medidorFrecuenciaCardiaca;
        this.medidorOxigeno = medidorOxigeno;
        this.colorCorrea = colorCorrea;
        this.horasModoDeporte = horasModoDeporte;
        this.horasReposo = horasReposo;
    }

    public boolean isMedidorFrecuenciaCardiaca() {
        return medidorFrecuenciaCardiaca;
    }

    public void setMedidorFrecuenciaCardiaca(boolean medidorFrecuenciaCardiaca) {
        this.medidorFrecuenciaCardiaca = medidorFrecuenciaCardiaca;
    }

    public boolean isMedidorOxigeno() {
        return medidorOxigeno;
    }

    public void setMedidorOxigeno(boolean medidorOxigeno) {
        this.medidorOxigeno = medidorOxigeno;
    }

    public String getColorCorrea() {
        return colorCorrea;
    }

    public void setColorCorrea(String colorCorrea) {
        this.colorCorrea = colorCorrea;
    }

    public int getHorasModoDeporte() {
        return horasModoDeporte;
    }

    public void setHorasModoDeporte(int horasModoDeporte) {
        this.horasModoDeporte = horasModoDeporte;
    }

    public int getHorasReposo() {
        return horasReposo;
    }

    public void setHorasReposo(int horasReposo) {
        this.horasReposo = horasReposo;
    }

    @Override
    public String toString() {
        return super.toString() +
                " medidorFrecuenciaCardiaca=" + medidorFrecuenciaCardiaca +
                ", medidorOxigeno=" + medidorOxigeno +
                ", colorCorrea='" + colorCorrea + '\'' +
                ", horasModoDeporte=" + horasModoDeporte +
                ", horasReposo=" + horasReposo;
    }
}
