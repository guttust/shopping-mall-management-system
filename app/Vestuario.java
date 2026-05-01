package app;

public class Vestuario extends Loja{
    private boolean produtosImportados;

    public Vestuario(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco enderecoLoja, Data dataFundacao, boolean produtoImportados){
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, enderecoLoja, dataFundacao);
        this.produtosImportados = produtoImportados;
    }

    public boolean getProdutosImpotados(){
        return this.produtosImportados;
    }

    public void setProdutosImportados(boolean produtosImpotados){
        this.produtosImportados = produtosImportados;
    }

    public String toString(){
        return super.toString()
            + "\nProdutos importados: " + this.produtosImportados;
    }
}
