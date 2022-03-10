package at.campus02.example;

import org.junit.Assert;
import org.junit.Test;

public class TestFaultOne {
    @Test(expected = NullPointerException.class)
    public void expectException(){
        int res = FaultOne.numZero(null);
    }

    @Test
    public void zeroAtEnd(){
        int res = FaultOne.numZero(new int[] {1,2,3,0});
        Assert.assertEquals(1, res);
    }


    @Test
    public void zeroAtStart(){
        int res = FaultOne.numZero(new int[] {0,1,2,3});
        Assert.assertEquals(1, res);
    }




}
