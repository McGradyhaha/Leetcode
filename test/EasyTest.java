import org.junit.Test;

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
    public  void hammingDistanceTest(){
        int result = test.hammingDistance(1,4);
        assertEquals(2, result);
    }



}