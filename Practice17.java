import java.util.Scanner;

public class Practice17 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �ϳ� �Է��ϼ���: ");
		int num  = sc.nextInt();
		
		for (int i = 0; 3*i <= num; i++) {
			System.out.print(3*i +"\t");
			
			if ((i+1) % 5 == 0)
				System.out.println();
		}
		
		sc.close();
	}
}
