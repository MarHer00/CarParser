import java.util.Scanner;

public class Main {
	private static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		while (true){
			parseString("ahhh");
			String car = getString();
			List<String> parsedCar = parseString(car);
			outP(parsedCar);
			System.out.println("Dein String enthält nur gültige Objekte: "+validateList(parsedCar));
			System.out.println();
		}
	}
	
	public static String getString() {
		System.out.println("Bitte gebe den zu parsenden String ein und dr�cke enter:");
		System.out.println();
		return scan.next();
	}
	
	public static List<String> parseString(String st){
		List<String> ret = new List<String>();
		int futureListLength = st.length()/2;

		if(st.length()%2==0) {
			while(!st.equals("")) {
				String subS = ""+st.charAt(st.length()-2)+st.charAt(st.length()-1);
				st = st.substring(0, st.length()-2);
				ret.append(subS);
			}
		}

		return flipList(ret, futureListLength);
	}

	public static List<String> flipList(List<String> list, int listLength){
		List<String> retList = new List<String>();

		for (int i = 0; i < listLength; i++) {
			list.toLast();
			retList.append(list.getContent());
			list.remove();
		}

		return retList;
	}
	
	public static void outP(List<String> list){
		int i = 1;
		list.toFirst();
		System.out.println("die Liste enthält die folgenden Objekte: ");
		while(list.hasAccess()){
			System.out.println(i+". "+list.getContent().toString());
			list.next();
			i++;
		}
	}

	public static boolean validateList(List<String> list){
		String[] partList = {"bl", "br", "fs", "hs", "tu", "fe", "sp"};
		list.toFirst();
		while(list.hasAccess()){
			if(list.getContent().equals(partList[0])||list.getContent().equals(partList[1])||list.getContent().equals(partList[2])||list.getContent().equals(partList[3])||list.getContent().equals(partList[4])||list.getContent().equals(partList[5])||list.getContent().equals(partList[6])){
				list.next();
			}else{
				return false;
			}
		}
		return true;
	}
}
