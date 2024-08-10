import java.util.LinkedList;
class MyHashSet {
	private static final int INITIAL_CAPACITY = 1000;
	private LinkedList<Integer>[] table;
	@SuppressWarnings("unchecked")
	public MyHashSet() {
		table = (LinkedList<Integer>[]) new LinkedList[INITIAL_CAPACITY];
	}
	private int hash(int key) {
		return key % INITIAL_CAPACITY;

	}
	public  void add (int key) {
		// generate the hash index
		// see for any linkedlist at that portion 
		//if not make a linkedlist at that index
		//make a bucket to use the linked list 
		//because of set check for existing key , if not then add that key on the bucket
		int index = hash(key);
	
		if(table[index] == null) {
			table[index] = new LinkedList<>();
		}
		LinkedList<Integer> bucket = table[index];
		if(!bucket.contains(key)){
			bucket.add(key);
		}
	}
	public void remove (int key) {
		int index = hash(key);
		if(table[index] != null){
			LinkedList<Integer> bucket = table[index];
			bucket.remove((Integer)key);
		}
	}
	public boolean contains(int key){
		int index = hash(key);
		if(table[index] != null){
			LinkedList<Integer> bucket = table[index];
			return bucket.contains(key);
		}
		return false;
	}
public static void main(String[] args) {
        MyHashSet set = new MyHashSet();
        set.add(1);
        set.add(2);
        System.out.println(set.contains(1)); // true
        System.out.println(set.contains(3)); // false
        set.add(2);
        System.out.println(set.contains(2)); // true
        set.remove(2);
        System.out.println(set.contains(2)); // false
    }
}