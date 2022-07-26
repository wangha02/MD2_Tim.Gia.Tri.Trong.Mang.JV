import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] students = {"Ba", "Duc", "Phu", "Chien", "Dat", "Nam", "Tung", "Chinh", "Bang"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ten sinh vien!");
        String input_name = scanner.nextLine();
        boolean tonTai = false;
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(input_name)) {
                System.out.println("vi tri cua cac thi sinh trong danh sach" + input_name + "is" + i);
                tonTai = true;
                break;
            }
        }
        if (!tonTai) {
            System.out.println("khong tim thay" + input_name + "trong danh sach");
        }
    }
}