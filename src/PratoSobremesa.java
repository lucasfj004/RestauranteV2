public class PratoSobremesa extends Prato{
    String tipoSobremesa;
    String principalSabor;

    public PratoSobremesa(double preco, String nome, String descricao, char tamanho, String tipoSobremesa, String principalSabor) {
        super(preco, nome, descricao, tamanho);
        this.tipoSobremesa = tipoSobremesa;
        this.principalSabor = principalSabor;
    }
}
