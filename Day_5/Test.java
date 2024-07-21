import java.util.*;

public class Test {
    public static String solve(int n, int num) {
        HashMap<Integer, String> map = new HashMap<>();
        for(int i = 1; i<10; i++) {
            
                map.put(i, i+"");
            
        }
       

        map.put(10, "A");
        map.put(11, "B");
        map.put(12, "C");
        map.put(13, "D");
        map.put(14, "E");
        map.put(15, "F");
        map.put(16, "G");
        map.put(17, "H");
        map.put(18, "I");
        map.put(19, "J");
        map.put(20, "K");
        map.put(21, "L");
        map.put(22, "M");
        map.put(23, "N");
        map.put(24, "O");
        map.put(25, "P");
        map.put(26, "Q");
        map.put(27, "R");
        map.put(28, "S");
        map.put(29, "T");
        map.put(30, "U");
        map.put(31, "V");
        map.put(32, "W");
        map.put(33, "X");
        map.put(34, "Y");
        map.put(35, "Z");


        StringBuilder sb = new StringBuilder();
        int q = Integer.MAX_VALUE;
        int rem = 0;
        while(q != 0) {
            q = num/n;
            rem = num%n;
            sb.append(map.get(rem));
            num = q;
        }
        return sb.reverse().toString();
    }


    public static void main(String[] args) {
       String ans =  solve(21, 5678); 
       System.out.println(ans);   
    }
}