package crackinginterview;
//perform in place: can only become longer, so replace backwards
//2 passes: first pass compute new length
public class urlify {
	static char[] urlify_fn(char[] s, int len) {
		int space_count = 0;
		for (int i=0;i<len;i++) {
			if (s[i] == ' ')
				space_count++;
		}
		int new_len = len + 2*space_count;
		int index = new_len;
		s[index--] = '\0';
		for (int i=len-1;i>0;i--) {
			if (s[i] == ' ') {
				s[index--] = '0';
				s[index--] = '2';
				s[index--] = '%';
			}
			else {
				s[index--] = s[i];
			}
		}
		return s;
	}
	public static void main(String[] args) {
		char[] c = new char[20];
		c[0] = 'a';
		c[1] = 'b';
		c[2] = ' ';
		c[3] = 'd';
		System.out.println(urlify_fn(c,4));
	}

}
