import java.util.Scanner;

public class Practice05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("¹ÞÀº µ·: ");
		int money = sc.nextInt();
		
		System.out.print("»óÇ°ÀÇ ÃÑ¾×: ");
		int total = sc.nextInt();
		
		int vat = total / 10;
		System.out.println("ºÎ°¡¼¼: " + vat);
		int change = money - total;
		System.out.println("ÀÜµ·: " + change);
		
		sc.close();
	}
}
