import Entity.Student;
import MônHọc.Subject;

import java.util.Scanner;

public class MainRun {
    public static Student[] students = new Student[100];
    public static Subject[] subjects = new Subject[100];
    public static void main(String[] args) {
        while (true){
            showMenu();
            int chucnang = NumberChoice();
            TinhNang(chucnang);
        }

    }
    public static void showMenu(){
        System.out.println("1.Nhập DS SV mới");
        System.out.println("2.In DS SV ");
        System.out.println("3.Nhập DS môn học mới");
        System.out.println("4.In DS Môn học");
        System.out.println("5.Thoát chương trình");
    }
    public static int NumberChoice(){
        System.out.println("Nhập chức năng muốn chọn");
        int num;
        do {
             num = new Scanner(System.in).nextInt();
            if(num >= 1 && num <= 5){
                break;
            }
            System.out.println("Vui lòng nhập lại");
        }
        while (true);
        return num;
    }
    public static void TinhNang(int NumberChoice){
        switch (NumberChoice){
            case 1:
                System.out.println("Nhập số lượng SV muốn thêm:");
                int numStudent = new Scanner(System.in).nextInt();
                for (int i = 0; i < numStudent; i++) {
                    Student student = new Student();
                    student.nhapDS_SinhVien();
                    luuDS_SV(student);
                }
                break;
            case 2:
                for (int i = 0; i < students.length; i++) {
                    if(students[i] != null){
                        System.out.println(students[i]);
                    }
                }
                System.out.println("----------------------");
                break;
            case 3:
                System.out.println("Nhập số lượng môn học muốn thêm: ");
                int numSub = new Scanner(System.in).nextInt();
                for (int i = 0; i < numSub; i++) {
                    Subject subject = new Subject();
                    subject.nhapThongTin();
                    luuDS_MonHoc(subject);
                }
                break;
            case 4:
                for (int i = 0; i < subjects.length; i++) {
                    if(subjects[i] != null){
                        System.out.println(subjects[i]);
                    }

                }
                System.out.println("----------------------");
                break;
            case 5:
                return;
        }
    }
    public static void luuDS_SV(Student student){
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null){
                students[i] = student;
                break;
            }
        }
    }
    public static void luuDS_MonHoc(Subject subject){
        for (int i = 0; i < subjects.length; i++) {
            if(subjects[i] == null){
                subjects[i] = subject;
                break;
            }

        }
    }
}
