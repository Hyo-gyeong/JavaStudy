import java.util.Scanner;

public class Practice06 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�̸�: ");
		String name = sc.next();
		System.out.print("����: ");
		int age = sc.nextInt();
		
		System.out.println("�̸��� " + name + "�̰� ���̴� " + age + "���Դϴ�.");
		
		sc.close();
	}
}
