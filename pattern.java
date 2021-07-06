	public static void main(String[] args) {
		String input = "WELCOME";
		String newInput = input.substring(input.length()/2) + input.substring(0,input.length()/2);
		String printText = "";
		for(int i=0;i<newInput.length();i++) {
		    printText += newInput.charAt(i);
		    for(int j=0;j<newInput.length()-i;j++)
		        System.out.print(" ");
		    System.out.print(printText);
		    System.out.println("");
		}
	}
