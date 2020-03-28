import java.util.Scanner;

public class Practice24 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름을 입력하세요: ");
		String name = sc.next();
		
		greeting(name);
		
		sc.close();
	}
	
	public static void greeting(String name) {
		System.out.println(name + "씨, 좋은 아침입니다.");
	}

}
