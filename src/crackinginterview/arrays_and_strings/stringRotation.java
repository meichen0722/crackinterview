package crackinginterview;
//trick: if s2 is substring of s1s1 && s2.length()==s1.length(),
//then s2 is a rotation of s1
public class stringRotation {
	static boolean string_rotation(String s1, String s2) {
		if (s1.length() != s2.length())
			return false;
		String s1s1 = s1 + s1;
		return isSubstring(s1s1, s2);
	}
	static boolean isSubstring(String s1, String s2) {
		//given function
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
