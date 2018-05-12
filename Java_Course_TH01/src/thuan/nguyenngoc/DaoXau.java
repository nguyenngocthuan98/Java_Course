package thuan.nguyenngoc;

public class DaoXau {

    public static String lam(String s) {
        String ns = new String();
        char[] s1 = s.toCharArray();
        for (int i = s1.length - 1; i >= 0; i--) {
            ns += s1[i];
        }
        return ns;
    }
}
