package variables_and_conditionals;

import javax.swing.JOptionPane;

/*
 * Everyone has a superpower. Mine is writing recipes. This program will store
 * the superpowers of all the people in the classroom. E.g. When I type "June",
 * your program should say "June's superpower is writing recipes".
 */
public class XGeeks {
	public static void main(String[] args) {

		// 1. Save the superpower for each person in a variable.
		String dannysPower = "knows nothing";
		String varnitsPower = "everything";
		String arnavsPower = "invisible";
		String evansPower = "sleep";
		// 2. Ask the user to enter a name. Store their answer in a variable.
		String lol = JOptionPane.showInputDialog("Whos superhero do you want to know");
		// 3. Show the superpower in a pop-up, depending on the name entered.
		if (lol.equalsIgnoreCase("Danny")) {
			JOptionPane.showMessageDialog(null, "Danny is " + dannysPower);
		}
		if (lol.equalsIgnoreCase("Varnit")) {
			JOptionPane.showMessageDialog(null, "Varnit is " + varnitsPower);
		}
		if (lol.equalsIgnoreCase("Arnav")) {
			JOptionPane.showMessageDialog(null, "Arnav is " + arnavsPower);
		}
		if (lol.equalsIgnoreCase("Evan")) {
			JOptionPane.showMessageDialog(null, "Evan is " + evansPower);
		}
	}
}