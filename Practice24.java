import java.util.Scanner;

public class Practice24 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("�̸��� �Է��ϼ���: ");
		String name = sc.next();
		
		greeting(name);
		
		sc.close();
	}
	
	public static void greeting(String name) {
		System.out.println(name + "��, ���� ��ħ�Դϴ�.");
	}

}
