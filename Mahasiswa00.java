
public class Mahasiswa00 {
    String nim;
    String nama;
    String kelas;
    double ipk;

    Mahasiswa00() {
    }

    Mahasiswa00(String nim, String nama, String kelas, double ipk) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        this.ipk = ipk;
    }

void tampilInformasi() {
    System.out.printf("%-10s %-12s %-8s %-5.1f\n", 
                      nama, nim, kelas, ipk);
    }
}