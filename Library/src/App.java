public class App {
	public static void main(String[] args) {
		Book seaOfRust = new Book("Sea Of Rust", 350);
		Book neuromancer = new Book("Neuromancer", 320);
		Book burningChrome = new Book("Burning Chrome", 250);

		Library person = new Library();
		person.addItem(seaOfRust, neuromancer, burningChrome);
		System.out.println(person.getShelf());

		User tim = new User("Jim", "Fake Street");
		User cat = new User("Cat", "Fib Avenue");
		User josh = new User("Josh", "Lie Lane");

		Administrator admin = new Administrator();
		admin.registerPerson(tim, cat, josh);
		System.out.println(admin.getRegistry());
		admin.updatePerson("Cat", "Trap House");
		System.out.println(admin.getRegistry());

		// person.updateItem()

	}
}
