 package PractiseSet;
import java.util.Random;
import java.util.Scanner;
/*
 Create a class Game, which allows a user to play "Guess the Number" game once.

          Game should have the following methods:
1.Constructor to generate the random number
2.takeUserInput() to take a user input of number
3.isCorrectNumber() to detect whether the number entered by the user is true
4.getter and setter for noOfGuesses
Use properties such as noOfGuesses(int), etc to get this task done!
 */
 class Game{
	int a,noOfGuesses=0,input;
	 
	public  Game() {
		Random r = new Random();
		 a = r.nextInt(99);
	}
	
	public int getNoOfGuesses() {
		return noOfGuesses;
	}
	
	public void setNoOfGuesses(int shf) {
		shf = noOfGuesses;
	}
	
	 public void takeUserInput() {
		System.out.print("Guess the Number between 0 to 100 to win the game : ");
		Scanner s = new Scanner(System.in);
	    input = s.nextInt(); 
	}
	 
	 public boolean isCorrectNumber() {
		    noOfGuesses++;
			if(input==a ) {
				System.out.println("Yes you guessed it right, it was " +a+ "\nYou guessed it in " +noOfGuesses+ " attempts\nYou win the Game.");
				return true;
			}
			else if(input<a) {
				System.out.println("Number is too less.\nGuess the high Number.");
			}
			else if(input>a) {
				System.out.println("Number is too high.\nGuess the less Number.");
			}
			return false; 
		
	} 
 }
	

class Excercise3GuessTheNumber{
		public static void main(String args[]) {
		Game g = new Game();
		boolean b = false;
		while(!b) {
		g.takeUserInput();
	    b = g.isCorrectNumber();
		}
		}
}

