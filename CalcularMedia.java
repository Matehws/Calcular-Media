import java.util.Scanner;

public class Exercicio18 {
    
public static void main(String[] args) {
    double m1, n1, n2;

    Scanner ler = new Scanner(System.in);
        
        do {
            System.out.println("Digite a primeira nota: ");
            n1 = ler.nextInt();
        } while (n1 < 0 || n1 > 10);

        do {
            System.out.println("Digite a segunda nota: ");
            n2 = ler.nextInt();
        } while (n2 < 0 || n2 > 10);

        m1 = (n1 + n2) / 2;

        System.out.println("A média das notas é: " + m1);
        ler.close();
}
}
