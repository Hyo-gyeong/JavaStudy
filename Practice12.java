import java.util.Scanner;

public class Practice12 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ű�� �Է��ϼ���: ");
		double h = sc.nextInt();
		System.out.print("�����Ը� �Է��ϼ���: ");
		double w = sc.nextInt();
		
		double standard = (h - 100) * 0.9;
		System.out.println("ǥ��ü���� " + standard + "�Դϴ�.");
		
		if (w > standard) {
			System.out.println("��ü���Դϴ�.");
		}
		else {
			System.out.println("��ü���Դϴ�.");
		}
		
		sc.close();
	}

}
