
//Problem Name: 1134 . Check If a Number Is Armstrong Number
//LeetCode Problem ID: 1134
//Difficulty: Easy
//
//🧾 Problem Statement:
//Given an integer n, return true if and only if it is an Armstrong number.
//
//The k-digit number n is an Armstrong number if and only if the kth power of each digit sums to n itself.
//
//Formally:
//Let n = d1d2d3...dk (where di are digits),
//Then
//
//        ini
//Copy
//        Edit
//n == d1^k + d2^k + ... + dk^k
//✅ Example 1:
//vbnet
//        Copy
//Edit
//Input: n = 153
//Output: true
//Explanation: 153 is a 3-digit number, and 153 = 1^3 + 5^3 + 3^3.
//        ✅ Example 2:
//yaml
//        Copy
//Edit
//Input: n = 123
//Output: false
//Explanation: 123 != 1^3 + 2^3 + 3^3 = 36.
//        🔒 Constraints:
//        0 <= n <= 10^8




import java.util.Scanner;


public class Armstrong_number {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        System.out.println("N: " + n);
        boolean isArmstrong = Armstrong_number(n);
        System.out.println("is Armstrong : " + isArmstrong);

        sc.close();
    }

    public static boolean Armstrong_number(int n) {
        int dup = n;  //  duplicate (dup)
        int digits = String.valueOf(n).length(); // count digits
        int sum = 0;
        while (n > 0) {
            int lastDigit = n % 10; // optional
           // sum = sum + (lastDigit * lastDigit * lastDigit);  ---> yeh sirf 3 digits tak he kaam karega
            sum = (int) (sum+Math.pow(lastDigit, digits));
            n /= 10;
        }
        if (dup == sum)
            System.out.println("true");
        else
            System.out.println("false");

        return dup == sum;


}
}
