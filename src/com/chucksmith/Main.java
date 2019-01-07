package com.chucksmith;

public class Main {

	public static void main(String[] args) {
//		boolean gameOver = true;
		int score = 1001;
//		int levelComplete = 5;
//		int bonus = 100;
		String name = "Chuck Smith";


//		int returnValue = calculateScore(gameOver, score, levelComplete, bonus);
//		System.out.println("Your final score was " + returnValue);
//		score = 10000;
//		levelComplete = 8;
//		bonus = 200;
//
//		returnValue = calculateScore(gameOver, score, levelComplete, bonus);
//		System.out.println("Your final score was " + returnValue);

		score = 1001;
		name = "Chuck Smith";

		displayHighScorePosition(name, calculateHighScorePosition(score));

		score = 999;
		name = "Billy Bob";
		displayHighScorePosition(name, calculateHighScorePosition(score));

		score = 499;
		name = "Jack Diane";
		displayHighScorePosition(name, calculateHighScorePosition(score));

		score = 0;
		name = "Peter Parker";
		displayHighScorePosition(name, calculateHighScorePosition(score));

	}


	public static int calculateScore(boolean gameOver, int score, int levelComplete, int bonus) {


		if (gameOver) {
			int finalScore = score + (levelComplete * bonus);
			finalScore += 2000;
			return finalScore;
		}
		return -1;
	}

	public static void displayHighScorePosition(String name, int position){
		System.out.println(name + " managed to get into position " + position + " on the high score table!");
	}

	public static int calculateHighScorePosition(int score){
		if(score > 1000){
			return 1;
		}else if(score > 500 && score < 1000){
			return 2;
		}else if(score > 100 && score < 500){
			return 3;
		}else
		return 4;
	}


}