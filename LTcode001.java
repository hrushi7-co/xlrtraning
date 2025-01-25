package LeetCode;

public class LTCode001 {     
    public boolean isPalindrome(int x) {                  
        String str = Integer.toString(x);                 
        String reversedStr = new StringBuilder(str).reverse().toString();                         
        return str.equals(reversedStr);     
    } 

    public static void main(String[] args) {
        LTCode001 solution = new LTCode001();
        System.out.println(solution.isPalindrome(121));  
        System.out.println(solution.isPalindrome(-121))