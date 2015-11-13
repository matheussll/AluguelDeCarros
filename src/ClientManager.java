import java.util.Scanner;

public class ClientManager {
	public static void addClient(String name, String cep, String cpf, String cnh, ClientList clientes) {
		boolean exists = false;
		for(int i = 0; i < clientes.getClientes().size(); i++) {
			if (clientes.getClientes().get(i).getCnh().equals(cnh) || clientes.getClientes().get(i).getCpf().equals(cpf)) {
				exists = true;
			}
		}  

		if (exists == false){
			Cliente cliente = new Cliente(name,cep,cpf,cnh);
			cliente.setCode(clientes.getClientes().get(clientes.getClientes().size()-1).getCode()+1);
			clientes.addClientToList(cliente);
			clientes.writeClients();
		}
		
		else {
			System.out.println("Usuário já cadastrado");
		}
	}
	
	public static void updateClient(int code, ClientList clientes) {
		boolean exists = false;
		for(int i = 0; i < clientes.getClientes().size(); i++) {
			if (clientes.getClientes().get(i).getCode() == code) {
				System.out.print("Nome: " + clientes.getClientes().get(i).getName() + ", ");
				System.out.print("Cpf: " + clientes.getClientes().get(i).getCpf() + ", ");
				System.out.print("Cep: " + clientes.getClientes().get(i).getCep() + ", ");
				System.out.print("Cnh: " + clientes.getClientes().get(i).getCnh() + ", ");	
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
				clientes.getClientes().get(i).setName(name);
				clientes.getClientes().get(i).setCnh(cnh);
				clientes.getClientes().get(i).setCep(cep);
				clientes.getClientes().get(i).setCpf(cpf);
				clientes.writeClients();
				exists = true;
			}
		
		}
		
		if (exists==false) {
			System.out.println("Usuário não encontrado");
			// selecionando da lista sempre vai achar cliente
		}
		
	}
	
	
	public static void removeClient(int code, ClientList clientes) {
		boolean exists = false;
		for(int i = 0; i < clientes.getClientes().size(); i++) {
			if (clientes.getClientes().get(i).getCode() == code) {
					clientes.getClientes().remove(i);
					clientes.writeClients();
					// CUIDAR QUANDO FOR REMOVER CLIENTE, VERIFICAR PENDENCIAS
					exists = true;
			}
		}
		if (exists==false) {
			System.out.println("Usuário não encontrado");
			// selecionando da lista sempre vai achar cliente
		}
		
		
	}
}
