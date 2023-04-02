package Student_result;

import java.util.Scanner;

import Result_check.student_result_check;
import U_student_mark.upload_mark;

public class Student_main_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		upload_mark u_mark = new upload_mark();
		student_result_check s_r_c = new student_result_check();
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		boolean loop = true;

		while (loop) {
			System.out.println("Staff login press 1\nStudent login press 2\nExit press 5");
			int choose = sc.nextInt();
			switch (choose) {
			case 1: {
				System.out.println("Enter your User name");
				String username = sc.next();
				System.out.println("Enter your password");
				int password = sc.nextInt();
				u_mark.login(username, password);

				break;
			}
			case 2: {
				s_r_c.S_mark(u_mark);
				break;
			}
			case 5: {
				loop = false;
				break;
			}
			}

		}
	}

}
