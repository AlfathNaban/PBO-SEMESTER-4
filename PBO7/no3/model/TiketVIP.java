package no3.model;

public class TiketVIP extends Tiket {
    private String fasilitas;

    public TiketVIP(String namaKonser, double harga, String fasilitas) {
        super(namaKonser, harga);
        this.fasilitas = fasilitas;
    }

    @Override
    public void display() {
        System.out.println("Tiket VIP: " + namaKonser +
                           " | Harga: " + harga +
                           " | Fasilitas: " + fasilitas);
    }
}
