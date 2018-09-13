package pkgHelper;

import static org.junit.Assert.*;

import org.junit.Test;

public class LatinSquareTest 
{

	@Test
	public void test() 
	{
		int goodSquare[][] = { { 1, 2, 3 }, { 2, 3, 1 }, { 3, 1, 2} };
		int badSquare[][] = { { 1, 2, 2 }, { 2, 3, 1 }, { 3, 1, 2} };
		
		LatinSquare testGood = new LatinSquare(goodSquare);
		LatinSquare testBad = new LatinSquare(badSquare);
		
		
		//containsZero test cases
		assertFalse(testGood.containsZero());
		goodSquare[0][1] = 0; 
		assertTrue(testGood.containsZero());
		goodSquare[0][1] = 2; 
		
		
		//assertFalse(testBad.containsZero());
		
		
	}
}
