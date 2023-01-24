import java.util.Scanner;
import java.util.Random;

public class Powerball {

	static int clampToRange(int value, int lowerValue, int upperValue) {

		int rangeWidth = upperValue - lowerValue + 1;

		while (value > upperValue) {
			value -= rangeWidth;
		}
		while (value < lowerValue) {
			value += rangeWidth;
		}
		return value;

	}

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		System.out.println("What is your name?");
		String nameInput = userInput.nextLine();
		System.out.println("Hello " + nameInput);

		System.out.println("Do you wish to continue to the interactive portion?");

		if (userInput.nextLine().toLowerCase().charAt(0) == 'y') {

			while (true) {
				System.out.println("Let's begin!");
				System.out.println("Do you have a red car?");
				String car = userInput.nextLine();
				System.out.println("What is your favorite actor or actress?");
				String actor = userInput.nextLine();
				System.out.println("What is the name of your favorite pet?");
				String petName = userInput.nextLine();
				System.out.println("What age is your favorite pet?");
				while(!userInput.hasNextInt()) {
					System.out.println("Invalid input, please enter a number!");
					userInput.next();
				}
				int petAge = userInput.nextInt();
				System.out.println("What is your lucky number?");
				while(!userInput.hasNextInt()) {
					System.out.println("Invalid input, please enter a number!");
					userInput.next();
				}
				int luckyNum = userInput.nextInt();

				System.out.println("Do you have a favorite quarterback?");
				String hasQuarterback = userInput.nextLine();
				if (userInput.nextLine().toLowerCase().charAt(0) == 'y') {
					int jerseyNumber = 0;
					System.out.println("What is their jersey number?");
					while(!userInput.hasNextInt()) {
						System.out.println("Invalid input, please enter a number!");
						userInput.next();
					}
					jerseyNumber = userInput.nextInt();
				} else {
					System.out.println("That's okay!");
				}

				System.out.println("What is two-digit model year of your car?");
				while(!userInput.hasNextInt()) {
					System.out.println("Invalid input, please enter a number!");
					userInput.next();
				}
				int carModel = userInput.nextInt();
				
				System.out.println("Enter a random number between 1-50");
				while(!userInput.hasNextInt()) {
					System.out.println("Invalid input, please enter a number!");
					userInput.next();
				}
				int chosenNum = userInput.nextInt();


				int MaxNums = 65;

				int MaxMagic = 75;
				int MinMagic = 1;

				Random randMagic = new Random();
				int MagicNum = randMagic.nextInt((MaxMagic - MinMagic) + 1) + MinMagic;

				int MagicLuck = 0;
				MagicLuck = clampToRange(MagicLuck, 1, 75);


				int[] RandNum = new int[5];

				RandNum[0] = carModel + luckyNum;

				RandNum[1] = chosenNum - luckyNum;

				RandNum[2] = actor.charAt(0);

				RandNum[3] = 42;

				RandNum[4] = petAge + carModel;

				for(int i=0; i<5; ++i) {
					RandNum[i] = clampToRange(RandNum[i], 1, 65);
		 		}

				System.out.printf("Lottery numbers: %d, %d, %d, %d Magic ball: %d\n", RandNum[0], RandNum[1],
						RandNum[2], RandNum[3], RandNum[4], MagicLuck);

				System.out.println("Do you want to play again?");
				String playAgain = userInput.nextLine();
				if (userInput.nextLine().toLowerCase().charAt(0) == 'y') {
					System.out.println("Back to the start!");
				} else {
					System.out.println("Thanks for playing!");
					System.exit(0);
				}

			}
		} else {
			System.out.println("Please return later to complete the survey");
		}
	}
}
