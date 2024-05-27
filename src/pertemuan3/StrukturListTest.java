package pertemuan3;
public class StrukturListTest {
    private Node head;

    public StrukturListTest() {
        this.head = null;
    }

    public void addHead(float nilai) {
        Node newNode = new Node(nilai);
        newNode.setNext(head);
        head = newNode;
    }

    public void addBottom(float nilai) {
        Node newNode = new Node(nilai);

        if (head == null) {
            head = newNode;
            return;
        }

        Node current = head;
        while (current.getNext() != null) {
            current = current.getNext();
        }

        current.setNext(newNode);
    }

    public void addMiddle(float nilai, int posisi) {
        if (posisi < 0) {
            System.out.println("Posisi tidak boleh negatif");
            return;
        }

        if (posisi == 0 || head == null) {
            addHead(nilai);
            return;
        }

        Node newNode = new Node(nilai);
        Node current = head;
        int posisiSekarang = 0;

        while (posisiSekarang < posisi - 1 && current.getNext() != null) {
            current = current.getNext();
            posisiSekarang++;
        }

        newNode.setNext(current.getNext());
        current.setNext(newNode);
    }

    public void tampilElemen() {
        Node current = head;
        while (current != null) {
            System.out.print(current.getNilai() + " ");
            current = current.getNext();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        StrukturListTest list = new StrukturListTest();

        list.addHead(5);
        list.addBottom(3);
        list.addMiddle(4, 2);
        list.addMiddle(7, 2);
        list.addMiddle(8, 2);
        list.tampilElemen();
    }

    private static class Node {
        private float nilai;
        private Node next;

        public Node(float nilai) {
            this.nilai = nilai;
            this.next = null;
        }

        public float getNilai() {
            return nilai;
        }

        public void setNilai(float nilai) {
            this.nilai = nilai;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }
}