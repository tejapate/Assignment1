
public class DeletChar {

	
	private string removeAllOccurrences (String str , char ch) {
		
		String result = "";
		
		for (int i = 0; i < str.length(); i++) {
			
			result = str.charAt(i) + result;
		}
	}
}
