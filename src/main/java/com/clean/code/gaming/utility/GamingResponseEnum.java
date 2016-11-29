package com.clean.code.gaming.utility;

/**
 * Enum for GamingResponseEnum.
 * 
 * @author hputhr
 *
 */
public enum GamingResponseEnum {
	
	ROCK_WINS("rock crushes scissors -> rock wins"),
	GAME_TIED("Tie");
	
	private String message;
	
	private GamingResponseEnum(String message){
		this.message = message;
	}
	
	public String getMessage(){
		return message;
	}
}
