package package1;

public class CountWordsInString {

	public static void main(String[] args) {
		
		String str1 = "java is best lnaguage is java";
		countWord(str1);
	}
	
	public static void countWord(String str) {
		String s1[] = str.split(" ");
		//System.out.println(s1.length);
		int count=0;
		for(int i=0; i<s1.length; i++) {
			
			if(s1[i].equals("java")) {
				count++;
			}
		}
		System.out.println("Found String Java "+count+" times");
	}
}
