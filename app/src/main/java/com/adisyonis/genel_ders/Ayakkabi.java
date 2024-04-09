package com.adisyonis.genel_ders;

public class Ayakkabi {
    private String marka;
    private String tur;
    private String renk;
    private double numara;
    private String cinsiyet;
    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getTur() {
        return tur;
    }

    public void setTur(String tur) {
        this.tur = tur;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public double getNumara() {
        return numara;
    }

    public void setNumara(double numara) {
        this.numara = numara;
    }
    public void setCinsiyet(String cinsiyet){
        this.cinsiyet=cinsiyet;
    }
    public String getCinsiyet(){
        return cinsiyet;
    }
    public Ayakkabi(String marka, String tur, String renk, double numara, String cinsiyet) {
        this.marka = marka;
        this.tur = tur;
        this.renk = renk;
        this.numara = numara;
        this.cinsiyet = cinsiyet;
    }



}
