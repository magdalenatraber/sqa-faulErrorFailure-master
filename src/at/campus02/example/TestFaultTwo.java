package at.campus02.example;

import org.junit.Assert;
import org.junit.Test;

public class TestFaultTwo {
    @Test
    public void findNumber() {
        int pos = FaultTwo.findLast(new int[] {2, 3, 5, 8}, 2);
        Assert.assertEquals(0, pos);
    }
    //b)
    @Test(expected = NullPointerException.class)
    public void expectException(){
        int res = FaultTwo.findLast(null,1);
    }
//C)
    @Test
    public void findNumberAtLastposition() {
        int pos = FaultTwo.findLast(new int[] {2, 3, 5, 2}, 2);
        Assert.assertEquals(3, pos);
    }
    //d)
    @Test
    public void NumberNotFound() {
        int pos = FaultTwo.findLast(new int[] {2, 3, 2, 0,3}, 7);
        Assert.assertEquals(-1, pos);
    }

}
