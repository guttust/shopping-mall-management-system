package app;

public class Produto {
    private String nome;
    private double preco;
    private Data dataValidade;
    
    //Construtor da classe Produto

    public Produto(String nome, double preco, Data dataValidade){
        this.nome = nome;
        this.preco = preco;
        this.dataValidade = dataValidade;
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

    public Data getDataValidade(){
        return this.dataValidade;
    }

    public void setDataValidade(Data dataValidade){
        this.dataValidade = dataValidade;
    }

    //Método toString

    public String toString(){
        return "Produto: " + this.nome + "\nPreço: " + this.preco;
    }

    //Método para descobrir se o produto está vencido ou não
    
    public boolean verificarVencimento(Data dataAtual){
        if (this.dataValidade.getAno() < dataAtual.getAno()){
            return true;
        }else if (this.dataValidade.getAno() == dataAtual.getAno()){
            if (this.dataValidade.getMes() < dataAtual.getMes()){
                return true;
            }else if (this.dataValidade.getMes() == dataAtual.getMes() && this.dataValidade.getDia() < dataAtual.getDia()){
                return true;
            }
        }return false;
    }
}
