class Palindrom {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }

        int original = x;
        int reversed = 0;

        while (x > 0) {
            int digit = x % 10;            // Son basamağı al
            reversed = reversed * 10 + digit; // Ters sayıya ekle
            x = x / 10;                    // Sayıdan son basamağı sil
        }
        System.out.println("polindrom?= "+ (original == reversed));// true

        return original == reversed;
    }
}