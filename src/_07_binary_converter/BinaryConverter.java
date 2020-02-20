package _07_binary_converter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BinaryConverter implements ActionListener {
		JFrame frame = new JFrame("Binary to ASCII Convertor");
		JPanel panel = new JPanel();
		JLabel label = new JLabel();
		JTextField textfield = new JTextField(20);
		JButton button = new JButton("convert");
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			JButton buttonPressed = (JButton)e.getSource();
			if(button == buttonPressed) {
				label.setText(convert(textfield.getText()));
				frame.pack();
			}
		}
		void setupWindow() {
			panel.add(textfield);
			panel.add(button);
			frame.add(panel);
			panel.add(label);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.pack();
			button.addActionListener(this);
			frame.setVisible(true);
		}
		String convert(String input) {
		    if(input.length() != 8){
		        JOptionPane.showMessageDialog(null, "Enter 8 bits, silly!!!");
		        return "-";
		    }
		    String binary = "[0-1]+";//must contain numbers in the given range
		    if (!input.matches(binary)) {
		        JOptionPane.showMessageDialog(null, "Binary can only contain 1s or 0s, silly!!!");
		        return "-";   
		    }
		    try {
		        int asciiValue = Integer.parseInt(input, 2);
		        char theLetter = (char) asciiValue;
		        return "" + theLetter;
		    } catch (Exception e) {
		        JOptionPane.showMessageDialog(null, "Enter a binary, silly!!!");
		        return "-";
		    }
		}
		
}
