package crackinginterview;
//roatate by layer
public class rotateMatrix {
	static boolean rotate_matrix(int[][] m){
		if (m.length == 0 || m.length != m[0].length)
			return false;
		for (int layer=0;layer<m.length;layer++) {
			int first = layer;
			int last = m.length-layer-1;
			int temp;
			for(int i=first;i<last;i++) {
				temp = m[first][i];
				m[first][i] = m[last-i][first];
				m[last-i][first] = m[last][last-i];
				m[last][last-i] = m[i][last];
				m[i][last] = temp;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

}
