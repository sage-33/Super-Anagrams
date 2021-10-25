public class SuperAnagram {
	private String phrase1;
	private String phrase2;
	private String holder1;
	private String holder2;
	private int sumScore;

	public SuperAnagram(String strOne, String strTwo) {
		phrase2 = strTwo;
		phrase1 = strOne;
		// for (int d = 0; d < 25; d++) {
		// scoreBoard[d] = capBoard[d];
//	}
	}

	public boolean isSuperAnagram() {
		String[] scoreBoard = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q",
				"r", "s", "t", "u", "v", "w", "x", "y", "z" };
		String[] capBoard = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R",
				"S", "T", "U", "V", "W", "X", "Y", "Z" };
		int[] scores = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		for (int i = 0; i < phrase2.length(); i++) {
			char c = phrase2.charAt(i);
			if (Character.isLetter(c)) {
				holder2 += phrase2.substring(i, i + 1);
				for (int n = 0; n < 25; n++)
					if (scoreBoard[n] == holder2) {
						scores[n] = scores[n]++;
					}
				holder2 = "";
			}
		}
		for (int j = 0; j < phrase1.length(); j++) {
			char c = phrase1.charAt(j);
			if (Character.isLetter(c)) {
				holder1 += phrase1.substring(j, j + 1);
				for (int w = 0; w < 25; w++)
					if (scoreBoard[w] == holder1) {
						scores[w] = scores[w]--;
					}
				holder1 = "";
			}
		}
		for (int p = 0; p < 25; p++) {
			sumScore += scores[p];
			if (sumScore >= 0) {
				return true;
			}
		}

		return false;

	}
}
