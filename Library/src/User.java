import java.util.ArrayList;

public class User implements CheckInable, CheckOutable {
	private String ID;
	private String name;
	private String address;
	ArrayList<Media> borrowed = new ArrayList<Media>();

	public User(String ID, String name, String address) {
		this.ID = ID;
		this.name = name;
		this.address = address;
	}
	
	public String getID() {
		return ID;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public void setID(String ID) {
		this.ID = ID;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "ID: " + ID + " Name: " + name + " Address: " + address;
	}

	

	public void CheckInItem(Media med) {
		borrowed.add(med);
	}

	public void CheckOutable(Media med) {
		borrowed.remove(med);
	}

}
