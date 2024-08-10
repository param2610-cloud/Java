package DSA.recursion;

public class movestring {
    public static void move(String word,char element,int idx,int lastidx,String newString){
        if(idx==word.length()){
            for (int i = 0; i < lastidx; i++) {
                newString+=element;
            }
            System.out.println(newString);
            return;
        }
        if(word.charAt(idx)==element){
            lastidx++;
            move(word, element, idx+1, lastidx, newString);
            
        }else{
            newString+=word.charAt(idx);
            move(word, element, idx+1, lastidx, newString);
        }
    }
    public static void main(String[] args) {
        String word = "Parambrata";
        move(word, 'a', 0, 0, "");
    }
}
