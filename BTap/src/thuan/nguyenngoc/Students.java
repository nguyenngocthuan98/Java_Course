package thuan.nguyenngoc;

import java.util.ArrayList;

public class Students implements ISearch {

	private ArrayList<Student> students = new ArrayList<>();

	public ArrayList<Student> getStudents() {
		return students;
	}

	public void setStudents(ArrayList<Student> students) {
		this.students = students;
	}

	@Override
	public Object timKiem(int from, int to) {
		ArrayList<Student> timtuoi = new ArrayList<Student>();
		for (int i = 0; i < students.size(); i++) {
			if (students.get(i).gettinhTuoi() <= to && students.get(i).gettinhTuoi() >= from) {
				timtuoi.add(students.get(i));
			}
		}
		return timtuoi;
	}

	@Override
	public Object timKiem(boolean gioitinh) {
		ArrayList<Student> timgt = new ArrayList<Student>();
		for (int i = 0; i < students.size(); i++) {
			if (students.get(i).getGioitinh() == gioitinh) {
				timgt.add(students.get(i));
			}
		}
		return timgt;
	}

	@Override
	public Object timKiem(String hoten) {
		ArrayList<Student> timten = new ArrayList<Student>();
		for (int i = 0; i < students.size(); i++) {
			if (students.get(i).getHoten().indexOf(hoten) >= 0) {
				timten.add(students.get(i));
			}
		}
		return timten;
	}

}
