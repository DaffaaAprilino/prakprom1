package pertemuan8;

public class QueueMain {
    public static void main(String[] args) {
        StrukturQueue queue = new StrukturQueue();

        // Sebelum enqueue 4x
        System.out.println("### Sebelum enqueue 4x ###");
        System.out.println("Size : " + queue.size());
        System.out.println("isEmpty : " + queue.isEmpty());
        queue.displayElements();
        System.out.println();

        // Enqueue 4x
        queue.enqueue(2);
        queue.enqueue(7);
        queue.enqueue(6);
        queue.enqueue(1);

        System.out.println("### Setelah enqueue 4x ###");
        System.out.println("Size : " + queue.size());
        System.out.println("isEmpty : " + queue.isEmpty());
        queue.displayElements();
        System.out.println("Front : " + queue.front());
        System.out.println();

        // Dequeue 2x
        queue.dequeue();
        queue.dequeue();

        System.out.println("### Setelah dequeue 2x ###");
        System.out.println("Size : " + queue.size());
        System.out.println("isEmpty : " + queue.isEmpty());
        queue.displayElements();
        System.out.println("Front : " + queue.front());
    }
}
