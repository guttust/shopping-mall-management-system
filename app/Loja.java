package app;
//eu vou usar os comentários para me guiar melhor aqui

public class Loja{
    private String nome;
    private int quantidadeFuncionarios;
    private double salarioBaseFuncionario;

    public Loja(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario) { //Método construtor geral que cria um objeto da classe "Loja"
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = salarioBaseFuncionario;
    }

    public Loja(String nome, int quantidadeFuncionarios){ //Outro método contrtor que cria um objeto da classe "Loja", mas sem o salário base dos funcionários, automaticamente setada para "-1.0"
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = -1.0;
    }

    //Getters e Setters

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

    //Método toString que exibe as informações da loja

    public String toString(){
        return "Loja: " + this.nome + "\nQuantidade de funcionarios: " + this.quantidadeFuncionarios + "\nSalário base dos funcionarios: " + this.salarioBaseFuncionario;
    }

    //Método que calcula o gasto total com os funcionários da loja, lembrando que se o salário base dos funcionários for igual a -1.0, o método deve retornar -1.0

    public double gastosComSalario(){
        if(this.salarioBaseFuncionario == -1.0){
            return -1.0;
        }else{
            return this.quantidadeFuncionarios * this.salarioBaseFuncionario;
        }
    }

    //Método para classificar o tamanho da Loja, menor que 10 é pequena, entre 10 e 30 é média, maior que 30 é grande

    public char tamanhoLoja(){
        if(this.quantidadeFuncionarios < 10){
            return 'P';
        } else if(this.quantidadeFuncionarios >= 10 && this.quantidadeFuncionarios <= 30){
            return 'M';
        }else{
            return 'G';
        }
    }
}