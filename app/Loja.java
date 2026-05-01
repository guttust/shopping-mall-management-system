package app;

public class Loja{
    private String nome;
    private int quantidadeFuncionarios;
    private double salarioBaseFuncionario;
    private Endereco enderecoLoja;
    private Data dataFundacao;

    public Loja(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco enderecoLoja, Data dataFundacao){
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = salarioBaseFuncionario;
        this.enderecoLoja = enderecoLoja;
        this.dataFundacao = dataFundacao;
    }

    public Loja(String nome, int quantidadeFuncionarios){
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = -1.0;
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public int getQuantidadeFuncionarios(){
        return this.quantidadeFuncionarios;
    }

    public void setQuantidadeFuncionarios(int quantidadeFuncionarios){
        this.quantidadeFuncionarios = quantidadeFuncionarios;
    }

    public double getSalarioBaseFuncionario(){
        return this.salarioBaseFuncionario;
    }

    public void setSalarioBaseFuncionario(double salarioBaseFuncionario){
        this.salarioBaseFuncionario = salarioBaseFuncionario;
    }

    public Endereco getEnderecoLoja(){
        return this.enderecoLoja;
    }

    public void setEnderecoLoja(Endereco enderecoLoja){
        this.enderecoLoja = enderecoLoja;
    }

    public Data getDataFundacao(){
        return this.dataFundacao;
    }

    public void setDataFundacao(Data dataFundacao){
        this.dataFundacao = dataFundacao;
    }

    public String toString(){
        return "Loja: " + this.nome
            + "\nQuantidade de funcionarios: " + this.quantidadeFuncionarios
            + "\nSalario base dos funcionarios: " + this.salarioBaseFuncionario
            + "\nEndereco: " + this.enderecoLoja
            + "\nData de fundacao: " + this.dataFundacao;
    }

    public double gastosComSalario(){
        if (this.salarioBaseFuncionario == -1.0) {
            return -1.0;
        } else {
            return this.quantidadeFuncionarios * this.salarioBaseFuncionario;
        }
    }

    public char tamanhoLoja(){
        if (this.quantidadeFuncionarios < 10) {
            return 'P';
        } else if (this.quantidadeFuncionarios >= 10 && this.quantidadeFuncionarios <= 30) {
            return 'M';
        } else {
            return 'G';
        }
    }
}
