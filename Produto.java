package PROJETO;

public class Produto {


        int codProduto;
        private String nomeProduto;
        private String marcaProduto;
        private double valorProduto;
        private int quantidadeProduto;
        private String categoriaProduto;
        private double valorTotal;

        public Produto (Produto p1) {
            this.nomeProduto = nomeProduto;
            this.marcaProduto = marcaProduto;
            this.valorProduto = valorProduto;
            this.quantidadeProduto = quantidadeProduto;

        }



       public Produto( Produto p0,Produto p1, Produto p2, Produto p3, Produto p4, Fornecedor f0, Fornecedor f1,
                Fornecedor f2, Fornecedor f3, Fornecedor f4){
                this.nomeProduto = nomeProduto;
                this.marcaProduto = marcaProduto;
                this.valorProduto = valorProduto;
                this.quantidadeProduto =quantidadeProduto;
         }


        Produto(){

        }

        public void mostraCodigo(){
            System.out.println("Codigo dos produtos: " + this.codProduto);
        }

        public void mostra(){

            System.out.println("Codigo do produto: " + this.codProduto);

            System.out.println("Nome do produto: " + this.nomeProduto);

            System.out.println("Marca do Produto: " + this.marcaProduto);

            System.out.println("Valor unitario do produto: " + this.valorProduto);

            System.out.println("Quantidade de produtos: " + this.quantidadeProduto);
        }



        public int getCodProduto(int codProduto) {

            return codProduto;

        }
        public void setCodProduto(int codProduto) {

            this.codProduto = codProduto;

        }


        public String getNomeProduto() {

            return nomeProduto;

        }
        public void setNomeProduto(String nomeProduto) {

            this.nomeProduto = nomeProduto;

        }


        public String getMarcaProduto() {

            return marcaProduto;

        }
        public void setMarcaProduto(String marcaProduto) {

            this.marcaProduto = marcaProduto;

        }


        public double getValorProduto() {

            return valorProduto;

        }

        public void setValorProduto(double valorProduto) {

            if (valorProduto <= 0)

                System.out.println("Erro valor do produto não pode ser menor que zero!");

            else

            this.valorProduto = valorProduto;
        }


        public int getQuantidadeProduto() {
            return quantidadeProduto;
        }
        public void setQuantidadeProduto(int quantidadeProduto) {
            if (quantidadeProduto > 0)
            this.quantidadeProduto = quantidadeProduto;
            else
                System.out.println("Erro o produto não pode ser menor ou igual zero");
        }
        public double getValorTotal() {
            this.valorTotal = this.valorProduto * this.quantidadeProduto;
        return valorTotal;
    }
        public void setValorTotal(double valorTotal) {
            this.valorTotal = valorTotal;
        }

}
