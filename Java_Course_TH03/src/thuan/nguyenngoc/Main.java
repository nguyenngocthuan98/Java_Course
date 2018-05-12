package thuan.nguyenngoc;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		int soDiem = 9;
		int soTron = 4;
		ArrayList<Point> diem = new ArrayList<Point>();
		ArrayList<Round> dtron = new ArrayList<Round>();

		for (int i = 0; i < soTron; i++)
			dtron.add(new Round());

		for (int i = 0; i < soDiem; i++)
			diem.add(new Point());

		for (int i = 0; i < soTron; i++) {
			for (int j = 0; j < soDiem; j++) {
				int m;
				m = dtron.get(i).VTriTDoi(diem.get(j));
				if (m == -1) {
					System.out.println("Diem " + (j + 1) + " nam trong duong tron " + (i + 1));
				} else if (m == 0) {
					System.out.println("Diem " + (j + 1) + " nam tren duong tron " + (i + 1));
				} else if (m == 1) {
					System.out.println("Diem " + (j + 1) + " nam ngoai duong tron " + (i + 1));
				}
			}
		}
	}

}