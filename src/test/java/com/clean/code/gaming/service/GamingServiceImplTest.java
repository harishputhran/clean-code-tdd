package com.clean.code.gaming.service;

import static junit.framework.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import com.clean.code.gaming.utility.GamingEnum;
import com.clean.code.gaming.utility.GamingResponseEnum;

@RunWith(JUnit4.class)
public class GamingServiceImplTest {
	
	private GamingServiceImpl classToTest = new GamingServiceImpl();

	
	@Test
	public void returnsNullFromDetermineGameWinnerWhenEitherOfPlayerInputsIsInvalid(){
		
		assertNull(classToTest.determineGameWinner(null, null));
	}
	
	@Test
	public void returnsGameTiedFromDetermineGameWinnerWhenBothPlayersChooseSameObject(){
		assertEquals(GamingResponseEnum.GAME_TIED.getMessage(), classToTest.determineGameWinner(GamingEnum.ROCK, GamingEnum.ROCK));
	}
	
	@Test
	public void returnsRockIsWinnerFromDetermineGameWinnerWhenPlayer1ChoosesRockAndPlayer2ChoosesScissors(){
		assertEquals(GamingResponseEnum.ROCK_WINS.getMessage(), classToTest.determineGameWinner(GamingEnum.SCISSORS, GamingEnum.ROCK));
	}
	
	@Test
	public void returnsRockIsWinnerFromDetermineGameWinnerWhenPlayer2ChoosesRockAndPlayer1ChoosesScissors(){
		assertEquals(GamingResponseEnum.ROCK_WINS.getMessage(), classToTest.determineGameWinner(GamingEnum.ROCK, GamingEnum.SCISSORS));
	}

}
