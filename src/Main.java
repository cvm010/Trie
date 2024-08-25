public class Main {
    public static void main(String[] args) {
   String[] sr = {"RAM", "RAMESHWAR", "RANDOM", "LAPTOP"};
   Trie trie = new Trie();
   for(int i=0;i<sr.length;i++){
       trie.insert(sr[i]);
   }
        System.out.println(trie.search("RAM"));
        System.out.println(trie.search("RAMESHWAR"));
        System.out.println(trie.search("HANUMAN"));
        System.out.println(trie.isStartFrom("RA"));
        System.out.println(trie.isStartFrom("LAPT"));
        System.out.println(trie.isStartFrom("LAS"));



    }
}