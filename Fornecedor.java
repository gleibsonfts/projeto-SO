package PROJETO;

public class Fornecedor {
    private String nome;
    private String cnpj;
    private String email;
    private Produto produto;
    private String telefone;
    private String lote;



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        if (cnpj.length() == 18)
        this.cnpj = cnpj;
        else
            System.out.println("Erro o CNPJ deve estar no seguinte formato(XX.XXX.XXX/0001-XX)");
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        if (telefone.length() == 14)
        this.telefone = telefone;
        else
            System.out.println("Erro o telefone deve seguir este formato(DDD 00000-0000)");
    }

    public String getLote() {
        return lote;
    }

    public void setLote(String lote) {
        if (lote.length() == 10)
        this.lote = lote;
        else
            System.out.println("Erro o lote deve seguir este formato(XX/XX/XXXX)");
    }
}
