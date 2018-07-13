import java.util.*;
import java.math.*;

/**
 * Project Name: Leetcode
 * Package Name:
 * Description: Easy Level Questions
 * Author: WhyK
 * Date:2018/7/12 6:00 PM
 * Copyright (c) 2018, mcgradyhaha@gmail.com All Rights Reserved.
 */


public class Easy {

    /**
     *
     * 771. Jewels and Stones
     * Question Description:
     * You're given strings J representing the types of stones that are jewels, and S representing the stones you have.
     * Each character in S is a type of stone you have.  You want to know how many of the stones you have are also jewels.
     * The letters in J are guaranteed distinct, and all characters in J and S are letters. Letters are case sensitive,
     * so "a" is considered a different type of stone from "A".
     *
     * Date:2018/7/12 6:00 PM
     * @param J
     * @param S
     * @return The number of Jewels in Stones
     */
    public int numJewelsInStones(String J, String S) {
        int num = 0;
        char[] jList = J.toCharArray();
        char[] sList = S.toCharArray();

        for(char x : sList){
            for(char y: jList){
                if(x == y){
                    num++;
                }
            }
        }
        return num;
    }

    /**
     * 709. To Lower Case
     * Question Description:
     * Implement function ToLowerCase() that has a string parameter str, and returns the same string in lowercase.
     *
     * Date:2018/7/12 6:15 PM
     * @param str
     * @return lowercase String
     */
    public String toLowerCase(String str) {
        return str.toLowerCase();
    }

    /**
     * 804. Unique Morse Code Words
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
     *
     * 832. Flipping an Image
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
     * 461. Hamming Distance
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


}
