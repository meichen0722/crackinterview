package crackinginterview;
//method1:
//if a string is permutation of another,
//they have the same amount of each character
//method2:
//if permutation, the sorted string should be equal
public class checkPermutation {
	static boolean check_permutation_1(String s1, String s2) {
		//permutation must have the same length
		if (s1.length() != s2.length())
			return false;
		int[] count = new int[128];
		for (int i=0;i<s1.length();i++) {
			int var1 = s1.charAt(i);
			int var2 = s2.charAt(i);
			count[var1]++;
			count[var2]--;
		}
		for (int i=0;i<128;i++) {
			if (count[i] != 0)
				return false;
		}
		return true;
	}
	static boolean check_permutation_2(String s1, String s2) {
		if (s1.length() != s2.length())
			return false;
		s1 = string_sort(s1);
		s2 = string_sort(s2);
		return s1.equals(s2);
	}
	static String string_sort(String s) {
		//function for sorting string
		char[] char_array = s.toCharArray();
		java.util.Arrays.sort(char_array);
		return new String(char_array);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="abc";
		String s2="acb";
		System.out.println(check_permutation_1(s1,s2));
		System.out.println(check_permutation_2(s1,s2));
	}

}
