package Result_check;

import java.util.Scanner;

import Student_info.student_info;
import U_student_mark.upload_mark;

public class student_result_check {
	@SuppressWarnings("resource")
	public void S_mark(upload_mark u_mark) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your regno");
		String id = sc.next();
		for (student_info umark : u_mark.a_list1) {
			String dept=student_info.DeportMent;
			String sem=student_info.Semester;
			String regno = umark.Regno;
			String name = umark.Name;
			byte t1 = umark.Tamil1;
			byte e1 = umark.English1;
			byte m1 = umark.Marthematics1;
			byte cs1 = umark.Computer_Science1;
			byte p1 = umark.Practical1;
			byte ve = umark.VE;
			if (id.equals(umark.Regno)) {
				System.out.println("Depertment          " + dept+"Semester          " + sem+"Regno          " + regno + "\nName           " + name 
						+ "\nTamil          " + t1 + "\nEnglish        " + e1 + "\nMaths          " + cs1
						+ "\nScience        " + p1 +"\nMarthematics1        " + m1 + "\nValue education " + ve);
			}

		}
		for (student_info umark : u_mark.a_list2) {
			String dept=student_info.DeportMent;
			String sem=student_info.Semester;
			String regno = umark.Regno;
			String name = umark.Name;
			byte t2 = umark.Tamil2;
			byte e2 = umark.English2;
			byte m2 = umark.Marthematics2;
			byte cs2 = umark.Computer_Science2;
			byte m3 = umark.Marthematics3;
			byte p2=umark.Practical2;
			byte ES=umark.Environmental_studies;
			if (id.equals(umark.Regno)) {
				System.out.println("Depertment          " + dept+"\nSemester          " + sem+"\nRegno          " + regno + "\nName           " + name 
						+ "\nTamil          " + t2 + "\nEnglish        " + e2 + "\nMaths          " + cs2
						+ "\nScience        " + p2 +"\nMarthematics2        " + m2 +"\nMarthematics3        " + m3 + "\nEnvironmental_studies " + ES);
			}
		}


	}
}
