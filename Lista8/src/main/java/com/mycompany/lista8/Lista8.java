package com.mycompany.lista8;

import java.util.Scanner;

public class Lista8 {

    public static void Atividade5(Scanner sc) {
        int[][] matriz = new int[5][5];
        boolean encontrou = false;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.println("Escreva o número da linha " + i + " e coluna " + j + ":");
                matriz[i][j] = sc.nextInt();
            }
        }
        System.out.println("Escreva um valor para procurar na matriz: ");
        int valorProcura = sc.nextInt();
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (valorProcura == matriz[i][j]) {
                    System.out.println("Encontrou na linha "+i+" e coluna "+j);
                    break;
                }
            }
            if (encontrou) {
                break;
            }
        }
        if(!encontrou){
            System.out.println("Valor não encontrado!");
        }
    }

    public static void Atividade4(Scanner sc) {
        int[][] matriz = new int[4][4];
        int[] maior = new int[3];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.println("Escreva o número da linha " + i + " e coluna " + j + ":");
                matriz[i][j] = sc.nextInt();
                if (matriz[i][j] > maior[0] || (i == 0 && j == 0)) {
                    maior[0] = matriz[i][j];
                    maior[1] = i;
                    maior[2] = j;
                }
            }
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("A localização da maior matriz é linha " + maior[1] + " coluna " + maior[2]);
    }

    public static void Atividade3() {
        int[][] matriz = new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = i * j;
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void Atividade2() {
        int[][] matriz = new int[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {

                if (i == j) {
                    matriz[i][j] = 1;
                } else {
                    matriz[i][j] = 0;
                }
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void Atividade1(Scanner sc) {
        int[][] matriz = new int[4][4];
        int contador = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.println("Escreva o número da linha " + i + " e coluna " + j + ":");
                matriz[i][j] = sc.nextInt();
                if (matriz[i][j] > 10) {
                    contador++;
                }
            }
        }
        System.out.println("Há " + contador + " números maiores que 10 na matriz.");
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
                    Atividade3();
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
