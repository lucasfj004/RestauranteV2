
public class Cliente {
    Controller controller = new Controller();
    private String nome;
    private int mesa;
    private Pedido pedido;
    private Cliente cliente;

    public Cliente(String nome, int mesa ) {
        this.nome = nome;
        this.mesa = mesa;
        this.pedido = new Pedido();
    }
    public Cliente(Cliente cliente){
        this.cliente = cliente;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMesa() {
        return mesa;
    }

    public void setMesa(int mesa) {
        this.mesa = mesa;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public String gerarComanda() {
        gerarComanda gerarComanda = new gerarComanda();
        return gerarComanda.geraComanda() + gerarComanda.geraPratosConsumidos();
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "controller=" + controller +
                ", nome='" + nome + '\'' +
                ", mesa=" + mesa +
                ", pedido=" + pedido +
                '}';
    }
}

