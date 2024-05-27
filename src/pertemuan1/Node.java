package pertemuan1;

public class Node {
	private int nilai;
    private Node next;
    private String nama;
    
    //initializing node
    public Node(int nilai){
        this.nilai = nilai;
    }
    
    //Setter dan Getter
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public String getNama() {
    return nama;
    }
    
    public int getNilai() {
        return nilai;
    }
    
    
    public void setNext(Node next){
    this.next = next;
    }
    
    public Node getNext(){
        return next;
    }
}
