import java.util.Scanner;

public class Practice11 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("화씨온도를 입력하세요: ");
		int F = sc.nextInt();
		
		double C = 5 / (double)9 * ( F - 32 ); //5/9(X)
		System.out.print("화씨 " + F + "도는 섭씨 "+ C + "에 해당합니다.");

		sc.close();
	}

}
