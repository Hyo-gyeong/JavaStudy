import java.util.Scanner;

public class Practice07 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		final double PI = 3.141592;
		
		System.out.print("������� ������: ");
		int r = sc.nextInt();
		System.out.print("������� ����: ");
		int h = sc.nextInt();
		
		double v = PI * r * r * h;
		System.out.println("������� ���Ǵ� " + v);
		
		sc.close();

	}

}
