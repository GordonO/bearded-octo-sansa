import java.util.*; 

public class BinarySearchWordsArray {
	

	public ArrayList<String> getMatchedWordsArray() { 
		VocabReader vr = new VocabReader();
	
		HTMLWordsArray hwa = new HTMLWordsArray();
		String[] html = hwa.getHTMLArray(); 
		
		ArrayList<String> matchedWords = new ArrayList<String>();  
		for (int i = 0; i < html.length; i++) {
			String word = html[i]; 
			int ret = Arrays.binarySearch(vr.wordsArray, html[i]); 
			
			if (ret > 0) { 
				matchedWords.add(word);
			}
			return matchedWords; 
			}
		}
	}
