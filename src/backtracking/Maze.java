package backtracking;

import java.util.ArrayList;
import java.util.List;

public class Maze {
    public static void main(String[] args) {
        System.out.println(count(3,3));
        path("",3,3);
        List<String> ans = pathRet("", 3, 3);
        System.out.println(ans);
    }

    static int count(int row, int col) {
        if (row == 1|| col == 1) {
            return  1;
        }
        int left = count(row-1, col);
        int rigth = count(row, col-1);
        return left+rigth;
    }

    static void path(String processed, int r, int c) {
        if (r==1 && c==1) {
            System.out.println(processed);
        }
        if (r > 1) {
            path(processed + 'D', r-1, c);
        }
        if (c > 1) {
            path(processed + 'R', r, c-1);
        }
    }

    static List<String> pathRet(String processed, int r, int c) {
        if (r==1 && c==1) {
            List<String> list = new ArrayList<>();
            list.add(processed);
            return list;
        }
        List<String> list = new ArrayList<>();
        if (r > 1) {
            list.addAll(pathRet(processed + 'D', r-1, c));
        }
        if (c > 1) {
            list.addAll(pathRet(processed + 'R', r, c-1));
        }
        return list;
    }
}
