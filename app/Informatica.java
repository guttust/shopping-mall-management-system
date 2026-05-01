package app;

public class Informatica extends Loja{
    private double seguroEletronicos;

    public Informatica(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco enderecoLoja, Data dataFundacao, double seguroEletronicos){
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, enderecoLoja, dataFundacao);
        this.seguroEletronicos = seguroEletronicos;
    }

    public double getSeguroeletronicos(){
        return this.seguroEletronicos;
    }

    public void setSeguroEletronicos(double seguroEletronicos){
        this.seguroEletronicos = seguroEletronicos;
    }

    public String toString(){
        return super.toString()
            + "\nValor do seguro dos eletronicos: " + this.seguroEletronicos;
    }
}
