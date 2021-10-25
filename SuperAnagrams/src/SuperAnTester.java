import java.util.Scanner;

public class SuperAnTester {
	public static void main(String[] args, boolean gram) {
		Scanner scan = new Scanner(System.in);
		String strOne = scan.nextLine();
		String strTwo = scan.nextLine();
		System.out.println("Enter a phrase:" + strOne);
		System.out.println("Enter a phrase:" + strTwo);
		SuperAnagram ana = new SuperAnagram(strOne, strTwo);
		if (ana.isSuperAnagram() == true) {
			System.out.println("true");
		}
		else (ana.isSuperAnagram() == false) {
			System.out.println("false");
		}
	}
}