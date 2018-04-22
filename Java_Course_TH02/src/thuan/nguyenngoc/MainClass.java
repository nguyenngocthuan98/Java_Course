package thuan.nguyenngoc;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class MainClass {

	public static void main(String[] args) throws IOException {
		HangHoa hh = new HangHoa();
		KhachHang kh = new KhachHang();
		String ot = new String();
		BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Nhập User: ");
		String usr = buff.readLine();

		System.out.println("Nhập Pass: ");
		String pass = buff.readLine();

		if (usr.equals(kh.getUsername()) && pass.equals(kh.getPassword())) {
			int x;
			do {
				System.out.println("Quý khách có muốn mua không? ");
				System.out.println("1. Có");
				System.out.println("2. Không");
				x = Integer.parseInt(buff.readLine());
				if (x == 2) {
					break;
				}
				HangHoa hah = new HangHoa();
				System.out.println("Tên hàng: ");
				String th = buff.readLine();

				System.out.println("Ngày sản xuất: ");
				String nsx = buff.readLine();

				System.out.println("Đơn giá: ");
				double dg = Double.parseDouble(buff.readLine());

				System.out.println("Số lượng: ");
				int sl = Integer.parseInt(buff.readLine());

				ot += kh.MuaHang(th, nsx, dg, sl);
			} while (true);
			System.out.println(ot);

		} else {
			System.out.println(
					"Xin lỗi, tài khoản của quý khách không tồn tại trong hệ thống. Xin liên hệ đăng kí với chi nhánh khách hàng gần nhất.");
		}

	}

}
