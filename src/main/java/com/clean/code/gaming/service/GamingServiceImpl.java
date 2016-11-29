package com.clean.code.gaming.service;

import com.clean.code.gaming.utility.GamingEnum;
import com.clean.code.gaming.utility.GamingResponseEnum;

/**
 * Rock, Paper and Scissors Gaming Service.
 * 
 * @author hputhr
 *
 */
public class GamingServiceImpl{
	
	/**
	 * Method to determine the Game Winner.
	 * 
	 * @param GamingEnum
	 * @param GamingEnum
	 * @return String
	 */
	public String determineGameWinner(GamingEnum player1Input, GamingEnum player2Input) {
		GamingResponseEnum gamingResponse = player1Input.compare(player2Input);
		String gamingResponseMessage = gamingResponse != null ? gamingResponse.getMessage() : null;
		return gamingResponseMessage;
	}
}
