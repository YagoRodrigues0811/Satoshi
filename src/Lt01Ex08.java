import java.util.Scanner;

public class Lt01Ex08 {

	public static void main(String[] args) {
		double deposito;
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o Depósito em poupança");
		deposito = sc.nextDouble();
		
		System.out.println("Valor após um mês: "+ (deposito + (deposito*(1.3/100))));
		sc.close();
	}
}
