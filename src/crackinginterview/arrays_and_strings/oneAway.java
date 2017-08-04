package crackinginterview;

public class oneAway {
	static boolean one_away(String s1, String s2) {
		int len_diff = s1.length() - s2.length();
		int count_diff = 0;
		if (Math.abs(len_diff) > 1)
			return false;
		if (len_diff == 0) {
			for (int i=0;i<s1.length();i++) {
				if (s1.charAt(i) != s2.charAt(i)) {
					count_diff++;
					if (count_diff>1)
						return false;
				}
			}
			return true;
		}
		else {
			if (len_diff == 1) {
				String temp = s1;
				s1 = s2;
				s2 = temp;
			}
			int i = 0;
			int j = 0;
			while (i<s1.length()) {
				if (s1.charAt(i) != s2.charAt(j)) {
					count_diff++;
					j++;
					if (count_diff > 1)
						return false;
				}
				else {
					i++;
					j++;
				}
			}
			return true;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "pale";
		String s2 = "pales";
		System.out.println(one_away(s1,s2));
	}

}
