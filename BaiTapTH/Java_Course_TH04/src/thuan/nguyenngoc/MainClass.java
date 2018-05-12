package thuan.nguyenngoc;

public class MainClass {

	public static void main(String[] args) {
		HinhKhoi h = new HinhKhoi(3);
		HinhKhoi1 h1 = new HinhKhoi1(5, 9);
		HinhKhoi2 h2= new HinhKhoi2(9, 7,5);
		HinhKhoi3 h3 = new HinhKhoi3(10,5);
		System.out.println(h.toString());
        System.out.println(h1.toString() +  "\n The tich hinh khoi 1: " + h1.theTich());
        System.out.println(h2.toString() +  "\n The tich hinh khoi 2: " + h2.theTich());
        System.out.println(h3.toString() +  "\n The tich hinh khoi 3: " + h3.theTich());
	}

}
