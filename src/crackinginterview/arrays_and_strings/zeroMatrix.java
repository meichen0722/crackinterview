package crackinginterview;
//use flags to record
//use bit vector(n bits) can save space than boolean array(n bytes)
//boolean is 1 byte space
public class zeroMatrix {
	static int[][] zero_matrix(int[][] m){
		int rows = m.length;
		int columns = m[0].length;
//		boolean[] row_flag = new boolean[rows];
		int row_bitvector = 0;
		int column_bitvector = 0;
//		boolean[] column_flag = new boolean[columns];
		for (int i=0;i<rows;i++) {
			for (int j=0;j<columns;j++){
				if (m[i][j] == 0) {
//					row_flag[i] = true;
					row_bitvector |= 1<<i; 
//					column_flag[j] = true;
					column_bitvector |= 1<<j; 
				}
			}
		}
		for (int i=0;i<rows;i++) {
			for (int j=0;j<columns;j++){
//				if (row_flag[i] || column_flag[j])
				if (((row_bitvector>>i) & 1)!=0 || ((column_bitvector>>j) & 1)!=0)
					m[i][j] = 0;
			}
		}
		return m;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] m = {{1,2,3},{0,5,6}};
		m = zero_matrix(m);
		for (int i=0;i<m.length;i++) {
			for (int j=0;j<m[0].length;j++) {
				System.out.println(m[i][j]);
			}
		}
	}

}
