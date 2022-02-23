public class SmartPhone extends SmartDevice{

    private String resolucion;
    private float megaPixelsCamara;
    private boolean tieneFaceID;
    private int horasEnLlamada;
    private float megaPixelCamaraFrontal;

    public SmartPhone() {
    }

    public SmartPhone(String modelo, String OS, int bateria, double voltaje, String resolucion, float megaPixelsCamara, boolean tieneFaceID, int horasEnLlamada, float megaPixelCamaraFrontal) {
        super(modelo, OS, bateria, voltaje);
        this.resolucion = resolucion;
        this.megaPixelsCamara = megaPixelsCamara;
        this.tieneFaceID = tieneFaceID;
        this.horasEnLlamada = horasEnLlamada;
        this.megaPixelCamaraFrontal = megaPixelCamaraFrontal;
    }

    public String getResolucion() {
        return resolucion;
    }

    public void setResolucion(String resolucion) {
        this.resolucion = resolucion;
    }

    public float getMegaPixelsCamara() {
        return megaPixelsCamara;
    }

    public void setMegaPixelsCamara(float megaPixelsCamara) {
        this.megaPixelsCamara = megaPixelsCamara;
    }

    public boolean isTieneFaceID() {
        return tieneFaceID;
    }

    public void setTieneFaceID(boolean tieneFaceID) {
        this.tieneFaceID = tieneFaceID;
    }

    public int getHorasEnLlamada() {
        return horasEnLlamada;
    }

    public void setHorasEnLlamada(int horasEnLlamada) {
        this.horasEnLlamada = horasEnLlamada;
    }

    public float getMegaPixelCamaraFrontal() {
        return megaPixelCamaraFrontal;
    }

    public void setMegaPixelCamaraFrontal(float megaPixelCamaraFrontal) {
        this.megaPixelCamaraFrontal = megaPixelCamaraFrontal;
    }

    @Override
    public String toString() {
        return  super.toString() +
                " resolucion='" + resolucion + '\'' +
                ", megaPixelsCamara=" + megaPixelsCamara +
                ", tieneFaceID=" + tieneFaceID +
                ", horasEnLlamada=" + horasEnLlamada +
                ", megaPixelCamaraFrontal=" + megaPixelCamaraFrontal;
    }
}
