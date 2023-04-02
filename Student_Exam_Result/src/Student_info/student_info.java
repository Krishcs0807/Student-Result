package Student_info;

public class student_info {

	public static String DeportMent;
	public static String Semester;
	public String Regno;
	public String Name;
	public byte Tamil1 = 0;
	public byte English1;
	public byte Computer_Science1;
	public byte Practical1;
	public byte Marthematics1;
	public byte VE;

	public student_info() {

	}

	public student_info(String regno, String name, byte tamil, byte english, byte computer_Science, byte practical,
			byte marthematics1, byte Value_education) {
		Regno = regno;
		Name = name;
		Tamil1 = tamil;
		English1 = english;
		Computer_Science1 = computer_Science;
		Practical1 = practical;
		Marthematics1 = marthematics1;
		VE = Value_education;
		DeportMent = "Bsc(CS)";
		Semester = "I";
	}

	@Override
	public String toString() {
		return DeportMent + Semester + "Regno=" + Regno + Regno + ", Name=" + Name + ", Tamil1=" + Tamil1
				+ ", English1=" + English1 + ", Computer_Science1=" + Computer_Science1 + ", Practical1=" + Practical1
				+ ", Marthematics1=" + Marthematics1 + ", VE=" + VE;
	}

	public byte Tamil2;
	public byte English2;
	public byte Computer_Science2;
	public byte Practical2;
	public byte Marthematics2;
	public byte Marthematics3;
	public byte Environmental_studies;

	public student_info(String regno, String name, byte tamil, byte english, byte computer_Science, byte practical,
			byte marthematics1, byte marthematics3, byte environmental_studies) {
		Regno = regno;
		Name = name;
		Tamil2 = tamil;
		English2 = english;
		Computer_Science2 = computer_Science;
		Practical2 = practical;
		Marthematics2 = marthematics1;
		Marthematics3 = marthematics3;
		Environmental_studies = environmental_studies;
		DeportMent = "Bsc(CS)";
		Semester = "II";
	}

	public String toString1() {
		return DeportMent + Semester + "Regno=" + Regno + Regno + ", Name=" + Name + ", Tamil2=" + Tamil2
				+ ", English2=" + English2 + ", Computer_Science1=" + Computer_Science1 + ", Practical1=" + Practical1
				+ " Marthematics2=" + Marthematics2 + "Marthematics3=" + Marthematics3 + ", Environmental_studies="
				+ Environmental_studies;
	}

//	public byte Tamil3;
//	public byte English3;
//	public byte Computer_Science3;
//	public byte  Practical3;
//	public byte Fundamentals_of_Yogic_Practices;
//	public student_info(String regno, String name,byte tamil, byte english, byte computer_Science, byte  practical,byte fundamentals_of_yogic_practices) {
//		Regno = regno;
//		Name = name;
//		Tamil2 = tamil;
//		English2 = english;
//		Computer_Science2 = computer_Science;
//		 Practical2 =  practical;
//		 Fundamentals_of_Yogic_Practices=fundamentals_of_yogic_practices;
//		 DeportMent="Bsc(CS)";
//		 Semester="III";
//	}

}
