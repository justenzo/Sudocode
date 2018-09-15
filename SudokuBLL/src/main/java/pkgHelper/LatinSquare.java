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
	public int[][] getLatinSquare()
	{
		return this.puzzle;
	}
	
	
	public void setLatinSquare(int[][] twoDimArr)
	{
		this.puzzle = twoDimArr;
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
	
	
	public boolean doesElementExist(int[] arr, int iValue) 
	{
		for (int i = 0; i < arr.length; i ++)
		{
			if (arr[i] == iValue)
			{
				return true; 
			}
		}
		return false; 
	}
	
	
	public boolean hasAllValues(int[] targetArr, int[] sourceArr)
	{
		for (int i = 0; i < sourceArr.length; i ++)
		{
			for (int j = 0; j < targetArr.length; j ++)
			{
				if (doesElementExist(getRow(i), targetArr[j]) == false)
				{
					return false;
				}
			}
		}
		return true;
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
	
	
	public int[] getRow(int row)
	{
		int[] returnRow = new int[this.puzzle.length];
		
		for (int i = 0; i < this.puzzle.length; i ++)
		{
			returnRow[i] = this.puzzle[row][i];
		}
		return returnRow;
	}	
	
	
	public boolean isLatinSquare() 
	{
		for (int i = 0; i < this.puzzle.length; i ++) 
		{
			if (hasDuplicates(getRow(i)) == true || hasDuplicates(getColumn(i)) == true || containsZero() == true)
			{
				return false; 
			}
			
			if (i < puzzle.length - 1)
			{
				if (hasAllValues(getRow(i+1), getRow(i)) == false || hasAllValues(getColumn(i+1), getColumn(i)) == false || hasAllValues(getRow(i), getRow(i+1)) == false || hasAllValues(getColumn(i), getColumn(i+1)) == false)
				{
					return false; 
				}
			}
		}
		return true; 
	}
	
	
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
}
