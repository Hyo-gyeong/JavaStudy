import java.util.Scanner;

public class Practice08 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("500�� ¥���� ����: ");
		int c1 = sc.nextInt();
		System.out.print("100�� ¥���� ����: ");
		int c2 = sc.nextInt();
		System.out.print("50�� ¥���� ����: ");
		int c3 = sc.nextInt();
		System.out.print("10�� ¥���� ����: ");
		int c4 = sc.nextInt();
		
		int sum = 500 * c1 + 100 * c2 + 50 * c3 + 10 * c4;
		System.out.println("�����뿡 �ִ� �Ѿ�: " + sum + "��");
		
		sc.close();
	}

}
