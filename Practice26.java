import java.util.Scanner;

public class Practice26 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num;
		
		do {
			System.out.print("������ �Է��ϼ���: ");
			num = sc.nextInt();
			System.out.println("�߸��� �Է��Դϴ�. �ٽ� �Է��ϼ���.");
		}while (num <= 0);
		
		System.out.println("������ "+num+"���Դϴ�.");
		printTimes(num);
	
		sc.close();
	}

	public static void printTimes(int n) {
		for (int i = 1; i < 10; i++) {
			System.out.println(n + "*" + i + " = " + (n*i));
			}
	}
}
