package com.sg.kata;

public class Player {
	
	private int score;
	
	public void marquerPoint() {
		score++;		
	}
	
	
	public String scorePoint() throws Exception {
		if(score==0) {
			return "0";
		}else if(score == 1) {
			return String.valueOf(15);
		} else if( score == 2) {
			return String.valueOf(30);
		} else if (score == 3) {
			return String.valueOf(40);
		}
		else if(score == 4) {
			return "JEU";
		}
		else {
			throw new Exception("Score incorrect");
		}
		
	}

	
	
	

	public int getScore() {
		return score;
	}


	public void setScore(int score) {
		this.score = score;
	}
	
	
	
	
	
}
