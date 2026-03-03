public class Produto {
    String nome;
    double preco;
    
    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getnome(){
        return nome;
    }

    public double getPreco(){
        return preco;
    }
}
