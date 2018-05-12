package thuan.nguyenngoc;

public class DaoTu {

	public static String lam(String s) {
		String nt = new String();
		char[] a = s.toCharArray();
		int t = a.length - 1;
		for (int i = a.length - 1; i >= 0; i--) {
			if (a[i] == ' ' || i == 0) {
				nt += new String(getChar(a, i, t));
				t = i;
			}
		}
		return nt;
	}

	public static char[] getChar(char[] s, int from, int to) {
		char[] temp = new char[to - from + 1];
		for (int i = from; i <= to; i++) {
			temp[i - from] = s[i];
		}
		return temp;
	}
}
