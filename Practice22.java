import java.util.Scanner;

public class Practice22 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요: ");
		int n1 = sc.nextInt();
		System.out.print("정수를 입력하세요: ");
		int n2 = sc.nextInt();
		
		int total1 = sum(n1, n2);
		System.out.println(n1 + "+" + n2 + "="+ total1);
		int total2 = sum(n2, n1);
		System.out.println(n2 + "+" + n1 + "="+ total2);

		sc.close();
	}
	
	public static int sum(int x, int y) {
		int sum = x + y;
		return sum;
	}

}
