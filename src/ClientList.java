import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class ClientList {
	public static ArrayList<Cliente> clientes = new ArrayList<Cliente>();
	
	public ArrayList<Cliente> getClientes() {
		return clientes;
	}
	public static void setClientes(ArrayList<Cliente> clientes) {
		ClientList.clientes = clientes;
	}
	public ClientList() throws Exception {
		super();
		Path path = Paths.get("clientes.ser");

		if (Files.exists(path)) {
			clientes=readClients();
		}
		else {
			writeClients();
		}
	}
	public void addClientToList(Cliente client) {
		clientes.add(client);
		
	}
	
	public void writeClients() {
		try {
			// write object to file
			FileOutputStream fos = new FileOutputStream("clientes.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(clientes);
			oos.close();

			// read object from file.out.println("One:" + result.getOne() + ", Two:" + result.getTwo());

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static ArrayList<Cliente> readClients() throws Exception {
		try {
			FileInputStream fis = new FileInputStream("clientes.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			ArrayList<Cliente> clientes = (ArrayList<Cliente>) ois.readObject();
			ois.close();
			return clientes;

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	
	}
}
