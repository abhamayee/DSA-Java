package strings;

public class Stream {
    public static void main(String[] args) {
        String str = "baccad";
        skip("", str);
        String ans = skip(str);
        System.out.println(ans);

        String str2 = "abcappledf";
        String res = skipWord(str2, "apple");
        System.out.println(res);
    }

    static void skip(String processed, String unProssed){
        if (unProssed.isEmpty()){
            System.out.println(processed);
            return;
        }
        char ch = unProssed.charAt(0);
        if (ch == 'a') {
            skip(processed, unProssed.substring(1));
        } else {
            skip(processed + ch, unProssed.substring(1));
        }
    }

    static String skip(String unProssed){
        if (unProssed.isEmpty()){
            return "";
        }
        char ch = unProssed.charAt(0);
        if (ch == 'a') {
            return skip(unProssed.substring(1));
        } else {
            return ch + skip(unProssed.substring(1));
        }
    }

    static String skipWord(String unProssed, String word){
        if (unProssed.isEmpty()){
            return "";
        }
        if (unProssed.startsWith(word)) {
            return skipWord(unProssed.substring(word.length()), word);
        } else {
            return unProssed.charAt(0) + skipWord(unProssed.substring(1), word);
        }
    }
}
