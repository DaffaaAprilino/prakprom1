package pertemuan4;

public class linkedlist {
	   Node head;

	    void tambahDiAwal(double data) {
	        Node newNode = new Node(data);
	        newNode.next = head;
	        head = newNode;
	    }

	    void tambahDiAkhir(double data) {
	        Node newNode = new Node(data);
	        if (head == null) {
	            head = newNode;
	            return;
	        }

	        Node last = head;
	        while (last.next != null) {
	            last = last.next;
	        }
	        last.next = newNode;
	    }

	    void tambahDiTengah(double data, int posisi) {
	        Node newNode = new Node(data);
	        if (posisi == 0) {
	            newNode.next = head;
	            head = newNode;
	            return;
	        }

	        Node current = head;
	        for (int i = 0; i < posisi - 1 && current != null; i++) {
	            current = current.next;
	        }

	        if (current == null) {
	            System.out.println("Posisi tidak valid");
	            return;
	        }

	        newNode.next = current.next;
	        current.next = newNode;
	    }

	    void tampilkan() {
	        Node current = head;
	        while (current != null) {
	            System.out.print((int) current.data + " ");
	            current = current.next; // Maju ke node berikutnya
	        }
	        System.out.println();
	    }

}
