package com.vg.week3.dicegame;

/*
 * Author: Vadim Gubin
 * Student ID: 301538942
 * Date: September 24, 2026
 * Description: Four dice. First roll 7, 11, 15, 21 wins.
 * 10, 12, 13, 19, 20, 22, 23, 24 loses. Any other sum is the goal.
 * Second roll must match the goal to win. 13 on the second roll loses.
 */

public class DiceGame {

	private Die die;

	public DiceGame() {
		die = new Die();
	}

	private int rollFourDice() {
		int die1 = die.roll();
		int die2 = die.roll();
		int die3 = die.roll();
		int die4 = die.roll();
		int sum = die1 + die2 + die3 + die4;

		System.out.println("Dice 1: " + die1);
		System.out.println("Dice 2: " + die2);
		System.out.println("Dice 3: " + die3);
		System.out.println("Dice 4: " + die4);
		System.out.println("Total: " + sum);

		return sum;
	}

	public void play() {
		int sum = rollFourDice();

		if (sum == 7 || sum == 11 || sum == 15 || sum == 21) {
			System.out.println("You win!");
		} else if (sum == 10 || sum == 12 || sum == 13 || sum == 19 || sum == 20
				|| sum == 22 || sum == 23 || sum == 24) {
			System.out.println("You lose!");
		} else {
			int goal = sum;
			System.out.println("Your goal number is: " + goal);
			System.out.println("Roll the four dice again.");
			System.out.println();
			System.out.println("Second Roll:");

			sum = rollFourDice();

			if (sum == 13) {
				System.out.println("You lose!");
			} else if (sum == goal) {
				System.out.println("You win!");
			} else {
				System.out.println("You did not roll the goal number. You lose!");
			}
		}
	}

	public static void main(String[] args) {
		DiceGame game = new DiceGame();
		game.play();
	}
}
