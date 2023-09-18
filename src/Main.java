import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        int opcao;
        Scanner scanner = new Scanner(System.in);

        Iphone iphone1 = new Iphone(99999999, 
                                    "iPhone1", 
                                    "Media Player",
                                    "Safari");
        do{

            System.out.println("Selecione uma opção no menu: \n" +
                                "1: Tocar música \n" +
                                "2: Pausar música \n" +
                                "3: Selecionar música \n" +
                                "4: Efetuar ligação \n" +
                                "5: Atender ligação \n" +
                                "6: Iniciar correio de voz \n" +
                                "7: Exibir página no navegador \n" +
                                "8: Adicionar nova aba no navegador \n" +
                                "9: Atualizar página no navegador \n" +
                                "0: Desligar");

            opcao = scanner.nextInt();

            switch(opcao){
                case 1:
                    iphone1.tocar();
                break;
                case 2:
                    iphone1.pausar();
                break;
                case 3:
                    iphone1.selecionarMusica();
                break;
                case 4:
                    iphone1.ligar();
                break;
                case 5:
                    iphone1.atender();
                break;
                case 6:
                    iphone1.correioVoz();
                break;
                case 7:
                    iphone1.exibirPagina();
                break;
                case 8:
                    iphone1.novaAba();
                break;
                case 9:
                    iphone1.atualizarPagina();
                break;
                case 0:
                    System.out.println("Desligando aparelho");
                break;
                default:
                    System.out.println("Opção errada.");
            }

        }while(opcao != 0);

    }
}
