import java.util.Scanner;

public class Lt01Ex03 {

	public static void main(String[] args) {
		double base, altura;
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a base do Tri�ngulo");
		base = sc.nextDouble();
		System.out.println("Digite a altura");
		altura = sc.nextDouble();
		
		System.out.println("A �rea do tri�ngulo: "+(base*altura)/2);
		sc.close();
	}
}
