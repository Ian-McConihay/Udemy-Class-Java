package Section4;

public class MethodGame {
	public static void main(String[] args) {
		boolean gameOver = true;
		int score = 10_000;
		int levelCompleted = 8;
		int bonus = 200;

		calculateScore(gameOver, score, levelCompleted, bonus);
		calculateScore(true, 1000, 10, 400);
	}

	public static void calculateScore(boolean gameOver, int score,  int levelCompleted, int bonus){
		int finalScore = score + (levelCompleted * bonus);
		int highScore = 10_000;
		if(gameOver){
			System.out.println("Your final score was " + finalScore);
		} else if(finalScore > highScore && gameOver){
			System.out.println("You set the new HighScore! " + finalScore);
		}
	}


}
