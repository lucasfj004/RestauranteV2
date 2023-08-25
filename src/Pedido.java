import java.util.ArrayList;
import java.util.Random;

public class Pedido {


    private int numPedido ;
    private ArrayList <Prato> pratosSelecionados = new ArrayList<>();
    private ArrayList<Prato> pratos = new ArrayList<>();
    private Prato prato = new Prato();

    public Pedido(int numPedido) {
        this.numPedido = numPedido;

    }
    public Pedido (){
        Random random = new Random();
        numPedido = random.nextInt(100);
    }

    public int getNumPedido() {
        return numPedido;
    }

    public boolean verificaPrato(String nomePrato){
        pratos = prato.getPratosDisponiveis();
        for (Prato prato : pratos) {
            return nomePrato.equalsIgnoreCase(prato.getNome());
        }
        return false;
    }

    public ArrayList<Prato> getPratosSelecionados() {
        return pratosSelecionados;
    }

    public void setPratosSelecionados(ArrayList<Prato> pratosSelecionados) {
        this.pratosSelecionados = pratosSelecionados;
    }

    public double calculaTotal(){
        double total = 0;
        for(Prato p : pratosSelecionados){
            total += p.getPreco();
        }
        return total;
    }

    public boolean addPrato (Prato prato){
         return pratosSelecionados.add(prato);
    }

    public boolean removerPrato (Prato prato){
        return pratosSelecionados.remove(prato);
    }


    @Override
    public String toString() {
        return "Pedido{" +
                "numPedido=" + numPedido +
                ", pratosSelecionados=" + pratosSelecionados +
                ", pratos=" + pratos +
                ", prato=" + prato +
                '}';
    }
}