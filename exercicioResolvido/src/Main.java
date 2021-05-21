import java.util.Locale;
import java.util.Scanner;

public class Main {

   public static void main(String[] args) {

       Locale.setDefault(Locale.US);
       Scanner sc = new Scanner(System.in);

       double nota1, nota2, notaFinal;

       nota1 = sc.nextDouble();
       nota2 = sc.nextDouble();

       notaFinal = nota1 + nota2;

       if(notaFinal > 60.00)
           System.out.printf("NOTA FINAL = %.1f%n", notaFinal);
       
       else{
           System.out.printf("NOTA FINAL = %.1f%n", notaFinal);
           System.out.println("REPROVADO");
       }
       
       sc.close();
   }
}
