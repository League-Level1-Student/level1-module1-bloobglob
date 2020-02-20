
public class Candy {
	private String maker;
    private String type;
    private double price; 
    Candy(String maker, String type, double price) {
    	this.maker = maker;
    	this.type = type;
    	this.price = price;
    }
    void makeCandy() {
    	System.out.println(maker + " is selling " + type + " candy for $" + price);
    }
}
