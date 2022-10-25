import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class IsLeapYearTest {

    @Test
    public void Checks_if_leap_year_when_year_dividable_by_4_but_not_100() {
        assertTrue(LeapYear.isLeapYear(2020));
    }

    @Test
    public void Checks_if_leap_year_when_year_dividable_by_400() {
        assertTrue(LeapYear.isLeapYear(2000));
    }

    @Test
    public void Checks_if_not_leap_year_when_year_not_dividable_by_4() {
        assertFalse(LeapYear.isLeapYear(2021));
    }

    @Test
    public void Checks_if_not_leap_year_when_year_dividable_by_100_but_not_400() {
        assertFalse(LeapYear.isLeapYear(1900));
    }



}
