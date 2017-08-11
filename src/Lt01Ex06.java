import java.util.Scanner;

public class Lt01Ex06 {

	public static void main(String[] args) {
		int x, y, c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite x");
		x = sc.nextInt();
		System.out.println("Digite y");
		y = sc.nextInt();
		c = x;
		x= y;
		y = c;
		System.out.println(x);
		System.out.println(y);
		sc.close();
	}
}
