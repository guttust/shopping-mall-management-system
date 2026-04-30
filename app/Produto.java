package app;

public class Produto {
    private String nome;
    private double preco;
    
    //Construtor da classe Produto

    public Produto(String nome, double preco){
        this.nome = nome;
        this.preco = preco;
    }

    //Getters e Setters

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public double getPreco(){
        return this.preco;
    }

    public void setPreco(double preco){
        this.preco = preco;
    }

    //Método toString

    public String toString(){
        return "Produto: " + this.nome + "\nPreço: " + this.preco;
    }
}
