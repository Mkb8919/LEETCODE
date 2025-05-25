//9. Palindrome Number
//Given an integer x, return true if x is a palindrome, and false otherwise.
//
//
//
//        Example 1:
//
//Input: x = 121
//Output: true
//Explanation: 121 reads as 121 from left to right and from right to left.
//        Example 2:
//
//Input: x = -121
//Output: false
//Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
//Example 3:
//
//Input: x = 10
//Output: false
//Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
//
//
//Constraints:
//
//        -231 <= x <= 231 - 1
//
//
//Follow up: Could you solve it without converting the integer to a string?








public class check_a_palindrome {

    class Solution {
        public boolean isPalindrome(int x) {
            // Negative numbers and numbers ending with 0 (except 0 itself) are not palindromes
            if (x < 0 || (x % 10 == 0 && x != 0)) {
                return false;
            }
            int original = x;
            int reversed = 0;
            while(x>0){
                int digit =x%10;
                reversed = reversed*10+digit;
                x=x/10;
            }
            if(original == reversed){
                System.out.println("true");

            } else {
                System.out.println("false");

            }

            return original == reversed;


        }
    }
}
