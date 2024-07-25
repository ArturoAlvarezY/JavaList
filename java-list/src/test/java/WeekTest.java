import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.empty;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.not;

import dev.arturo.models.Week;

public class WeekTest {

    Week week = new Week();

    @Test
    void testAlphabeticOrder() {
        assertThat(week.alphabeticOrder(), contains("friday", "monday", "saturday", "sunday", "thursday", "tuesday", "wednesday"));
    }

    @Test
    void testClearAll() {
        assertThat(week.clearAll(),empty());
    }

    @Test
    void testGetDaysOfTheWeek() {
        assertThat(week.getDaysOfTheWeek(), contains("monday", "tuesday", "wednesday", "thursday", "friday", "saturday", "sunday"));
    }

    @Test
    void testGetSolicitedDay() {
        assertThat(week.getSolicitedDay("monday"), true);
    }

    @Test
    void testItExists() {
        assertThat(week.itExists("MONDAY"), is(true));
    }

    @Test
    void testLongList() {
        assertThat(week.longList(), is(7));
    }

    @Test
    void testRemoveArgument() {
        assertThat(week.removeArgument("monday"), is(true));
        assertThat(week, not("monday"));

    }
}
