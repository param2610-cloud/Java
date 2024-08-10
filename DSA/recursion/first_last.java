package DSA.recursion;

public class first_last {
    public static void first_last(String Word,int idx,char ELement__,int result[]){
        if(idx==Word.length()-1){
            return;
        }
        if(Word.charAt(idx) == ELement__){
            if(result[0] == -1){
                result[0]=  idx;
                result[1] = idx;
            }else{
                result[1]=idx;
            }
        }
        first_last(Word, idx+1, ELement__, result);
    }
    public static void main(String[] args) {
        String word= "parambrata";
        int result[] = {-1,-1};
        first_last(word, 0,'r', result);
        System.out.println("First: "+result[0]);
        System.out.println("Last: "+result[1]);
    }
}
