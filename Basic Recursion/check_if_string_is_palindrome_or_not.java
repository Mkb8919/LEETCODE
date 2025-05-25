// 125. valid palindrome

//A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.
//
//Given a string s, return true if it is a palindrome, or false otherwise.
//
//
//
//        Example 1:
//
//Input: s = "A man, a plan, a canal: Panama"
//Output: true
//Explanation: "amanaplanacanalpanama" is a palindrome.
//        Example 2:
//
//Input: s = "race a car"
//Output: false
//Explanation: "raceacar" is not a palindrome.
//Example 3:
//
//Input: s = " "
//Output: true
//Explanation: s is an empty string "" after removing non-alphanumeric characters.
//Since an empty string reads the same forward and backward, it is a palindrome.
//
//
//        Constraints:
//
//        1 <= s.length <= 2 * 105
//s consists only of printable ASCII characters.




public class check_if_string_is_palindrome_or_not {

    class Solution {
        public boolean isPalindrome(String s){
            // Step 1: Preprocess the string
            StringBuilder cleaned = new StringBuilder();
            for (char ch : s.toCharArray()) {
                if (Character.isLetterOrDigit(ch)) {
                    cleaned.append(Character.toLowerCase(ch));
                }
            }

            // Step 2: Convert cleaned to string and call recursion
            return isPalindrome(cleaned.toString(), 0);
        }


        private boolean isPalindrome(String s, int i){
            int n = s.length();
            if(i>=n/2){
                return true;
            }
            if(s.charAt(i) != s.charAt(n-i-1)){
                return false;
            }
            return isPalindrome(s , i+1);
        }
    }

}
