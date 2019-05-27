import java.util.ArrayList;

public class Library {
	private ArrayList<Media> shelf = new ArrayList<Media>();

	public ArrayList<Media> getShelf() {
		return shelf;
	}
	

	public void addItem(Media item1) {
		shelf.add(item1);
	}

	public void addItem(Media item1, Media item2, Media item3) {
		shelf.add(item1);
		shelf.add(item2);
		shelf.add(item3);
	}

	public void removeItem(ArrayList<Media> shelf, Book item1) {
		shelf.remove(item1);
	}

	public void updateItem(Media name, int numpage) {
		for (Media m : shelf) {
			if (m.getClass().getName().equals(name)) {
				((Book) m).setNumPage(numpage);
			}
			if (m.getClass().getCanonicalName().equals(name)) {
				((Magazine) m).setNumPage(numpage);
			} else {
				System.out.println("Please Choose Book or Magazine");

			}
		}
	}

}
