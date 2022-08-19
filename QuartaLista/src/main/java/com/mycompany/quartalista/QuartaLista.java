package com.mycompany.quartalista;

import java.util.Scanner;

public class QuartaLista {

    public static void Atividade7(Scanner sc) {
        int numero = 0, fatorial;
        System.out.println("Informe um número positivo");
        do {
            numero = sc.nextInt();
            if (numero < 0) {
                System.out.println("Informe apenas números positivos!");
            }
        } while (numero < 0);

        if (numero == 0) {
            System.out.println("O fatorial de " + numero + " é 1");
        } else {
            fatorial = numero;
            for (int i = numero - 1; i > 0; i--) {
                if (numero - 1 != 0) {
                    fatorial = fatorial * i;
                }
            }
            System.out.println("O fatorial de " + numero + " é " + fatorial + "!");
        }
    }

    public static void Atividade6(Scanner sc) {
        int alunos;
        double mediaAlunos = 0;
        System.out.println("Informe a quantidade de turmas");
        int turmas = sc.nextInt();
        for (int i = 0; i < turmas; i++) {
            do {
                System.out.println("Informe a quantidade de alunos na turma " + i);
                alunos = sc.nextInt();
                if (alunos >= 40 || alunos < 0) {
                    System.out.println("Por favor, informe uma quantidade menor ou igual a 40 e maior que 0!");
                }
            } while (alunos >= 40 || alunos < 0);
            mediaAlunos += alunos;
        }
        mediaAlunos = mediaAlunos / turmas;
        System.out.println("A média de alunos por turma é de " + mediaAlunos);
    }

    public static void Atividade5(Scanner sc) {
        boolean controle = true;
        String[] menorSalario = new String[2];

        double mediaSalario = 0, salario, valorMenorSalario = 0;
        int idade, maiorIdade = 0, menorIdade = 0, qntdMulheres = 0, qntdPessoas = 0;
        String genero;
        do {
            idade = Idade(sc);
            if (idade != -1) {
                genero = Sexo(sc);
                salario = Salario(sc);
                if (genero.equals("FEMININO")) {
                    qntdMulheres++;
                }
                mediaSalario += salario;
                qntdPessoas++;
                if (qntdPessoas == 1) {
                    maiorIdade = idade;
                    menorIdade = idade;
                    menorSalario[0] = String.valueOf(idade);
                    menorSalario[1] = String.valueOf(genero);
                    valorMenorSalario = salario;
                } else {
                    if (idade > maiorIdade) {
                        maiorIdade = idade;
                    }
                    if (idade < menorIdade) {
                        menorIdade = idade;
                    }
                    if (salario < valorMenorSalario) {
                        valorMenorSalario = salario;
                        menorSalario[0] = String.valueOf(idade);
                        menorSalario[1] = String.valueOf(genero);
                    }
                }
                linha();
                System.out.println("PESSOA INFORMADA COM SUCESSO!");
                linha();
            } else {
                controle = false;
                if (qntdPessoas != 0) {
                    mediaSalario = (mediaSalario / qntdPessoas);
                }
            }
        } while (controle);
        linha();
        if (qntdPessoas != 0) {
            System.out.println("Quantidade de pessoas que foram cadastradas: " + qntdPessoas);
            System.out.println("Quantidade de mulheres que foram cadastradas: " + qntdMulheres);
            System.out.println("Média de salários do grupo: R$" + mediaSalario);
            linha();
            System.out.println("Menor idade: " + menorIdade);
            System.out.println("Maior idade: " + maiorIdade);
            System.out.println("Idade e o sexo da pessoa que possui o menor salário:");
            System.out.println(menorSalario[1] + ", " + menorSalario[0]);
        } else {
            System.out.println("Ninguém foi cadastrado!");
        }
    }

    public static double Salario(Scanner sc) {
        Double dinheiro;
        System.out.println("Informe o seu salário: ");
        do {
            dinheiro = sc.nextDouble();
            if (dinheiro < 0) {
                System.out.println("Por favor, não informe um salário negativo!");
            }
        } while (dinheiro < 0);
        return dinheiro;
    }

    public static String Sexo(Scanner sc) {
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

    public static int Idade(Scanner sc) {
        int Idade;

        System.out.println("Informe a sua idade: (-1 para exibir resultados e finalizar cadastros)");
        do {
            Idade = sc.nextInt();
            if ((Idade < -1 || Idade > 150) || Idade == 0) {
                System.out.println("Por favor, informe uma idade válida.");
            }
        } while ((Idade < -1 || Idade > 150) || Idade == 0);
        return Idade;
    }

    public static void Atividade4(Scanner sc) {
        System.out.println("Informe um número para visualizar a tabuada");
        int num = sc.nextInt();
        for (int i = 0; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }

    public static void Atividade3(Scanner sc) {
        int numero, par = 0;
        for (int i = 0; i < 10; i++) {
            System.out.println("Informe o " + (i + 1) + "º número:");
            numero = sc.nextInt();
            if (numero % 2 == 0) {
                par++;
            }
        }
        System.out.println("Quantidade de números pares: " + par);
        System.out.println("Quantidade de números impares: " + (10 - par));
    }

    public static void Atividade2(Scanner sc) {
        String senha, validar;
        int password;
        boolean controle;
        System.out.println("Informe uma senha de 4 números inteiros maiores do que 0!");
        do {
            controle = false;
            senha = sc.next();
            if (senha.length() == 4) {
                try {
                    password = Integer.parseInt(senha);
                    if (password < 0) {
                        controle = Error();
                    }
                } catch (NumberFormatException e) {
                    controle = Error();
                }
            } else {
                controle = Error();
            }
        } while (controle);
        System.out.println("Repita a sua senha");
        validar = sc.next();
        if (validar.equals(senha)) {
            System.out.println("Senha Correta");
        } else {
            System.out.println("Senha Incorreta");
        }
    }

    public static Boolean Error() {
        System.out.println("Por favor, utilize uma senha com 4 números inteiros positivos!");
        return true;
    }

    public static void Atividade1(Scanner sc) {
        int quantidade = 0, media = 0;
        double num;
        do {
            System.out.println("Insira um número maior que 0 (0 para resultados)");
            do {
                num = sc.nextDouble();
                if (num < 0) {
                    System.out.println("Por favor, insira apenas números positivos ou 0!");
                }
            } while (num < 0);
            if (num != 0) {
                quantidade++;
                media += num;
                linha();
                System.out.println("Número " + num + " inserido com sucesso!");
            } else {
                if (quantidade > 0) {
                    media = media / quantidade;
                    System.out.println("Foram inseridos " + quantidade + " números!");
                    System.out.println("A média é de " + media);
                } else {
                    System.out.println("Não foram inseridos nenhum número!");
                }
            }
        } while (num != 0);
    }

    public static void linha() {
        System.out.println("___________________________________________________________________________");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int option;
        do {
            linha();
            System.out.println("Escolha uma opção entre 1 a 7 referente a atividade passada (8 para sair)");
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
                case 7 ->
                    Atividade7(sc);
                case 8 ->
                    System.out.println("Saindo!");
                default ->
                    System.out.println("Essa atividade é inexistente!");
            }
        } while (option != 8);
        sc.close();
    }
}
