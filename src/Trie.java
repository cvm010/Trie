public class Trie {
    Trie[] arr;
    boolean flag;

    public Trie() {
        arr = new Trie[26];
        flag = false;
    }
    public void insert(String s){
        Trie curr = this;
        for(int i=0;i<s.length();i++){
            int ind = s.charAt(i) - 'A';
            if(curr.arr[ind]== null){
                curr.arr[ind] = new Trie();
            }
            curr= curr.arr[ind];
        }
        curr.flag = true;
    }
    public boolean search(String s){
        Trie curr = this;
        for(int i=0;i<s.length();i++){
            int ind = s.charAt(i) - 'A';
            if(curr.arr[ind] == null){
                return false;
            }
            curr= curr.arr[ind];
        }
        return curr.flag;
    }

    public boolean isStartFrom(String s){
        Trie curr = this;
        for(int i=0;i<s.length();i++){
            int ind = s.charAt(i) - 'A';
            if(curr.arr[ind] == null){
                return false;
            }
            curr= curr.arr[ind];
        }
        return true;
    }
}
