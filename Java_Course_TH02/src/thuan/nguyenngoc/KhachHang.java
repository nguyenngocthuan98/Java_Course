package thuan.nguyenngoc;

public class KhachHang {
	private String username;
	private String password;

	public String getUsername() {
		return username;
	}

	public void setUsername(String user) {
		username = user;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String pass) {
		password = pass;
	}

	public KhachHang(String user, String pass) {
		username = user;
		password = pass;
	}

	public KhachHang() {
		username = "nigga";
		password = "1";
	}

	public String MuaHang(String th, String nsx, double dg, int sl) {
		HangHoa hh = new HangHoa();
		hh.setTenHang(th);
		hh.setNgaySanXuat(nsx);
		hh.setDonGia(dg);
		hh.setSoLuong(sl);
		hh.TinhTien();
		return hh.HangHoa();
	}
}
