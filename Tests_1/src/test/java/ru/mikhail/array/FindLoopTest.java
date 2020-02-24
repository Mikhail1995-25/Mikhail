package ru.mikhail.array;
import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

public class FindLoopTest {
    @Test
    public void whenFirst(){
        int[] input = new int[] {1, 4, 5, 2, 9};
        int value = 1;
        int result = FindLoop.Min(input, value);
        int expect = 0;
        assertThat(result, is(expect));
    }
    @Test
    public void whenSecond(){
        int[] input = new int[]{7, 9, 3, 1, 10, 11, 4};
        int value = 1;
        int result = FindLoop.Min(input, value);
        int expect = 3;
        assertThat(result, is(expect));
    }
    @Test
    public void whenSort(){
        int[] input = new int[] {3, 4, 2, 5, 6, 1, 10};
        int value = 1;
        int start = 3;
        int finish = 6;
        int result = FindLoop.Min(input, value, start, finish);
        int expect = 5;
        assertThat(result, is(expect));
    }
    @Test
    public void whenSort2() {
        int[] input = new int[]{9, 3, 2, 5, 4, 1, 10, 11};
        int value = 1;
        int start = 2;
        int finish = 6;
        int result = FindLoop.Min(input, value, start, finish);
        int expect = 5;
        assertThat(result, is(expect));
    }
}
