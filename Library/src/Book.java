public class Book extends Media {
	private int numPage;

	public void setNumPage(int page) {
		this.numPage = page;
	}

	public Book(String title, int numPage) {
		super();
		this.numPage = numPage;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Title: " + getTitle() + " NumPage: " + numPage;
	}

}
