package ru.mikhail.array;

import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

public class SortSelectedTest {
    @Test
    public void whenSort(){
        int[] input = new int[]{3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(input);
        int[] expected = {1, 2, 3, 4, 5};
        assertThat(result, is(expected));
    }
    @Test
    public void whenSort2(){
        int[] input = new int[]{3, 1, 2};
        int[] result = SortSelected.sort(input);
        int[] expected = {1, 2, 3};
        assertThat(result, is(expected));
    }
    @Test
    public void whenSort3(){
        int[] input = new int[] {18, 15, 12, 19, 20, 11, 10, 14, 13, 16, 17};
        int[] result = SortSelected.sort(input);
        int[] expected = {10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        assertThat(result, is(expected));
    }
}
