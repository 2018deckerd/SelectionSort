import java.util.ArrayList;
import java.util.Collections;

/**
 * Implements the bubble sorting algorithm for a large file of text
 * @author Dylan Decker
 *
 */
public class SelectionSorter {

	public static void selectionSort(ArrayList<String> wordList) {
	String greatestWord = "";
	for (int i = wordList.size() - 1; i >= 0; i--) {
		greatestWord = wordList.get(0);
		int index = wordList.indexOf(greatestWord);
		for (int j = 0; j <= i; j++) {
			if (wordList.get(j).compareTo(greatestWord) > 0) {
				greatestWord = wordList.get(j);
				index = wordList.indexOf(greatestWord);
	}
	}
		Collections.swap(wordList, index, i);
}
}
}
