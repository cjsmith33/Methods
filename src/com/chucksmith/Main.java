package com.chucksmith;

public class Main {

	public static void main(String[] args) {
		boolean gameOver = true;
		int score = 800;
		int levelComplete = 5;
		int bonus = 100;

		int returnValue = calculateScore(true, 800, levelComplete, bonus);
		System.out.println(returnValue);
		score = 10000;
		levelComplete = 8;
		bonus = 200;

		returnValue = calculateScore(true, score, levelComplete, bonus);
		System.out.println(returnValue);
	}

	public static int calculateScore(boolean gameOver, int score, int levelComplete, int bonus) {


		if (gameOver) {
			int finalScore = score + (levelComplete * bonus);
			finalScore += 1000;
			System.out.println("Your final score was " + finalScore);
			return finalScore;
		}
		return -1;
	}

}