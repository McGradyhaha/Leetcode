import java.util.*;


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
     * Date:2018/7/14 10:15 AM
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
     * Date:2018/7/14 10:30 AM
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


    /**
     * 728. Self Dividing Numbers
     *
     * Question Description:
     * A self-dividing number is a number that is divisible by every digit it contains.
     * For example, 128 is a self-dividing number because 128 % 1 == 0, 128 % 2 == 0, and 128 % 8 == 0.
     * Also, a self-dividing number is not allowed to contain the digit zero.
     * Given a lower and upper number bound, output a list of every possible self dividing number, including the bounds
     * if possible.
     *
     * Date:2018/7/16 9:00 AM
     * @param left
     * @param right
     * @return
     */
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> dividedList = new ArrayList<>();

        for(int i=left; i<right+1; i++){
            boolean flag = true;
            char[] tmp = Integer.toString(i).toCharArray();
            for(int j=0; j<tmp.length; j++){
                int test = Character.getNumericValue(tmp[j]);
                if(test==0){
                    flag = false;
                    break;
                }
                else{
                    if(i%test !=0) {
                        flag = false;
                        break;
                    }
                }
            }
            if(flag == true){
                dividedList.add(i);
            }
        }
        return dividedList;
    }

    /**
     * 561. Array Partition I
     *
     * Question Description:
     * Given an array of 2n integers, your task is to group these integers into n pairs of integer, say (a1, b1),
     * (a2, b2), ..., (an, bn) which makes sum of min(ai, bi) for all i from 1 to n as large as possible.
     *
     * Date:2018/7/16 9:15 AM
     * @param nums
     * @return
     */
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum=0;
        for(int i=0; i<nums.length; i+=2){
            sum+=nums[i];
        }
        return sum;
    }


    /**
     * 868. Binary Gap
     * Question Description:
     * Given a positive integer N, find and return the longest distance between two consecutive 1's in the binary
     * representation of N.
     * If there aren't two consecutive 1's, return 0.
     *
     * Date:2018/7/16 9:45 AM
     * @param N
     * @return
     */
    public int binaryGap(int N) {
        String trans = Integer.toBinaryString(N);
        char[] charList = trans.toCharArray();
        boolean start = false;
        int maxGap = 0;
        int gap = 0;
        for(int i=0; i<charList.length; i++){
            if(charList[i]=='1' && start==false){
                start = true;
            }
            else if(charList[i]=='0' && start==true){
                gap+=1;
            }
            else if(charList[i]=='1' && start==true){
                gap+=1;
                start = false;
                if(gap>maxGap){
                    maxGap = gap;
                }
                i-=1;
                gap=0;
            }
            else{
                continue;
            }
        }
        return maxGap;
    }


    /**
     * 806. Number of Lines To Write String
     *
     * Question Description
     * We are to write the letters of a given string S, from left to right into lines. Each line has maximum width 100
     * units, and if writing a letter would cause the width of the line to exceed 100 units, it is written on the next
     * line. We are given an array widths, an array where widths[0] is the width of 'a', widths[1] is the width of 'b',
     * ..., and widths[25] is the width of 'z'.
     *
     * Example :
     * Input:
     * widths = [4,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10]
     * S = "bbbcccdddaaa"
     * Output: [2, 4]
     * Explanation:
     * All letters except 'a' have the same length of 10, and
     * "bbbcccdddaa" will cover 9 * 10 + 2 * 4 = 98 units.
     * For the last 'a', it is written on the second line because
     * there is only 2 units left in the first line.
     * So the answer is 2 lines, plus 4 units in the second line.
     * Now answer two questions: how many lines have at least one character from S, and what is the width used by the
     * last such line? Return your answer as an integer list of length 2.
     *
     * @param widths
     * @param S
     * @return
     */
    public int[] numberOfLines(int[] widths, String S) {

        int lines = 0;
        int plus = 0;
        int[] result =new int[2];
        char[] sList = S.toCharArray();
        if(sList.length!=0){
            lines+=1;
            for(int i=0; i<sList.length; i++){
                if(plus + widths[(sList[i] - 'a')]>100){
                    lines+=1;
                    plus=0;
                    i-=1;
                }
                else{
                    plus += widths[(sList[i] - 'a')];
                }
            }
            result[0]=lines;
            result[1]=plus;
            return result;
        }
        else{
            result[0]=lines;
            result[1]=plus;
            return result;
        }

    }




    /**
     * 557. Reverse Words in a String III
     *
     * Question Description
     * Given a string, you need to reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.
     *
     * Example 1:
     * Input: "Let's take LeetCode contest"
     * Output: "s'teL ekat edoCteeL tsetnoc"
     *
     * @param s
     * @return
     */
    public String reverseWords(String s) {
        String reverse = "";
        String reverseSet = "";
        s = " "+s;
        for(int i= s.length()-1; i>=0; i--){
            reverse+=s.charAt(i);
            if(s.charAt(i) ==' '){
                reverseSet = reverse + reverseSet;
                reverse = "";
            }
        }
        return reverseSet.substring(0, reverseSet.length()-1);
    }




















}
