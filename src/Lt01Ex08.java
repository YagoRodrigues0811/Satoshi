import java.util.Scanner;

public class Lt01Ex08 {

	public static void main(String[] args) {
		double deposito;
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o Dep�sito em poupan�a");
		deposito = sc.nextDouble();
		
		System.out.println("Valor ap�s um m�s: "+ (deposito + (deposito*(1.3/100))));
		sc.close();
	}
}
