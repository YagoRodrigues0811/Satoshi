import java.util.Scanner;

public class Lt01Ex09 {

	public static void main(String[] args) {
		int num1, num2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o primeiro número");
		num1 = sc.nextInt();
		System.out.println("Digite o segundo número");
		num2 = sc.nextInt();
		System.out.println("Soma dos quadrados: "+((num1*num1)+(num2*num2)));
		sc.close();
	}
}
