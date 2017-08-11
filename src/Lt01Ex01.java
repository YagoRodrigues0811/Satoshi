import java.util.Scanner;

public class Lt01Ex01 {
 
	public static void main(String[] args) {
		double base, area;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a base do quadrado");
		base = sc.nextDouble();
		System.out.println("A área é: "+base*base);
		sc.close();
		
	}
}
