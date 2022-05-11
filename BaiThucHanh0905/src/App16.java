import java.util.ArrayList;

public class App16 {
    public static void main(String[] args) {

        ArrayList arrListString = new ArrayList<>();
        arrListString.add("Java");
        arrListString.add("PHP");
        arrListString.add("C#");
        arrListString.add("C++");

        System.out.println("Các phần tử có trong arrListString la : ");
        for (int i = 0; i < arrListString.size(); i++) {
            System.out.print(arrListString.get(i) + "\t");
        }
    }
}