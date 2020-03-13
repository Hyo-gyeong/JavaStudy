import java.util.Scanner;

public class Practice07 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		final double PI = 3.141592;
		
		System.out.print("원기둥의 반지름: ");
		int r = sc.nextInt();
		System.out.print("원기둥의 높이: ");
		int h = sc.nextInt();
		
		double v = PI * r * r * h;
		System.out.println("원기둥의 부피는 " + v);
		
		sc.close();

	}

}
