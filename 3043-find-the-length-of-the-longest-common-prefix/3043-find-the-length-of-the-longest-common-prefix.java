class Solution {
    // Trie (Ağaç) Düğümü
    class TrieNode {
        // 0'dan 9'a kadar rakamlar için yer
        TrieNode[] children = new TrieNode[10]; 
    }

    public int longestCommonPrefix(int[] arr1, int[] arr2) {
        TrieNode root = new TrieNode();

        // 1. Adım: arr1'deki sayıları ağaca ekle
        for (int num : arr1) {
            String s = String.valueOf(num); // Sadece burada string'e çeviriyoruz
            TrieNode node = root;
            for (char c : s.toCharArray()) {
                int digit = c - '0'; // '3' -> 3 (int) çevrimi
                if (node.children[digit] == null) {
                    node.children[digit] = new TrieNode();
                }
                node = node.children[digit];
            }
        }

        int maxLen = 0;

        // 2. Adım: arr2'deki sayıları ağaçta ne kadar ilerleyebiliyor diye kontrol et
        for (int num : arr2) {
            String s = String.valueOf(num);
            TrieNode node = root;
            int currentLen = 0;
            for (char c : s.toCharArray()) {
                int digit = c - '0';
                // Eğer yol varsa ilerle, yoksa döngüyü kır
                if (node.children[digit] != null) {
                    currentLen++;
                    node = node.children[digit];
                } else {
                    break;
                }
            }
            maxLen = Math.max(maxLen, currentLen);
        }
        
        return maxLen;
    }
}