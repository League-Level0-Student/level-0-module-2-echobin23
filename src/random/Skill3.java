package random;

import java.util.Random;

import javax.swing.JOptionPane;

public class Skill3 {
public static void main(String[] args) {

Random x = new Random();
int i = x.nextInt(21);
System.out.println(i);
Random r = new Random();
	int s = r.nextInt(11);
	System.out.println(s);
	JOptionPane.showMessageDialog(null, "The difference is "+(i-s));
}
}
