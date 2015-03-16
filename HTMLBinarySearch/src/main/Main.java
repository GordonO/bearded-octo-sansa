package main;

import main.BinarySearchWordsArray;
import main.HTMLWordsArray;
import main.URLReader;


import java.io.IOException;


public class Main {
	
public static void main(String [] arguments) throws IOException { 

	URLReader urlreader =  new URLReader(); 
	String [] urlstringarray  = urlreader.getUrlArray(); 
	
	HTMLWordsArray htmlarray = new HTMLWordsArray(); 
	
	BinarySearchWordsArray binarysearch = new BinarySearchWordsArray();
	
	
	
	for (String urlstring : urlstringarray) {
		String[] HTMLArray = htmlarray.getHTMLArray(urlstring);
		

	} 
} 
}

