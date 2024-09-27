package asciiConverter;

import java.util.Scanner;

public class AsciiTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter an ASCII code: ");
		
		int asciiCode = input.nextInt();
		
		new AsciiConverter(asciiCode);
		
		input.close();

	}

}
