/**
 * @author Christelle
 * 
 */
public class ScannerDemo {

	private static String file1 = null;
	private static int counter = 1;

	public static void main(String args[]) {
		file1 = args[0];
		TokenStream ts = new TokenStream(file1);

		System.out.println(file1);

		while (!ts.isEndofFile()) {
			Token token = ts.nextToken();
			System.out.println("Token " + counter + " " + token);
			counter++;
		}
	}
}
