package _03_char._3_pi_aloud;

import java.io.IOException;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class PiAloud {
	// 1. Make a main method and make sure your program can run

	// 2. Make a String variable to hold 20 digits of Pi. You could use http://www.piday.org/million/ to get this.
	String pi = "3.1415926535897932384";
	// 3. Print out 3 digits of Pi. The first value is "pi.charAt(0)", the second is "pi.charAt(1)"
	// Check the console shows 3.1
	//JOptionPane.showMessageDialog(null, pi.charAt(0));
	//JOptionPane.showMessageDialog(null, pi.charAt(1));
	//JOptionPane.showMessageDialog(null, pi.charAt(2));
	// 4. Print ALL the digits of of the Pi String (hint: use a loop)
	for (int i=0;i< 21;i++){
		JOptionPane.showMessageDialog(null, pi.charAt(i));
	    speak(pi.charAt(i));
	}
	// 5. Use the speak() method below to speak each digit of Pi.

	
	
	
	}
	/********************  Use these methods. DON'T CHANGE THE CODE BELOW  ******************/

	static void speak(char characterToSpeak) {
		try {
			Runtime.getRuntime().exec("say " + characterToSpeak).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void pause(int seconds) {
		try {
			Thread.sleep(1000 * seconds);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	static char getInputFromUser() {
		Scanner scanner = new Scanner(System.in);
		return scanner.next().toCharArray()[0];
	}

}


