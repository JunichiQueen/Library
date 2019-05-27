public class App {
	public static void main(String[] args) {
		Book seaOfRust = new Book("Sea Of Rust", 350);
		Book neuromancer = new Book("Neuromancer", 320);
		Book burningChrome = new Book("Burning Chrome", 250);

		Library person = new Library();
		person.addItem(seaOfRust, neuromancer, burningChrome);
		System.out.println(person.getShelf());

		User tim = new User("1", "Jim", "Fake Street");
		User cat = new User("2", "Cat", "Fib Avenue");
		User josh = new User("1", "Josh", "Lie Lane");

		Administrator admin = new Administrator();
		admin.registerPerson(tim, cat, josh);
		System.out.println(admin.getRegistry());
		admin.updatePerson("Cat", "Trap House");
		System.out.println(admin.getRegistry());

		// person.updateItem()

	}
}
