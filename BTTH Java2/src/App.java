import java.util.Scanner;
import java.text.DecimalFormat;
public class GiaiPTBacNhat {
    public static void main(String[] args) {
        int aNumber, bNumber;
        double nghiem;
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số a: ");
        aNumber = scanner.nextInt();
        System.out.println("Nhập vào số b: ");
        bNumber = scanner.nextInt();
        System.out.println("Phương trình bạn vừa nhập vào là: " + aNumber + "x + " + bNumber + " = 0.");
        if (aNumber == 0) {
            if (bNumber == 0) {
                System.out.println("Phương trình này có vô số nghiệm.");
            } else {
                System.out.println("Phương trình vô nghiệm.");
            }
        } else {
            nghiem = (double) -bNumber / aNumber;
            System.out.println("Phương trình có nghiệm x = " + decimalFormat.format(nghiem) + ".");
        }
        System.out.println("-----------------------------");
        System.out.println("Chương trình này được đăng tại Freetuts.net");
    }
}
