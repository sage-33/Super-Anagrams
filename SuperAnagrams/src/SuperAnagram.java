/**
 * Represents two phrases resulting with whether or not they are super anagrams
 * regardless of capitalization and punctuation.
 * 
 * @author sagesilberman
 *
 */
public class SuperAnagram {
	private String phrase1; // holds the phrase from scanner
	private String phrase2; // holds the phrase from scanner
	private String holder1 = ""; // holds the assigned number
	private String holder2 = ""; // holds the assigned number

	/**
	 * Constructs a SuperAnagram with two phrases and compares the letters inside of
	 * them to check if they are super anagrams
	 * 
	 * @param strOne the first string from scanner
	 * @param strTwo the second string from scanner
	 */
	public SuperAnagram(String strOne, String strTwo) {
		phrase2 = strTwo;
		phrase1 = strOne;

	}

	/**
	 * Returns <code>true</code> if any of the values in the score array is greater
	 * than 0, otherwise is false
	 * 
	 * @return <code>true</code> if any of the values in the score array is greater
	 *         than 0 <code>false</code> otherwise
	 * 
	 */
	public boolean isSuperAnagram() {
		String[] scoreBoard = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q",
				"r", "s", "t", "u", "v", "w", "x", "y", "z" };
		int[] scores = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		// check the letter of the second phrase going forward
		for (int i = 0; i < phrase2.length(); i++) {
			char c = phrase2.charAt(i);
			if (Character.isLetter(c)) {
				holder2 += phrase2.substring(i, i + 1);
				for (int n = 0; n < 25; n++) {
					if (scoreBoard[n].equalsIgnoreCase(holder2)) {
						scores[n]++;
						holder2 = "";
					}
				}
			}
		}
		// check the letters of the first phrase going backwards
		for (int j = 0; j < phrase1.length(); j++) {
			char c = phrase1.charAt(j);
			if (Character.isLetter(c)) {
				holder1 += phrase1.substring(j, j + 1);
				for (int w = 0; w < 25; w++) {
					if (scoreBoard[w].equalsIgnoreCase(holder1)) {
						scores[w]--;
						holder1 = "";
					}
				}
			}
		}

		for (int p = 0; p < 25; p++) {
			if (scores[p] < 0) {
				return false;
			}
		}
		return true;
	}

}