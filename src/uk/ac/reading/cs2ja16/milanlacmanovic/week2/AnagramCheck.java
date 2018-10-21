package uk.ac.reading.cs2ja16.milanlacmanovic.week2;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class AnagramCheck {
	
	private String[] Phrases;
	private String[] OriginalPhrases;
	private char[][] SplitPhrases;
	private int[][] count;
	private static String res;
	
	AnagramCheck (String userIn){
		StringSplitter S = new StringSplitter(userIn, ";");
		Phrases = S.getStrings();
		OriginalPhrases = S.getStrings();
	}
	public int cleanup() {
		int samelengthcheck = 0;
		for (int i = 0; i < Phrases.length; i++) {
			Phrases[i] = Phrases[i].replaceAll("\\s+","");
			Phrases[i] = Phrases[i].toLowerCase();
			if (i == 0) {
				samelengthcheck = Phrases[0].length();
			}
			if (Phrases[i].length() != samelengthcheck) {
				return 1;
			}
		}
		return 0;
	}
	
	public void Split() {
		SplitPhrases = new char[Phrases.length][Phrases[0].length()];
		for (int i = 0; i < SplitPhrases.length; i++) {
			SplitPhrases[i] = Arrays.copyOf(Phrases[i].toCharArray(), Phrases[i].length());
			//SplitPhrases[i] = Phrases[i].toCharArray();
		}
	}
	public void charCount() {
		count = new int[SplitPhrases.length][SplitPhrases[0].length];
		for (int j = 0; j < SplitPhrases.length; j++) {
			for (int i = 0; i < SplitPhrases[j].length; i++) {
				count[j][i] = SplitPhrases[j][i];
			}
		}
		for (int k =0; k < count.length; k++) {
			Arrays.sort(count[k]);
		}
		
	}
	
	public void TwoAnagramCompare() {
		if (Arrays.equals(count[0], count[1])) {
			res = "'" + OriginalPhrases[0] + "'" + " and " + "'" + OriginalPhrases[1] + "'" + " are anagrams";
		}
		else {
			res = "'" + OriginalPhrases[0] + "'" + " and " + "'" + OriginalPhrases[1] + "'" + " are not anagrams";
		}
	}
	
	public void findAnagram() {
		if (cleanup() == 0) {
			Split();
			charCount();
			TwoAnagramCompare();
		}
		else {
			res = "'" + OriginalPhrases[0] + "'" + " and " + "'" + OriginalPhrases[1] + "'" + " anre not anagrams, not the same number of letters";
		}
	}
	
	public static void main(String[] args) {
		String userIn = JOptionPane.showInputDialog(null, "Enter two strings separated by a ';'");
		AnagramCheck A = new AnagramCheck(userIn);
		A.findAnagram();
		JOptionPane.showMessageDialog(null, res);

	}
}
