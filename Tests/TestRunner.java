// javac -cp .:junit-4.12.jar:hamcrest-core-1.3.jar TestRunner.java
// java -cp .:junit-4.12.jar:hamcrest-core-1.3.jar org.junit.runner.JUnitCore TestRunner

import org.junit.Assert;
import org.junit.Test;

public class TestRunner {

    @Test
    public void sampleTest() {
        Minimax test = new Minimax(new int[] {1, 2, 3, 4, 5, 6, 7, 8});
        Assert.assertEquals(test.getHead().getValue(), 6);
    }
    
    @Test
    public void negativesTest() {
        Minimax test = new Minimax(new int[] {-10, 40, 20, 100});
        Assert.assertEquals(test.getHead().getValue(), 20);
    }
    
    @Test
    public void longTest() {
        Minimax test = new Minimax(new int[] {0, 5, -5, 10, 7, 8, 1, 1, 3, -6, 9, 8, 14, -8, 6, -1});
        Assert.assertEquals(test.getHead().getValue(), 0);
    }
    
    @Test
    public void treeBranchesTest() {
        Minimax test = new Minimax(new int[] {0, 5, -5, 10, 7, 8, 1, 1, 3, -6, 9, 8, 14, -8, 6, -1});
        Assert.assertEquals(test.getHead().getValue(), 0);
        Assert.assertEquals(test.getHead().getLeftChild().getValue(), 0);
        Assert.assertEquals(test.getHead().getRightChild().getValue(), -1);
    }
    
    @Test
    public void binaryTest() {
        Minimax test3 = new Minimax(new int[] {-1, 1});
        Assert.assertEquals(test3.getHead().getValue(), 1);
    }
    
    @Test
    public void sameTest() {
        Minimax test3 = new Minimax(new int[] {1, 1, 1, 1});
        Assert.assertEquals(test3.getHead().getValue(), 1);
    }
    

}