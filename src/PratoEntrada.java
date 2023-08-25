public class PratoEntrada extends Prato{
    String estiloPrato;

    public PratoEntrada(double preco, String nome, String descricao, char tamanho, String estiloPrato) {
        super(preco, nome, descricao, tamanho);
        this.estiloPrato = estiloPrato;
    }
}
