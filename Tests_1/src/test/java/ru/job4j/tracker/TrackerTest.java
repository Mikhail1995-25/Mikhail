package ru.job4j.tracker;

import org.junit.Test;
import ru.mikhail.tracker.Item;
import ru.mikhail.tracker.Tracker;

import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.is;
public class TrackerTest {

    @Test
    public void whenAddNewItemThenTrackerHasSameItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("test1");
        tracker.add(item);
        Item result = tracker.findById(item.getId());
        assertThat(result.getName(), is(item.getName()));
    }
}
