public class Mobilya {

    private String aciklama;
    private double yukseklik;
    private boolean kapaliMi;

    public Mobilya() {
    }

    public Mobilya(String aciklama, double yukseklik, boolean kapaliMi) {
        this.aciklama = aciklama;
        this.yukseklik = yukseklik;
        this.kapaliMi = kapaliMi;
    }

    public boolean isKapaliMi() {
        return kapaliMi;
    }

    public double getYukseklik() {
        return yukseklik;
    }

    public void setKapaliMi(boolean kapaliMi) {
        this.kapaliMi = kapaliMi;
    }

    public void setYukseklik(double yukseklik) {
        if (yukseklik<0) yukseklik=0;
        this.yukseklik = yukseklik;
    }

    @Override
    public String toString() {
        return aciklama;
    }
}
