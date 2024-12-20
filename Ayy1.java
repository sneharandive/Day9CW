package Day9Cw;

public class Ayy1 {

	public static void main(String[] args) {

		int array[][]= {
				
				{1,2,3,4},
				{4,5,7,8},
				{8,7,6,5},
				{4,3,2,1}
				};
		for(int i=0 ; i<array.length ; i++) {
			for(int j=0; j<array[i].length; j++) {
				  System.out.print(" "+array[i][j]);
			}
			System.out.println(" ");
		}
	}

}
