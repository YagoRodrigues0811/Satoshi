import java.util.Scanner;

public class Lt01Ex02 {

	public static void main(String[] args) {
		double salario;
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o sal�rio atual");
		salario = sc.nextDouble();
		System.out.println("O novo sal�rio � :"+salario*1.15);
		sc.close();
		
	}
}
