package no2;

import java.util.ArrayList;

public class ContohArrayList {
    public static void main(String[] args) {
        // Membuat ArrayList
        ArrayList<String> nama = new ArrayList<>();

        // Menambahkan data
        nama.add("Andi");
        nama.add("Budi");
        nama.add("Citra");

        // Menampilkan isi ArrayList
        System.out.println("Daftar nama:");
        for (String n : nama) {
            System.out.println(n);
        }

        // Mengambil data berdasarkan index
        System.out.println("Nama index ke-1: " + nama.get(1));

        // Menghapus data
        nama.remove("Budi");

        // Menampilkan setelah dihapus
        System.out.println("Setelah dihapus:");
        System.out.println(nama);
    }
}
