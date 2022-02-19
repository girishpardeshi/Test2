package StringProgramms;

import java.util.Arrays;

public class JavaAnagrams {
	public static void isAnagram(String a, String b) {
		if (a.length() != b.length()) {
			System.out.println("String no Anagram");
		} else {
			char[] char1 = a.toLowerCase().toCharArray();
			char[] char2 = b.toLowerCase().toCharArray();
			Arrays.sort(char1);
			Arrays.sort(char2);
			if (Arrays.equals(char1, char2)) {
				System.out.println("Anagram String");
			} else {
				System.out.println("Not anagram String");
			}
		}
	}
	public static void main(String[] args) {
		String str1 = "Army";
		String str2 = "Mary";
		isAnagram(str1, str2);
	}
}