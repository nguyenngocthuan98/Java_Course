package thuan.nguyenngoc;

import java.time.ZoneId;
import java.util.Date;

public class Employer {
	public String ma;
	public String hoten;
	public int namsinh;
	public boolean gioitinh;
	public double hsl;

	public Employer(String ma, String hoten, int namsinh, boolean gioitinh, double hsl) {
		this.ma = ma;
		this.hoten = hoten;
		this.namsinh = namsinh;
		this.gioitinh = gioitinh;
		this.hsl = hsl;
	}
	
	public String getMa() {
		return ma;
	}

	public void setMa(String ma) {
		this.ma = ma;
	}

	public String getHoten() {
		return hoten;
	}

	public void setHoten(String hoten) {
		this.hoten = hoten;
	}

	public int getNamsinh() {
		return namsinh;
	}

	public void setNamsinh(int namsinh) {
		this.namsinh = namsinh;
	}

	public boolean getGioitinh() {
		return gioitinh;
	}

	public void setGioitinh(boolean gioitinh) {
		this.gioitinh = gioitinh;
	}

	public double getHsl() {
		return hsl;
	}

	public void setHsl(double hsl) {
		this.hsl = hsl;
	}

	public int gettinhTuoi() {
		return (new Date()).toInstant().atZone(ZoneId.systemDefault()).getYear() - namsinh;
	}

	public double tinhLuong() {
		return hsl * 1250000;
	}

	@Override
	public String toString() {
		return "Sinh vien: " + "\nMa sinh vien: " + ma + "\nHo ten sinh vien:" + hoten + "\nNam sinh: " + namsinh
				+ "\nGioi tinh: " + ((gioitinh) ? "Nam" : "Nu") + "\nHe so luong: " + hsl + "\nLuong: " + tinhLuong();
	}

}
