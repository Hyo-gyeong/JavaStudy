import java.util.Scanner;

public class Practice04 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("원하는 마일을 입력하세요: ");
		double m = input.nextDouble();
		
		double k = m  * 1.609;
		System.out.println(m + "마일은 "+ k +"킬로입니다.");
		
		input.close();
	}
}