import java.util.Scanner;

public class Practice14 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double y;
		
		System.out.print("x값을 입력하세요: ");
		double x = sc.nextDouble();
		
		if (x > 0) {
			y = (7 * x) + 2;
			System.out.println("f(x) = " + y);
		}
		else {
			y = (x * x * x) - (9 * x) + 2;
			System.out.println("f(x) = " + y);
		}
		
		sc.close();
	}

}
