package main.java.br.com.calcularimposto.model;

public class Computador extends Produto{
    public static final double IMPOSTO_POR_CENTO = 0.21;
    public Computador(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calcularImposto() {
        System.out.println("Calculando imposto do Computador");
        return this.valor * Computador.IMPOSTO_POR_CENTO;
    }


}
