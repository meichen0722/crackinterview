package crackinginterview;

public class stringCompression {
	static String string_compression(String s) {
		char[] rt = new char[];
		int i = 0;
		int j = 1;
		int index = 0;
		while (j<s.length()) {
			if (s.charAt(i) == s.charAt(j)) {
				j++;
			}
			else {
				rt[index++] = s.charAt(i);
				rt[index++] = Integer.toString(j-i+1).toCharArray();
			}
		}

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
