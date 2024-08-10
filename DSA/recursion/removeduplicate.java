package DSA.recursion;
import java.util.HashMap;
import java.util.Map;

public class removeduplicate {
    public static Map<Character,Boolean> map = new HashMap<>();
    public static void remove(String word,int idx,String newString){
        if(word.length()==idx){
            System.out.println(newString);
            return;
        }
        if(map.getOrDefault(word.charAt(idx),false)){
            remove(word, idx+1, newString);
        }else{
            map.put(word.charAt(idx), true);
            newString+=word.charAt(idx);
            remove(word, idx+1, newString);
        }
    }
    public static void main(String[] args) {
        String word = "parambrata";
        remove(word, 0, "");
    }
}
