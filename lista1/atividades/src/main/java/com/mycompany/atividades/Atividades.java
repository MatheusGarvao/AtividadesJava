package com.mycompany.atividades;

import java.util.Scanner;

public class Atividades {

    public static void Atividade15(Scanner sc) {
        System.out.println("Insira o valor total da sua compra: ");
        double valorTotal = sc.nextDouble();
        double resto = ((valorTotal % 3) / 3);
        double felipe = (valorTotal / 3) + (resto * 2);
        double carlos = (valorTotal / 3) - (resto);
        System.out.println("Felipe irá pagar " + felipe + ", enquanto Carlos e André pagarão " + carlos + " cada.");
    }

    public static void Atividade14(Scanner sc) {
        System.out.println("Qual o raio da sua pizza? (em cm) ");
        int R = sc.nextInt();
        System.out.println("A área de sua pizza é de " + 3.14 * Math.pow(R, 2) + "cm");
    }

    public static void Atividade13(Scanner sc) {
        int numero;
        System.out.println("Insira um valor maior ou igual a 0 até 999");

        do {
            numero = sc.nextInt();
            if (numero < 0 || numero >= 1000) {
                System.out.println("Por favor, informe um número maior ou igual a zero e menor que 1000");
            }
        } while (numero < 0 && numero >= 1000);
        int unidade = (numero - (numero - numero % 10));
        if (numero > 99) {
            System.out.println("Centena: " + numero / 100);
        }
        if (numero > 9) {
            System.out.println("Dezena: " + ((numero - (numero - numero % 100) - unidade) / 10));
        }
        System.out.println("Unidade: " + unidade);
    }

    public static void Atividade12(Scanner sc) {
        System.out.println("Insira o valor do seu salário: ");
        double salario = sc.nextDouble();
        double salarioAumento = salario + (salario * 0.15);
        double salarioDesconto = salarioAumento - (salarioAumento * 0.08);
        System.out.println("Salário: " + salario);
        System.out.println("Salário com 15% de aumento: " + salarioAumento);
        System.out.println("Salário com 8% de desconto: " + salarioDesconto);
    }

    public static void Atividade11(Scanner sc) {
        System.out.println("Insira o número de dias sem acidentes: ");
        int dias = sc.nextInt();
        System.out.println("A quantidade de anos sem acidentes é de " + (dias / 365));
        System.out.println("A quantidade de meses sem acidentes é de " + (dias / 30));
        System.out.println("A quantidade de dias sem acidentes é de " + dias);
    }

    public static void Atividade10(Scanner sc) {
        int coords1[] = {0, 0};
        int coords2[] = {0, 0};

        System.out.println("Escreva o 1º ponto vertical");
        coords1[0] = sc.nextInt();
        System.out.println("Escreva o 1º ponto horizontal");
        coords1[1] = sc.nextInt();
        System.out.println("Escreva o 2º ponto vertical");
        coords2[0] = sc.nextInt();
        System.out.println("Escreva o 2º ponto horizontal");
        coords2[1] = sc.nextInt();

        double distancia = (Math.sqrt(Math.pow((coords2[0] - coords1[0]), 2) + Math.pow((coords2[1] - coords1[1]), 2)));
        System.out.println("A distancia entre as coordenadas ");
        System.out.println("x1: " + coords1[0] + ", y1: " + coords1[1]);
        System.out.println("x2: " + coords2[0] + ", y2: " + coords2[1]);
        System.out.println("é de: " + distancia);
    }

    public static void Atividade9(Scanner sc) {
        int tamanho[] = {0, 0, 0};
        int valor[] = {0, 0, 0};
        int calculo=0;
        String tipo ="";
        for (int x = 0; x < 3; x++) {
            switch (x) {
                case 0 -> {
                    tipo = "Pequenas";
                    calculo = 10;
                }
                case 1 -> {
                    tipo = "Médias";
                    calculo = 12;
                }
                case 2 -> {
                    tipo = "Grandes";
                    calculo = 15;
                }
            }
            System.out.println("Informe quantas camisetas " + tipo + " você quer:");
            tamanho[x] = sc.nextInt();
            valor[x] = tamanho[x] * calculo;
        }
         System.out.println("Soma do valor das camisetas: " + (valor[0] + valor[1] + valor[2]));
        for (int x = 0; x < 3; x++) {
            switch (x) {
                case 0 ->
                    tipo = "Pequenas";
                case 1 ->
                    tipo = "Médias";
                case 2 ->
                    tipo = "Grandes";
            }
         
            System.out.println("quantidade de camisetas " + tipo + ": " + tamanho[x] + ", Arrecadando " + valor[x] + " reais");
        }
    }

    public static void Atividade2(Scanner sc) {
        System.out.println("Insira o número de cavalos: ");
        int cavalos = sc.nextInt();
        System.out.println("A quantidade de ferraduras necessárias é de: " + cavalos * 4);
    }

    public static void Atividade1(Scanner sc) {

        System.out.println("Insira o valor do 1º lado do seu terreno");
        double lado1 = sc.nextDouble();
        System.out.println("Insira o valor do 2º lado do seu terreno");
        double lado2 = sc.nextDouble();
        System.out.println("O valor da área do seu terreno é de: " + lado1 * lado2);

    }

    public static void linha() {
        System.out.println("___________________________________________________________________________");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int option = 0;
        while (option != 16) {
            linha();
            System.out.println("Escolha uma opção entre 1 a 16 referente a atividade passada (16 para sair)");
            option = sc.nextInt();
            linha();
            switch (option) {
                case 1 ->
                    Atividade1(sc);
                case 2 ->
                    Atividade2(sc);
                /*case 3 ->
                    Atividade3(sc);
                case 4 ->
                    Atividade4(sc);
                case 5 ->
                    Atividade5(sc);
                case 6 ->
                    Atividade6(sc);
                case 7 ->
                   Atividade7(sc);
                case 8 ->
                   Atividade8(sc);*/
                case 9 ->
                    Atividade9(sc);
                case 10 ->
                    Atividade10(sc);
                case 11 ->
                    Atividade11(sc);
                case 12 ->
                    Atividade12(sc);
                case 13 ->
                    Atividade13(sc);
                case 14 ->
                    Atividade14(sc);
                case 15 ->
                    Atividade15(sc);
                case 16 ->
                    System.out.println("Saindo!");
                default ->
                    System.out.println("Essa atividade é inexistente!");
            }
        }

    }

}
