import java.util.Scanner;

public class Practice23 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �Է��ϼ��� : ");
		int num = sc.nextInt();
		
		int abs = abs(num);
		System.out.println("�Էµ� ����"+num+"�� ������ " + abs + "�Դϴ�.");

		sc.close();
	}
	
	public static int abs(int n) {
		if (n < 0)
			n = -n;
		return n;
	}

}