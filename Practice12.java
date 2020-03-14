import java.util.Scanner;

public class Practice12 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("키를 입력하세요: ");
		double h = sc.nextInt();
		System.out.print("몸무게를 입력하세요: ");
		double w = sc.nextInt();
		
		double standard = (h - 100) * 0.9;
		System.out.println("표준체중은 " + standard + "입니다.");
		
		if (w > standard) {
			System.out.println("과체중입니다.");
		}
		else {
			System.out.println("저체중입니다.");
		}
		
		sc.close();
	}

}
