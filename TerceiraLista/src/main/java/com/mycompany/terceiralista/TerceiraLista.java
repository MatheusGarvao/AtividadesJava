/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.terceiralista;

import java.util.Scanner;

public class TerceiraLista {

    public static void Atividade3(Scanner sc, TerceiraLista obj) {
        String name = obj.nome(sc);

    }

    public String nome(Scanner sc) {
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

    public int idade(Scanner sc) {
        int Idade;
        
        System.out.println("Informe a sua idade:");
        do{
        Idade = sc.nextInt();
        if(Idade<0||Idade>150){
            System.out.println("Por favor, informe uma idade válida.");
        }
        }while(Idade<0||Idade>150);
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
        SegundaLista obj = new SegundaLista();
        int option = 0;
        while (option != 16) {
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
                    Atividade3(sc, obj);

                case 12 ->
                    System.out.println("Saindo!");
                default ->
                    System.out.println("Essa atividade é inexistente!");
            }
        }
    }
}
