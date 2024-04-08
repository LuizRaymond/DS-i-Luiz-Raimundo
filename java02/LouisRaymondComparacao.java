package java02;

import java.util.Scanner;

public class LouisRaymondComparacao {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String texto1;
        String texto2;

System.out.println("Ola projeto de garoto(a) de programa, você faz DS? ");
texto1 = scan.nextLine();

System.out.println("Você gosta do seu curso? ");
texto2 = scan.nextLine();

if (texto1.equals(texto2)) {
    System.out.println("Que bacana mano");
} else if (texto1 == "nao" ) {
    System.out.println("Paia, tchau.");
}

    }
}