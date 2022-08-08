package com.mycompany.segundalista;

import java.util.Scanner;

public class SegundaLista {

    public static void Atividade9(Scanner sc) {
        System.out.println("Qual a sua altura?");
        int altura = sc.nextInt();
        sout
    }

    public static void Atividade8(Scanner sc) {
        int[] numero = new int[5];
        int i = 0, x, aux;
        do {
            System.out.println("Insira o " + (i + 1) + "º número:");
            numero[i] = sc.nextInt();
            for (x = 0; x < 5; x++) {
                if (numero[i] == numero[x] && i != x) {
                    System.out.println("Este número já está cadastrado");
                    linha();
                    i--;
                    break;
                }
            }
            i++;
        } while (i < 5);

        do {
            x = 0;
            for (i = 0; i <= 3; i++) {
                if (numero[i] > numero[i + 1]) {
                    aux = numero[i];
                    numero[i] = numero[i + 1];
                    numero[i + 1] = aux;
                    x = 1;
                }
            }
        } while (x != 0);
        System.out.println("A ordem crescente dos números é ");
        for (i = 0; i <= 3; i++) {
            System.out.print(numero[i] + ", ");
        }
        System.out.println(numero[4] + ".");

    }

    public static void Atividade7(Scanner sc) {
        System.out.println("Insira um número:");
        int numero = sc.nextInt();
        if (numero % 2 == 0) {
            System.out.println("O numero digitado foi somado 5 e resultou em " + (numero + 5));
        } else {
            System.out.println("O numero digitado foi somado 8 e resultou em " + (numero + 8));
        }
    }

    public static void Atividade6(Scanner sc) {
        double numeros[] = {0, 0, 0};
        double aux, x;
        int i;
        for (i = 0; i <= 2; i++) {
            System.out.println("Insira o " + (i + 1) + "º número:");
            numeros[i] = sc.nextInt();
        }

        do {
            x = 0;
            for (i = 0; i <= 1; i++) {
                if (numeros[i] < numeros[i + 1]) {
                    aux = numeros[i + 1];
                    numeros[i + 1] = numeros[i];
                    numeros[i] = aux;
                    x = 1;
                }
            }
        } while (x != 0);
        System.out.println("A numeração decrescente é: " + numeros[0] + ", " + numeros[1] + ", " + numeros[2]);
    }

    public static void Atividade5(Scanner sc) {
        System.out.println("Insira um número:");
        int numero = sc.nextInt();
        if (numero < 0) {
            System.out.println("O triplo do seu número é: " + (numero * 3));
        } else {
            if (numero > 0) {
                System.out.println("O dobro do seu número é: " + (numero * 2));
            } else {
                System.out.println("O seu número é 0");
            }
        }

    }

    public static void Atividade4(Scanner sc) {
        int valores[] = {0, 0, 0};
        String operacao;
        System.out.println("Insira o primeiro valor:");
        valores[0] = sc.nextInt();
        System.out.println("Insira o segundo valor:");
        valores[1] = sc.nextInt();
        if (valores[0] == valores[1]) {
            valores[2] = valores[0] + valores[1];
            operacao = "soma";
        } else {
            valores[2] = valores[0] * valores[1];
            operacao = "multiplicação";
        }
        System.out.println("foi feito uma " + operacao + " e resultou em " + valores[2]);
    }

    public static void Atividade3(Scanner sc) {
        double equacao[] = {0, 0, 0};
        System.out.println("Informe o valor de A:");
        equacao[0] = sc.nextDouble();
        if (equacao[0] != 0) {
            System.out.println("Informe o valor de B");
            equacao[1] = sc.nextDouble();
            System.out.println("Informe o valor de C");
            equacao[2] = sc.nextDouble();
            double delta = Math.pow(equacao[1], 2) - 4 * equacao[0] * equacao[2];
            System.out.println(0>delta);
            if (0 < delta) {
                double bhaskara[] = {0, 0};
                if (delta == 0) {
                    System.out.println("A equação possuí somente 1 raiz!");
                    bhaskara[0] = (-1 * equacao[1]) / (2 * equacao[0]);
                    System.out.println("Raiz: " + bhaskara[0]);
                } else {
                    bhaskara[0] = (-1 * equacao[1] + Math.sqrt(delta)) / (2 * equacao[0]);
                    bhaskara[1] = (-1 * equacao[1] - Math.sqrt(delta)) / (2 * equacao[0]);
                    System.out.println("raiz 1: " + bhaskara[0]);
                    System.out.println("raiz 2: " + bhaskara[1]);
                }
            } else {
                System.out.println("A equação não possui raizes reais! delta é: " + delta);
            }
        } else {
            System.out.println("O valor de A não corresponde a raízes reais!");
        }
    }

    public static void Atividade2(Scanner sc, SegundaLista obj) {
        String pessoa[] = {"", "", ""};
        int anos,x;
        String vogal = "";
        System.out.println("Qual é o seu nome?");
        pessoa[0] = sc.next();
        System.out.println("Qual é o seu sexo?");
       
        pessoa[1] = obj.sexo(sc);
        switch (pessoa[1]) {
            case "MASCULINO" -> {
                vogal = "O";
            }
            case "FEMININO" -> {
                vogal = "A";
            }
        }
        System.out.println("Qual o seu estado civíl?");
        do {
            x = 0;
            System.out.println("S = SOLTEI" + vogal);
            System.out.println("C = CASAD" + vogal);
            System.out.println("SS = SEPARAD" + vogal);
            System.out.println("D = DIVORCIAD" + vogal);
            System.out.println("V = VIÚV" + vogal);
            pessoa[2] = sc.next();
            switch (pessoa[2]) {
                case "S" ->
                    pessoa[2] = "SOLTEIR" + vogal;
                case "C" ->
                    pessoa[2] = "CASAD" + vogal;
                case "SS" ->
                    pessoa[2] = "SEPARAD" + vogal;
                case "D" ->
                    pessoa[2] = "DIVORCIAD" + vogal;
                case "V" ->
                    pessoa[2] = "VIÚV" + vogal;
                default -> {
                    x = 1;
                    System.out.println("Por favor, escolha uma opção válida!");
                }
            }
        } while (x == 1);
        if (pessoa[2].equals("CASADA")) {
            System.out.println("A quantos anos você está casada?");
            anos = sc.nextInt();
        }
        System.out.println("Cadastro executado com sucesso!");
    }

    public static void Atividade1(Scanner sc) {
        double valores[] = {0, 0, 0};
        for (int i = 0; i <= 2; i++) {
            System.out.println("Insira o " + i + 1 + "º Valor: ");
            valores[i] = sc.nextDouble();
        }
        if ((valores[0] + valores[1]) < valores[2]) {
            System.out.println("A soma dos valores A e B é menor que o valor C");
        } else {
            System.out.println("A soma dos valores A e B NÃO é menor que o valor C");
        }
        System.out.println("Valor A: " + valores[0]);
        System.out.println("Valor B: " + valores[1]);
        System.out.println("Valor C: " + valores[2]);
        System.out.println("Soma do valor A e B: " + (valores[0] + valores[1]));
    }

    public static void linha() {
        System.out.println("___________________________________________________________________________");
    }

    public String sexo(Scanner sc) {
        System.out.println("Qual é o seu sexo? (escolha entre em maiusculo F/M):");
        int x;
        String sexo;
        do {
            x = 0;
            sexo = sc.next();
            switch (sexo) {
                case "M" -> {
                    sexo = "MASCULINO";
                }
                case "F" -> {
                    sexo = "FEMININO";
                }
                default -> {
                    x = 1;
                    System.out.println("Por favor, utilize apenas M ou F em MAIUSCULO!");
                }
            }
        } while (x == 1);
        return sexo;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SegundaLista obj = new SegundaLista();
        int option = 0;
        while (option != 16) {
            linha();
            System.out.println("Escolha uma opção entre 1 a 15 referente a atividade passada (16 para sair)");
            option = sc.nextInt();
            linha();
            switch (option) {
                case 1 ->
                    Atividade1(sc);
                case 2 ->
                    Atividade2(sc, obj);
                case 3 ->
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
                    Atividade8(sc);/*
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
                    Atividade15(sc);*/
                case 16 ->
                    System.out.println("Saindo!");
                default ->
                    System.out.println("Essa atividade é inexistente!");
            }
        }
    }
}
