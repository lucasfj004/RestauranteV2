import java.util.ArrayList;

public class Prato {
    protected double preco;
    protected String nome;
    protected String descricao;
    protected char tamanho;
    protected ArrayList<Prato> pratosDisponiveis = new ArrayList<>();


    public Prato(double preco, String nome, String descricao, char tamanho) {
        this.preco = preco;
        this.nome = nome;
        this.descricao = descricao;
        this.tamanho = tamanho;
    }


    public boolean addPratosDisponiveis(Prato prato){
        return pratosDisponiveis.add(prato);
    }

    public ArrayList<Prato> getPratosDisponiveis() {
        return pratosDisponiveis;
    }

    public double getPreco() {
        return preco;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public char getTamanho() {
        return tamanho;
    }

    @Override
    public String toString() {
        return "Prato{" +
                "preco=" + preco +
                ", nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                ", tamanho=" + tamanho +
                ", pratosDisponiveis=" + pratosDisponiveis +
                '}';
    }
}
