
public class Administrator extends Librarian {
	
	
	@Override
	public void registerPerson(User user, User user2, User user3) {
		getRegistry().add(user);
		getRegistry().add(user2);
		getRegistry().add(user3);
	}
	@Override
	public void deletePerson(User user) {
		getRegistry().remove(user);
	}
	@Override
	public void updatePerson(String inputName, String address) {
		for (User u : getRegistry()) {
			if (u.getClass().getName().equals(inputName)) {
				u.setAddress(address);
			}

		}


}
	
}