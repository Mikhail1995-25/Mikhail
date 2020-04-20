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

    @Test
    public void whenReplace() {
        Tracker tracker = new Tracker();
        Item item = new Item("bug");
        tracker.add(item);
        String id = item.getId();
        Item bugWithDesc = new Item("bug with description");
        tracker.replace(id, bugWithDesc);
        assertThat(tracker.findById(id).getName() , is("bug with description"));
    }
}
