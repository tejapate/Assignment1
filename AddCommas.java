import acm.program.*;

public class AddCommas extends GraphicsProgram {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;




	//String addCommasToNumericString(String digits) {
		
		String addCommasToNumericString(String digits) {
			String result = "";
			
			int len = digits.length();
			int noOfDigits = 0;
			
			for (int i = len - 1; i >= 0; i--) { 
				result = digits.charAt(i) + result;
				noOfDigits++;
				 
				if ((noOfDigits % 3) == 0) && (i > 0)) {
					result = "," + result;
				}
				
			}
	}
	
		
			
		
		//addCommasToNumericString(digits) {
		public void run() {
			while (true) {
				String digits1 = readLine("Enter a numaric string: ");
				if (digits1.length()==0) break;
				println(addCommasToNumericString(digits1));
			}
		}
		
		
	}

/*	private String addCommasToNumericString(String digits) {
		private String addCommasToNumericString(String digits) {
			String result = "";
			
			int len = digits.length();
			int noOfDigits = 0;
			
			for (int i = len - 1; i >= 0; i--) { 
				result = digits.charAt(i) + result;
				noOfDigits++;
				 
				if ((noOfDigits % 3) == 0) && (i > 0)) {
					result = "," + result;
				}
				
			}
			return result;
		}

} */
