import java.util.Scanner;

public class Practice05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� ��: ");
		int money = sc.nextInt();
		
		System.out.print("��ǰ�� �Ѿ�: ");
		int total = sc.nextInt();
		
		int vat = total / 10;
		System.out.println("�ΰ���: " + vat);
		int change = money - total;
		System.out.println("�ܵ�: " + change);
		
		sc.close();
	}
}
