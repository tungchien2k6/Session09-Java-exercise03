public class Main {
    public static void main(String[] args) {
        System.out.println("=== STUDENT MANAGEMENT SYSTEM ===\n");
        Student sv1 = new Student(1, "Nguyễn Văn A", 20, 3.75);
        Student sv2 = new Student(2, "Trần Thị B", 21, 2.85);
        Student sv3 = new Student(3, "Lê Văn C", 19, 4.0);

        sv1.printInfo();
        sv2.printInfo();
        sv3.printInfo();

        System.out.println("Tổng số sinh viên đã tạo: " + Student.getCount());
    }
}