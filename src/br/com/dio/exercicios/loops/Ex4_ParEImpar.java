package br.com.dio.exercicios.loops;

import java.util.Scanner;

/*
Faça um programa que peça N números inteiros,
calcule e mostre a quantidade de números pares
e a quantidade de números ímpares.
*/
public class Ex4_ParEImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int quantidadeDeNumeros, numero;

        System.out.println("Informe uma quantidade de números inteiros: ");
        quantidadeDeNumeros = scan.nextInt();

        int count = 0, quantidadePares = 0, quantidadeImpares = 0;

        do {
            System.out.println("Informe um número: ");
            numero = scan.nextInt();

            if(numero % 2 == 0) quantidadePares++;
            else quantidadeImpares++;

            count++;
        } while(count < quantidadeDeNumeros);

        System.out.println("Total de números ímpares: " + quantidadeImpares);
        System.out.println("Total de números pares: " + quantidadePares);
    }
}
