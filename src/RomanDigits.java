class RomanDigits {
    public int romanToInt(String s) {
        int tot=0;
        int prev=0;
        for(int i= s.length() -1; i>=0; i--){
            char c =  s.charAt(i);
            int cur = getValue(c);
            if(cur<prev){
                tot -= cur;
            }
            else{
                tot+= cur;
            }
            prev = cur;
        }
        System.out.println("roman number to: "+tot);
        return tot;
    }
    private int getValue(char c) {
        switch(c) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0;
        }
    }
}