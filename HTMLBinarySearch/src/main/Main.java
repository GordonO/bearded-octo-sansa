package main;

import java.io.IOException;


public class Main {
	
public static void main(String [] arguments) throws IOException { 

	URLReader urlreader =  new URLReader();

	String [] urlstringarray  = urlreader.getUrlArray(); 
//	getUrlArray returns string array
	VocabReader vocabreader = new VocabReader();
//	populateArray
	vocabreader.populateArray();
	HTMLWordsArray htmlarray = new HTMLWordsArray(); 
	for (int j = 0; j < urlstringarray.length; j++) {
		htmlarray.getHTMLArray(urlstringarray[j]);
	}
	
	BinarySearchWordsArray binarysearch = new BinarySearchWordsArray();
	binarysearch.getMatchedWordsArray();
//	returned matchedwords
	
	WriteFile writefile = new WriteFile();
	
} 
}