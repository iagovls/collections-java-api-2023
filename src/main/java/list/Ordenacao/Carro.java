package main.java.list.Ordenacao;

import java.util.Comparator;

public class Carro implements Comparable<Carro>{
    private String modelo;
    private int ano;
    private double consumo;
    private boolean promocao;
    private double preco;
    private String cor;

    public Carro(String modelo, int ano, double consumo, boolean promocao, double preco, String cor) {
        this.modelo = modelo;
        this.ano = ano;
        this.consumo = consumo;
        this.promocao = promocao;
        this.preco = preco;
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAno() {
        return ano;
    }

    public double getConsumo() {
        return consumo;
    }

    public boolean isPromocao() {
        return promocao;
    }

    public double getPreco() {
        return preco;
    }

    public String getCor() {
        return cor;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "modelo='" + modelo + '\'' +
                ", ano=" + ano +
                ", consumo=" + consumo +
                ", promocao=" + promocao +
                ", preco=" + preco +
                ", cor='" + cor + '\'' +
                '}';
    }


    @Override
    public int compareTo(Carro i) {
        if(this.ano > i.getAno()) {
            return 1;
        } else {
            return -1;

        }
    }
}
