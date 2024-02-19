
/* Project: Lab2 Git
* Class: UniqueWords.java
* Author: William Pico
* Date: February 19, 2024
* This program prints out the number of unique words in an arrayList.
* It's main purpose is to help get a better understanding on how git works.
*/
import java.util.ArrayList;

public class UniqueWords {
	/**
	 * counts the number of unique strings in a list
	 * 
	 * @param list ArrayList of strings to be examined
	 * @return number of unique strings in the list
	 */

	// This method returns the number of uniqueWords in the arrayList
	public static int countUnique(ArrayList<String> list) {

		int count = 0;

		for (int i = 0; i < list.size(); i++) {

			// boolean is initialized as true so that all words are unique by default
			boolean uniqueWord = true;

			for (int j = 0; j < list.size(); j++) {

				// if loop checks if the word at indexes i and j are the same and if the index
				// values are distinct
				if (list.get(j).equals(list.get(i)) && i != j) {

					// if both conditions are met the uniqueWord is set as false since same word is
					// located in different indexes
					uniqueWord = false;
				}
			}

			if (uniqueWord == true) {
				count++;

			}
		}
		return count;
	}

	public static void main(String[] args) {
		ArrayList<String> words = new ArrayList<>();
		words.add("apple");
		words.add("orange");
		words.add("blackboard");
		words.add("apple");
		words.add("orange");
		words.add("sun");
		words.add("moon");

		int unique = countUnique(words);
		System.out.println(words + " has " + unique + " unique words");
	}
}
