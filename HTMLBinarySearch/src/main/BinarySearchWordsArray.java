import java.util.*; 

public class BinarySearchWordsArray {
	

	public ArrayList<String> getMatchedWordsArray(String[] array) { 
		VocabReader vr = new VocabReader();
	
		HTMLWordsArray hwa = new HTMLWordsArray();
		
		ArrayList<String> matchedWords = new ArrayList<String>();  
		
		for (int i = 0; i < array.length; i++) {
			String word = array[i]; 
			int ret = Arrays.binarySearch(vr.wordsArray, array[i]); 
			
			if (ret > 0) { 
				matchedWords.add(word);
			}
			return matchedWords; 
			}
		}
	}
