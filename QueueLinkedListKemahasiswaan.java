public class QueueLinkedListKemahasiswaan {
    NodeKemahasiswaan front, rear;
    int size, max;

    public QueueLinkedListKemahasiswaan(int max) {
        this.max = max;
        size = 0;
        front = rear = null;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == max;
    }

    public void clear() {
        front = rear = null;
        size = 0;
        System.out.println("Antrian berhasil dikosongkan.");
    }

    public void enqueue(AntrianKemahasiswaan data) {
        if (isFull()) {
            System.out.println("Antrian penuh!");
            return;
        }

        NodeKemahasiswaan newNode = new NodeKemahasiswaan(data, null);
        
        if (isEmpty()) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }

        size++;
        System.out.println(data.nama + " berhasil masuk antrian.");
    }

    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
            return;
        }

        System.out.println("Mahasiswa dipanggil:");
        front.data.tampilData();

        front = front.next;
        size--;

        if (front == null) {
            rear = null;
        }
    }

    public void peekFront() {
        if (!isEmpty()) {
            System.out.println("Antrian terdepan:");
            front.data.tampilData();
        } else {
            System.out.println("Antrian kosong!");
        }
    }

    public void peekRear() {
        if (!isEmpty()) {
            System.out.println("Antrian terakhir:");
            rear.data.tampilData();
        } else {
            System.out.println("Antrian kosong!");
        }
    }

    public void printQueue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
        } else {
            NodeKemahasiswaan temp = front;
            System.out.println("Daftar Antrian:");
            while (temp != null) {
                temp.data.tampilData();
                temp = temp.next;
            }
        }
    }

    public void jumlahAntrian() {
        System.out.println("Jumlah mahasiswa dalam antrian: " + size);
    }
}