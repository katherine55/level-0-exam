
/* Level 0 Exam: Coding  Exercise #2 */
import javax.swing.JOptionPane;

public class CodingExercise2 {
	public static void main(String[] args) {
		String ageString = JOptionPane.showInputDialog("How old are you?");
		int ageInt = Integer.parseInt(ageString);
		int yearBorn = 2015 - ageInt;
		JOptionPane.showMessageDialog(null, yearBorn + " is the year you were born");
		
	if(ageInt > 30){
		JOptionPane.showMessageDialog(null, "You are way too old to be playing this game!");
	}
	}

}
