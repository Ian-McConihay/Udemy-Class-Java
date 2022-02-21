package Section4;

public class MethodGame {
	public static void main(String[] args) {
		calculateScore(1000, true, levelCompleted, bonus);

	}

	public static void calculateScore(int score, boolean gameOver, int levelCompleted, int bonus){
		boolean gameOver =true;
		int highScore = 10_000;
		int score = 10_000;
		int levelCompleted = 8;
		int bonus = 200;
		int finalScore = score + (levelCompleted * bonus);

		if(gameOver){
			System.out.println("Your final score was " + finalScore);
		} else if(finalScore > highScore && gameOver){
			System.out.println("You set the new HighScore! " + finalScore);
		}
	}


}
