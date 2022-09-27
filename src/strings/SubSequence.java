package strings;

import java.util.ArrayList;
import java.util.List;

public class SubSequence {
    public static void main(String[] args) {
        String str = "abc";
        List<String> res = new ArrayList<>();
        subSeqAscii("", str, res);
        System.out.println(res);
    }

    static void subSeq(String processed, String unProcessed, List<String> res) {
        if (unProcessed.isEmpty()) {
            res.add(processed);
            return;
        }
        char ch = unProcessed.charAt(0);
        subSeq(processed + ch,unProcessed.substring(1), res);
        subSeq(processed, unProcessed.substring(1), res);
    }

    static void subSeqAscii(String processed, String unProcessed, List<String> res) {
        if (unProcessed.isEmpty()) {
            res.add(processed);
            return;
        }
        char ch = unProcessed.charAt(0);
        subSeqAscii(processed + ch,unProcessed.substring(1), res);
        subSeqAscii(processed, unProcessed.substring(1), res);
        subSeqAscii(processed + (ch+0),unProcessed.substring(1), res);
    }
}
