package main.java.br.com.calcularimposto.model;

public class Televisao extends Produto{
    public static final double IMPOSTO_POR_CENTO = 0.15;

    public Televisao(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calcularImposto() {
        System.out.println("Calculando imposto da televisão");
        return this.valor * Televisao.IMPOSTO_POR_CENTO;
    }
}
