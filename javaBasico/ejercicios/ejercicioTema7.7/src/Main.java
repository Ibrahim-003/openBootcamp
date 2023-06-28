import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            if (i%2 == 0) {
                continue;
            }

            numbers.add(i);
        }

        for (int num : numbers) {
            System.out.println(num);
        }

    }
}