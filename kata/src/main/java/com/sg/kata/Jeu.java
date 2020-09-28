package com.sg.kata;

public class Jeu {
	
	private Player player1;
	private Player player2;
	
	
	
	public String calculerScore() {
		
		return player1.getScore()+"-"+player2.getScore();
				
	}
	
	
	
	

}
