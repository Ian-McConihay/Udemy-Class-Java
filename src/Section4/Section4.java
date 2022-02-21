package Section4;

public class Section4 {
	public static void main(String[] args) {
//		Expression
		double kilometers = (100 * 1.609344);
//		int highScore = 100;
////		Control flow statement
////		If statement
//		if (highScore > 99){
//			System.out.println("You got a high score!");
//			highScore = 0;
//				}

//			Java statement

//			int
//					myVariable
//					=
//					50;
		int myVariable = 50;
		myVariable++;
		System.out.println("This is a test " +
				"Another test" +
				" and another ");
		//Both valid complete statements
		int anotherVariable=50;myVariable--;System.out.println("This is another");





//		CODE BLOCKS

		boolean gameOver =true;
		int highScore = 10_000;
		int score = 10_000;
		int levelCompleted = 8;
		int bonus = 200;
		int finalScore = score + (levelCompleted * bonus);
//		if(score < 5000 && score > 1000) {
//			System.out.println("Your Score is less than 5000");
//		} else if(score < 1000){
//			System.out.println("Your score is less than 1000");
//		} else {
//			System.out.println("This was executed");
//		}
//		 if(gameOver == true) is the exact same as if(gameOver)
//		it defaults to true same as defaulting to false if you did if(!gameOver)
//		Variables cannot be accessed outside the codeblock {}
		if(gameOver){
			System.out.println("Your final score was " + finalScore);
		} else if(finalScore > highScore && gameOver){
			System.out.println("You set the new HighScore! " + finalScore);
		}

























	}
}
