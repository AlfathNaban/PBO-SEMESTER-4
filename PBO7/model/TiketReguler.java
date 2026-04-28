package model;

public class TiketReguler extends Tiket {
    private String zona;

    public TiketReguler(String namaKonser, double harga, String zona) {
        super(namaKonser, harga);
        this.zona = zona;
    }

    @Override
    public void display() {
        System.out.println("Tiket Reguler: " + namaKonser +
                           " | Harga: " + harga +
                           " | Zona: " + zona);
    }
}
