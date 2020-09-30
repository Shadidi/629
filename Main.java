// Souad Hadidi
// Problem 628

import java.util.*;

public class Main{
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int numberOfCases = 0;
		while(scnr.hasNext()){
			numberOfCases++;
			if (numberOfCases > 1){
				System.out.println("--");
			}
			
			// Stores number of words in dictionary
			int n = scnr.nextInt();
			
			// Store the dictionary words
			String [] dicWords = new String[n];
			for (int i = 0; i < n; i++){
				dicWords[i] = scnr.next();
			}
			// for (String s : dicWords){
			// 	System.out.println(s);
			// }

			// Store number of rules
			int m = scnr.nextInt();

			// Store rules
			char [][] rules = new char[m][];
			for (int i = 0; i < m; i++){
				rules[i] = scnr.next().toCharArray();
			}

			// Store result of combination
			HashSet<String> passwordSet = new HashSet<>();
			
			// Go through the rules and store combinations
			for (int i = 0; i < rules.length; i++){
				for (int j = 0; j < rules[i].length; j++){
					passwords(dicWords, String.valueOf(rules[i][j]), rules, i, j, passwordSet);	
				}
			}
		}

	}
	private static void passwords(String [] dicWords, String pwSoFar, char [][] rules, int i, int j, HashSet<String> passwordSet){
		passwordSet.add(pwSoFar);
		
		if (rules[i][j] == '#'){

		}
	}
}