package main.java.br.com.calcularimposto.service;


import main.java.br.com.calcularimposto.model.Produto;

public final class CalculadoraImposto {
    public static void calcularImpostoProduto(Produto produto) {
        System.out.println("Relatório de imposto");
        double imposto = produto.calcularImposto();
        System.out.println("Produto: " + produto.getNome());
        System.out.println("Valor: " + produto.getValor());
        System.out.println("Imposto a ser pago: " + imposto);
    }
}
