import java.text.MessageFormat;
import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
        System.out.print("Digite o nome: ");
        String nome = sc.nextLine();
        
		 System.out.print("Por favor, digite o n�mero da Ag�ncia: ");
         String agencia = sc.nextLine();
         
		 System.out.print("Digite o numero da conta: ");
         int conta = Integer.parseInt(sc.nextLine());
         
         System.out.print("Digite o nome: ");
         Double saldo = Double.parseDouble(sc.nextLine());
         
         String msg = MessageFormat.format("Ol� {0}, obrigado por criar uma conta em nosso banco, sua ag�ncia � {1}, conta {2} e seu saldo {3} j� est� dispon�vel para saque", nome, agencia, conta, saldo);
         
         System.out.println(msg);
	}
}
