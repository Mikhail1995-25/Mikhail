package ru.mikhail.array;

import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

public class MinDiapasonTest {
    @Test
    public void whenMin(){
        assertThat(MinDiapason.findMin(
                new int[] {2, 9, 12, 0, 3, 8},
                2, 5),
                is(0));
    }
    @Test
    public void whenMin2(){
        assertThat(MinDiapason.findMin(
                new int[] {10, 5, 3, 1, 8},
                1, 4),
                is(1));
    }
}
