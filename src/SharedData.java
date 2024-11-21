import java.util.ArrayList;

/**	Class representing Shared Data, arrays and flags between threads
 *  @author Braude Software Engineer Faculty
 */
public class SharedData 
{
	private ArrayList<Integer> array;
	private boolean [] winArray;
	private boolean flag;
	private final int b;
	
	/**
	 * SharedData Class Object Constructor
	 * @param array:			Array (a) with integers to sum up
	 * @param b:				the num the integers in array must sum to
	 */
	public SharedData(ArrayList<Integer> array, int b) {
		
		this.array = array;
		this.b = b;
	}

	/**
	 *  Get WinArray in SharedData Class Object
	 *  @return winArray:	boolean indexes for array (a) that sum to b	 */
	public boolean[] getWinArray() 
	{
		return winArray;
	}
	
	/**
	 * Set WinArray in SharedData Class Object
	 * @param winArray:	boolean array indexes for array (a) that sum to b
	 */
	public void setWinArray(boolean [] winArray) 
	{
		this.winArray = winArray;
	}

	/**
	 * Get Array of the Integer Elements (a) from SharedData Class Object
	 * @return array:	Array (a) with integers to sum up
	 */
	public ArrayList<Integer> getArray() 
	{
		return array;
	}

	/**
	 * Get b from SharedData Class Object
	 * @return b:	num the integers in array must sum to	
	 */
	public int getB() 
	{
		return b;
	}

	/**
	 * get Flag with boolean value from SharedData Class Object
	 * @return flag:	boolean representing that a thread found a solution
	 */
	public boolean getFlag() 
	{
		return flag;
	}

	/**
	 * set Flag with boolean value in SharedData Class Object
	 * @param flag:		boolean representing that a thread found a solution
	 */
	public void setFlag(boolean flag) {
		this.flag = flag;
	}

}
