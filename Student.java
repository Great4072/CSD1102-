public class Student {
    String studentId;
    String name;
    String major;
    double gpa;

    // constructor
    public Student(String studentId, String name, String major, double gpa) {
        this.studentId = studentId;
        this.name = name;
        this.major = major;
        this.gpa = gpa;
    }

    // method แสดงข้อมูล
    public void displayInfo() {
        System.out.println("รหัสนักศึกษา: " + studentId);
        System.out.println("ชื่อ: " + name);
        System.out.println("สาขา: " + major);
        System.out.println("เกรดเฉลี่ย: " + gpa);
        System.out.println("----------------------");
    }
}
