package _01_algorithms._3_goofy_names;

import javax.swing.JOptionPane;

public class Prime_or_not {
public static void main(String[] args) {
String number =JOptionPane.showInputDialog("Choose a number");
int Number = Integer.parseInt(number);
boolean isPrime=true;
for (int i = 2; i < Number; i++) {
	if(Number%i==0) {
		isPrime=false;
		break;
	}	
	
}
	if(isPrime) {
	JOptionPane.showMessageDialog(null, "The number is prime");
	}
else {
	JOptionPane.showMessageDialog(null, "the number is not prime");
}
}
}