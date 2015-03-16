package main;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.jsoup.*;
import org.jsoup.nodes.Document;

public class HTMLWordsArray {
		
		public String[] getHTMLArray(String inUrlString) throws IOException { 
		String[] htmlArray;  
		
		Document doc = Jsoup.connect(inUrlString).get(); 
		
		String contents = doc.body().text(); 
		String htmlString = doc.html();

		contents = contents.toLowerCase(); 
		contents = contents.replaceAll("[^a-z]", " ").trim();  
		
		List<String> htmlList = Arrays.asList(contents.split("\\s+")); 	
		List<String> list = new ArrayList<String>();
		htmlArray = htmlList.toArray(new String[0]);
		
		return htmlArray; 
		
		
		
		
		
//			for (String stuff : htmlArray) { 
//			System.out.println(stuff); 
			}

	} 



//	public String[] htmlArray;

	
//	public static void main(String[] args) {
//		public String[] htmlArray;
//
//		 Document doc = Jsoup.connect(urlString).get();
//		
//		 String contents = doc.body().text();
//		
//		 contents = contents.toLowerCase();
//		 contents = contents.replaceAll("[^a-z]", " ").trim();
//		
//		 List<String> htmlList = Arrays.asList(text.split("\\s+"));
//		 List<String> list = new ArrayList<String>();
//		 htmlArray = htmlList.toArray(new String[0]);
//		
//		 for (String stuff : htmlArray) {
//		 System.out.println(stuff);
//		 }
//		
//	}

//	public void htmlWordsArray() {
//		
//		String[] htmlArray;
//		Document doc = (Document) Jsoup.connect(URLReader.getUrl());//.get();
//
//		String contents = doc.body().text();
//
//		contents = contents.toLowerCase();
//		contents = contents.replaceAll("[^a-z]", " ").trim();
//
//		List<String> htmlList = Arrays.asList(text.split("\\s+"));
//		List<String> list = new ArrayList<String>();
//		htmlArray = htmlList.toArray(new String[0]);
//	}
//}
