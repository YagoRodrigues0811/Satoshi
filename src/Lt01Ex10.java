import java.util.Scanner;

public class Lt01Ex10 {

	public static void main(String[] args) {
		double num1, num2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o primeiro número");
		num1 = sc.nextDouble();
		System.out.println("Digite o segundo número");
		num2 = sc.nextDouble();
		
		
		System.out.println("Diferença: "+Math.sqrt(Math.pow(num1-num2, 2)));
		sc.close();
	}
}
