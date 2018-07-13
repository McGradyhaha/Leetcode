import java.util.Arrays;

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
     * 771. Question Description:
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
}
