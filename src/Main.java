import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner numeroUmScanner = new Scanner(System.in);
        System.out.println("Digite um numero:");
        int numeroUm = numeroUmScanner.nextInt();

        Scanner numeroDoisScanner = new Scanner(System.in);
        System.out.print("Digite outro numero: \n");
        int numeroDois = numeroDoisScanner.nextInt();


        System.out.println("A soma dos numeros é: \n");
        System.out.println(numeroUm+numeroDois);

    }
}