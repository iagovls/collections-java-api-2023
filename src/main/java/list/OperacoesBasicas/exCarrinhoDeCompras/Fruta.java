package main.java.list.OperacoesBasicas.exCarrinhoDeCompras;

public class Fruta {
    private String nome;
    private Double preco;
    private Integer quant;

    public Fruta(String nome, Double preco, Integer quant) {
        this.nome = nome;
        this.preco = preco;
        this.quant = quant;
    }   

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Integer getQuant() {
        return quant;
    }

    public void setQuant(Integer quant) {
        this.quant = quant;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Fruta{");
        sb.append("nome=").append(nome);
        sb.append(", preco=").append(preco);
        sb.append(", quant=").append(quant);
        sb.append('}');
        return sb.toString();
    }
    
    
}


