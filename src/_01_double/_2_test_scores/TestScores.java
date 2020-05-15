package _01_double._2_test_scores;

import javax.swing.JOptionPane;

public class TestScores {
		public static void main(String[] args) {
			String bob = JOptionPane.showInputDialog("what is your test score? (Write it in a decimal ex). 75.5)");
			double n1 = Double.parseDouble(bob);
			if(n1>=80){
				JOptionPane.showMessageDialog(null, "Wow! You studied really hard for this test didn't you?");
			}
			else if (n1>=50 && n1<80) {
				JOptionPane.showMessageDialog(null, "You did okay....");
			}
			else if(n1>=0 && n1<50) {
				JOptionPane.showMessageDialog(null, "You did terrbile!!!!");
			}

	

	

	

	
		}
	
	
}
