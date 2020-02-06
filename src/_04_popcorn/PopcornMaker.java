package _04_popcorn;

import javax.swing.JOptionPane;

public class PopcornMaker {
	public static void main(String[] args) {
		String flavor = JOptionPane.showInputDialog("What type of popcorn would you like?");
		Popcorn popcorn = new Popcorn(flavor);
		Microwave microwave = new Microwave();
		String userTime = JOptionPane.showInputDialog("How long do you want to cook it?");
		int time = Integer.parseInt(userTime);
		microwave.putInMicrowave(popcorn);
		microwave.setTime(time);
		microwave.startMicrowave();
	}
}
