public class Produto {
    private String nome;
    private double preco;
    private Data dataValidade;

    public Produto(String nome, double preco, Data dataValidade){
        this.nome = nome;
        this.preco = preco;
        this.dataValidade = dataValidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Data getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(Data dataValidade) {
        this.dataValidade = dataValidade;
    }

    @Override
    public String toString() {
        return "Produto\n" +
                "Nome:" + nome +
                "\nPreço: R$ " + preco +
                "\nValidade: " + dataValidade;
    }

    public boolean estaVencido(Data data){
        if(dataValidade.getAno() <= data.getAno()){
            if(dataValidade.getMes() <= data.getMes()){
                if(dataValidade.getDia() < data.getDia()){
                    return true;
                }
            }
        }
        return false;
    }
}
