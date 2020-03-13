import java.util.Scanner;

public class Practice08 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("500원 짜리의 개수: ");
		int c1 = sc.nextInt();
		System.out.print("100원 짜리의 개수: ");
		int c2 = sc.nextInt();
		System.out.print("50원 짜리의 개수: ");
		int c3 = sc.nextInt();
		System.out.print("10원 짜리의 개수: ");
		int c4 = sc.nextInt();
		
		int sum = 500 * c1 + 100 * c2 + 50 * c3 + 10 * c4;
		System.out.println("저금통에 있는 총액: " + sum + "원");
		
		sc.close();
	}

}
