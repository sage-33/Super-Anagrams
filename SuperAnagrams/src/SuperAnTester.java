import java.util.Scanner;

/**
 * Given two phrases, are they super anagrams regardless of capitalization and
 * punctuation?
 */
public class SuperAnTester {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a phrase:" + "\n" + "> ");
		String strOne = scan.nextLine();
		System.out.print("Enter another phrase:" + "\n" + "> ");
		String strTwo = scan.nextLine();
		SuperAnagram ana = new SuperAnagram(strOne, strTwo);
		if (ana.isSuperAnagram() == true) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}
}