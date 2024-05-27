package pertemuan4;

public class Nodemain {
	public static void main(String[] args) {
		
        linkedlist list = new linkedlist();
        
        list.tambahDiAkhir(8);
        list.tambahDiTengah(6, 1); 
        list.tambahDiTengah(7, 1); 
        list.tambahDiAwal(9);
        // menampilkan hasil dari linkedlist yang sudah di tambahkan
        // di atas tadi
        System.out.print("Elemen list: ");
        list.tampilkan();
    }

}
