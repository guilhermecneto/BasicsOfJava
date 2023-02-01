/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.javabasico;
import  java.util.Scanner;
/**
 *
 * @author ANONYMOUS
 */
public class NewClass {
    public static void main(String[] args) {
        int numeroAgencia;
        String conta;
        String NomeCliente;
        float saldo;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite o número da Agência");
        numeroAgencia = entrada.nextInt();
        
        System.out.println("Digite sua conta");
        conta = entrada.nextLine();
        System.out.println("Digite o seu nome");
        NomeCliente = entrada.nextLine();
        System.out.println("Qual o seu saldo?");
        saldo = entrada.nextFloat();
        
        System.out.println("Olá " + NomeCliente + " obrigado po criar uma conta na nossa agência");
        System.out.println("Sua agência é: " + numeroAgencia + " Sua conta é :" + conta);
        System.out.println("Seu saldo é de: " + saldo);
    }
}
