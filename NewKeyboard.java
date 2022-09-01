// In KMIT institution there is a special keyboard designed by a student.
// It contains only one row of 26-keys, keys[], each key indicates a unique letter 
// in the alphabet from 'a' to 'z' in the given order.

// The order of keys in that keyboard will be given.
// You need to findout the time taken to type a word.

// The rules to calculate the time is as follows:
// * Initially you will be at the first key .i.e, keys[0].
// * To type a letter, you have to move to the key having desired letter, key[j].
// * Time taken to type the character from key at i-th index to key at j-th index 
//   is |i - j|.

// NOTE: You need to press only one key at a time to type the word.

// INPUT FORMAT:
// -------------
// Line-1: A string S, consists of order of the keys in the keyboard.
// Line-2: A string W, the word to be typed.

// OUTPUT FORMAT:
// --------------
// Print an integer result, the time taken to type the word.


// SAMPLE INPUT-1:
// ---------------
// abcdefghijklmnopqrstuvwxyz

// SAMPLE OUTPUT-1:
// ----------------
// code

// EXPLANATION:
// ------------
// Given word is "code"
// - Time taken to type letter-c: from keys[0] to keys[2] => | 0 - 2 | = 2
// - Time taken to type letter-o: from keys[2] to keys[14] => | 2 - 14 | = 12
// - Time taken to type letter-d: from keys[14] to keys[3] => | 14 - 3 | = 11
// - Time taken to type letter-e: from keys[3] to keys[4] => | 3 - 4 | = 1
// Total time taken is : 26


// SAMPLE INPUT-2:
// ---------------
// poiuytrewqasdfghjklmnbvcxz
// kmit

// SAMPLE OUTPUT-2:
// ----------------
// 39

// EXPLANATION:
// ------------
// Given word is "kmit"
// - Time taken to type letter-k: from keys[0] to keys[17] => | 0 - 17 | = 17
// - Time taken to type letter-m: from keys[17] to keys[19] => | 17 - 19 | = 2
// - Time taken to type letter-i: from keys[19] to keys[2] => | 20 - 2 | = 17
// - Time taken to type letter-t: from keys[2] to keys[5] => | 2 - 5 | = 3
// Total time taken is : 39

import java.util.*;
class fs 
{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str=sc.next();
        String target=sc.next();
        int[] ind = new int[26];
        for(int i=0;i<str.length();i++) ind[str.charAt(i)-97]=i;
        int sum=ind[target.charAt(0)-97];
        for(int i=1;i<target.length();i++) sum+=Math.abs(ind[target.charAt(i)-97]-ind[target.charAt(i-1)-97]);
        System.out.println(sum);
    }
}
