/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.terceiralista;

import java.util.Scanner;

public class TerceiraLista {

    public static void Atividade10e11(Scanner sc) {
        int i, x, y, contador = 0, soma = 0;
        int[] numero = new int[2];
        System.out.println("Informe o primeiro número");
        numero[0] = sc.nextInt();
        System.out.println("Informe o segundo número");
        numero[1] = sc.nextInt();
        if (numero[0] > numero[1]) {
            x = 1;
            y = 0;
        } else {
            x = 0;
            y = 1;
        }
        for (i = numero[x]; i <= numero[y]; i++) {
            contador++;
            if (contador == 20) {
                System.out.println(i + " ");
                contador = 0;
            } else {
                System.out.print(i + " ");
            }
            soma += i;
        }
        System.out.println();
        System.out.println("Soma dos números: " + soma);
    }

    public static void Atividade9() {
        for (int i = 1; i <= 50; i++) {
            if (i % 2 == 1) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void Atividade8(Scanner sc) {
        int[] numero = new int[5];
        int soma = 0;
        double media;
        for (int i = 0; i < numero.length; i++) {
            System.out.println("Escreva o " + (i + 1) + "º número:");
            numero[i] = sc.nextInt();
            soma += numero[i];
        }
        media = soma / numero.length;
        System.out.println("A soma dos " + (numero.length) + " é de: " + soma);
        System.out.println("A média é de " + media);
    }

    public static void Atividade7(Scanner sc) {
        int[] numero = new int[5];
        int maior = 0;
        for (int i = 0; i < numero.length; i++) {
            System.out.println("Escreva o " + (i + 1) + "º número:");
            numero[i] = sc.nextInt();
            if (i == 0) {
                maior = numero[i];
            } else {
                if (numero[i] > maior) {
                    maior = numero[i];
                }
            }
        }
        System.out.println("O maior número é: " + maior);
    }

    public static void Atividade6() {
        int i;
        for (i = 0; i < 20; i++) {
            System.out.println(i + 1);
        }
        for (i = 0; i < 20; i++) {
            System.out.print((i + 1) + " ");
        }
        System.out.println();
    }

    public static void Atividade4e5(Scanner sc) {
        double A, taxaA, B, taxaB;
        int x = 0, saida;
        do {
            System.out.println("Informe a população A:");
            do {
                A = sc.nextDouble();
                if (A < 0) {
                    System.out.println("Por favor, informe uma população maior ou igual a 0");
                }
            } while (A < 0);
            System.out.println("Informe a porcentagem de crescimento da população A (apenas números positivos)");
            do {
                taxaA = sc.nextDouble();
                if (taxaA <= 0) {
                    System.out.println("Por favor, informe uma taxa de crescimento maior do que 0");
                }
            } while (taxaA <= 0);

            System.out.println("Informe a população B:");
            do {
                B = sc.nextDouble();
                if (B < 0) {
                    System.out.println("Por favor, informe uma população maior ou igual a 0");
                }
            } while (B < 0);
            System.out.println("Informe a porcentagem de crescimento da população B (apenas números positivos)");
            do {
                taxaB = sc.nextDouble();
                if (taxaB <= 0) {
                    System.out.println("Por favor, informe uma taxa de crescimento maior do que 0");
                }
            } while (taxaB <= 0);
            taxaA = taxaA / 100;
            taxaB = taxaB / 100;
            while (A <= B) {
                A = A + (A * taxaA);
                B = B + (B * taxaB);
                x++;
            }
            linha();
            System.out.println("Será necessário " + x + " anos para a cidade A");
            System.out.println("ser maior do que a cidade B.");
            System.out.println("População A: " + A);
            System.out.println("População B: " + B);
            linha();
            do {
                System.out.println("Gostaria de repitir a operação?");
                System.out.println("1 = SIM");
                System.out.println("2 = NÃO");
                saida = sc.nextInt();
                switch (saida) {
                    case 1 ->
                        linha();
                    case 2 -> {
                    }
                    default -> {
                        System.out.println("Opção inválida");
                        linha();
                    }
                }
            } while (saida != 1 && saida != 2);
        } while (saida != 2);
    }

    public static void Atividade3(Scanner sc) {
        String name = nome(sc);
        int idade = idade(sc);
        double salario = salario(sc);
        String sexo = sexo(sc);
        String estadoCivil = estadoCivil(sc, sexo);
        linha();
        System.out.println("Informações cadastradas com sucesso!");
        linha();
        System.out.println("Nome: " + name);
        System.out.println("Idade: " + idade);
        System.out.println("Salário: R$" + salario);
        System.out.println("Sexo: " + sexo);
        System.out.println("Estado civíl: " + estadoCivil);
    }

    public static String estadoCivil(Scanner sc, String sexo) {
        String vogal, civil;
        int x;

        if (sexo.equals("MASCULINO")) {
            vogal = "O";
        } else {
            vogal = "A";
        }

        System.out.println("Qual o seu estado civíl?");
        do {
            x = 0;
            System.out.println("S = SOLTEI" + vogal);
            System.out.println("C = CASAD" + vogal);
            System.out.println("SS = SEPARAD" + vogal);
            System.out.println("D = DIVORCIAD" + vogal);
            System.out.println("V = VIÚV" + vogal);
            civil = sc.next();
            switch (civil) {
                case "S" ->
                    civil = "SOLTEIR" + vogal;
                case "C" ->
                    civil = "CASAD" + vogal;
                case "SS" ->
                    civil = "SEPARAD" + vogal;
                case "D" ->
                    civil = "DIVORCIAD" + vogal;
                case "V" ->
                    civil = "VIÚV" + vogal;
                default -> {
                    x = 1;
                    System.out.println("Por favor, escolha uma opção válida!");
                }
            }
        } while (x == 1);
        return civil;
    }

    public static String sexo(Scanner sc) {
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

    public static double salario(Scanner sc) {
        double Salario;
        System.out.println("Informe o seu salário:");
        do {
            Salario = sc.nextDouble();
            if (Salario <= 0) {
                System.out.println("Por favor, Informe um valor acima de 0");
            }
        } while (Salario <= 0);
        return Salario;
    }

    public static String nome(Scanner sc) {
        String nome;
        System.out.println("Informe o seu nome:");
        do {
            nome = sc.next();
            if (nome.length() <= 3) {
                System.out.println("Por favor, informe um nome com mais de 3 caracteres.");
            }
        } while (nome.length() <= 3);
        return nome;
    }

    public static int idade(Scanner sc) {
        int Idade;

        System.out.println("Informe a sua idade:");
        do {
            Idade = sc.nextInt();
            if (Idade < 0 || Idade > 150) {
                System.out.println("Por favor, informe uma idade válida.");
            }
        } while (Idade < 0 || Idade > 150);
        return Idade;
    }

    public static void Atividade2(Scanner sc) {
        String[] perfil = new String[2];
        do {
            System.out.println("Informe um nome de usuário:");
            perfil[0] = sc.next();
            System.out.println("Informe uma senha:");
            perfil[1] = sc.next();
            if (perfil[0].equals(perfil[1])) {
                System.out.println("A sua senha não pode ser o mesmo nome de usuário!");
            }
        } while (perfil[0].equals(perfil[1]));
    }

    public static void Atividade1(Scanner sc) {
        int nota;
        System.out.println("Informe uma nota entre 0 e 10!");
        do {
            nota = sc.nextInt();
            if (nota < 0 || nota > 10) {
                System.out.println("Por favor, informe apenas notas entre 0 a 10.");
            }
        } while (nota < 0 || nota > 10);
    }

    public static void linha() {
        System.out.println("___________________________________________________________________________");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int option;
        do {
            linha();
            System.out.println("Escolha uma opção entre 1 a 11 referente a atividade passada (12 para sair)");
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
                    Atividade4e5(sc);
                case 5 ->
                    Atividade4e5(sc);
                case 6 ->
                    Atividade6();
                case 7 ->
                    Atividade7(sc);
                case 8 ->
                    Atividade8(sc);
                case 9 ->
                    Atividade9();
                case 10 ->
                    Atividade10e11(sc);
                case 11 ->
                    Atividade10e11(sc);
                case 12 ->
                    System.out.println("Saindo!");
                default ->
                    System.out.println("Essa atividade é inexistente!");
            }
        } while (option != 12);
    }
}
