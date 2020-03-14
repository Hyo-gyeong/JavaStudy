import java.util.Scanner;

public class Practice09 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("거스름돈 총액: ");
		int ch = sc.nextInt();
		
		System.out.println("500원짜리 동전 : " + (ch / 500) + "개");
		ch %= 500;
		System.out.println("100원짜리 동전: " + (ch / 100) + "개");
		ch %= 100;
		System.out.println("50원짜리 동전: " + (ch / 50) + "개");
		ch %= 50;
		System.out.println("10원짜리 동전: " + (ch / 10) + "개");
		
		sc.close();

	}

}
