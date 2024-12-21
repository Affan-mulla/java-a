import javax.swing.JOptionPane;
public class GUIproject {
	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog("Enter your Name");
		JOptionPane.showMessageDialog(null, "Hello " + name);

		int age = Integer.parseInt(JOptionPane.showInputDialog("Enter Your Age"));

		if (age >= 18) {
			JOptionPane.showMessageDialog(null, "You are adult :" + age);
		} else {
			JOptionPane.showMessageDialog(null, "You are kid" + age);
		}

		double height  = Double.parseDouble(JOptionPane.showInputDialog("Enter your height"));
		JOptionPane.showMessageDialog(null, "Your height is "+height);
	}
}
