package test.java.br.com.calcularimposto;

import main.java.br.com.calcularimposto.model.Computador;
import main.java.br.com.calcularimposto.model.Produto;
import main.java.br.com.calcularimposto.model.Tomate;
import main.java.br.com.calcularimposto.service.CalculadoraImposto;

public class ProdutoTest02 {
    public static void main(String[] args) {
        Produto produto1 = new Computador("PC do tonyn", 4000);
        System.out.println(produto1.getNome());
        System.out.println(produto1.getValor());
        System.out.println(produto1.calcularImposto());
        System.out.println("--------------------");
        Produto produto2 = new Tomate("Tomate nilba", 100);
        System.out.println(produto2.getNome());
        System.out.println(produto2.getValor());
        System.out.println(produto2.calcularImposto());
        CalculadoraImposto.calcularImpostoProduto(produto2);
    }
}
