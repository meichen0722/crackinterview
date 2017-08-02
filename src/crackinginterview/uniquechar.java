package crackinginterview;

public class uniquechar {
	boolean uniqueChar(String s) {
		if (s.length()>128) {
			return false;
		}
		boolean[] charFlag = new boolean[128];
		for(int i=0; i<s.length(); i++) {
			int var = s.charAt(i);
			if(charFlag[var])
				return false;
			charFlag[var] = true;
		}
		return true;
	}
	public void main(String[] args){
		String s = "abc";
		uniqueChar(s);
	  }
}
