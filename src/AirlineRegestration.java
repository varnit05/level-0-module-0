import javax.swing.JOptionPane;

public class AirlineRegestration {
	public static void main(String[] args) {

		String lastName = JOptionPane.showInputDialog(null, "What's Your LastName?");
		String firstName = JOptionPane.showInputDialog(null, "What's Your FirstName?");
		String birthMonth = JOptionPane.showInputDialog(null, "What's Your Birthmonth?");
		String birthdayDay = JOptionPane.showInputDialog(null, "What's Your Birthday day?");
		String birthYear = JOptionPane.showInputDialog(null, "What's Your Birthyear?");
		String row = JOptionPane.showInputDialog(null, "What's Your Row Number");
		String seat = JOptionPane.showInputDialog(null, "What's Your Seat Number");
		
		JOptionPane.showMessageDialog(null, lastName + ", " + firstName);
		JOptionPane.showMessageDialog(null, birthMonth + ", " + birthdayDay + "," + birthYear);
		JOptionPane.showMessageDialog(null, "row: " + row);																					
		JOptionPane.showMessageDialog(null, "seat: " + seat);								
		
		
		
	}
}
