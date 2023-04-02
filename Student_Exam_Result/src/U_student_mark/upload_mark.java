package U_student_mark;

import java.util.ArrayList;

import java.util.List;

import java.util.Scanner;

import Student_info.student_info;

public class upload_mark {
	private String Username;
	private int Password;
	student_info s_info1;
	student_info s_info2;

	public void login(String Username, int Password) {
		this.Username = Username;
		this.Password = Password;

		Add_student_Mark();

	}

	public List<student_info> a_list1 = new ArrayList<student_info>();
	public List<student_info> a_list2 = new ArrayList<student_info>();

	void Add_student_Mark() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		if (Username.equals("1234") && (Password == 1234)) {
			Boolean loop = true;

			while (loop) {
				System.out.println("Add UG Student Mark press 1\nAdd PG Student Mark press 2\nExit press 3");
				int choose = sc.nextInt();

				switch (choose) {
				case 1: {
					Boolean loop1 = true;

					
						System.out.println("1.Computer Science\n2.Maths\n3.Tamil\n5.Exit");
						int choose1 = sc.nextInt();

							switch (choose1) {
							case 1: {
								while (loop1) {
									
								System.out.println("Semester 1 marke press 1\nSemester 2 marke press 2\nExit press 5");
								int choose3 = sc.nextInt();

								switch (choose3) {
								case 1: {

									System.out.println("Regno");
									String regno = sc.next();

									System.out.println("Name");
									String name = sc.next();

									System.out.println("Tamil Mark");
									byte tamil = sc.nextByte();

									System.out.println("English Mark");
									byte english = sc.nextByte();

									System.out.println("Computer Science Mark");
									byte computer_Science = sc.nextByte();

									System.out.println("Practical Mark");
									byte practical = sc.nextByte();

									System.out.println("Marthematics1 Mark");
									byte marthematics1 = sc.nextByte();

									System.out.println("Value education Mark");
									byte ve = sc.nextByte();

									s_info1 = new student_info(regno, name, tamil, english, computer_Science, practical,
											marthematics1, ve);
									a_list1.add(s_info1);
									break;
								}
								case 2: {
									System.out.println("Regno");
									String regno = sc.next();

									System.out.println("Name");
									String name = sc.next();

									System.out.println("Tamil2 Mark");
									byte tamil2 = sc.nextByte();

									System.out.println("English2 Mark");
									byte english2 = sc.nextByte();

									System.out.println("Computer Science2 Mark");
									byte computer_Science2 = sc.nextByte();

									System.out.println("Practical2 Mark");
									byte practical2 = sc.nextByte();

									System.out.println("Marthematics2 Mark");
									byte marthematics2 = sc.nextByte();

									System.out.println("Marthematics3 Mark");
									byte marthematics3 = sc.nextByte();

									System.out.println("Environmental_studies Mark");
									byte environmental_studies = sc.nextByte();

									s_info2 = new student_info(regno, name, tamil2, english2, computer_Science2,
											practical2, marthematics2, marthematics3, environmental_studies);
									a_list2.add(s_info2);
									break;
								}
								case 5: {
									System.out.println("One step back press 1\ntwo step back press 2");
									int S_count = sc.nextInt();
									if (S_count == 1) {
										loop1 = false;
									} else if (S_count == 2) {
										loop1 = false;
										loop = false;
									}
									break;
								}

								}
								
							}
								break;
							}

							case 2: {
								System.out.println("Maths DeportMent Not Update sorry....");
								break;
							}
							case 3: {
								System.out.println("Tamil DeportMent Not Update sorry....");
								break;
							}

							
							}
							break;
						}

					
				
				case 2: {
					System.out.println("PG Not Update sorry....");
					break;
				}
				case 3: {
					loop = false;
					break;
				}
				}

			}

		}

	}
}
