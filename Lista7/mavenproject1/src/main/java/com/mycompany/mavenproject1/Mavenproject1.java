package com.mycompany.mavenproject1;

import java.util.Arrays;
import java.util.Scanner;

public class Mavenproject1 {

    public static void Atividade1(Scanner sc) {

        int vetorA[] = new int[10];
        int vetorB[] = new int[10];
        int vetorC[] = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.println("Entre o valor do vetor A posicao " + (i + 1));
            vetorA[i] = sc.nextInt();
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("Entre o valor do vetor B posicao " + (i + 1));
            vetorB[i] = sc.nextInt();
        }
        for (int i = 0; i < 10; i++) {
            vetorC[i] = vetorA[i] - (vetorB[i] * vetorA[i]);
            System.out.println("Vetor C posicao " + (i + 1) + ": " + vetorC[i]);
        }
    }

    public static void Atividade2() {
        int vetorNaturais[] = new int[100];
        int i = 0;
        int j = 0;
        while (i < 100) {
            j++;
            if (j % 7 != 0 || j % 10 == 7) {
                vetorNaturais[i] = j;
                System.out.println(vetorNaturais[i]);
                i++;
            }
        }
    }

    public static void Atividade3(Scanner sc) {
        int numerosInt[] = new int[6];
        for (int i = 0; i < 6; i++) {
            System.out.println("Entre o " + (i + 1) + "º numero:");
            numerosInt[i] = sc.nextInt();
        }
        System.out.println("Numeros pares: ");
        int somaPares = 0;
        for (int i = 0; i < 6; i++) {
            if (numerosInt[i] % 2 == 0) {
                System.out.print(numerosInt[i] + " ");
                somaPares = somaPares + numerosInt[i];
            }
        }
        System.out.println("\nSoma dos numeros pares: " + somaPares);
        System.out.println("Numeros impares: ");
        int quantidadeImpares = 0;
        for (int i = 0; i < 6; i++) {
            if (numerosInt[i] % 2 != 0) {
                System.out.print(numerosInt[i] + " ");
                quantidadeImpares++;
            }
        }
        System.out.println("\nQuantidade de numeros impares: " + quantidadeImpares);
    }

    public static void Atividade4(Scanner sc) {
        int j;
        String vetor1[] = new String[10];
        String vetor2[] = new String[10];
        for (int i = 0; i < 10; i++) {
            System.out.println("Entre o valor do vetor 1 posicao " + (i + 1));
            vetor1[i] = sc.next();
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("Entre o valor do vetor 2 posicao " + (i + 1));
            vetor2[i] = sc.next();
        }
        System.out.println("Elementos do vetor 3:\n");
        String vetor3[] = new String[20];
        vetor3[0] = vetor1[0];
        if (vetor2[0].equals(vetor3[0])) {
            vetor3[1] = "";
        } else {
            vetor3[1] = vetor2[0];
        }
        j = 1;
        boolean repetido = false;
        for (int i = 2; i < 20;) {
            for (int k = i - 1; k >= 0; k--) {
                if (vetor1[j].equals(vetor3[k])) {
                    repetido = true;
                    vetor3[i] = "";
                    break;
                }
            }
            if (repetido == false) {
                vetor3[i] = vetor1[j];
            }
            repetido = false;
            for (int k = i; k >= 0; k--) {
                if (vetor2[j].equals(vetor3[k])) {
                    repetido = true;
                    vetor3[i + 1] = "";
                    break;
                }
            }
            if (repetido == false) {
                vetor3[i + 1] = vetor2[j];
            }
            repetido = false;
            i++;
            i++;
            j++;
        }
        for (int i = 0; i < 20; i++) {
            if (!vetor3[i].equals("")) {
                System.out.println(vetor3[i]);
            }
        }
    }

    public static void Atividade5(Scanner sc) {
        System.out.println("Insira um número inteiro");
        int numero = sc.nextInt();
        int[] novo = new int[numero];
        int[] anterior = new int[numero];

        for (int i = 0; i < numero; i++) {
            for (int x = 0; x <= i; x++) {
                if (x == 0 || x == 1) {
                    novo[x] = 1;
                } else {
                    novo[x] = anterior[x] + anterior[x - 1];
                }
                System.out.print(novo[x] + " ");
            }
            anterior = Arrays.copyOf(novo, novo.length);
            System.out.println();
        }
    }

    public static void linha() {
        System.out.println("___________________________________________________________________________");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int option = 0;
        while (option != 6) {
            linha();
            System.out.println("Escolha uma opção entre 1 a 5 referente a atividade passada (6 para sair)");
            option = sc.nextInt();
            linha();
            switch (option) {
                case 1 ->
                    Atividade1(sc);
                case 2 ->
                    Atividade2();
                case 3 ->
                    Atividade3(sc);
                case 4 ->
                    Atividade4(sc);
                case 5 ->
                    Atividade5(sc);
                case 6 ->
                    System.out.println("Saindo!");
                default ->
                    System.out.println("Essa atividade é inexistente!");
            }
        }
    }
}
