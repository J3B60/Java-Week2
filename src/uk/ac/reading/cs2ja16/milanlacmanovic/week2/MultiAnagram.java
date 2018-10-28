package uk.ac.reading.cs2ja16.milanlacmanovic.week2;

import javax.swing.JOptionPane;

public class MultiAnagram {
	public static void main(String[] args) {
		String[] ArrayofStrings;
		String userIn = JOptionPane.showInputDialog(null, "Enter strings separated by a 'space'");
		StringSplitter S = new StringSplitter(userIn, " ");
		ArrayofStrings = new String[S.getStrings().length];
		ArrayofStrings = S.getStrings();
		String ans = "";
		for G//for loop 0 to num of words -2 for chosen for comparison
		//for loop 0 to num of words - 1 for the to be compared
		//display ans
	}
	//anagramcheck need another constructor with which is passed two strings
}
