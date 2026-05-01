import app.Data;
import app.Endereco;
import app.Loja;
import app.Produto;
import java.util.Scanner;

public class Principal{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int opcao = 0;
        Loja lojaCriada = null;
        Produto produtoCriado = null;

        while(opcao != 3){
            System.out.println("MENU:");
            System.out.println("Digite o numero correspondente a opcao desejada:");
            System.out.println("[1] Criar uma Loja");
            System.out.println("[2] Criar um Produto");
            System.out.println("[3] Sair");

            opcao = scanner.nextInt();
            scanner.nextLine();

            if(opcao == 1){
                System.out.println("Digite o nome da loja: ");
                String nomeLoja = scanner.nextLine();

                System.out.println("Digite a quantidade de funcionarios: ");
                int quantidadeFuncionarios = scanner.nextInt();
                scanner.nextLine();

                System.out.println("Digite o salario base dos funcionarios: ");
                double salarioBaseFuncionario = scanner.nextDouble();
                scanner.nextLine();

                System.out.println("Digite o endereco da loja: ");
                System.out.println("Nome da rua: ");
                String nomeDaRua = scanner.nextLine();

                System.out.println("Cidade: ");
                String cidade = scanner.nextLine();

                System.out.println("Estado: ");
                String estado = scanner.nextLine();

                System.out.println("Pais: ");
                String pais = scanner.nextLine();

                System.out.println("CEP: ");
                String cep = scanner.nextLine();

                System.out.println("Numero: ");
                String numero = scanner.nextLine();

                System.out.println("Complemento: ");
                String complemento = scanner.nextLine();

                System.out.println("Digite a data de fundacao da loja: ");
                System.out.println("Dia: ");
                int diaFundacao = scanner.nextInt();
                scanner.nextLine();

                System.out.println("Mes: ");
                int mesFundacao = scanner.nextInt();
                scanner.nextLine();

                System.out.println("Ano: ");
                int anoFundacao = scanner.nextInt();
                scanner.nextLine();

                Endereco enderecoLoja = new Endereco(nomeDaRua, cidade, estado, pais, cep, numero, complemento);

                Data dataFundacao = new Data(diaFundacao, mesFundacao, anoFundacao);

                lojaCriada = new Loja(nomeLoja, quantidadeFuncionarios, salarioBaseFuncionario, enderecoLoja, dataFundacao);
            } else if(opcao == 2){
                System.out.println("Digite o nome do produto: ");
                String nomeProduto = scanner.nextLine();

                System.out.println("Digite o preco do produto: ");
                double precoProduto = scanner.nextDouble();
                scanner.nextLine();

                System.out.println("Digite a data de validade do produto: ");
                System.out.println("Dia: ");
                int dia = scanner.nextInt();
                scanner.nextLine();

                System.out.println("Mes: ");
                int mes = scanner.nextInt();
                scanner.nextLine();

                System.out.println("Ano: ");
                int ano = scanner.nextInt();
                scanner.nextLine();

                Data dataValidade = new Data(dia, mes, ano);

                produtoCriado = new Produto(nomeProduto, precoProduto, dataValidade);
            }else if(opcao == 3){
                System.out.println("Saindo do programa...");
            }else{
                System.out.println("Opção inválida");
            }

            if(lojaCriada != null && produtoCriado != null && opcao != 3) {
                Data dataReferencia = new Data(20, 10, 2023);

                if(produtoCriado.verificarVencimento(dataReferencia)) {
                    System.out.println("PRODUTO VENCIDO");
                }else{
                    System.out.println("PRODUTO NÃO VENCIDO");
                }
                System.out.println(lojaCriada);
            }
        }
        scanner.close();
    }
}
