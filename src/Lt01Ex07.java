import java.util.Scanner;

public class Lt01Ex07 {

	public static void main(String[] args) {
		double comprimento, altura, largura;
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o comprimento");
		comprimento = sc.nextDouble();
		System.out.println("Digite a altura");
		altura = sc.nextDouble();
		System.out.println("Digite a largura");
		largura = sc.nextDouble();
		System.out.println("Volume: "+altura*comprimento*largura);
		sc.close();
	}
}
