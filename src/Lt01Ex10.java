import java.util.Scanner;

public class Lt01Ex10 {

	public static void main(String[] args) {
		double num1, num2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o primeiro n�mero");
		num1 = sc.nextDouble();
		System.out.println("Digite o segundo n�mero");
		num2 = sc.nextDouble();
		
		
		System.out.println("Diferen�a: "+Math.sqrt(Math.pow(num1-num2, 2)));
		sc.close();
	}
}
