package PROJETO;



public class ControleDeEstoque {
    private Fornecedor fornecedor;
    private Produto produto;
    private String dataEntrada;
    private String dataSaida;
    private double dinheiroEstoque;
    private double novoSaldo;
    private static int produtoEstoque;
    private int comprar;
    private int vender;
    private int escolhaProduto;





    public ControleDeEstoque(Fornecedor fornecedor, Produto produto, Produto p0,Produto p1, Produto p2, Produto p3, Produto p4, Fornecedor f0, Fornecedor f1,
            Fornecedor f2, Fornecedor f3, Fornecedor f4) {
        this.fornecedor = fornecedor;
        this.produto = p0;
        this.produto = p3;
        this.produto = p4;
        this.dataEntrada = dataEntrada;
        this.dataSaida = dataSaida;
        this.dinheiroEstoque = dinheiroEstoque;
        this.novoSaldo = novoSaldo;
    }
    public ControleDeEstoque(Produto p1) {
        this.fornecedor = fornecedor;
        this.produto = p1;
        this.dataEntrada = dataEntrada;
        this.dataSaida = dataSaida;
        this.dinheiroEstoque = dinheiroEstoque;
        this.novoSaldo = novoSaldo;
    }
    public ControleDeEstoque(Produto p2, Fornecedor f0) {
        this.fornecedor = fornecedor;
        this.produto = p2;
        this.dataEntrada = dataEntrada;
        this.dataSaida = dataSaida;
        this.dinheiroEstoque = dinheiroEstoque;
        this.novoSaldo = novoSaldo;
    }
ControleDeEstoque(){

    }




    public void Produto(double valor,Produto produto, String dataEntrada){
        this.produto = produto;
        this.dataEntrada = dataEntrada;
        this.produtoEstoque++;
        this.dinheiroEstoque -= valor;


    }

    public String getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(String dataEntrada) {
          if (dataEntrada.length() == 10) {
              this.dataEntrada = dataEntrada;
          }else {

              System.out.println("Erro a data de entrada deve seguir este formato(XX/XX/XXXX)");
          }
          }



    public String getDataSaida() {
        return dataSaida;
    }

    public void setDataSaida(String dataSaida) {
        if (dataSaida.length() == 10) {
            this.dataSaida = dataSaida;
        }else {

            System.out.println("Erro a data de saída deve seguir este formato(XX/XX/XXXX)");
        }
    }

    public double getDinheiroEstoque() {
        return dinheiroEstoque;
    }

    public void setDinheiroEstoque(double dinheiroEstoque) {
        this.dinheiroEstoque = dinheiroEstoque;
    }
    public double getNovoSaldo() {
        return novoSaldo;
    }
    public int getComprar() {
        this.comprar = produto.getQuantidadeProduto() + comprar;
        return comprar;
    }
    public void setComprar(int comprar) {
        if(comprar > 0) {
        this.comprar = comprar;
        this.novoSaldo = this.dinheiroEstoque -(produto.getValorProduto() * this.comprar);
        }
    }
    public int getVender() {
        this.vender = produto.getQuantidadeProduto() - vender;
        return vender;
    }
    public void setVender(int vender) {
        if(vender > 0 ) {
        this.vender = vender;
        this.novoSaldo = this.dinheiroEstoque +(produto.getValorProduto() * this.vender);
        }
    }
    public int getEscolhaProduto() {
        this.escolhaProduto = produto.codProduto;
        return escolhaProduto;
    }
    public void setEscolhaProduto(int escolhaProduto) {
        this.escolhaProduto = escolhaProduto;
    }








    // Depois...
}
class Data{

    private int dia;
    private int mes;
    private int ano;
    private String novaData;


    public int getDia() {
        return dia;
    }
    public int length() {
        // TODO Auto-generated method stub
        return 0;
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

    public String formatarData(){
        this.novaData = (this.dia + "/" + this.mes + "/" + this.ano);
        return novaData;
    }

    public String getData(){
        String dataFormatada = formatarData();
        return  dataFormatada;
    }


    public void setData(Data data, int dia, int mes, int ano){
        do{
            if (dia <= 31 && dia > 0) {
            this.dia = data.dia;
        }else{
            System.out.println("Formato inválido! digite apenas os 2 digitos do dia!");
        }
        }while (dia == data.dia);
        do{
        if (data.mes <= 12 && data.mes > 0) {
            this.mes = data.mes;
        }else{
            System.out.println("Formato inválido! digite apenas os 2 digitos do mês!");
        }
        }while (mes == data.mes);
        do{
            if (data.ano > 0) {
            this.ano = data.ano;
        }else{
                System.out.println("Formato inválido! digite apenas os 4 digitos do ano!");
            }
        }while (ano == data.ano);



}

}
