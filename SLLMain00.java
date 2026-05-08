public class SLLMain00 {
    public static void main(String[] args) {
        SingleLinkedList00 sll = new SingleLinkedList00();

        Mahasiswa00 mhs1 = new Mahasiswa00("24212200", "Alvaro", "1A", 4.0);
        Mahasiswa00 mhs2 = new Mahasiswa00("24212201", "Bimon", "2B", 3.8);
        Mahasiswa00 mhs3 = new Mahasiswa00("24212202", "Cintia", "3C", 3.5);
        Mahasiswa00 mhs4 = new Mahasiswa00("24212203", "Dirga", "4D", 3.6);

        sll.addFirst(mhs4);
        sll.addLast(mhs1);
        sll.insertAfter("24212203", mhs3);
        sll.insertAt(2, mhs2);

        System.out.println("data index 1 : ");
        sll.getData(1).tampilInformasi();

        System.out.println("data mahasiswa an bimon berada pada index : " + sll.indexOf("24212201"));

        sll.removeFirst();
        sll.removeLast();
        sll.print();
        sll.removeAt(0);
        sll.print();
    }
}