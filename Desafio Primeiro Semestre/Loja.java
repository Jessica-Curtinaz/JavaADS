import java.util.Arrays;

public class Loja {
    private String nome;
    private int quantidadeFuncionarios;
    private double salarioBaseFuncionario;
    private Endereco endereco;
    private Data dataFundacao;
    private Produto[] estoqueProdutos;

    public Loja(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, int qntProdutos){
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = salarioBaseFuncionario;
        this.endereco = endereco;
        this.dataFundacao = dataFundacao;
        this.estoqueProdutos = new Produto[qntProdutos];
    }

    public Loja(String nome, int quantidadeFuncionarios, Endereco endereco, Data dataFundacao, int qntProdutos){
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.endereco = endereco;
        this.dataFundacao = dataFundacao;
        this.estoqueProdutos = new Produto[qntProdutos];
        salarioBaseFuncionario = -1;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidadeFuncionarios() {
        return quantidadeFuncionarios;
    }

    public void setQuantidadeFuncionarios(int quantidadeFuncionarios) {
        this.quantidadeFuncionarios = quantidadeFuncionarios;
    }

    public double getSalarioBaseFuncionario() {
        return salarioBaseFuncionario;
    }

    public void setSalarioBaseFuncionario(double salarioBaseFuncionario) {
        this.salarioBaseFuncionario = salarioBaseFuncionario;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Data getDataFundacao() {
        return dataFundacao;
    }

    public void setDataFundacao(Data dataFundacao) {
        this.dataFundacao = dataFundacao;
    }

    public Produto[] getEstoqueProdutos() {
        return estoqueProdutos;
    }

    public void setEstoqueProdutos(Produto[] estoqueProdutos) {
        this.estoqueProdutos = estoqueProdutos;
    }

    @Override
    public String toString() {
        return "Loja\n" +
                "Nome: "+nome +
                "\nQuantidade de Funcionários: " + quantidadeFuncionarios +
                "\nSalário Base de um Funcionário: " + salarioBaseFuncionario +
                "\nEndereço\n" + endereco +
                "\nData de Fundação: " + dataFundacao +
                "\nProdutos em Estoque: " + Arrays.toString(estoqueProdutos);
    }

    public double gastosComSalario(){
        if(salarioBaseFuncionario != -1){
            return salarioBaseFuncionario * quantidadeFuncionarios;
        }
        else{
            return -1;
        }
    }

    public char tamanhoDaLoja(){
        if(quantidadeFuncionarios < 10){
            return 'P';
        }
        else if (quantidadeFuncionarios >= 10 && quantidadeFuncionarios <= 30) {
            return 'M';
        }
        else {
            return 'G';
        }
    }

    public void imprimeProdutos(){
        for (int i = 0; i < estoqueProdutos.length; i++) {
            if (estoqueProdutos[i] != null)
                System.out.println(estoqueProdutos[i].toString());
        };
    }

    public boolean insereProduto(Produto novoProduto){
        for (int i = 0; i < estoqueProdutos.length; i++) {
            if (estoqueProdutos[i] == null){
                estoqueProdutos[i] = novoProduto;
                return true;
            }
        }
        return false;
    }

    public boolean removeProduto(String produto){
        for (int i = 0; i < estoqueProdutos.length; i++) {
            if (estoqueProdutos[i].getNome().equalsIgnoreCase(produto)){
                estoqueProdutos[i] = null;
                return true;
            }
        }
        return false;
    }
}
