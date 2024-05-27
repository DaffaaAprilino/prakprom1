package pertemuan6;

public class linkedlist {
    private Node HEAD;

    public linkedlist() {
        HEAD = null;
    }

    public boolean isEmpty() {
        return HEAD == null;
    }

    public void addHead(Matakuliah data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            HEAD = newNode;
        } else {
            newNode.setNext(HEAD);
            HEAD = newNode;
        }
    }

    public void displayElement() {
        if (isEmpty()) {
            System.out.println("List Kosong");
        } else {
            Node curNode = HEAD;
            while (curNode != null) {
                System.out.println(curNode.getData().getKode()+ " " + curNode.getData().getNama()+ ", " + curNode.getData().getSks());
                curNode = curNode.getNext();
            }
        }
    }

    public void addTail(Matakuliah data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            HEAD = newNode;
        } else {
            Node current = HEAD;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(newNode);
        }
    }

    public void addMid(int position, Matakuliah data) {
        Node newNode = new Node(data);
        if (position <= 0 || isEmpty()) {
            addHead(data);
        } else {
            Node current = HEAD;
            for (int i = 1; i < position && current.getNext() != null; i++) {
                current = current.getNext();
            }
            newNode.setNext(current.getNext());
            current.setNext(newNode);
        }
    }
}
