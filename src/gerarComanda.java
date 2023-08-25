import java.util.ArrayList;


public class gerarComanda {
    private Controller controller = new Controller();
    private Cliente cliente = new Cliente(controller.pegaCliente());;


    public gerarComanda() {

    }

    // Gerar String de todos os dados do cliente
    public String geraComanda() {

        String retorna = cliente.getNome() + " " + cliente.getMesa() + " " + cliente.getPedido().calculaTotal()
                + " ";
        return retorna;
    }

    // Gerar String de todos os pratos consumidos pelo cliente
    public String geraPratosConsumidos() {
        String retorna1 = " ";
        ArrayList<Prato> pratos;
        pratos = new ArrayList<>();
        pratos = cliente.getPedido().getPratosSelecionados();
        for (Prato prato : pratos) {
            retorna1 += prato.getNome();
        }
        return retorna1;
    }


}



