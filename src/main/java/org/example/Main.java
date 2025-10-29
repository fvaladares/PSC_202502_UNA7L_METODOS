package org.example;

import java.util.Scanner;

/**
 * Classe principal - ponto onde é feita a chamada de outras classes que
 * compõem o sistema.
 */
public class Main {
    public static void main(String[] args) {

//        int a = 10;
//        int b = 4;
//        System.out.println((double)a/b);
        // tipo identificador
        int numero1;
        int numero2;
        // tipo identificador
        Calculadora calculadora; // Criação de uma variável do tipo Calculadora

        /*
            Criação da instância da classe (cria o objeto) do tipo calculadora
            O comando new reserva memória suficiente para armazenar os dados, e retorna
            o endereço para a variável calculadora
         */
        calculadora = new Calculadora();

        Scanner sc;
        sc = new Scanner(System.in);

        // Leitura dos dados para realização dos cálculos
        System.out.print("""                
                
                Por favor, informe o \
                primeiro número:\s""");
        numero1 = sc.nextInt();

        System.out.print("""
                \s
                Por favor, informe o \
                segundo número:\s""");
        numero2 = sc.nextInt();

        // Imprime o resultado da operação de soma
        System.out.println(
                calculadora.somaDoisInteiros(numero1, numero2));
        // Imprime o resultado da operação de subtração
        System.out.println(
                calculadora.subtracaoDoisInteiros(numero1, numero2));

        /*
                TODO (CRIE UM MENU, UTILIZANDO WHILE OU DO/WHILE,
                 PARA PERMITIR QUE A PESSOA ESCOLHA QUAL OPERAÇÃO DESEJA
                 REALIZAR.)
         */
    }
}


