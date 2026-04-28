package no3.model;

public abstract class Tiket {
    protected String namaKonser;
    protected double harga;

    public Tiket(String namaKonser, double harga) {
        this.namaKonser = namaKonser;
        this.harga = harga;
    }

    public String getNamaKonser() {
        return namaKonser;
    }

    public double getHarga() {
        return harga;
    }

    public abstract void display();
}
