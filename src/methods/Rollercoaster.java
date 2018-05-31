package methods;

import javax.swing.JOptionPane;

public class Rollercoaster {
	public static void main(String[] args) {
		String answer = JOptionPane.showInputDialog("What is your length, in inches?");
		int answer1 = Integer.parseInt(answer);
		if(answer1 > 47) {
			JOptionPane.showMessageDialog(null, "You are long enough to go on the Rollertoaster.");
		}
		else {
			JOptionPane.showMessageDialog(null, "You are not long enough to go on the Rollertoaster, please elongate.");
		}
	}
}
