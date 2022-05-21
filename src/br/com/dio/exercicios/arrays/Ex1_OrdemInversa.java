package br.com.dio.exercicios.arrays;
/*
 Crie um vetor de 6 números inteiros
 e mostre-os na ordem inversa.
*/

public class Ex1_OrdemInversa {
    public static void main(String[] args) {
        int[] vetor = {-5, 10, 25, 3, 8};
        int count = 0;

        System.out.print("Vetor: ");
        while(count < vetor.length){
            System.out.print(vetor[count] + " ");
            count++;
        }

        System.out.print("\nVetor Inverso: ");
        for (int i = vetor.length - 1; i >= 0; i--){
            System.out.print(vetor[i] + " ");
        }
    }
}
