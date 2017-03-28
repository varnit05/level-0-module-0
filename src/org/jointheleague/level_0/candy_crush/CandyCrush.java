package org.jointheleague.level_0.candy_crush;

import javax.swing.JOptionPane;

public class CandyCrush {

	public static void main(String[] args) {
		// 1. Using a pop-up, ask the user who they don't like
		String input = JOptionPane.showInputDialog("Who Do You Not Like?");
		// 2. Change the next line so that the pop-up will tell them they have a
		// crush on that person
		JOptionPane.showMessageDialog(null, "You totally have a crush on " + input);

		// 3. Ask the user for the name of their best friend
		String input1 = JOptionPane.showInputDialog("What's The Name Of Your Best Friend");
		// 4. Tell them their best friend is as sweet as candy
		JOptionPane.showMessageDialog(null, "Your Best Friend" + input1 + "Is Sweet");
	}
}
