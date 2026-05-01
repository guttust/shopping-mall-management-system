package app;

public class Alimentacao extends Loja{
    private Data dataAlvara;

    public Alimentacao(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco enderecoLoja, Data dataFundacao, Data dataAlvara){
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, enderecoLoja, dataFundacao);
        this.dataAlvara = dataAlvara;
    }

    public Data getDataAlvara(){
        return this.dataAlvara;
    }

    public void setDataAlvara(Data dataAlvara){
        this.dataAlvara = dataAlvara;
    }

    public String toString(){
        return super.toString()
            + "\nData do alvara: " + this.dataAlvara;
    }
}
