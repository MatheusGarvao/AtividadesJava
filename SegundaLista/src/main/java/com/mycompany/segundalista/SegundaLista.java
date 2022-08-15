package com.mycompany.segundalista;

import java.util.Scanner;

public class SegundaLista {

    public static void Atividade15(Scanner sc) {
     int[]angulos=new int[3];
     for (int i = 0;i<3;i++){
         System.out.println("Escreva o "+(i+1)+"º angulo do seu triangulo:");
         angulos[i]=sc.nextInt();
     }
     if((angulos[0]+angulos[1]+angulos[2])==180){
       if (angulos[0]>90||angulos[1]>90||angulos[2]>90){
           System.out.println("O seu triangulo é um Obtusângulo");    
       }else{
           if(angulos[0]==90||angulos[1]==90||angulos[2]==90){
               System.out.println("O seu triângulo é um Obtusângulo");
           }else{
               System.out.println("O seu triângulo é um Acutângulo");
           }
       }
     } else{
         System.out.println("A soma dos 3 angulos não resulta em 180 graus, logo, não é um triangulo.");
     }
    }
    public static void Atividade13e14(Scanner sc) {
        System.out.println("Quantos lados tem o seu polígono?");
        int lados = sc.nextInt();
        System.out.println("Qual é o tamanho destes lados?");
        int tamanho = sc.nextInt();
        if (lados < 3) {
            System.out.println("NÃO É UM POLÍGONO");
        } else {
            if (lados > 5) {
                System.out.println("POLÍGONO NÃO IDENTIFICADO");
            } else {
                switch (lados) {
                    case 3 -> {
                        System.out.println("O SEU POLÍGONO É UM TRIÂNGULO");
                        System.out.println("A ÁREA DELE É DE " + ((Math.pow(tamanho, 2) * Math.sqrt(3)) / 4) + "CM²");
                    }
                    case 4 -> {
                        System.out.println("O SEU POLÍGONO É UM QUADRADO");
                        System.out.println("A ÁREA DELE É DE " + (tamanho * tamanho));
                    }
                    case 5 ->
                        System.out.println("O SEU POLÍGONO É UM PENTAGONO");

                }
            }
        }

    }

    public static void Atividade12(Scanner sc) {
        double[] notas = new double[3];
        double mediaAtv;
        System.out.println("Insira o número de identificação do aluno:");
        int matricula = sc.nextInt();
        for (int i = 0; i < 3; i++) {
            System.out.println("Insira a " + (i + 1) + "º nota:");
            notas[i] = sc.nextDouble();
        }
        System.out.println("Qual foi a média das atividades?");
        mediaAtv = sc.nextDouble();
        double notaFinal = ((((notas[0] + notas[1]) * 2) + (notas[2] * 3) + mediaAtv) / 8);
        System.out.println("O aluno com o seu número de identificação " + matricula);
        System.out.println("teve as seguintes notas:");
        System.out.println("Primeira nota: " + notas[0]);
        System.out.println("Segunda nota: " + notas[1]);
        System.out.println("Terceira nota: " + notas[2]);
        System.out.println("Média das atividades: " + mediaAtv);
        System.out.println("Média de aproveitamento: " + notaFinal);
        if (notaFinal >= 90) {
            System.out.println("O aluno está APROVADO com um conceito A");
        } else {
            if (notaFinal >= 75) {
                System.out.println("O aluno está APROVADO com um conceito B");
            } else {
                if (notaFinal >= 60) {
                    System.out.println("O aluno está APROVADO com um conceito C");
                } else {
                    if (notaFinal >= 40) {
                        System.out.println("O aluno está REPROVADO com um conceito D");
                    } else {
                        System.out.println("O aluno está REPROVADO com um conceito E");
                    }
                }
            }
        }
    }

    public static void Atividade11(Scanner sc) {
        System.out.println("Insira o valor do produto:");
        double produto = sc.nextDouble();
        int metodo, parcelas, taxa;

        System.out.println("Escolha um método de pagamento:");
        do {
            System.out.println("1 = CARTÃO DE DÉBITO");
            System.out.println("2 = CARTÃO DE CRÉDITO");
            System.out.println("3 = DINHEIRO");
            System.out.println("4 = CHEQUE");
            metodo = sc.nextInt();
            if (metodo <= 0 || metodo > 4) {
                System.out.println("Por favor, escolha entre uma das 4 opções disponíveis.");
            }
        } while (metodo <= 0 || metodo > 4);
        if (metodo == 2) {
            System.out.println("Será pago em quantas parcelas? (1 = a vista)");
            do {
                parcelas = sc.nextInt();
                if (parcelas <= 0) {
                    System.out.println("Por favor, insira uma quantidade positiva");
                }
            } while (parcelas <= 0);
            if (parcelas == 1) {
                System.out.println("Você irá pagar a vista com um desconto de 15%, saindo por");
                System.out.println("R$" + (produto - (produto * 0.15)));
            } else {
                if (parcelas == 2) {
                    System.out.println("Você irá pagar em duas vezes, o valor do produto é de");
                    System.out.println("R$" + produto + " Pagando cada parcela por R$" + (produto / 2));
                } else {
                    System.out.println("Você irá pagar em " + parcelas + " vezes com um juros de 10%, saindo por");
                    System.out.println("R$" + (produto + (produto * parcelas * 0.1)) + " pagando " + parcelas + " de R$" + ((produto * parcelas * 0.1) / parcelas));
                }
            }
        } else {
            if (metodo == 3 || metodo == 4) {
                System.out.println("Você irá pagar a vista com um desconto de 10%, saindo por");
                System.out.println("R$" + (produto - (produto * 0.1)));
            } else {
                System.out.println("Você irá pagar a vista o valor do produto, que é de");
                System.out.println("R$" + produto);
            }
        }

    }

    public static void Atividade10(Scanner sc) {
        int[] lados = new int[3];
        for (int i = 0; i <= 2; i++) {
            System.out.println("Insira o " + (i + 1) + " lado do triangulo:");
            lados[i] = sc.nextInt();
        }
        if (lados[0] == lados[1] && lados[0] == lados[2]) {
            System.out.println("O seu triangulo é equilátero");
        } else {
            if ((lados[0] == lados[1]) || (lados[1] == lados[2]) || (lados[0] == lados[2])) {
                System.out.println("O seu triangulo é Isóscele");
            } else {
                System.out.println("O seu triangulo é Escaleno");
            }
        }
    }

    public static void Atividade9(Scanner sc) {
        System.out.println("Qual a sua altura?");
        double altura = sc.nextDouble();
        String sexo = sexo(sc);
        System.out.println("O seu peso ideal é de");
        switch (sexo) {
            case ("MASCULINO") ->
                System.out.println(((72.7 * altura) - 58) + " KG");
            case ("FEMININO") ->
                System.out.println(((62.1 * altura) - 44.7) + " KG");
        }
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

    public static void Atividade2(Scanner sc) {
        String pessoa[] = {"", "", ""};
        int anos, x;
        String vogal = "";
        System.out.println("Qual é o seu nome?");
        pessoa[0] = sc.next();
        System.out.println("Qual é o seu sexo?");

        pessoa[1] = sexo(sc);
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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
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
                    Atividade2(sc);
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
                    Atividade8(sc);
                case 9 ->
                    Atividade9(sc);
                case 10 ->
                    Atividade10(sc);
                case 11 ->
                    Atividade11(sc);
                case 12 ->
                    Atividade12(sc);
                case 13 ->
                    Atividade13e14(sc);
                case 14 ->
                    Atividade13e14(sc);
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
