import java.util.Scanner;
import java.lang.Math;

public class Questao11 {
    public static void main(String[] args) {
        System.out.println("Informe um número inteiro: ");
        int num1;
        Scanner leia = new Scanner(System.in);
        num1 = leia.nextInt();

        System.out.println("Informe outro número inteiro: ");
        int num2;
        num2 = leia.nextInt();

        System.out.println("Informe um número real: ");
        double num3;
        num3 = leia.nextDouble();
        leia.close();
        int dobro;

        dobro = (num1 * 2) * (num2 / 2);

        System.out.println(dobro);

        double triplo;

        triplo = (num1 * 3) + num3;

        System.out.println(triplo);

        double cubo;

        cubo = Math.pow(num3, 3);

        System.out.println(cubo);
    }

}