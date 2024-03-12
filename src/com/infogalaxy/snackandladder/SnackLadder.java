package com.infogalaxy.snackandladder;

import java.util.Random;
public class SnackLadder {

	
		private int pos = 0;
		public void position() {
			System.out.println("The position of player is "+pos);
		}
		public void playGame() {
		Random random = new Random();
		int die = random.nextInt(6) + 1;
		System.out.println("Player dies"+die);
		
		}
	
		public static void main(String[] args) {
			SnackLadder snackLadder = new SnackLadder();
			snackLadder.position();
			snackLadder.playGame();
		}
}
	
