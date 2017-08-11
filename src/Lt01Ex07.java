import java.util.Scanner;

public class Lt01Ex07 {

	public static void main(String[] args) {
		double temperatura;
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a temperatura em celsius");
		temperatura = sc.nextDouble();
		System.out.println("farenait: "+((temperatura*9)+160)/5);
		sc.close();
	}
}
