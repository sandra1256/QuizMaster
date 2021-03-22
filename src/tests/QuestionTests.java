package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import cse237.Question;

class QuestionTests {
//name for test
	//will have errors--> first write a test that fials bc we
	//havent written the code to pass the test
	//need question object
	@Test
	void testQuestionCheckAnswerCorrect() {
		//already defined in test that constructor needs two inputs
		//question prompt and correct answer
		Question questionUnderTest= new Question("why did the chicken cross the road?", "bazinga");
		//test to seee if method is correct, give correct answer that returns boolean
	//Defined critical points of code in the unit test,
		//Checkanswer takes in a potentional answer and returns boolean of correct or not
		boolean correct= questionUnderTest.checkAnswer("bazinga");
		//say that w an assertion--> should be true and say its correct
		assertTrue(correct);
		
	}
	//says this is a unit test
	@Test
	//second test want to check for incorrect answers too--properly recognize them
	void testQuestionCheckAnswerInCorrect() {
		//already defined in test that constructor needs two inputs
		//question prompt and correct answer
		Question questionUnderTest= new Question("why did the chicken cross the road?", "bazinga");
		//test to seee if method is correct, give correct answer that returns boolean
	//Defined critical points of code in the unit test,
		//Checkanswer takes in a potentional answer and returns boolean of correct or not
		boolean incorrect= questionUnderTest.checkAnswer("bok");
		//want it to be false bc its an incrrect answer--> correcly recognize incorrect 
		assertFalse(incorrect);
		
	}
	
}
