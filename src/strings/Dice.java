package strings;

import java.util.ArrayList;
import java.util.List;

public class Dice {
    public static void main(String[] args) {
        List<String> res = new ArrayList<>();
        dice("", 4, res);
        System.out.println(res);
    }

    static void dice(String p, int target, List<String> res) {
        if (target == 0) {
            res.add(p);
            return;
        }

        for (int i = 1; i <= 6 && i <= target; i++) {
            dice(p + i, target - i, res);
        }
    }
}
