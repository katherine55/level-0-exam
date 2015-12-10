
/* Level 0 Exam: Coding  Exercise #1 */
import java.awt.Color;

import javax.swing.JOptionPane;
import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.Tortoise;

public class CodingExercise1 {
	public static void main(String[] args) {
		String color = JOptionPane
				.showInputDialog("would you like the tortoise to draw in black or yellow, or magenta?");

		if (color.equalsIgnoreCase("black")) {
			Tortoise.setPenColor(Color.black);
		}

		else if (color.equalsIgnoreCase("yellow")) {
			Tortoise.setPenColor(Color.yellow);
		}

		else if (color.equalsIgnoreCase("magenta")) {
			Tortoise.setPenColor(Color.magenta);
		}

		Tortoise.penDown();
		Tortoise.setPenWidth(10);

		for (int i = 0; i < 4; i++) {
			Tortoise.turn(90);
			Tortoise.move(100);
		}
	}
}
