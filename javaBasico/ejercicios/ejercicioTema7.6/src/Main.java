import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Blue");
        colors.add("Red");
        colors.add("Grey");
        colors.add("Yellow");

        LinkedList<String> linkColors = new LinkedList<>(colors);

        for (String color : colors) {
            System.out.println(color);
        }

        for (String linkColor : linkColors) {
            System.out.println(linkColor);
        }


    }
}