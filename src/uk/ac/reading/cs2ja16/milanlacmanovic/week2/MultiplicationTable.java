/**
 * class to create a multiplication table
 * @author shsmchlr
 */

package uk.ac.reading.cs2ja16.milanlacmanovic.week2;

public class MultiplicationTable {
	private int maxNum;
	private int[][] TableData;
	
	/**
	 * create table for 1*1 up to maxN*maxN
	 * @param maxN
	 */
	MultiplicationTable (int maxN){
		//create array of right size, then call makeTable to fill it
	}
	/**
	 * function to populate the table
	 */
	private void makeTable() {
		//write code to populate the table (loop stuff)
	}
	/**
	 * return string with the table
	 */
	public String toString() {
		String res = "MLs Multiplication Table"+"\n";
		//write code to add data from 2d array to res
		return res;
	}
	public static void main(String[] args) {
		//TODO Auto-generated method stub
		MultiplicationTable mt = new MultiplicationTable(10);
		System.out.print(mt.toString());
	}
}
