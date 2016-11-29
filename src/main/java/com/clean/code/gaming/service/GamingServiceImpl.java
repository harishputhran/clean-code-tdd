package com.clean.code.gaming.service;

import org.apache.commons.lang3.StringUtils;

import com.clean.code.gaming.api.GamingService;

public class GamingServiceImpl implements GamingService {
	
	private static final String GAME_TIED = "Game Tied.";

	@Override
	public String determineGameWinner(String player1Input, String player2Input) {
		if(StringUtils.equalsIgnoreCase(player1Input, player2Input)){
			return GAME_TIED;
		}
		return null;
	}

}
