
public class PigRunner {
	public static void main(String[] args) {
		Pig babe = new Pig("Babe", true);
		Pig rasher = new Pig("Rasher", false);
		Pig ziggy = new Pig("Ziggy", true);
		if(ziggy.willBecomeBacon()) {
			System.out.println("bacon for breakfast");
		}else {
			System.out.println("eggs for breakfast");
		}
	}
}
