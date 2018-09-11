package pkgHelper;

public class LatinSquare 
{
	private int[][] myLatinSquare; //attribute
	
	public LatinSquare(int[][] twoDimArray) //constructor 
	{
		this.myLatinSquare = twoDimArray;
	}
	
	public boolean containsZero() //method
	{
		for(int iCol = 0; iCol < myLatinSquare.length; iCol++)
		{
			for(int iRow = 0; iRow < myLatinSquare.length; iRow++)
			{
				if (myLatinSquare[iCol][iRow] == 0)
				{
					return true; 
				}
			}
		}
		return false; 
	}
	
	public boolean doesElementExist(int[] arr, int iValue) //method
	{
		for (int i : arr)
		{
			if (i == iValue)
				return true; 
		}
		return false; 
	}
}
