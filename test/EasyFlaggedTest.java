import org.junit.Test;

import static org.junit.Assert.*;

/*
 *
 *Created by WhyK on 7/23/2018
 */public class EasyFlaggedTest {
    EasyFlagged test = new EasyFlagged();


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
    public void uniqueMorseRepresentationsTest(){
        String[] para = {"gin", "zen", "gig", "msg"};
        int result = test.uniqueMorseRepresentations(para);
        assertEquals(2,result);
    }

    @Test
    public void findComplementTest(){
        int result = test.findComplement(5);
        assertEquals(2,result);

    }

    @Test
    public void reverseStringTest(){
        String result = test.reverseString("olleh");
        assertEquals("hello", result);
    }
}