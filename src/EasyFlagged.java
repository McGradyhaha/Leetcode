import java.util.*;

/*
 *
 *Created by WhyK on 7/23/2018
 */
public class EasyFlagged {
    /**
     *
     * 832. Flipping an Image(Flagged)
     *
     * Question Description:
     * Given a binary matrix A, we want to flip the image horizontally, then invert it, and return the resulting image.
     * To flip an image horizontally means that each row of the image is reversed.  For example, flipping [1, 1, 0]
     * horizontally results in [0, 1, 1].
     * To invert an image means that each 0 is replaced by 1, and each 1 is replaced by 0. For example, inverting
     * [0, 1, 1] results in [1, 0, 0].
     *
     * Date:2018/7/13 10:30 AM
     * @param A
     * @return flip and invert result
     */
    public int[][] flipAndInvertImage(int[][] A) {
        int row = A.length;
        int col = A[0].length;
        int[][] R = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                R[i][j] = 1 - A[i][col - 1 - j];
            }
        }
        return R;
    }

    /**
     *
     * 461. Hamming Distance(Flagged)
     *
     * Question Description:
     * The Hamming distance between two integers is the number of positions at which the corresponding bits are different.
     * Given two integers x and y, calculate the Hamming distance.
     *
     * Date:2018/7/13 10:45 AM
     * @param x
     * @param y
     * @return
     */

    public int hammingDistance(int x, int y) {
        return Integer.bitCount(x^y);

    }

    /**
     * 804. Unique Morse Code Words(Flagged)
     * Question Description:
     * International Morse Code defines a standard encoding where each letter is mapped to a series of dots and dashes,
     * as follows: "a" maps to ".-", "b" maps to "-...", "c" maps to "-.-.", and so on.
     *
     * the full table for the 26 letters of the English alphabet is given below:
     * [".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.",
     * "...","-","..-","...-",".--","-..-","-.--","--.."]
     *
     * Date:2018/7/12 6:30 PM
     * @param words
     * @return morse code
     */
    public int uniqueMorseRepresentations(String[] words) {
        String[] morseList = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---"
                ,".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        Set<String> moreseRepre = new HashSet<>();
        for(String word : words){
            String morse= "";
            char[] wList = word.toCharArray();
            for(int i=0; i<wList.length; i++){
                morse += morseList[(wList[i] - 'a')];
            }
            moreseRepre.add(morse);
        }
        return moreseRepre.size();
    }

    /**
     * 476. Number Complement(Flagged)
     *
     * Question Description
     * Given a positive integer, output its complement number. The complement strategy is to flip the bits of its binary
     * representation.
     *
     * Note:
     * The given integer is guaranteed to fit within the range of a 32-bit signed integer.
     * You could assume no leading zero bit in the integer’s binary representation.
     * @param num
     * @return
     */
    public int findComplement(int num) {
        int i = 0;
        int j = 0;
        while (i < num) {
            i += Math.pow(2, j);
            j++;
        }
        return i - num;
    }


    /**
     * 344. Reverse String(Flagged)
     *
     * Question Description
     * Write a function that takes a string as input and returns the string reversed.
     * Example:
     * Given s = "hello", return "olleh".
     *
     * @param s
     * @return
     */
    public String reverseString(String s) {
        String reverse = "";
        for(int i = s.length() - 1; i >= 0; i--) {
            reverse = reverse + s.charAt(i);
        }
        return reverse;
    }

    /**
     * 821. Shortest Distance to a Character（Flagged）
     *
     * Question Description:
     * Given a string S and a character C, return an array of integers representing the shortest distance from the
     * character C in the string.
     *
     * Input: S = "loveleetcode", C = 'e'
     * Output: [3, 2, 1, 0, 1, 0, 0, 1, 2, 2, 1, 0]
     *
     * @param S
     * @param C
     * @return
     */
    public int[] shortestToChar(String S, char C) {
        char[] sList = S.toCharArray();
        int[] iList = new int[sList.length];
        ArrayList<Integer> target = new ArrayList();
        for(int i=0; i<sList.length; i++){
            if(sList[i] == C){
                target.add(i);
            }
        }
        for(int i=0; i<sList.length; i++){
            int min = sList.length+1;
            int temp;
            if(sList[i]==C){
                min = 0;
                iList[i]=min;
            }
            else{
                for(int j=0; j<target.size(); j++){
                    temp = Math.abs(target.get(j)-i);
                    if(temp<min){
                        min=temp;
                    }
                }
                iList[i]=min;
            }
        }
        return iList;
    }

}
