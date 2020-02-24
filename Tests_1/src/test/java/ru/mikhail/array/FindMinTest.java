package ru.mikhail.array;

import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

public class FindMinTest {
    @Test
    public void whenMin(){
        assertThat(FindMin.findMin(
                new int[]{0, 3, 5}),
                is(0));
    }
    @Test
    public void whenMin2(){
        assertThat(FindMin.findMin(
                new int[]{3, 0, 5}),
                is(0));
    }
    @Test
    public void whenMin3(){
        assertThat(FindMin.findMin(
                new int[] {5, 8, 4, 1}),
                is(1));
    }
}
