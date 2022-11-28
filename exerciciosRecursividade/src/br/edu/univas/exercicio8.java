package br.edu.univas;

import java.util.Scanner;

public class exercicio8 {

    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero!");
        int numero = scanner.nextInt();

        int resultado = calculaFatorial(numero);
        System.out.println(resultado);

    }

    public static int calculaFatorial (int x) {
        
        if (x == 1) {
            return 1;
        }

        return x * calculaFatorial(x - 1);

    }
}
