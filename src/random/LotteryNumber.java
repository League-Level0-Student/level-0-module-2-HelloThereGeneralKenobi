package random;

import java.util.Random;

import javax.swing.JOptionPane;

public class LotteryNumber {
	public static void main(String[] args) {
		Random gen = new Random();
		int num1 = gen.nextInt(10);
		int num2 = gen.nextInt(10);
		int num3 = gen.nextInt(10);
		int num4 = gen.nextInt(10);
		int num5 = gen.nextInt(10);
		
		JOptionPane.showMessageDialog(null, num1 + "" + num2 + "" + num3 + "" + num4 + "" + num5);
	}
}
