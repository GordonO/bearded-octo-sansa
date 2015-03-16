package main;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
	public static void main(String[] args) {

		// public static void writeToFile() {
		String URLarray[] = URLReader.getUrlArray();
		File file1 = new File("file1.html");
		File file2 = new File("file2.html");
		File file3 = new File("file3.html");
		File file4 = new File("file4.html");
		File file5 = new File("file5.html");
		File file6 = new File("file6.html");
		File file7 = new File("file7.html");
		File file8 = new File("file8.html");
		File file9 = new File("file9.html");
		File file10 = new File("file10.html");
		
		

		try (BufferedWriter br = new BufferedWriter(
				new FileWriter(scrapedFile))) {
			br.write(scrapedFile.toString());
		} catch (IOException e) {
			System.out.println("Unable to open file: "
					+ scrapedFile.toString());
		}
	}
}
