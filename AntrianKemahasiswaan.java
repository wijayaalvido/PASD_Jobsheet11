public class AntrianKemahasiswaan {
    String nim, nama, jurusan;

    public AntrianKemahasiswaan(String nim, String nama, String jurusan) {
        this.nim = nim;
        this.nama = nama;
        this.jurusan = jurusan;
    }

    public void tampilData() {
        System.out.printf("%-12s %-10s %-10s\n", nim, nama, jurusan);
    }
}