package exercise;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

// BEGIN
class App {
    public static boolean scrabble(String letters, String word) {
        String[] let = letters.split("");
        var length = word.length();
        List list = new ArrayList(Arrays.asList(let));

        for (var i = 0; i < length; i++) {
            String ch = word.substring(i, i + 1).toLowerCase();
            if (!list.contains(ch)) {
                return false;
            }
            list.remove(ch);
        }
        return true;
    }
}
//END
