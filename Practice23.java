import java.util.Scanner;

public class Practice23 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 : ");
		int num = sc.nextInt();
		
		int abs = abs(num);
		System.out.println("입력된 정수"+num+"의 절댓값은 " + abs + "입니다.");

		sc.close();
	}
	
	public static int abs(int n) {
		if (n < 0)
			n = -n;
		return n;
	}

}