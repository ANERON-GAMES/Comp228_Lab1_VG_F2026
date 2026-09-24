package com.vg.week3.dicegame;

import java.security.SecureRandom;

/*
 * Author: Vadim Gubin
 * Student ID: 301538942
 * Date: September 24, 2026
 * Description: One six-sided die using SecureRandom.
 */

public class Die {

	private SecureRandom random;

	public Die() {
		random = new SecureRandom();
	}

	public int roll() {
		return random.nextInt(6) + 1;
	}
}
