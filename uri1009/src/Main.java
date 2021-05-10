import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String nome;
		double salario, vendas, total;
		
		nome = sc.next();
		salario = sc.nextDouble();
		vendas = sc.nextDouble();
		
		total = salario + vendas * 0.15;
		
		System.out.printf("TOTAL = R$ %.2f%n" , total);
		
		sc.close();
	}

}
