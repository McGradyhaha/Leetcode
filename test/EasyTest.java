import org.junit.Test;
import java.util.*;

import static org.junit.Assert.*;

public class EasyTest {

    Easy test = new Easy();

    @Test
    public void numJewelsInStonesTest(){

        int result = test.numJewelsInStones("aA", "aAAbbbb");

        assertEquals(3, result);
    }

    @Test
    public void toLowerCaseTest(){
        String result = test.toLowerCase("aAAbbbb");
        assertEquals("aaabbbb", result);
    }

    @Test
    public void uniqueMorseRepresentationsTest(){
        String[] para = {"gin", "zen", "gig", "msg"};
        int result = test.uniqueMorseRepresentations(para);
        assertEquals(2,result);
    }

    @Test
    public void flipAndInvertImageTest(){
        int[][] input=    {{1,1,0,0},{1,0,0,1},{0,1,1,1},{1,0,1,0}};
        int[][] result =  test.flipAndInvertImage(input);
        int[][] expected = {{1,1,0,0},{0,1,1,0},{0,0,0,1},{1,0,1,0}};
        assertArrayEquals(expected, result);
    }

    @Test
    public void hammingDistanceTest(){
        int result = test.hammingDistance(1,4);
        assertEquals(2, result);
    }

    @Test
    public void judgeCircleTest(){
        boolean result = test.judgeCircle("UDDLLRRU");
        assertEquals(true, result);
    }

    @Test
    public void peakIndexInMountainArrayTest(){
        int[] input = {0,10,5,2};
        int result = test.peakIndexInMountainArray(input);
        assertEquals(1, result);
    }

    @Test
    public void transposeTest(){
        int[][] input = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] result = test.transpose(input);
        int[][] expected = {{1,4,7},{2,5,8},{3,6,9}};
        assertArrayEquals(expected,result);

    }

    @Test
    public void selfDividingNumbersTest(){
        List<Integer> result = test.selfDividingNumbers(1,22);
        List<Integer> expected = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 15, 22);
        assertEquals(expected,result);
    }

    @Test
    public void arrayPairSumTest(){
        int[] input = {1,4,3,2};
        int result = test.arrayPairSum(input);
        assertEquals(4, result);
    }

    @Test
    public void binaryGapTest(){
        int result5 = test.binaryGap(13);
        assertEquals(2, result5);
    }


}