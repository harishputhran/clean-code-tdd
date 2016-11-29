package com.clean.code.gaming.service;

import static junit.framework.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class GamingServiceImplTest {
	
	private GamingServiceImpl classToTest = new GamingServiceImpl();
	private static final String GAME_TIED = "Game Tied.";
	private static final String ROCK_WINS = "Rock crushes Scissors. Rock wins.";
	private static final String ROCK = "Rock";
	private static final String SCISSORS = "Scissors";
	
	@Test
	public void returnsNullFromDetermineGameWinnerWhenEitherOfPlayerInputsIsInvalid(){
		
		assertNull(classToTest.determineGameWinner(null, null));
	}
	
	@Test
	public void returnsGameTiedFromDetermineGameWinnerWhenBothPlayersChooseSameObject(){
		assertEquals(GAME_TIED, classToTest.determineGameWinner(ROCK, ROCK));
	}
	
	@Test
	public void returnsRockIsWinnerFromDetermineGameWinnerWhenPlayer1ChoosesRockAndPlayer2ChoosesScissors(){
		assertEquals(ROCK_WINS, classToTest.determineGameWinner(SCISSORS, ROCK));
	}
	
	@Test
	public void returnsRockIsWinnerFromDetermineGameWinnerWhenPlayer2ChoosesRockAndPlayer1ChoosesScissors(){
		assertEquals(ROCK_WINS, classToTest.determineGameWinner(ROCK, SCISSORS));
	}

}
