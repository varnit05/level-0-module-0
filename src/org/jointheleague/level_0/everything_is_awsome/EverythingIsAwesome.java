package org.jointheleague.level_0.everything_is_awsome;

import javax.swing.JOptionPane;

public class EverythingIsAwesome {
	public static void main(String[] args) {
		String input = JOptionPane.showInputDialog("What do you like?");
		JOptionPane.showMessageDialog(null, input + " Is Awesome");

	}

}
