package Entity;

import java.util.Scanner;

public class Student extends Person {
    private int maSV;
    private String className;
    private static int StudentId = 0;

    public int getMaSV() {
        return maSV;
    }

    public void setMaSV(int maSV) {
        this.maSV = maSV;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    @Override
    public String toString() {
        return "Entity.Student{" +
                "maSV='" + maSV + '\'' +
                ", className='" + className + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
    public void nhapDS_SinhVien(){
        System.out.println("Nhập tên: ");
        this.name = new Scanner(System.in).nextLine();
        System.out.println("Nhập địa chỉ: ");
        this.address = new Scanner(System.in).nextLine();
        System.out.println("Nhập SĐT: ");
        this.phone = new Scanner(System.in).nextLine();
        System.out.println("Nhập tên lớp: ");
        this.className = new Scanner(System.in).nextLine();
    }
    public Student(){
        if(StudentId == 0){
            StudentId = 9999;
        }
        StudentId++;
        this.maSV = StudentId;
    }
}
