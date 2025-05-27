import java.util.Arrays;

public class Shopping {
    private String nome;
    private Endereco endereco;
    private Loja[] lojas;

    public Shopping(String nome, Endereco endereco, int qtdMaxLojas){
        this.nome = nome;
        this.endereco = endereco;
        this.lojas = new Loja[qtdMaxLojas];
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Loja[] getLojas() {
        return lojas;
    }

    public void setLojas(Loja[] lojas) {
        this.lojas = lojas;
    }

    @Override
    public String toString() {
        return "Shopping " +
                "\nNome: " + nome +
                "\nEndereço\n" + endereco +
                "\nLojas" + Arrays.toString(lojas);
    }

    public boolean insereLoja(Loja novaLoja){
        for (int i = 0; i < lojas.length; i++) {
            if (lojas[i] == null){
                lojas[i] = novaLoja;
                return true;
            }
        }
        return false;
    }

    public boolean removeLoja(String nomeLoja){
        for (int i = 0; i < lojas.length; i++) {
            if (lojas[i].getNome().equalsIgnoreCase(nomeLoja)){
                lojas[i] = null;
                return true;
            }
        }
        return false;
    }

    public int quantidadeLojasPorTipo(String tipo){
        int cont = 0;
        for (int i = 0; i < lojas.length; i++){
            if (tipo.equalsIgnoreCase("alimentacao") && lojas[i] instanceof Alimentacao){
                cont++;
            } else if (tipo.equalsIgnoreCase("bijuteria") && lojas[i] instanceof Bijuteria) {
                cont++;
            } else if (tipo.equalsIgnoreCase("cosmetico") && lojas[i] instanceof Cosmetico) {
                cont++;
            } else if (tipo.equalsIgnoreCase("informatica") && lojas[i] instanceof Informatica) {
                cont++;
            } else if (tipo.equalsIgnoreCase("vestuario") && lojas[i] instanceof Vestuario) {
                cont++;
            } else {
                return -1;
            }
        }
        return cont;
    }

    public Informatica lojaSeguroMaisCaro(){
        Informatica lojaSeguroMaisCaro = null;
        double cont = 0;
        for (int i = 0; i < lojas.length; i++) {
            if (lojas[i] instanceof Informatica){
                if (((Informatica) lojas[i]).getSeguroEletronicos() > cont){
                    cont = ((Informatica) lojas[i]).getSeguroEletronicos();
                    lojaSeguroMaisCaro = (Informatica) lojas[i];
                }
            }
        }
        return lojaSeguroMaisCaro;
    }
}