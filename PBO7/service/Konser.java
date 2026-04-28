package service;

import model.Tiket;
import java.util.ArrayList;

public class Konser implements Pemesanan {

    private ArrayList<Tiket> daftarTiket = new ArrayList<>();

    public void tambahTiket(Tiket tiket) {
        daftarTiket.add(tiket);
    }

    public void tampilkanTiket() {
        System.out.println("\n=== DAFTAR TIKET ===");
        for (Tiket t : daftarTiket) {
            t.display(); // polymorphism
        }
    }

    @Override
    public void pesan(String nama) {
        System.out.println(nama + " berhasil memesan tiket.");
    }

    @Override
    public void batal(String nama) {
        System.out.println(nama + " membatalkan pesanan.");
    }
}