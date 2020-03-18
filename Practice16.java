
public class Practice16 {

	public static void main(String[] args) {
		
		int i, j = 0;
		
		for (i = 1; i <= 100; i = i + 3) {
			System.out.print(i+"\t");
			j++;
						
			if (j % 5 == 0) 
				System.out.println();
		}

		System.out.println("\n");
		j = 0;
		for (i = 1; i <= 100; i += 3) {
			System.out.print(i+"\t");
			j++;
						
			if (j % 5 == 0) 
				System.out.println();
		}
	}

}
