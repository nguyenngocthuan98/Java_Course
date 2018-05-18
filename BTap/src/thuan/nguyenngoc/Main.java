package thuan.nguyenngoc;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int choose;
		ArrayList<Student> st = new ArrayList<>();
		Students students = new Students();
		st.add(new Student("sv01", "Nguyen Ngoc Thuan", 1998, true));
		st.add(new Student("sv02", "Tran Viet Bao", 1999, true));
		st.add(new Student("sv03", "Nguyen Thanh Thien", 1998, true));
		st.add(new Student("sv04", "Ho Quang Cuong Dat", 1999, true));
		st.add(new Student("sv05", "Ho Quang Tho", 1996, false));
		students.setStudents(st);

		ArrayList<Employer> em = new ArrayList<>();
		Employers employers = new Employers();
		em.add(new Employer("em01", "Tran Thi T", 1998, false, 1));
		em.add(new Employer("em02", "Nguyen Thanh Lai", 1996, true, 2));
		em.add(new Employer("em03", "Cao Thi Ngoc L", 1999, false, 3));
		em.add(new Employer("em04", "Nguyễn Thế Lân", 1995, true, 2));
		em.add(new Employer("em05", "Hoang Thi Thanh L", 1985, false, 1));
		employers.setEmployers(em);

		do {
			System.out.println("1. Tim theo TEN SVien");
			System.out.println("2. Tim theo TUOI SVien");
			System.out.println("3. Tim gioi tinh la NAM SVien");
			System.out.println("4. Tim gioi tinh la NU SVien");
			System.out.println("5. Tim Theo LUONG");
			System.out.println("6. Thoat");
			choose = new Scanner(System.in).nextInt();
			switch (choose) {
			case 1:
				System.out.println("Nhap ten: ");
				String ten = new Scanner(System.in).nextLine();
				System.out.println(students.timKiem(ten));
				break;
			case 2:
				System.out.println("Nhap so dau: ");
				int from = new Scanner(System.in).nextInt();
				System.out.println("Nhap so cuoi: ");
				int to = new Scanner(System.in).nextInt();
				System.out.println(students.timKiem(from, to));
				break;
			case 3:
				System.out.println("Cac hoc sinh NAM: \n");
				System.out.println(students.timKiem(true));

				break;
			case 4:
				System.out.println("Cac hoc sinh NAM: \n");
				System.out.println(students.timKiem(false));
				break;
			case 5: {
				System.out.println("Nhập số đầu");
				int from1 = new Scanner(System.in).nextInt();
				System.out.println("Nhập số cuối");
				int to1 = new Scanner(System.in).nextInt();
				System.out.println(employers.timKiem(from1, to1));
				break;
			}
			}
			if (choose == 6)
				System.out.println("Exit!");
				break;
		} while (true);
	}

}