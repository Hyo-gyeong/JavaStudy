import java.util.Scanner;

public class Practice26 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num;
		
		do {
			System.out.print("정수를 입력하세요: ");
			num = sc.nextInt();
			System.out.println("잘못된 입력입니다. 다시 입력하세요.");
		}while (num <= 0);
		
		System.out.println("구구단 "+num+"단입니다.");
		printTimes(num);
	
		sc.close();
	}

	public static void printTimes(int n) {
		for (int i = 1; i < 10; i++) {
			System.out.println(n + "*" + i + " = " + (n*i));
			}
	}
}
