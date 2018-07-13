import org.junit.Test;

import static org.junit.Assert.*;

public class EasyTest {

    @Test
    public void numJewelsInStonesTest(){
        Easy test = new Easy();
        int result = test.numJewelsInStones("aA", "aAAbbbb");   //   test case: Input: J = "aA", S = "aAAbbbb"

        assertEquals(3, result);    //  Output: 3
    }


}