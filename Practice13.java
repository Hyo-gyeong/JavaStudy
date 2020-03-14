import java.util.Scanner;

public class Practice13 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int small;
		
		System.out.print("첫 번째 숫자를 입력하세요: ");
		int n1 = sc.nextInt();
		System.out.print("두 번째 숫자를 입력하세요: ");
		int n2 = sc.nextInt();
		
		if (n1 > n2)
			small = n2;
		else
			small = n1;
		
		System.out.print("세 번째 숫자를 입력하세요: ");
		int n3 = sc.nextInt();
		
		if (small > n3)
			small = n3;
		
		System.out.print("가장 작은 숫자는 " + small + "입니다");
		
		sc.close();
	}

}
