package com.mycompany.nonalista;

import java.util.Random;
import java.util.Scanner;

public class NonaLista {

    public static void Atividade4(Scanner sc) {
        double[][] alunos = new double[5][4];
        double[] maior = new double[2];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
                switch (j) {
                    case 0 -> {
                        System.out.println("Informe o número de matrícula do " + (j + 1) + "º aluno:");
                    }
                    case 1 -> {
                        System.out.println("Informe a média das provas do " + (j + 1) + "º aluno:");
                    }
                    case 2 -> {
                        System.out.println("Informe a média dos trabalhos do " + (j + 1) + "º aluno:");
                    }
                }
                alunos[i][j] = sc.nextDouble();
            }
            alunos[i][3] = alunos[i][2] + alunos[i][1];
            if (i == 0) {
                maior[0] = alunos[i][0];
                maior[1] = alunos[i][3];
            } else {
                if (alunos[i][3] > maior[1]) {
                    maior[0] = alunos[i][0];
                    maior[1] = alunos[i][3];
                }
            }
        }
        double media = (alunos[0][3] + alunos[1][3] + alunos[2][3] + alunos[3][3] + alunos[4][3]) / 4;
        System.out.println("Média das notas finais: " + media);
        System.out.println("Aluno com maior nota: " + maior[0]);
    }

    public static void Atividade3(Scanner sc) {
        Random rand = new Random();
        int[][] matriz = gerarMatriz(sc, 5, 5, 1);
        boolean correto = false;
        while (!correto) {
            correto = true;
            for (int k = 0; k < 5; k++) {
                for (int l = 0; l < 5; l++) {
                    for (int i = 0; i < 5; i++) {
                        for (int j = 0; j < 5; j++) {
                            if (matriz[i][j] == matriz[k][l]) {
                                if (i != k && j != l) {
                                    matriz[i][j] = rand.nextInt(100);
                                    correto = false;
                                }
                            }
                        }
                    }
                }
            }
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("| " + matriz[i][j] + " |");
            }
            System.out.println();
        }
    }

    public static void Atividade2(Scanner sc) {
        int[][] matriz = gerarMatriz(sc, 3, 3, 0);
        int soma = matriz[1][0] + matriz[2][0] + matriz[2][1];
        System.out.println("A soma dos números abaixo da diagonal principal é de: " + soma);
    }

    public static void Atividade1(Scanner sc) {
        int[][] matriz = gerarMatriz(sc, 3, 3, 0);
        int soma = 0;
        for (int i = 0; i < 3; i++) {
            soma += matriz[i][i];
        }
        System.out.println("A soma da diagonal principal é de: " + soma);
    }

    public static int[][] gerarMatriz(Scanner sc, int x, int y, int procedimento) {
        int[][] matriz = new int[x][y];
        Random rand = new Random();
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                switch (procedimento) {
                    case 0 -> {
                        System.out.println("Escreva o número da linha " + i + " e coluna " + j + ":");
                        matriz[i][j] = sc.nextInt();
                    }
                    case 1 ->
                        matriz[i][j] = rand.nextInt(100);
                }
            }
        }
        return matriz;
    }

    public static void linha() {
        System.out.println("___________________________________________________________________________");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int option = 0;
        while (option != 6) {
            linha();
            System.out.println("Escolha uma opção entre 1 a 4 referente a atividade passada (5 para sair)");
            option = sc.nextInt();
            linha();
            switch (option) {
                case 1 ->
                    Atividade1(sc);
                case 2 ->
                    Atividade2(sc);
                case 3 ->
                    Atividade3(sc);
                case 4 ->
                    Atividade4(sc);
                case 5 ->
                    System.out.println("Saindo!");
                default ->
                    System.out.println("Essa atividade é inexistente!");
            }
        }
    }

}
