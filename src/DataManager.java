import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class DataManager {
	public static void writeClients(ArrayList<Cliente> clientes) {
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
