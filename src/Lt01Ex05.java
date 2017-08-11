import java.util.Scanner;

public class Lt01Ex05 {

	public static void main(String[] args) {
		int a, b, c;
		double delta, x1, x2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a");
		a = sc.nextInt();
		System.out.println("Digite b");
		b = sc.nextInt();
		System.out.println("Digite c");
		c = sc.nextInt();
		
		delta = (b*b)-4*a*c;
		
		x1 = (-b+Math.sqrt(delta))/2*a;
		x2 = (-b-Math.sqrt(delta))/2*a;
		
		System.out.println(x1);
		System.out.println(x2);
		sc.close();
	}
}
