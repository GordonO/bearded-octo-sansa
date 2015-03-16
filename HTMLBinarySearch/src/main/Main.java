import BinarySearchWordsArray;
import HTMLWordsArray;
import URLReader;



import java.io.IOException;
import java.util.ArrayList;


public class Main {
	
public static void main(String [] arguments) throws IOException { 

	URLReader urlreader =  new URLReader(); 
	String [] urlstringarray  = urlreader.getUrlArray(); 
	
	HTMLWordsArray htmlarray = new HTMLWordsArray(); 
	
	BinarySearchWordsArray binarysearch = new BinarySearchWordsArray();
	
	
	
	for (String urlstring : urlstringarray) {
		String[] HTMLArray = htmlarray.getHTMLArray(urlstring);
		ArrayList<String> matchingWords = binarysearch.getMatchedWordsArray(HTMLArray); 
		
		

	} 
} 
}

