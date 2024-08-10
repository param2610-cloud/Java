package DSA.recursion;

public class ReverseString {
    public static void Reverse(String word, int idx){
        if(idx==0){
            System.out.print(word.charAt(idx));
            return;
        }
        System.out.print(word.charAt(idx));
        Reverse(word,idx-1);

    }
    public static void main(String[] args) {
        String word = "parambrata";
        Reverse(word, word.length()-1);
    }
}
