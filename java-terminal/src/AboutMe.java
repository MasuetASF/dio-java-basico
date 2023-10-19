import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    
    public static void main(String[] args) {    

        Scanner entrada = new Scanner(System.in).useLocale(Locale.US);

            System.out.println("Digite o seu nome");
            String nome = entrada.next();

            System.out.println("Digite o seu sobrenome");
            String sobrenome = entrada.next(); 

            System.out.println("Digite a sua idade");
            int idade = entrada.nextInt();

            System.out.println("Digite a sua altura");
            double altura = entrada.nextDouble();



            System.out.println("Olá, me chamo " + nome + " "+ sobrenome);
            System.out.println("Tenho " + idade);
            System.out.println("Minha altura é " + altura +"cm");

        entrada.close();
    }
}
