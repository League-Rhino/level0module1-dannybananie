package variables_and_conditionals;
import javax.swing.JOptionPane;

public class Horoscope {
public static void main(String[] args) {
	
	
String month =	JOptionPane.showInputDialog("What is the month of your birthday");

if(month.equalsIgnoreCase("January")){
	
	JOptionPane.showMessageDialog(null, "You are in Capricorn");

	
}
else if(month.equalsIgnoreCase("Febuary")){
	
	JOptionPane.showMessageDialog(null, "You are in Aquarius");
	
	
}


}
}
