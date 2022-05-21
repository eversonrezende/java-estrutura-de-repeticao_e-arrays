package br.com.dio.exercicios.loops;

/*
Faça um programa que peça uma nota, entre zero e dez.
Mostre uma mensagem caso o valor seja inválido e continue pedindo
até que o usuário informe um valor válido
*/

import java.util.Scanner;

public class Ex2_Nota {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int nota;

        while(true){
            System.out.println("Nota de 0 a 10: ");
            nota = scan.nextInt();

            if (nota >= 0 && nota <= 10){
                break;
            } else {
                System.out.println("Valor inválido, insira novamente!");
            }
        }
    }
}
