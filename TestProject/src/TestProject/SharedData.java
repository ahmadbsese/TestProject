package TestProject;

import java.util.ArrayList;

/**
 * @author hamza
 *
 */
public class SharedData 
{
	ArrayList<Integer> array;
	private boolean [] winArray;
	private boolean flag;
	private final int b;
	
	/**
	 * @param array				Array with the numbers
	 * @param b					The sum we are looking for
	 */
	public SharedData(ArrayList<Integer> array, int b) {
		
		this.array = array;
		this.b = b;
	}

	/**
	 * @return			return the winning array
	 */
	public boolean[] getWinArray() 
	{
		return winArray;
	}

	/**
	 * @param winArray			Set the winning array
	 */
	public void setWinArray(boolean [] winArray) 
	{
		this.winArray = winArray;
	}

	/**
	 * @return		return the numbers array
	 */
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
	 * boolean function which set the flag when the threads reset it to 0 or 1.
	 */
	public void setFlag(boolean flag) {
		this.flag = flag;
	}

}
