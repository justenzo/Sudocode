package pkgHelper;

import static org.junit.Assert.*;

import org.junit.Test;

public class LatinSquareTest 
{

	@Test
	public void test() 
	{
		int twoDimArray[][] = { { 1, 2, 3 }, { 2, 3, 1 }, { 3, 1, 2} };
		
		int[] oneDim1 = { 2, 2, 3, };
		int[] oneDim2 = { 1, 2, 3, };
		
		LatinSquare testSquare = new LatinSquare(twoDimArray);
		
		System.out.println(testSquare.hasDuplicates(oneDim1));
		
		//assertFalse(ls.containsZero());
	}

}
