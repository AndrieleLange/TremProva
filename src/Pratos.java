public class Pratos {
    private String nome;
    private double preco;
    private String descricao;

    

    public Pratos(String nome, double preco, String descricao) {
        this.nome = nome;
        this.preco = preco;
        this.descricao = descricao;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "\n" + nome + "\nIgredientes: " + descricao + "\n R$ " + preco +  "\n";
    }

    

}
