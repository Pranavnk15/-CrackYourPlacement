class Solution {
    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int carry = 0;
        int i = a.length()-1;
        int j = b.length()-1;

        while(i >= 0 || j >= 0 || carry == 1) {
            if(i >= 0) {
                carry += a.charAt(i--) - '0';  // Now, we subtract by '0' to convert the numbers from a char type into an int, so we can perform operations on the numbers
            }
            if(j >=0 ){
                carry += b.charAt(j--) - '0';
            }
            sb.append(carry % 2); // just moduling , we can get remainder and add it into our result
            carry /= 2;
        }
        return sb.reverse().toString();
    }
}