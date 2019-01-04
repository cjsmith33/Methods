package com.chucksmith;

public class Main {

	public static void main(String[] args) {
		boolean gameOver = true;
		int score = 800;
		int levelComplete = 5;
		int bonus = 100;

		calculateScore(true, 800, levelComplete, bonus);

		score = 10000;
		levelComplete = 8;
		bonus = 200;

		calculateScore(true, score, levelComplete, bonus);

	}

	public static void calculateScore(boolean gameOver, int score, int levelComplete, int bonus) {


		if (gameOver) {
			int finalScore = score + (levelComplete * bonus);
			finalScore += 1000;
			System.out.println("Your final score was " + finalScore);
		}
	}

}