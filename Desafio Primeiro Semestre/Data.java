public class Data {
    private int dia;
    private int mes;
    private int ano;

    public Data(int dia, int mes, int ano){
        if (mes >= 1 && mes <= 12) {
            if (dia >= 1 && dia <= 31) {
                if (mes == 2) {
                    if (ano % 4 == 0) {
                        if (dia <= 29) {
                            this.dia = dia;
                            this.mes = mes;
                            this.ano = ano;
                        }
                        else {
                            dia = 1;
                            mes = 1;
                            ano = 2000;
                            System.out.println("ERRO: Data inválida!");
                        }
                    }
                    else {
                        if (dia <= 28) {
                            this.dia = dia;
                            this.mes = mes;
                            this.ano = ano;
                        }
                        else {
                            dia = 1;
                            mes = 1;
                            ano = 2000;
                            System.out.println("ERRO: Data inválida!");
                        }
                    }
                }
                else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
                    if (dia <= 30) {
                        this.dia = dia;
                        this.mes = mes;
                        this.ano = ano;
                    }
                    else {
                        dia = 1;
                        mes = 1;
                        ano = 2000;
                        System.out.println("ERRO: Data inválida!");
                    }
                }
                else {
                    this.dia = dia;
                    this.mes = mes;
                    this.ano = ano;
                }
            }
            else {
                dia = 1;
                mes = 1;
                ano = 2000;
                System.out.println("ERRO: Data inválida!");
            }
        }
        else {
            dia = 1;
            mes = 1;
            ano = 2000;
            System.out.println("ERRO: Data inválida!");
        }
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    @Override
    public String toString() {
        return dia + "/" + mes + "/" + ano;
    }

    public boolean verificaAnoBissexto(){
        if(ano %4 == 0){
            return true;
        }
        else {
            return false;
        }
    }
}