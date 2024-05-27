package pertemuan3;

public class No3 {
	 public static void main(String[] args) {
	        int rows = 4;

	        for (int i = 0; i < rows; i++) {
	            
	            for (int j = rows; j > i; j--) {
	                System.out.print("*");
	            }
	            
	            System.out.println();
	        }
	    }
}
