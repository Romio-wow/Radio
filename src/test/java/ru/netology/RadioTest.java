package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    Radio radio = new Radio();

    @Test
    void nextStation() {
        radio.setCurrentStation(5);
        radio.setMaxStation(9);
        radio.nextStation();
        int actual = radio.getCurrentStation();
        int expected = 6;
        assertEquals(expected, actual);
    }

    @Test
    void nextStation2() {
        radio.setCurrentStation(9);
        radio.setMaxStation(9);
        radio.setMinStation(0);
        radio.nextStation();
        int actual = radio.getCurrentStation();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    void previousStation() {
        radio.setCurrentStation(5);
        radio.setMinStation(0);
        radio.previousStation();
        int actual = radio.getCurrentStation();
        int expected = 4;
        assertEquals(expected, actual);
    }

    @Test
    void previousStation2() {
        radio.setCurrentStation(0);
        radio.setMaxStation(9);
        radio.setMinStation(0);
        radio.previousStation();
        int actual = radio.getCurrentStation();
        int expected = 9;
        assertEquals(expected, actual);
    }

    @Test
    void volumeUp() {
        radio.setCurrentVolume(5);
        radio.setMaxVolume(10);
        radio.volumeUp();
        int actual = radio.getCurrentVolume();
        int expected = 6;
        assertEquals(expected, actual);

    }

    @Test
    void volumeUp2() {
        radio.setCurrentVolume(10);
        radio.setMaxVolume(10);
        radio.volumeUp();
        int actual = radio.getCurrentVolume();
        int expected = 10;
        assertEquals(expected, actual);

    }

    @Test
    void volumeDown() {
        radio.setCurrentVolume(5);
        radio.setMinVolume(0);
        radio.volumeDown();
        int actual = radio.getCurrentVolume();
        int expected = 4;
        assertEquals(expected, actual);
    }

    @Test
    void volumeDown2() {
        radio.setCurrentVolume(0);
        radio.setMinVolume(0);
        radio.volumeDown();
        int actual = radio.getCurrentVolume();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    void setCurrentStation() {
        radio.setCurrentStation(13);
        radio.setMaxStation(10);
        int actual = radio.getCurrentStation();
        int expected = 5;
        assertEquals(expected, actual);
    }

    @Test
    void setCurrentStation2() {
        radio.setCurrentStation(-1);
        radio.setMinStation(0);
        int actual = radio.getCurrentStation();
        int expected = 5;
        assertEquals(expected, actual);
    }

    @Test
    void setCurrentVolume() {
        radio.setCurrentVolume(11);
        radio.setMaxVolume(10);
        int actual = radio.getCurrentVolume();
        int expected = 4;
        assertEquals(expected, actual);
    }

    @Test
    void setCurrentVolume2() {
        radio.setCurrentVolume(-2);
        radio.setMinVolume(0);
        int actual = radio.getCurrentVolume();
        int expected = 4;
        assertEquals(expected, actual);
    }
}