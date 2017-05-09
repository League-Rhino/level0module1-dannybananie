package variables_and_conditionals;

import java.util.Random;

import javax.swing.JOptionPane;

public class HighLowGame {
public static void main(String[] args) {
	Random game = new Random();
	int hi = game.nextInt(100);
	System.out.println(hi);
	for (int i = 0; i < 20; i++) {
		
	
String blah =	JOptionPane.showInputDialog("What is the number im thinking about");
	int backspace= Integer.parseInt(blah);
	if(hi<backspace){
		JOptionPane.showMessageDialog(null,"Your guess is too high");
	}
	if(hi>backspace){
		JOptionPane.showMessageDialog(null,"Your guess is too low");
	}
	
	
	if(hi==backspace){
		JOptionPane.showMessageDialog(null,"Your guess is correct");
		i=20;
		
	}


}
}
}
