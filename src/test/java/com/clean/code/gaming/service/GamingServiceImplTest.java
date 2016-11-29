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
	
	@Test
	public void returnsPaperIsWinnerFromDetermineGameWinnerWhenPlayer1ChoosesPaperAndPlayer2ChoosesRock(){
		assertEquals(GamingResponseEnum.PAPER_WINS.getMessage(), classToTest.determineGameWinner(GamingEnum.PAPER, GamingEnum.ROCK));
	}
	
	@Test
	public void returnsPaperIsWinnerFromDetermineGameWinnerWhenPlayer1ChoosesRockAndPlayer2ChoosesPaper(){
		assertEquals(GamingResponseEnum.PAPER_WINS.getMessage(), classToTest.determineGameWinner(GamingEnum.ROCK, GamingEnum.PAPER));
	}
	
	@Test
	public void returnsPaperIsWinnerFromDetermineGameWinnerWhenPlayer1ChoosesScissorsAndPlayer2ChoosesPaper(){
		assertEquals(GamingResponseEnum.SCISSOR_WINS.getMessage(), classToTest.determineGameWinner(GamingEnum.SCISSORS, GamingEnum.PAPER));
	}
	
	@Test
	public void returnsPaperIsWinnerFromDetermineGameWinnerWhenPlayer1ChoosesPaperAndPlayer2ChoosesScissors(){
		assertEquals(GamingResponseEnum.SCISSOR_WINS.getMessage(), classToTest.determineGameWinner(GamingEnum.PAPER, GamingEnum.SCISSORS));
	}
}
