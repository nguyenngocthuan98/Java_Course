package thuan.nguyenngoc;

import java.time.ZoneId;
import java.util.Date;

public class Student {
	public String ma;
	public String hoten;
	public int namsinh;
	public boolean gioitinh;

	public int gettinhTuoi() {
		return (new Date()).toInstant().atZone(ZoneId.systemDefault()).getYear() - namsinh;
	}
	
	//ham tao
	public Student(String ma, String hoten, int namsinh, boolean gioitinh) {
		this.ma = ma;
		this.hoten = hoten;
		this.namsinh = namsinh;
		this.gioitinh = gioitinh;
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

	@Override
	public String toString() {
		return "Sinh vien: " + "\nMa sinh vien: " + ma + "\nHo ten sinh vien:" + hoten + "\nNam sinh: " + namsinh
				+ "\nGioi tinh: " + ((gioitinh) ? "Nam" : "Nu");
	}

}
