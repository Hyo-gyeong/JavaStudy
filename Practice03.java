import java.util.Scanner;

public class Practice03 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ ����: ");
		int width = sc.nextInt();
		System.out.print("������ ����: ");
		int height = sc.nextInt();
		
		System.out.println("�簢���� ���̴� " + (width * height) + "�Դϴ�.");
		
		sc.close();
	}
}
