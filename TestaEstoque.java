package PROJETO;

import java.util.Scanner;

import org.omg.Messaging.SyncScopeHelper;

public class TestaEstoque {
    public static void main(String [] args){

          Produto p0 = new Produto();
            p0.setCodProduto(1234);
            p0.setNomeProduto("Carro Palio");
            p0.setMarcaProduto("Fiat");
            p0.setQuantidadeProduto(100);
            p0.setValorProduto(50000.00);


            Produto p1 = new Produto();
            p1.setCodProduto(2234);
            p1.setNomeProduto("Carro new Fiesta");
            p1.setMarcaProduto("Ford");
            p1.setQuantidadeProduto(200);
            p1.setValorProduto(53000.00);

            Produto p2 = new Produto();
            p2.setCodProduto(3234);
            p2.setNomeProduto("Carro HB 20");
            p2.setMarcaProduto("Hyundai");
            p2.setQuantidadeProduto(120);
            p2.setValorProduto(44000.00);

            Produto p3 = new Produto();
            p3.setCodProduto(4234);
            p3.setNomeProduto("Carro Classic");
            p3.setMarcaProduto("Chevrolet");
            p3.setQuantidadeProduto(150);
            p3.setValorProduto(22000.00);

            Produto p4 = new Produto();
            p4.setCodProduto(5234);
            p4.setNomeProduto("Carro Fox");
            p4.setMarcaProduto("Volkswagen");
            p4.setQuantidadeProduto(70);
            p4.setValorProduto(42000.00);



            Fornecedor f0 = new Fornecedor();

            f0.setNome("Fiat");
            f0.setCnpj("00.000.000/0001-00");
            f0.setTelefone("081 99713-3813");
            f0.setEmail("fiat@gmail.com");

            Fornecedor f1 = new Fornecedor();
            f1.setNome("Ford");
            f1.setCnpj("00.000.000/0002-00");
            f1.setTelefone("081 98454-5415");
            f1.setEmail("ford@gmail.com");

            Fornecedor f2 = new Fornecedor();
            f2.setNome("Hyunday");
            f2.setCnpj("00.000.000/0003-00");
            f2.setTelefone("081 99453-3813");
            f2.setEmail("hyunday@gmail.com");

            Fornecedor f3 = new Fornecedor();
            f3.setNome("Chevrolet");
            f3.setCnpj("00.000.000/0004-00");
            f3.setTelefone("081 99713-3813");
            f3.setEmail("chevrolet@gmail.com");

            Fornecedor f4 = new Fornecedor();
            f4.setNome("Volkswagen");
            f4.setCnpj("00.000.000/0005-00");
            f4.setTelefone("081 99713-4853");
            f4.setEmail("volkswagen@gmail.com");



            ControleDeEstoque c = new ControleDeEstoque(f4, p0,p1,p2,p3,p4,p4, f0,f1,f2,f3,f4);

            ControleDeEstoque c0 = new ControleDeEstoque(p0);

            ControleDeEstoque c1 = new ControleDeEstoque(p1);

            ControleDeEstoque c2 = new ControleDeEstoque(p2);

            ControleDeEstoque c3 = new ControleDeEstoque(p3);

            ControleDeEstoque c4 = new ControleDeEstoque(p4);


            System.out.print("Codigo dos produtos cadastrados: ");
            p0.mostraCodigo();
            p1.mostraCodigo();
            p2.mostraCodigo();
            p3.mostraCodigo();
            p4.mostraCodigo();

            Scanner ler = new Scanner(System.in);
            System.out.println("Olá Bem vindo, ao nosso Controle de Estoque!");
            System.out.print("Digite o valor que você deseja começar seu estoque: ");
            double dinheiroEstoque = ler.nextDouble();
            c0.setDinheiroEstoque(dinheiroEstoque);
            c1.setDinheiroEstoque(dinheiroEstoque);
            c2.setDinheiroEstoque(dinheiroEstoque);
            c3.setDinheiroEstoque(dinheiroEstoque);
            c4.setDinheiroEstoque(dinheiroEstoque);

            System.out.print("Digite so codigo do produto: ");
            int escolhaProduto = ler.nextInt();



            switch (escolhaProduto) {
            case 1234:
                p0.mostra();
                break;

            case 2234:
                p1.mostra();
                break;
            case 3234:
                p2.mostra();
                break;
            case 4234:
                p3.mostra();
                break;
            case 5234:
                p4.mostra();
                break;
            }

            System.out.print("Digite 1 caso você queira compra um produto ou 2 se quiser vender: ");
            int opcao = ler.nextInt();

            if (opcao == 1){

            System.out.print("Digite a data de entrada do produto: ");
            String dataEntrada = ler.next();

            System.out.print("Quantidade que você deseja comprar: ");
            int comprar = ler.nextInt();
            c0.setComprar(comprar);
            c1.setComprar(comprar);
            c2.setComprar(comprar);
            c3.setComprar(comprar);
            c4.setComprar(comprar);

            }else{

            System.out.print("Digite a data de saída do produto: ");
            String dataSaida = ler.next();

            System.out.print("Quantidade que você deseja vender: ");
            int vender = ler.nextInt();
            c0.setVender(vender);
            c1.setVender(vender);
            c2.setVender(vender);
            c3.setVender(vender);
            c4.setVender(vender);
            }

            if (escolhaProduto == 1234){
                System.out.println("Nome do produto: " + p0.getNomeProduto());
                System.out.println("Nome do fornecedor: " + f0.getNome());
                System.out.println("Quantidade de Produto Atualizada: " + c0.getComprar());
                System.out.println("Quantidade do produto atualizada: " + c0.getVender());
                System.out.println("Dinheiro inicial do estoque: " + c0.getDinheiroEstoque());
                System.out.println("Saldo atualizado: " + c0.getNovoSaldo());

            }
            if (escolhaProduto == 2234){
                System.out.println("Nome do produto: " + p1.getNomeProduto());
                System.out.println("Nome do fornecedor: " + f1.getNome());
                System.out.println("Quantidade de Produto Atualizada: " + c1.getComprar());
                System.out.println("Quantidade do produto atualizada: " + c1.getVender());
                System.out.println("Dinheiro inicial do estoque: " + c1.getDinheiroEstoque());
                System.out.println("Saldo atualizado: " + c1.getNovoSaldo());

            }
            if (escolhaProduto == 3234){
                System.out.println("Nome do produto: " + p2.getNomeProduto());
                System.out.println("Nome do fornecedor: " + f2.getNome());
                System.out.println("Quantidade de Produto Atualizada: " + c2.getComprar());
                System.out.println("Quantidade do produto atualizada: " + c2.getVender());
                System.out.println("Dinheiro inicial do estoque: " + c2.getDinheiroEstoque());
                System.out.println("Saldo atualizado: " + c2.getNovoSaldo());

            }
            if (escolhaProduto == 4234){
                System.out.println("Nome do produto: " + p3.getNomeProduto());
                System.out.println("Nome do fornecedor: " + f3.getNome());
                System.out.println("Quantidade de Produto Atualizada: " + c3.getComprar());
                System.out.println("Quantidade do produto atualizada: " + c3.getVender());
                System.out.println("Dinheiro inicial do estoque: " + c3.getDinheiroEstoque());
                System.out.println("Saldo atualizado: " + c3.getNovoSaldo());

            }
            if (escolhaProduto == 5234){
                System.out.println("Nome do produto: " + p4.getNomeProduto());
                System.out.println("Nome do fornecedor: " + f4.getNome());
                System.out.println("Quantidade de Produto Atualizada: " + c4.getComprar());
                System.out.println("Quantidade do produto atualizada: " + c4.getVender());
                System.out.println("Dinheiro inicial do estoque: " + c4.getDinheiroEstoque());
                System.out.println("Saldo atualizado: " + c4.getNovoSaldo());

            }





    }


}
