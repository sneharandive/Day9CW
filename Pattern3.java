package Day9Cw;

public class Pattern3 {

	public static void main(String[] args) {
		int s = 5;
		for(int i=1; i< s ; i++) {
			for(int j=s-i; j>0; j++) {
				System.out.print(" ");
			}
			for(int k = 1; k <= (2 * i - 1); k++) {
				System.out.print("*");
			}
			System.out.println();
	}
	}
}
