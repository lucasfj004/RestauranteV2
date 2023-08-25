public class PratoPrincipal extends Prato{
String tipoCarne;

    public PratoPrincipal(double preco, String nome, String descricao, char tamanho, String tipoCarne) {
        super(preco, nome, descricao, tamanho);
        this.tipoCarne = tipoCarne;
    }
}
