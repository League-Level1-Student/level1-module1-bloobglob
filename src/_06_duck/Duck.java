package _06_duck;

public class Duck {
	private String favFood;
	private String duckName;
	Duck(String duckName, String favFood) {
      	this.duckName = duckName;
      	this.favFood = favFood;
	}
	void quack() {
		System.out.println(duckName + " quacked");
	}
	void eat() {
		System.out.println(duckName + " ate " + favFood);
	}
}
