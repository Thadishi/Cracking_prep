package Cracking;

public class URLify {

	//method to count number of words in string
	/*public int countWords(String sent) {
		
		
	}*/
	//replace spaces %20
	//method to convert to character array
	
	public static void main(String[] args) {
		String judas = "Judas is a hero and deserves praise";
		
		String[] judasArr = judas.split("\\ ");
		String francis = judas.replace(" ","%20");
		
		System.out.println("length of string array: "+judasArr.length);
		System.out.println("Length of string: "+judas.length());
		System.out.println(francis);
	}
}