import java.util.Scanner;

public class Practice11 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ȭ���µ��� �Է��ϼ���: ");
		int F = sc.nextInt();
		
		double C = 5 / (double)9 * ( F - 32 ); //5/9(X)
		System.out.print("ȭ�� " + F + "���� ���� "+ C + "�� �ش��մϴ�.");

		sc.close();
	}

}
