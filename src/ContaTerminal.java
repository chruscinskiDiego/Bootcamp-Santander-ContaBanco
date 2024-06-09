import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {

        Integer number;
        String agency;
        String clientName;
        Double balance;

        Scanner sc = new Scanner(System.in);

        System.out.println("Olá, seja bem-vindo ao App ContaBanco! xD");
        System.out.println("A seguir serão solicitados seus dados bancários, deseja continuar?");
        System.out.println("Digite SIM para prosseguir");
        String choice = sc.next();

        if ("SIM".equalsIgnoreCase(choice)) {

            System.out.println("Conta Bancária:");

            System.out.println("Digite o NÚMERO: ");
            number = sc.nextInt();
            sc.nextLine();

            System.out.println("Digite a AGÊNCIA: ");
            agency = sc.nextLine();

            System.out.println("Digite o NOME DO CLIENTE: ");
            clientName = sc.nextLine();

            System.out.println("Digite o SALDO: ");
            balance = sc.nextDouble();

            String print = "Olá ".concat(clientName)
                    .concat(", obrigado por criar uma conta em nosso banco")
                    .concat(", sua agência é ").concat(agency)
                    .concat(", conta ").concat(String.valueOf(number))
                    .concat(" e seu saldo ").concat(String.valueOf(balance))
                    .concat(" já está disponível para saque");

            System.out.println(print);

        }
        else{
            System.out.println("Tenha um bom dia! :D");
        }
    }
}