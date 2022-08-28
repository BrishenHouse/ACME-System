package ver1;

public class HelloWorld {

	public static void main(String[] args) {

		System.out.println("Hello from Eclipse");
		System.out.println("Brish is working on Eclipse");
		heyNow();
		whatFor("hello");	
	}

	public static void heyNow() {
		String msg = "hey now!";
		System.out.println(msg);
	}
	
	public static void whatFor(String msg) {
		System.out.println(msg + " stringArg, what for?");
	}
}
