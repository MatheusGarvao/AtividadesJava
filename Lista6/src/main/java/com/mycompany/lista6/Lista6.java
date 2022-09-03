package com.mycompany.lista6;

import java.util.Arrays;
import java.util.Scanner;

public class Lista6 {

    public static void Atividade5(Scanner sc) {
        double[] numeros = new double[5];
        int codigo;

        for (int i = 0; i < 5; i++) {
            System.out.println("Por favor, informe o " + (i + 1) + "º número:");
            numeros[i] = sc.nextDouble();
        }

        System.out.println("Insira um código (0 = sair, 1 = ordem direta, 2 = ordem inversa): ");
        codigo = sc.nextInt();
        switch (codigo) {
            case 0 ->
                System.out.println("Código 0 inserido, voltando ao menu");
            case 1 -> {
                System.out.println("Ordem direta: ");
                for (int i = 0; i < 5; i++) {
                    System.out.print(numeros[i] + " ");
                }
            }
            case 2 -> {
                System.out.println("Ordem Inversa: ");
                for (int i = 5; i >= 0; i--) {
                    System.out.print(numeros[i] + " ");
                }
            }
            default ->
                System.out.println("Código inválido");
        }
    }

    public static void Atividade4(Scanner sc) {
        int[] numeros = new int[20];
        boolean diferente = true;
        for (int i = 0; i < 20; i++) {
            System.out.println("Por favor, informe o " + (i + 1) + "º número:");
            numeros[i] = sc.nextInt();
        }
        System.out.println("Os números excluindo repitidos são:");
        System.out.println();
        for (int i = 0; i < 20; i++) {
            for (int k = 0; k < i; k++) {
                if ((numeros[i] == numeros[k]) && (i != k)) {
                    diferente = false;
                }
            }
            if (diferente) {
                System.out.print(numeros[i] + " ");
            }
            diferente = true;
        }
    }

    public static void Atividade3(Scanner sc) {
        double[] numeros = new double[10];
        double[] iguais = new double[10];
        int vazio = 0;
        for (int i = 0; i < 10; i++) {
            System.out.println("Por favor, informe o " + (i + 1) + "º número:");
            numeros[i] = sc.nextDouble();
        }
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j <= i; j++) {
                if ((numeros[i] == numeros[j]) && (j != i)) {
                    for (int k = 0; k < 10; k++) {
                        if (numeros[i] == iguais[k]) {
                            break;
                        } else if (k == 9) {
                            iguais[vazio] = numeros[i];
                            vazio++;
                        }
                    }
                }
            }
        }
        if (vazio != 0) {
            System.out.println("Os seguinte(s) número(s) se repetem:");
            System.out.println();
            for (int l = 0; l < vazio - 1; l++) {
                System.out.print(iguais[l] + ", ");
            }
            System.out.println(iguais[vazio - 1]);
        } else {
            System.out.println("Nenhum número repitido!");
        }
    }

    public static void Atividade2(Scanner sc) {
        double[] numeros = new double[5];
        double media = 0;
        for (int i = 0; i < 5; i++) {
            System.out.println("Por favor, informe o " + (i + 1) + "º número:");
            numeros[i] = sc.nextDouble();
            media += numeros[i];
        }
        media = media / 5;
        System.out.println("Foi inserido os seguintes números:");
        for (int i = 0; i < 4; i++) {
            System.out.print(numeros[i] + ", ");
        }
        System.out.println(numeros[4]);
        Arrays.sort(numeros);
        System.out.println("O maior número: " + numeros[4]);
        System.out.println("O menor número: " + numeros[0]);
        System.out.println("A média dos valores é de " + media);
    }

    public static void Atividade1(Scanner sc) {
        double[] numeros = new double[10];
        double soma = 0;
        int contador = 0;
        for (int i = 0; i < 10; i++) {
            System.out.println("Por favor, informe o " + (i + 1) + "º número:");
            numeros[i] = sc.nextDouble();
            if (numeros[i] < 0) {
                contador += i;
            } else {
                soma += numeros[i];
            }
        }
        System.out.println("Quantidade de números negativos:");
        System.out.println(contador);
        System.out.println("Soma dos números positivos:");
        System.out.println(soma);
    }

    public static void linha() {
        System.out.println("___________________________________________________________________________");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int option = 0;
        while (option != 7) {
            linha();
            System.out.println("Escolha uma opção entre 1 a 6 referente a atividade passada (7 para sair)");
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
                    Atividade5(sc);
                /*case 6 ->
                    Atividade6(sc);*/
                case 7 ->
                    System.out.println("Saindo!");
                default ->
                    System.out.println("Essa atividade é inexistente!");
            }
        }
    }
}
