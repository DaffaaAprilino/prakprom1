package pertemuan7;
public class linkedlist {
    Node head;

    public linkedlist() {
        this.head = null;
    }

    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public boolean find(int x) {
        Node curNode = head;
        boolean found = false;
        while (curNode != null && !found) {
            if (curNode.data == x) {
                found = true;
            } else {
                curNode = curNode.next;
            }
        }
        return found;
    }

    public int size() {
        Node curNode = head;
        int count = 0;
        while (curNode != null) {
            count++;
            curNode = curNode.next;
        }
        return count;
    }

    public static void main(String[] args) {
        linkedlist list = new linkedlist();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        System.out.println("Jumlah elemen dalam linked list: " + list.size());

        int elemenDicari = 20;
        if (list.find(elemenDicari)) {
            System.out.println(elemenDicari + " ditemukan dalam linked list.");
        } else {
            System.out.println(elemenDicari + " tidak ditemukan dalam linked list.");
        }

        elemenDicari = 50;
        if (list.find(elemenDicari)) {
            System.out.println(elemenDicari + " ditemukan dalam linked list.");
        } else {
            System.out.println(elemenDicari + " tidak ditemukan dalam linked list.");
        }
    }
}
