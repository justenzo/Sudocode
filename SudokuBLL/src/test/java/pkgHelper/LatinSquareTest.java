package pkgHelper;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class LatinSquareTest 
{

	@Test
	public void test() 
	{
		int twoDimArray[][] = { { 1, 2, 3 }, { 2, 3, 1 }, { 3, 1, 2 } };
		int twoDimArray2[][] = { { 0, 0, 0 }, { 0, 0, 0 }, { 0, 0, 0 } };
		int oneDimArray[] = { 1, 2, 3 };
		
		LatinSquare testSquare = new LatinSquare(twoDimArray);
		
		
		//JUnit Tests
		
		
		//getLatinSquare test cases
		assertTrue(Arrays.equals(testSquare.getLatinSquare(), twoDimArray));
		assertFalse(Arrays.equals(testSquare.getLatinSquare(), twoDimArray2));
		
		
		//setLatinSquare test cases
		testSquare.setLatinSquare(twoDimArray2);
		assertTrue(Arrays.equals(testSquare.getLatinSquare(), twoDimArray2));
		testSquare.setLatinSquare(twoDimArray);
		assertFalse(Arrays.equals(testSquare.getLatinSquare(), twoDimArray2));
		
		
		//hasDuplicates test cases
		assertFalse(testSquare.hasDuplicates(oneDimArray));
		oneDimArray[0] = 2; //adjusting array to change the method's output
		assertTrue(testSquare.hasDuplicates(oneDimArray));
		oneDimArray[0] = 1; //reverting array to original
		
		
		//doesElementExist test cases
		assertTrue(testSquare.doesElementExist(oneDimArray, 1));
		assertFalse(testSquare.doesElementExist(oneDimArray, 0));
		
		
		//hasAllValues test cases
		assertTrue(testSquare.hasAllValues(testSquare.getColumn(1),testSquare.getColumn(0)));
		twoDimArray[0][0] = 5; //adjusting array to change the method's output
		assertFalse(testSquare.hasAllValues(testSquare.getColumn(1),testSquare.getColumn(0)));
		twoDimArray[0][0] = 1; //reverting array to original
		
		
		//getColumn test cases
		assertTrue(Arrays.equals(testSquare.getRow(0), oneDimArray));
		oneDimArray[0] = 4; //adjusting array to change the method's output
		assertFalse(Arrays.equals(testSquare.getRow(0), oneDimArray));
		oneDimArray[0] = 1; //reverting array to original
		
		
		//getRow test cases
		assertTrue(Arrays.equals(testSquare.getRow(0), oneDimArray));
		oneDimArray[0] = 4; //adjusting array to change the method's output
		assertFalse(Arrays.equals(testSquare.getRow(0), oneDimArray));
		oneDimArray[0] = 1; //reverting array to original
		
		
		//isLatinSquare test cases
		assertTrue(testSquare.isLatinSquare());
		twoDimArray[0][0] = 2; //would be a latin square, but it has a duplicate
		assertFalse(testSquare.isLatinSquare());
		twoDimArray[0][0] = 4; //would be a latin square, but it doesnt have all values
		assertFalse(testSquare.isLatinSquare());
		twoDimArray[0][0] = 0; //would be a latin square, but has zeros
		twoDimArray[1][2] = 0;
		twoDimArray[2][1] = 0;
		assertFalse(testSquare.isLatinSquare());
		twoDimArray[0][0] = 1; //reverting array to original 
		twoDimArray[1][2] = 1;
		twoDimArray[2][1] = 1;
		
	
		//containsZero test cases
		assertFalse(testSquare.containsZero());
		twoDimArray[0][1] = 0; //adjusting array to change the method's output
		assertTrue(testSquare.containsZero());
		twoDimArray[0][1] = 2; //reverting array to original
	}
}