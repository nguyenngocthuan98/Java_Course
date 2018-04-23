package thuan.nguyenngoc;

public class HangHoa {
	private String tenhang;
	private String ngaysanxuat;
	private double dongia;
	private int soluong;

	public String getTenHang() {
		return tenhang;
	}

	public void setTenHang(String th) {
		tenhang = th;
	}

	public String getNgaySanXuat() {
		return ngaysanxuat;
	}

	public void setNgaySanXuat(String nsx) {
		ngaysanxuat = nsx;
	}

	public double getDonGia() {
		return dongia;
	}

	public void setDonGia(double dg) {
		dongia = dg;
	}

	public int getSoLuong() {
		return soluong;
	}

	public void setSoLuong(int sl) {
		soluong = sl;
	}

	public double TinhTien() {
		return dongia * soluong;
	}

	public HangHoa() {

	}

	public String HangHoa() {
		return "-----\n Tên hàng : " + tenhang + "\n Ngày sản xuất : " + ngaysanxuat + "\n Đơn giá : " + dongia
				+ "\n Số lượng : " + soluong + "\n Thành tiền: " + TinhTien();
	}
}
