package Day9Cw;

public class Pattern2 {

	public static void main(String[] args) {
		int s = 5;
		for(int i=1 ; i<= s ; i++) {
			for(int j=1; j<= s-i; j++) {
				System.out.print(" ");
			}
			for(int j =1 ; j<= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
