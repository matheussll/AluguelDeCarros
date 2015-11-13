import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		
		ClientList clientes = new ClientList();
		//createClient(clientes);       descomentar para criar cliente
		//ClientManager.updateClient(1, clientes);  descomentar para atualizar cliente (passar o codigo do cliente no primeiro parametro)
		//ClientManager.removeClient(6, clientes); descomentar  para remover cliente (passar o codigo do cliente no primeiro parametro)
		
		//for(int i = 0; i < clientes.getClientes().size(); i++) {   
		  //  System.out.print(clientes.getClientes().get(i).getName() + ", "); descomentar para printar lista com todos clientes
		//}  

	}
	
	public static void createClient(ClientList clientes) {
		String name,cnh,cep,cpf;			
			 Scanner in = new Scanner(System.in);
			 System.out.println("Digite o nome do usuario: ");
			 name = in.nextLine();
			 System.out.println("Digite o cpf do usuario: ");
			 cpf = in.nextLine();
			 System.out.println("Digite o cep do usuario: ");
			 cep = in.nextLine();
			 System.out.println("Digite a cnh do usuario: ");
			 cnh = in.nextLine();
			 ClientManager.addClient(name, cep, cpf, cnh, clientes);
	}
	
	
}
