import java.util.Scanner;

public class Practice04 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("���ϴ� ������ �Է��ϼ���: ");
		double m = input.nextDouble();
		
		double k = m  * 1.609;
		System.out.println(m + "������ "+ k +"ų���Դϴ�.");
		
		input.close();
	}
}