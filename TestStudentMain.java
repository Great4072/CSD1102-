public class TestStudentMain {
    public static void main(String[] args) {

        // สร้าง array ของ reference
        Student[] students = new Student[3];

        // สร้าง object
        students[0] = new Student("65001", "สมชาย", "วิทยาการคอมพิวเตอร์", 3.45);
        students[1] = new Student("65002", "สมหญิง", "เทคโนโลยีสารสนเทศ", 3.80);
        students[2] = new Student("65003", "อนันต์", "คอมพิวเตอร์ธุรกิจ", 3.20);

        // แสดงข้อมูลทั้งหมดด้วย loop
        for (int i = 0; i < students.length; i++) {
            students[i].displayInfo();
        }
    }
}
