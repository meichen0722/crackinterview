package crackinginterview;
//there are totally 128 characters, ASCII# 0~127
//record if each character has been used
public class isUnique {
	static boolean is_unique(String s) {
		if (s.length() > 128) {
			return false;
		}
		boolean[] flag = new boolean[128];
		for (int i=0;i<s.length();i++) {
			int var = s.charAt(i);
			if (flag[var] == true)
				return false;
			else
				flag[var] = true;
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abbbbbc";
		System.out.println(is_unique(s));
	}

}
