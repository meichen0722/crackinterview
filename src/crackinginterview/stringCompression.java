package crackinginterview;
//use StringBuilder for a dynamic String, save time
//StringBuilder.append(char/string)
//String.valueOf(int): string representation of int
public class stringCompression {
	static String string_compression(String s) {
//		String rt = "";
		StringBuilder rt = new StringBuilder();
		int count =0;
		for (int i=0; i<s.length();i++){
			if (i == s.length()-1 || s.charAt(i+1) != s.charAt(i)){
				count++;                 
//				rt += "" + s.charAt(i) + count;
				rt.append(s.charAt(i));
				rt.append(count);
				count = 0;
			}
			else {
				count++;
			}
		}
		return rt.length()<s.length()?rt.toString():s;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "aabbb";
		System.out.println(string_compression(s));
	}

}
