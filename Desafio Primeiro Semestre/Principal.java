public class Principal {

    public static void main(String[] args) {
        int opcao;
        Loja loja;
        Produto produto;

        do {
            System.out.println("MENU");
            System.out.println("(1) Criar uma loja");
            System.out.println("(2) Criar um produto");
            System.out.println("(3) Sair");
            opcao = Teclado.leInt("Escolha uma opção: ");

            switch(opcao){
                case 1:
                    System.out.println("Você escolheu criar uma loja!");
                    loja = new Loja(Teclado.leString("Informe o nome da loja: "),
                            Teclado.leInt("Informe a quantidade de funcionários: "),
                            Teclado.leDouble("Informe o salário base de um funcionário: "),
                            new Endereco(Teclado.leString("Informe o nome da rua: "),
                                    Teclado.leString("Informe a cidade: "),
                                    Teclado.leString("Informe o estado: "),
                                    Teclado.leString("Informe o país: "),
                                    Teclado.leString("Informe o cep: "),
                                    Teclado.leString("Informe o número: "),
                                    Teclado.leString("Informe o complemento: ")),
                            new Data(Teclado.leInt("Informe o dia da Fundação: "),
                                    Teclado.leInt("Informe o mês da Fundação: "),
                                    Teclado.leInt("Informe o ano da Fundação: ")),
                            Teclado.leInt("Informe a quantidade de Produtos: "));
                    System.out.println(loja.toString()+"\n");
                    break;
                case 2:
                    System.out.println("Você escolheu criar um produto!");
                    produto = new Produto(Teclado.leString("Informe o nome do produto: "),
                            Teclado.leDouble("Informe o preço do produto: "),
                            new Data(Teclado.leInt("Informe o dia de validade: "),
                                    Teclado.leInt("Informe o mês de validade: "),
                                    Teclado.leInt("Informe o ano de validade: ")));
                    if (produto.estaVencido(new Data(20,10,2023))){
                        System.out.println("PRODUTO VENCIDO\n");
                    } else System.out.println("PRODUTO NÃO VENCIDO\n");
                    break;
                case 3:
                    System.out.println("Você escolheu sair do menu!");
                    break;
                default:
                    System.out.println("Opção Inválida!");
            }
        }
        while (opcao != 3);
    }
}