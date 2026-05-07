package sistemabanco;

import java.util.Scanner;

public class SistemaBanco {
    public static void main(String[] args) {
        Scanner sys = new Scanner(System.in);
        Conta conta = new Conta();
        
        int op = 0;
        
        while(op != 4){
            System.out.println("\n--------BANCO MASTER--------");
            System.out.println("1 - Consultar saldo");
            System.out.println("2 - Depositar");
            System.out.println("3 - Sacar");
            System.out.println("4 - Sair");
            System.out.print("\nEscolha uma opção: ");
            op = sys.nextInt();
            
            if (op<1 || op>4){
                System.out.println("Opção inválida. Tente novamente!");
            }
            else if (op==1){
                System.out.printf("Seu saldo é: %.2f\n", conta.getSaldo());
            }
            else if (op==2){
                System.out.print("Qual o valor do depósito?: ");
                double deposito = sys.nextDouble();
                conta.depositar(deposito);
                System.out.printf("Seu novo saldo é de R$ %.2f\n",conta.getSaldo());           
            }
            else if (op==3){
                System.out.print("Digite o valor do saque: ");
                double saque = sys.nextDouble();
                conta.sacar(saque); 
                System.out.printf("Seu novo saldo é de R$ %.2f\n", conta.getSaldo());
            }
        }
        System.out.println("\nEncerrando programa...");
        System.out.println("Programa encerrado!");
        sys.close();   
    }    
}
