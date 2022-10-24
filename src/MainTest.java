import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class MainTest {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(4);
        System.out.println(birthday(list, 4, 1));
    }

    public static int birthday(List<Integer> s, int d, int m) {
        int count = 0;
        Iterator<Integer> iterator = s.iterator();
        for (int i = 0; i < s.size()-1; i++) {
            if (iterator.hasNext()) {
//                System.out.println(iterator.next());
                for (int j = i+1; j < m+i; j++) {
                    if(s.get(i) + s.get(j) == d){
                        count++;
                    }
                }
            }
        }
        if (iterator.next() == d) {
            return ++count;
        }

        return count;
    }
}
