package br.com.dio.exercicios.arrays;
/*
Faça um programa que leia 20 números inteiros aleatórios (entre 0 e 100) e armazene-os num vetor.
Ao final mostre os números e seus sucessores.
*/

import java.util.Random;

public class Ex3_NumerosAleatorios {
    public static void main(String[] args) {
        Random aleatorio = new Random();

        int[] vetor = new int[20];

        System.out.println("Vetor de Números Aleatórios: ");
        for (int i = 0; i < vetor.length; i++){
            int numero = aleatorio.nextInt(100);
            vetor[i] = numero;

            System.out.print(vetor[i] + " ");
        }

        System.out.println("\nVetor de Sucessores dos Números Aleatórios: ");
        for ( int numero : vetor) {
            System.out.print((numero+1) + " ");
        }

    }
}
