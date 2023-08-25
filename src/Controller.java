import java.util.ArrayList;
import java.util.Scanner;

public class Controller {
    Cliente cliente;
    Prato prato = new Prato();


    Scanner s = new Scanner(System.in);

    ArrayList<Cliente> clientes = new ArrayList<>();


    public void registrarCliente() {

        System.out.println("Informe nome do cliente");
        String nomeCliente = s.next();
        System.out.println("Informe a mesa do Cliente");
        int numMesa = s.nextInt();
        this.cliente = new Cliente(nomeCliente, numMesa);

        clientes.add(cliente);

    }

    public Cliente acessarCLiente(String nomeClinte) {
        for (Cliente cliente : clientes) {
            if (nomeClinte.equalsIgnoreCase(cliente.getNome())) {
                return cliente;
            }
        }
        return null;
    }

    public Cliente pegaCliente(){
        for (Cliente cliente : clientes){
            Cliente c = acessarCLiente(cliente.getNome());
            return c;
        }
        return null;
    }
    public void listarPratosSelecionados(){
        ArrayList<Prato> pratosSelecionados;
        pratosSelecionados = new ArrayList<>();
        pratosSelecionados = pegaCliente().getPedido().getPratosSelecionados();
        System.out.println(pratosSelecionados);

    }
    public void addPratoPedido() {
        Cliente c = pegaCliente();
        System.out.println("Informe o prato que você deseja");
        String nomePrato = s.next();
        if (c.getPedido().verificaPrato(nomePrato)) {
            c.getPedido().addPrato(prato);
            System.out.println(" Seu prato foi adicionado");
        }
    }
    public void gerarComanda() {
        System.out.println(cliente.gerarComanda());
    }

    public void addPratoSobremesa() {
        Prato bolo = new PratoSobremesa(35.00, "Bolo", "Bolo de chocolate acompanhado de gotas majestosas de João e Maria",
                'G', "ameno", "Chocolate");
        Prato tortaMorango = new PratoSobremesa(28.00, "Torta de Morango", "Deliciosa torta recheada com morangos frescos e creme suave.",
                'T', "frio", "Morango");
        Prato pudimCaramelo = new PratoSobremesa(22.50, "Pudim de Caramelo", "Pudim suave coberto com caramelo dourado e uma pitada de felicidade.",
                'P', "frio", "Caramelo");


        prato.addPratosDisponiveis(bolo);
        prato.addPratosDisponiveis(tortaMorango);
        prato.addPratosDisponiveis(pudimCaramelo);
    }

    public void addPratoEntrada() {
        Prato presuntoParma = new PratoEntrada(25.00, " presunto parma em fatias", "fatias finas e suaves de presunto parma da melhor qualidade", 'm', "frio");
        Prato caldoMandioquiha = new PratoEntrada(30.00, "caldo de mandioquinha", "caldo de mandioquinha com acompanhemantos, uma entrada leve", 'p', "quente");
        Prato alcatra = new PratoEntrada(25.00, " fatias de alcatra", "pequena peça de alcatra acompanhada de molhos", 'm', "quente");

        prato.addPratosDisponiveis(presuntoParma);
        prato.addPratosDisponiveis(caldoMandioquiha);
        prato.addPratosDisponiveis(alcatra);
    }

    public void addPratoPrincipal() {
        Prato picanhaEnlatada = new PratoPrincipal(500.00, " Picanha Enlatada", "Picanha deliciosamente enlatada na lata de aluminio", 'G', "Boi Alfa");
        Prato cobraDeMicroOndas = new PratoPrincipal(1.99, " Cobra de MicroOndas", "Cobra que matamos atras do restaurante", 'p', "Repitiliana");
        Prato leitao = new PratoPrincipal(420.69, " Leitão", "Leitão cozido na agua de salsicha", 'G', "Porca");

        prato.addPratosDisponiveis(picanhaEnlatada);
        prato.addPratosDisponiveis(cobraDeMicroOndas);
        prato.addPratosDisponiveis(leitao);
    }





    public void excluirPrato() {
        System.out.println("Informe o prato que vc deseja excluir");
        String nomePrato = s.next();
        if (cliente.getPedido().verificaPrato(nomePrato)) {
            cliente.getPedido().removerPrato(prato);
            System.out.println(" Seu prato foi removido");
        }
    }



}