import java.util.Scanner;

public class Practice13 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int small;
		
		System.out.print("ù ��° ���ڸ� �Է��ϼ���: ");
		int n1 = sc.nextInt();
		System.out.print("�� ��° ���ڸ� �Է��ϼ���: ");
		int n2 = sc.nextInt();
		
		if (n1 > n2)
			small = n2;
		else
			small = n1;
		
		System.out.print("�� ��° ���ڸ� �Է��ϼ���: ");
		int n3 = sc.nextInt();
		
		if (small > n3)
			small = n3;
		
		System.out.print("���� ���� ���ڴ� " + small + "�Դϴ�");
		
		sc.close();
	}

}
