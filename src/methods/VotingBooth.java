package methods;

import javax.swing.JOptionPane;

public class VotingBooth {
	public static void main(String[] args) {
		String ans = JOptionPane.showInputDialog("How old are you?");
		int ans1 = Integer.parseInt(ans);
		if(ans1 > 17) {
			JOptionPane.showInputDialog("Who should be the next president?");
		}
		else {
			JOptionPane.showMessageDialog(null, "Your opinon is INVALID");
		}
	}
}
