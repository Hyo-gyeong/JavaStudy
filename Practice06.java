import java.util.Scanner;

public class Practice06 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름: ");
		String name = sc.next();
		System.out.print("나이: ");
		int age = sc.nextInt();
		
		System.out.println("이름은 " + name + "이고 나이는 " + age + "세입니다.");
		
		sc.close();
	}
}
