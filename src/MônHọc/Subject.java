package MônHọc;

import java.util.Scanner;

public class Subject {
    private int id;
    private String nameSub;
    private int numberLearn;
    private String type;
    private static int SubId = 0;
    public Subject() {
        if (SubId == 0) {
            SubId = 99;
        }
        SubId++;
        this.id = SubId;
    }
    public void nhapThongTin() {
        System.out.println("Nhập tên môn: ");
        this.nameSub = new Scanner(System.in).nextLine();
        System.out.println("Nhập số đơn vị học trình: ");
        this.numberLearn = new Scanner(System.in).nextInt();
        System.out.println("Nhập tên môn học: ");
        System.out.println("Vui lòng chọn 1 trong các loại dưới đây: ");
        System.out.println("1. Đại cương.");
        System.out.println("2. Cơ sở ngành.");
        System.out.println("3. Chuyên ngành.");
        int SubTemp;
        do {
            SubTemp = new Scanner(System.in).nextInt();
            if (SubTemp >= 1 && SubTemp <= 3) {
                break;
            }
            System.out.print("Loại bạn đọc không hợp lệ, vui lòng nhập lại: ");
        } while (true);
        switch (SubTemp) {
            case 1:
                this.type = nameSubType.DAICUONG;
                break;
            case 2:
                this.type = nameSubType.COSONGANH;
                break;
            case 3:
                this.type = nameSubType.CHUYENNGANH;
                break;
        }
    }

    @Override
    public String toString() {
        return "Subject{" +
                "id=" + id +
                ", nameSub='" + nameSub + '\'' +
                ", numberLearn=" + numberLearn +
                ", type='" + type + '\'' +
                '}';
    }
}
