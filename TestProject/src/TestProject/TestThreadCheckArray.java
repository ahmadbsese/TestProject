package TestProject;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author user
 * description of my class
 *
 */
public class TestThreadCheckArray {
	/**
	 * @param args
	 * main to run the threads
	 */
	public static void main(String[] args) {
		/** try to catching the errors if the input was deafult*/
		try (Scanner input = new Scanner(System.in)) {
			/** two threads to run the test and get the main result*/
			Thread thread1, thread2;
			System.out.println("Enter array size");
			int num  = input.nextInt();
			ArrayList<Integer> array = new ArrayList<Integer>(num);
			System.out.println("Enter numbers for array");
			
			for (int index = 0; index < num; index++) 
				array.add(input.nextInt());
			
			System.out.println("Enter number");
			num = input.nextInt();
			
			SharedData sd = new SharedData(array, num);
			
			thread1 = new Thread(new ThreadCheckArray(sd), "thread1");
			thread2 = new Thread(new ThreadCheckArray(sd), "thread2");
			thread1.start();
			thread2.start();
			try 
			{
				thread1.join();
				thread2.join();
			} 
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
			if (!sd.getFlag())
			{
				System.out.println("Sorry");
				return;
			}
			System.out.println("Solution for b : " + sd.getB() + ",n = " + sd.getArray().size());
			System.out.print("I:    ");
			for(int index = 0; index < sd.getArray().size(); index++)
				System.out.print(index + "    ");
			System.out.println();
			System.out.print("A:    ");
			for (int index : sd.getArray())
			{
				System.out.print(index);
				int counter = 5;
				while (true)
				{
					index = index / 10;
					counter--;
					if (index == 0)
						break;
				}
				for (int i = 0; i < counter; i++)
					System.out.print(" ");
			}

			System.out.println();
			System.out.print("C:    ");
			for (boolean index : sd.getWinArray())
			{
				if (index)
					System.out.print("1    ");
				else
					System.out.print("0    ");	
			}
		}
	}

}
