/**
 * class to create a multiplication table
 * @author shsmchlr
 */

package uk.ac.reading.cs2ja16.milanlacmanovic.week2;

//import java.util.Arrays;

public class MultiplicationTable {
	private int maxNum;
	private int[][] TableData;
	
	/**
	 * create table for 1*1 up to maxN*maxN
	 * @param maxN
	 */
	MultiplicationTable (int maxN){
		maxNum = maxN;
		TableData = new int[maxN][maxN];
		makeTable();
	}
	/**
	 * function to populate the table
	 */
	private void makeTable() {
		for (int i = 1; i <= maxNum; i++) {
			for (int j = 1; j <=maxNum; j++) {
				TableData[j-1][i-1] = i*j;
			}
		}
	}
	/**
	 * return string with the table
	 */
	public String toString() {
		String res = "MLs Multiplication Table"+"\n";
		for (int i = 0; i < maxNum; i++) {
			for (int j = 0; j < maxNum; j++) {
				res += TableData[j][i] + "\t";
			}
			res += "\n";
		}
		return res;
	}
	public static void main(String[] args) {
		//TODO Auto-generated method stub
		MultiplicationTable mt = new MultiplicationTable(10);
		System.out.print(mt.toString());
	}
}
