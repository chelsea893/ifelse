package com.company;

public class Main {

    public static void main(String[] args) {
        // can also define variable names too
        int highScore =  calculateScore(true,800,5, 100); // passing in values /arguments
        System.out.println("Your final score was "+ highScore);
        highScore = calculateScore(true, 10000, 8, 200);
        System.out.println("Your final score was "+ highScore);
        calculateHighScorePosition(500);
        // can reuse variables and change their values or create new variables
        //int player = displayHighScorePosition(sam, 3);
        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("tim", highScorePosition);
        highScorePosition = calculateHighScorePosition(900);
        displayHighScorePosition("bob", highScorePosition);
        highScorePosition = calculateHighScorePosition(400);
        displayHighScorePosition("percy", highScorePosition);
        highScorePosition = calculateHighScorePosition(600); // returning a method
        displayHighScorePosition("gilbert", highScorePosition);
        highScorePosition = calculateHighScorePosition(1000);
        displayHighScorePosition("louise", highScorePosition);

    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) { // creating a method and setting parameters

        if(gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;

            return finalScore;
        } else {
            return -1;
        }
        //return -1;

    }
    public static void displayHighScorePosition(String playersName, int playersPosition) {
        System.out.println(playersName + " managed to get into position " + playersPosition + " on the high score table");
    }
    public static int calculateHighScorePosition(int playersScore){
        //if (playersScore >= 1000){
            //return 1;
        //}else if (playersScore >= 500) {
            //return 2;
        //} else if (playersScore >= 100) {
            //return 3;
        //}
        //return 4;
        int position = 4; // assuming position 4 will be returned
        if (playersScore >= 1000){
            position = 1;
        }else if (playersScore >= 500) {
            position = 2;
        } else if (playersScore >= 100) {
            position = 3;
        }
        return position; // if all not true position still remains as 4 so it can just remain

    }


}
