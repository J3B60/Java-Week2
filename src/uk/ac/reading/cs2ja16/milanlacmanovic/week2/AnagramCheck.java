package uk.ac.reading.cs2ja16.milanlacmanovic.week2;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class AnagramCheck {
	
	private String[] Phrases;
	private char[][] SplitPhrases;
	private int[][] count;
	private static String res;
	
	AnagramCheck (String userIn){
		StringSplitter S = new StringSplitter(userIn, ";");
		Phrases = S.getStrings();
	}
	public int cleanup() {
		int samelengthcheck = Phrases[0].length();
		for (int i = 0; i < Phrases.length; i++) {
			Phrases[i] = Phrases[i].replaceAll("\\s+","");
			Phrases[i] = Phrases[i].toLowerCase();
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
			res = Phrases[0] + " and " + Phrases[1] + " are anagrams";
		}
		else {
			res = Phrases[0] + " and " + Phrases[1] + " are not anagrams";
		}
	}
	
	public void findAnagram() {
		if (cleanup() == 0) {
			charCount();
			TwoAnagramCompare();
		}
		else {
			res = "The two phrases are not anagrams, not the same number of letters";
		}
	}
	
	public static void main(String[] args) {
		String userIn = JOptionPane.showInputDialog(null, "Enter two strings separated by a ';'");
		AnagramCheck A = new AnagramCheck(userIn);
		A.findAnagram();
		JOptionPane.showMessageDialog(null, res);

	}
}
