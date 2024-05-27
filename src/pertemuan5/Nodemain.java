package pertemuan5;

public class Nodemain {
    public static void main(String[] args) {
        // Membuat objek linkedlist
        linkedlist list = new linkedlist();

        // Menambahkan elemen ke linked list
        list.add(2);
        list.add(6);
        list.add(3);
        list.add(5);
        list.add(1);

        // Menampilkan elemen linked list sebelum penghapusan
        System.out.println();
        list.display();

        // Menghapus elemen 3 di tengah list
        list.removedMid(3);

        // Menampilkan elemen linked list setelah penghapusan
        System.out.println();
        list.display();
    }
}