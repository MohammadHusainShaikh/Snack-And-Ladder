package com.infogalaxy.snackandladder;

import java.util.Random;
public class SnackLadder {

		Random random = new Random();

		private int playerPosition = 0;
		
		private int option;
		private static final int STAY = 0;
		private static final int LADDER = 1;
		private static final int SNAKE = 2;

		public void playGame() {
			while(playerPosition != 100) {
				System.out.println("The position of player is "+playerPosition);
				int dieNo = random.nextInt(6) + 1;
				option = random.nextInt(3); 
				
				switch(option) {
				case STAY:
					System.out.println("STAY "+option);
					
					break;
				case LADDER:
					System.out.println("LADDER "+option);
					playerPosition += dieNo;
					break;
				case SNAKE:
					System.out.println("SNAKE "+option);
					playerPosition -= dieNo;
					if(playerPosition < 0) {
						playerPosition = 0;
						}
					break;
				}
			
				System.out.println("Number of die "+dieNo);
				System.out.println("The new position of a player is " +playerPosition);
				System.out.println("----------------------------------");
				}
			
		}
	
		public static void main(String[] args) {
			SnackLadder player = new SnackLadder();
			player.playGame();
		}
}
	
