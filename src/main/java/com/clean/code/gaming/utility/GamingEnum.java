package com.clean.code.gaming.utility;

/**
 * Enum for Game Inputs.
 * 
 * @author hputhr
 *
 */
public enum GamingEnum {
	
	ROCK,
	PAPER,
	SCISSORS;	
	
	/**
	 * Method compares the Enums to determine the Game Winner.
	 * 
	 * @param GamingEnum
	 * @return GamingResponseEnum
	 */
	public GamingResponseEnum compare(GamingEnum secondPlayerChosenItem){
		
		if(this.equals(ROCK) && SCISSORS.equals(secondPlayerChosenItem)
		|| this.equals(SCISSORS) && ROCK.equals(secondPlayerChosenItem)){
			return GamingResponseEnum.ROCK_WINS;
		}
		
		if(this.equals(PAPER) && ROCK.equals(secondPlayerChosenItem)
			|| this.equals(ROCK) && PAPER.equals(secondPlayerChosenItem)){
			return GamingResponseEnum.PAPER_WINS;
		}

		return this.equals(secondPlayerChosenItem) ? GamingResponseEnum.GAME_TIED : null;		
	}
}
