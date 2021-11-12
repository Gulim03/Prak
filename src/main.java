// алфаттік реттеу бойынша шығарылған есеп
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class main {
    public static void main(String[] args) {
        String chamomile = new String("Ромашка");
        String rose = new String("Роза");
        String violets = new String("Фиалки");
        String tulips = new String("Тюльпаны");

        ArrayList<String> flowers = new ArrayList<>(Arrays.asList(violets, rose,
                chamomile, tulips));

        Collections.sort(flowers);
        System.out.println(flowers);
    }
}