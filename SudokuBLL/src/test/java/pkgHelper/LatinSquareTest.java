package pkgHelper;

import static org.junit.Assert.*;

import org.junit.Test;

public class LatinSquareTest 
{

	@Test
	public void test() 
	{
		int twoDimArray[][] = { { 1, 2, 3 }, { 2, 3, 1 }, { 3, 1, 2} };
		
		int[] target = { 2, 1, 3, };
		int[] source = { 1, 2, 3, };
		
		LatinSquare testSquare = new LatinSquare(twoDimArray);
		
		
		System.out.println("hello" + testSquare.isLatinSquare());
		//System.out.println(testSquare.hasAllValues(target, source));
		
		
		//assertFalse(ls.containsZero());
	}

}
