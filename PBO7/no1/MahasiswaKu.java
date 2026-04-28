package no1;

public class MahasiswaKu {
    public static void main(String[] args) {

        Mahasiswa<String, String, Integer> m = new Mahasiswa<>();

        m.setNim("22345765");
        m.setName("Ajiz");
        m.setClas(21);

        System.out.println(m.getNim());
        System.out.println(m.getName());
        System.out.println(m.getClas());
    }
}
