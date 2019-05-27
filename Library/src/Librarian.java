import java.util.ArrayList;

public abstract class Librarian {
	private ArrayList<User> registry = new ArrayList<User>();

	public ArrayList<User> getRegistry() {
		return registry;
	}

	public void setRegistry(ArrayList<User> reg) {
		this.registry = reg;
	}

	public abstract void registerPerson(User user, User user2, User user3);


	public abstract void deletePerson(User user);

	public abstract void updatePerson(String inputName, String address);

}
