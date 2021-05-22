package de.htwberlin;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TimeSwitchTest {

    @Test
    void timeSwitcher() {
        TimeSwitch T = new TimeSwitch();
        String actual = "07:05:45 PM";
        String expected = "19:05:45";
        assertEquals(expected, T.timeSwitcher(actual));
    }

    @Test
    void timeSwitcher2() {
        TimeSwitch T = new TimeSwitch();
        String actual = "07:05:32 AM";
        String expected = "07:05:32";
        assertEquals(expected, T.timeSwitcher(actual));
    }
    @Test
    void timeSwitcher3() {
        TimeSwitch T = new TimeSwitch();
        String actual = "12:05:29 PM";
        String expected = "12:05:29";
        assertEquals(expected, T.timeSwitcher(actual));
    }
    @Test
    void timeSwitcher4() {
        TimeSwitch T = new TimeSwitch();
        String actual = "12:05:00 AM";
        String expected = "0:05:00";
        assertEquals(expected, T.timeSwitcher(actual));
    }
}