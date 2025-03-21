package services;

import java.util.Scanner;
import exceptions.ParametrosInvalidosException;

public class Contador {
    public static void main(String[] args) {  
        Scanner terminal = new Scanner(System.in);

        System.out.println("Digite o 1° parâmetro:");
        int parametroUm = terminal.nextInt();
        System.out.println("Digite o 2° parâmetro:");
        int parametroDois = terminal.nextInt();

        try {
            contar(parametroUm, parametroDois);
        } catch(ParametrosInvalidosException exception){
            System.out.println("Erro: " + exception.getMessage());
        }
        terminal.close();
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if(parametroUm > parametroDois) {
            throw new ParametrosInvalidosException("O primeiro parâmetro não pode ser maior que o segundo.");
        }
        int contagem = parametroDois - parametroUm;
        for (int valor = 0; valor < contagem; valor++) {
            System.out.println("Imprimindo o número: " + valor);
        }
    } 
}       
