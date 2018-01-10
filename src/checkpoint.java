import javax.swing.JOptionPane;

public class checkpoint {
	public static void main(String[] arg) {
		

String cups = JOptionPane.showInputDialog("How many cups of flour do you have");
int x = Integer.parseInt(cups);
if(x<2) {
	JOptionPane.showMessageDialog(null, "Go to the store and buy more");
}
	String people = JOptionPane.showInputDialog("How many people are you gonna give cookies too");
	int y = Integer.parseInt(people);
	if(y>30) {
		JOptionPane.showMessageDialog(null, "Your gonna need two batches of cookies");
	}
		String batch = JOptionPane.showInputDialog("How many batches did you bake");
	int z = Integer.parseInt(batch);
	if(batch.equals(2)) {
		JOptionPane.showMessageDialog(null, "Your lucky to have so many friends");
	}
}
}

