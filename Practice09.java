import java.util.Scanner;

public class Practice09 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�Ž����� �Ѿ�: ");
		int ch = sc.nextInt();
		
		System.out.println("500��¥�� ���� : " + (ch / 500) + "��");
		ch %= 500;
		System.out.println("100��¥�� ����: " + (ch / 100) + "��");
		ch %= 100;
		System.out.println("50��¥�� ����: " + (ch / 50) + "��");
		ch %= 50;
		System.out.println("10��¥�� ����: " + (ch / 10) + "��");
		
		sc.close();

	}

}
