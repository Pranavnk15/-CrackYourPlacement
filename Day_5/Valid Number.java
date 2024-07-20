class Solution {
    public boolean isNumber(String s) {
        boolean numSeen = false;
        boolean eSeen = false;
        boolean dotSeen = false;

        for(int i = 0; i<s.length(); i++) {
            char ch = s.charAt(i);
            if(Character.isDigit(ch)) {
                numSeen = true;
            } else if(ch == '+' || ch == '-') {
                if(i>0 && (s.charAt(i-1) != 'e' && s.charAt(i-1) != 'E')) {
                    return false;
                }
            } else if(ch == '.') {
                if(dotSeen || eSeen) {
                    return false;
                }
                dotSeen = true;
            } else if(ch == 'e' || ch == 'E') {
                if(eSeen || !numSeen) {
                    return false;
                }
                eSeen = true;
            } else {
                return false;
            }
        }
        return numSeen;
    }
}