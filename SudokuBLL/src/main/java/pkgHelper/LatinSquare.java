package pkgHelper;

public class LatinSquare 
{
	//attributes 
	private int[][] puzzle;
	
	
	//constructors 
	public LatinSquare(int[][] twoDimArray)  
	{
		this.puzzle = twoDimArray;
	}
	
	
	//methods
	public boolean containsZero() 
	{
		for(int iCol = 0; iCol < puzzle.length; iCol++)
		{
			for(int iRow = 0; iRow < puzzle.length; iRow++)
			{
				if (puzzle[iCol][iRow] == 0)
				{
					return true; 
				}
			}
		}
		return false; 
	}
	
	public boolean doesElementExist(int[] arr, int iValue) 
	{
		for (int i : arr)
		{
			if (i == iValue)
				return true; 
		}
		return false; 
	}
	
	public int[] getColumn(int column)
	{
		int[] returnColumn = new int[this.puzzle.length];
		
		for (int i = 0; i < this.puzzle.length; i ++)
		{
			returnColumn[i] = this.puzzle[i][column];
		}
		return returnColumn;
	}
	
	public int[][] getLatinSquare()
	{
		return this.puzzle;
	}
	
	public int[] getRow(int row)
	{
		int[] returnRow = new int[this.puzzle.length];
		
		for (int i = 0; i < this.puzzle.length; i ++)
		{
			returnRow[i] = this.puzzle[row][i];
		}
		return returnRow;
	}
	
	public boolean hasAllValues(int[] targetArr, int[] sourceArr)
	{
		for (int i = 0; i < sourceArr.length; i ++)
		{
			if (targetArr[i] != sourceArr[i])
			{
				return false; 
			}
		}
		return true; 
	}
	
	public boolean hasDuplicates(int[] oneDimArr) 
	{
		for (int i = 0; i < oneDimArr.length; i ++)
		{
			if (i != oneDimArr.length - 1)
			{
				if (oneDimArr[i] == oneDimArr[i+1])
				{
					return true; 
				}
			}
		}
		return false; 
	}
	
	public void setLatinSquare(int[][] twoDimArr)
	{
		this.puzzle = twoDimArr;
	}
}
