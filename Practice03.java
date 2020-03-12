import java.util.Scanner;

public class Practice03 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("가로의 길이: ");
		int width = sc.nextInt();
		System.out.print("세로의 길이: ");
		int height = sc.nextInt();
		
		System.out.println("사각형의 넓이는 " + (width * height) + "입니다.");
		
		sc.close();
	}
}
