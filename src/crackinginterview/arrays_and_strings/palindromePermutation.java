package crackinginterview;
//palindrome: at most 1 odd character
//bit vector: length of 26, each bit position represent 1 letter character
//set a bit to 1: x |= mask, set a bit to 0: x &= ~mask
//check if there is only one 1: x & (x-1) == 0
public class palindromePermutation {
	static boolean palindrome_permutation_1(String s) {
		int[] count = new int[26];
		for (int i=0;i<s.length();i++) {
			char c = s.charAt(i);
			if (c == ' ')
				continue;
			else if (c>='a' && c<='z')
				count[c-'a']++;
			else if (c>='A' && c<='Z')
				count[c-'A']++;
		}
		int odd_count = 0;
		for (int i=0;i<26;i++) {
			if (count[i]%2 == 1)
				odd_count++;
				if (odd_count>1)
					return false;
		}
		return true;
	}
	
	static boolean palindrome_permutation_2(String s) {
		int mask = 0;
		int bitvector = 0;
		for (int i=0;i<s.length();i++) {
			char c = s.charAt(i);
			if (c == ' ')
				continue;
			else if (c>='a' && c<='z')
				mask = 1 << (c-'a');
			else if (c>='A' && c<='Z')
				mask = 1 << (c-'A');
			if ((bitvector & mask) == 0)
				bitvector |= mask;
			else
				bitvector &= ~mask;
		}
		return (bitvector == 0) || ((bitvector & bitvector-1) == 0);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abcbad aa";
		System.out.println(palindrome_permutation_1(s));
		System.out.println(palindrome_permutation_2(s));
	}

}
