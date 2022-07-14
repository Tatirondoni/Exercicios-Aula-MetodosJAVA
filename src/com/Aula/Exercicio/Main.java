package com.Aula.Exercicio;

public class Main {

    public static void main(String[] args) {

        //Calculadora
        System.out.println("Exercício da Calculadora");

        Calculadora.soma(3, 6);
        Calculadora.subtracao(9, 1.8);
        Calculadora.divisao(7, 8);
        Calculadora.subtracao(5, 2.5);


        //Mensagem
        System.out.println("Exercício da Mensagem");

        Mensagem.ObterMensagem(9);
        Mensagem.ObterMensagem(14);
        Mensagem.ObterMensagem(1);

        //Empréstimo

        System.out.println("Exercício da Empréstimo");
        Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(1000, Emprestimo.getTresParcelas());
        Emprestimo.calcular(1000, 5);

    }

}
