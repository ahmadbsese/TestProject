package TestProject;

import java.util.ArrayList;

public class SharedData 
{
	ArrayList<Integer> array;
	private boolean [] winArray;
	private boolean flag;
	private final int b;
	
	public SharedData(ArrayList<Integer> array, int b) {
		
		this.array = array;
		this.b = b;
	}

	public boolean[] getWinArray() 
	{
		return winArray;
	}

	public void setWinArray(boolean [] winArray) 
	{
		this.winArray = winArray;
	}

	public ArrayList<Integer> getArray() 
	{
		return array;
	}

	/**
	 * @return
	 * function which returns value of the parameter b
	 */
	public int getB() 
	{
		return b;
	}

	/**
	 * @return
	 * boolean function which return the flag
	 */
	public boolean getFlag() 
	{
		return flag;
	}

	/**
	 * @param flag
	 * boolean function which set the flag when the threads reset it to 0 or 1
	 */
	public void setFlag(boolean flag) {
		this.flag = flag;
	}

}
