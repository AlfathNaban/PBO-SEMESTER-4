package no3.main;

import no3.model.*;
import no3.service.Konser;
import no3.util.DataManager;

public class MainApp {
    public static void main(String[] args) {

        Konser konser = new Konser();

        // object
        TiketVIP vip = new TiketVIP("Coldplay Live", 2000000, "Backstage Access");
        TiketReguler reg = new TiketReguler("Coldplay Live", 500000, "Zona A");

        // tambah ke list
        konser.tambahTiket(vip);
        konser.tambahTiket(reg);

        // tampilkan
        konser.tampilkanTiket();

        // interface method
        konser.pesan("Andi");
        konser.batal("Budi");

        // generic
        DataManager<String> dm = new DataManager<>();
        dm.addData("Data Pembeli 1");
        dm.addData("Data Pembeli 2");

        System.out.println("\n=== DATA PEMBELI ===");
        dm.showData();
    }
}