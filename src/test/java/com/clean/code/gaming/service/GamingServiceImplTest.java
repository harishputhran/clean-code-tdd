package com.clean.code.gaming.service;

import static junit.framework.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class GamingServiceImplTest {
	
	private GamingServiceImpl classToTest = new GamingServiceImpl();
	private static final String GAME_TIED = "Game Tied.";
	private static final String ROCK = "Rock";
	
	@Test
	public void returnsNullFromDetermineGameWinnerAsTheImplementationIsNotDone(){
		
		assertNull(classToTest.determineGameWinner(null, null));
	}
	
	@Test
	public void returnsGameTiedFromDetermineGameWinnerWhenBothPlayersChooseSameObject(){
		assertEquals(GAME_TIED, classToTest.determineGameWinner(ROCK, ROCK));
	}

}
