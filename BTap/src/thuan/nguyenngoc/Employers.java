package thuan.nguyenngoc;

import java.util.ArrayList;

public class Employers implements ISearch {

	private ArrayList<Employer> employers = new ArrayList<Employer>();

	public ArrayList<Employer> getEmployers() {
		return employers;
	}

	public void setEmployers(ArrayList<Employer> employers) {
		this.employers = employers;
	}

	@Override
	public Object timKiem(int from, int to) {
		ArrayList<Employer> timtuoi = new ArrayList<Employer>();
		for (int i = 0; i < employers.size(); i++) {
			if (employers.get(i).gettinhTuoi() <= to && employers.get(i).gettinhTuoi() >= from) {
				timtuoi.add(employers.get(i));
			}
		}
		return timtuoi;
	}

	@Override
	public Object timKiem(boolean gioitinh) {
		ArrayList<Employer> timgt = new ArrayList<Employer>();
		for (int i = 0; i < employers.size(); i++) {
			if (employers.get(i).getGioitinh() == gioitinh ) {
				timgt.add(employers.get(i));
			}
		}
		return timgt;
	}

	@Override
	public Object timKiem(String hoten) {
		ArrayList<Employer> timten = new ArrayList<Employer>();
		for (int i = 0; i < employers.size(); i++) {
			if (employers.get(i).getHoten().indexOf(hoten)>=0) {
				timten.add(employers.get(i));
			}
		}
		return timten;
	}
	
	public Object timKiem(Float tinhLuong) {
		ArrayList<Employer> timluong = new ArrayList<Employer>();
		for (int i = 0; i < employers.size(); i++) {
			if (employers.get(i).tinhLuong() == tinhLuong ) {
				timluong.add(employers.get(i));
			}
		}
		return timluong;
	}

}
