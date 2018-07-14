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
     *
     * 657. Judge Route Circle
     *
     * Question Description:
     * Initially, there is a Robot at position (0, 0). Given a sequence of its moves, judge if this robot makes a circle,
     * which means it moves back to the original place.
     * The move sequence is represented by a string. And each move is represent by a character. The valid robot moves
     * are R (Right), L (Left), U (Up) and D (down). The output should be true or false representing whether the robot
     * makes a circle.
     *
     * Date:2018/7/14 10:00 AM
     * @param moves
     * @return
     */
    public boolean judgeCircle(String moves) {
        char[] movesList = moves.toCharArray();
        int[] count = {0, 0, 0, 0};
        for(int i=0; i<movesList.length; i++){
            switch (movesList[i]){
                case 'U':
                    count[0]+=1;
                    break;
                case 'D':
                    count[1]+=1;
                    break;
                case 'L':
                    count[2]+=1;
                    break;
                case 'R':
                    count[3]+=1;
                    break;
            }
        }
        if(count[0]!=count[1] || count[2]!=count[3]){
            return false;
        }
        else{
            return true;
        }
    }


    /**
     *
     * 852. Peak Index in a Mountain Array
     *
     * Question Description:
     * Let's call an array A a mountain if the following properties hold:
     * A.length >= 3
     * There exists some 0 < i < A.length - 1 such that A[0] < A[1] < ... A[i-1] < A[i] > A[i+1] > ... > A[A.length - 1]
     * Given an array that is definitely a mountain, return any i such that A[0] < A[1] < ... A[i-1] < A[i] > A[i+1] >
     * ... > A[A.length - 1].
     *
     * @param A
     * @return
     */
    public int peakIndexInMountainArray(int[] A) {
        int temp = -1;

        for(int i=0; i<A.length; i++){
            if(A[i]>temp){
                temp = A[i];
            }
            else{
                return i-1;
            }
        }
        return 0;
    }

    /**
     * 867. Transpose Matrix
     *
     * Question Description:
     * Given a matrix A, return the transpose of A.
     * The transpose of a matrix is the matrix flipped over it's main diagonal, switching the row and column indices of
     * the matrix.
     *
     * @param A
     * @return
     */
    public int[][] transpose(int[][] A) {
        int[][] transpose = new int[A[0].length][A.length];
        for(int i=0; i<A.length; i++){
            for(int j=0; j<A[i].length; j++){
                transpose[j][i] = A[i][j];
            }
        }
        return transpose;

    }


}
