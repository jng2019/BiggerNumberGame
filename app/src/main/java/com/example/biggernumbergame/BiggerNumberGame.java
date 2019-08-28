package com.example.biggernumbergame;

public class BiggerNumberGame {

    private int number_left;
    private int number_right;
    private int score;
    private int lower_limit;
    private int upper_limit;

    public BiggerNumberGame(int lower_limit, int upper_limit) {
        this.lower_limit = lower_limit;
        this.upper_limit = upper_limit;
        generateRandomNumber();
    }
    // generate random numbers

    public void generateRandomNumber() {
        //generate a number between upper and lower limits inclusive
        //store one number in number one
        //generate a different number stored in number two

        number_left = (int)(Math.random() * (upper_limit - lower_limit)) + lower_limit;
        number_right = (int)(Math.random() * (upper_limit - lower_limit)) + lower_limit;
            while (number_left == number_right){
                number_left = (int)(Math.random() * (upper_limit - lower_limit)) + lower_limit;
        }
    }
    public String checkAnswer(int answer){
        //determine if  the answer is right
        //update score
        //return a relevant message
        if (Math.max(number_left, number_right) == answer)
        {
            score++;
            return "Good Job! Correct answer.";
        }
        else
            score--;
            return "Wrong Number! Try again.";
        }
    public int getNumber_left() {
        return number_left;
    }

    public void setNumber_left(int number_left) {
        this.number_left = number_left;
    }

    public int getNumber_right() {
        return number_right;
    }

    public void setNumber_right(int number_right) {
        this.number_right = number_right;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getLower_limit() {
        return lower_limit;
    }

    public void setLower_limit(int lower_limit) {
        this.lower_limit = lower_limit;
    }

    public int getUpper_limit() {
        return upper_limit;
    }

    public void setUpper_limit(int upper_limit) {
        this.upper_limit = upper_limit;
    }
}
