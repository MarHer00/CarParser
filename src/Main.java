import java.io.InputStream;
import java.util.Scanner;

public class Main {
	private static Scanner scan = new Scanner(InputStream);
	
	public static void main(String[] args) {
		String car = getString();
		List<String> parsedCar = parseString(car);
	}
	
	public static String getString() {
		System.out.println("Bitte gebe den zu parsenden String ein und drücke enter:");
		return scan.next();
	}
	
	public static List<String> parseString(String st){
		String[] partList = {"bl", "br", "fs", "hs", "tu", "fe", "sp"};
		
		List<String> ret = new List<String>();
		if(st.length()/2==0) {
			while(!st.equals("")) {
				String subs = ""+st.charAt(st.length())+st.charAt(st.length()-1);
			}
		}
		
		return ret;
	}
}
