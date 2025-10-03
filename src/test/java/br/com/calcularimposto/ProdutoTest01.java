package test.java.br.com.calcularimposto;

import main.java.br.com.calcularimposto.model.Computador;
import main.java.br.com.calcularimposto.model.Televisao;
import main.java.br.com.calcularimposto.model.Tomate;
import main.java.br.com.calcularimposto.service.CalculadoraImposto;

public class ProdutoTest01 {
    public static void main(String[] args) {
        Computador computador = new Computador("Notebook Gamer", 5000);
        Tomate tomate = new Tomate("Tomate-cereja", 50);
        Televisao televisao = new Televisao("Samsung 50\" ", 2000);

        CalculadoraImposto.calcularImpostoProduto(computador);
        System.out.println("----------------------");
        CalculadoraImposto.calcularImpostoProduto(tomate);
        System.out.println("----------------------");
        CalculadoraImposto.calcularImpostoProduto(televisao);

    }
}
