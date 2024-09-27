package asciiConverter;

import java.util.Scanner;

public class AsciiConverter {
	private int asciiCode;

	public AsciiConverter(int asciiCode) {
		while (!isInputValid(asciiCode)) {
			System.out.println("Invalid Input. Please enter code between 0 to 127");
			asciiCode = new Scanner(System.in).nextInt();
		}
		this.asciiCode = asciiCode;
		convertAndPrint();
	}

	private void convertAndPrint() {
		char character = (char)asciiCode;
		System.out.println("The character to ASCII code " + asciiCode + " is " + character);
		
	}

	private boolean isInputValid(int userInput) {
				
		return userInput >= 0 && userInput <= 127;
	}
	
	
}
