package HW3;

import org.junit.jupiter.api.Test;

import static Homework3.Main.isNumberInInterval;
import static org.junit.jupiter.api.Assertions.*;


public class IsNumberInIntervalTest {
    @Test
    public void lowerNumberTest(){
        assertFalse(isNumberInInterval(25));
    }

    @Test
    public void higherNumberTest(){
        assertFalse(isNumberInInterval(100));
    }
    @Test
    public void minNumberInIntervalTest(){IntervalTest(int x){