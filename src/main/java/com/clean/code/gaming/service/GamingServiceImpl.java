package com.clean.code.gaming.service;

import org.apache.commons.lang3.StringUtils;

import com.clean.code.gaming.api.GamingService;

public class GamingServiceImpl implements GamingService {
	
	private static final String GAME_TIED = "Game Tied.";
	private static final String ROCK_WINS = "Rock crushes Scissors. Rock wins.";
	private static final String ROCK = "Rock";
	private static final String SCISSORS = "Scissors";

	@Override
	public String determineGameWinner(String player1Input, String player2Input) {
		if(StringUtils.isBlank(player1Input)
				|| StringUtils.isBlank(player2Input)){
			return null;
		}else if(StringUtils.equalsIgnoreCase(player1Input, player2Input)){
			return GAME_TIED;
		}else if((ROCK.equalsIgnoreCase(player1Input) && SCISSORS.equalsIgnoreCase(player2Input))
					|| (ROCK.equalsIgnoreCase(player2Input) && SCISSORS.equalsIgnoreCase(player1Input))){
			return ROCK_WINS;
		}
		return null;
	}

}
