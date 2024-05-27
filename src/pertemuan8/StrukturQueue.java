package pertemuan8;
public class StrukturQueue {
    private Node FRONT;
    private Node REAR;

    public boolean isEmpty() {
        return (FRONT == null);
    }
    
    public StrukturQueue() {
        this.FRONT = null;
        this.REAR = null;
    }

    public void enqueue(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            FRONT = newNode;
            REAR = newNode;
        } else {
            REAR.setNext(newNode);
            REAR = newNode;
        }
    }
    
    public int size() {
        int size = 0;
        Node curNode = FRONT;
        while(curNode != null) {
            size++;
            curNode = curNode.getNext();
        }
        return size;
    }

    public int front() {
        return FRONT != null ? FRONT.getData() : -1;    
    }
    
    public void displayElements() {
        if (isEmpty()) {
            System.out.println("Elemen Queue: queue kosong");
        } else {
            Node curNode = FRONT;
            System.out.print("Elemen Queue: ");
            while (curNode != null) {
                System.out.print(curNode.getData() + " ");
                curNode = curNode.getNext();
            }
            System.out.println();
        }
    }
    
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong, tidak dapat dequeue.");
            return -1;
        } else {
            int data = FRONT.getData();
            FRONT = FRONT.getNext();
            if (FRONT == null) {
                REAR = null; // Mengupdate REAR jika FRONT menjadi null setelah dequeue
            }
            return data;
        }
    }


}