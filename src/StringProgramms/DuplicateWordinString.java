package StringProgramms;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class DuplicateWordinString {

	public static void duplicateWords(String inputString)
	{
		String[] words= inputString.split(" ");
		Map<String,Integer> wordcount = new HashMap<String,Integer>();
		for(String word : words) {
			if(wordcount.containsKey(word)) {
				wordcount.put(word, wordcount.get(word)+1);
			}else {
				wordcount.put(word, 1);
			}
		}
		Set<String> wordinstring = wordcount.keySet();
		for(String word : wordinstring) {
			if(wordcount.get(word)>1) {
				System.out.println(word+":"+wordcount.get(word));
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		duplicateWords("java Java java");
	}

}
