import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        Controller controller = new Controller();
        controller.addPratoSobremesa();
        controller.addPratoEntrada();
        controller.addPratoPrincipal();

        controller.registrarCliente();

     String nomeCLiente = s.next();
     System.out.println(controller.acessarCLiente(nomeCLiente));
     controller.pegaCliente();
     controller.addPratoPedido();

     controller.listarPratosSelecionados();

     System.out.println(controller.pegaCliente());


    }
}