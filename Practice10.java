import java.util.Scanner;

public class Practice10 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		final double PI = 3.141592;
		
		System.out.print("원뿔의 반지름: ");
		int r = sc.nextInt();
		System.out.print("원뿔의 높이: ");
		int h = sc.nextInt();
		
		double v = PI * r * r * h / 3;
		System.out.println("원뿔의 부피는 : " + v);
		
		sc.close();
	}

}
