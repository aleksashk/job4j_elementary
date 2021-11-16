package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class MaxTest {

    @Test
    public void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax5To4Then5() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax1000To5427Then5427() {
        int left = 1000;
        int right = 5427;
        int result = Max.max(left, right);
        int expected = 5427;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax1To1Then1() {
        int left = 1;
        int right = 1;
        int result = Max.max(left, right);
        int expected = 1;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax1To2And3Then3() {
        int left = 1;
        int center = 2;
        int right = 3;
        int result = Max.max(left, center, right);
        int expected = 3;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax5To4And4Then5() {
        int left = 5;
        int center = 4;
        int right = 4;
        int result = Max.max(left, center, right);
        int expected = 5;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax1000To5427AndMinus8Then5427() {
        int left = 1000;
        int center = 5427;
        int right = -8;
        int result = Max.max(left, center, right);
        int expected = 5427;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax1To1And1Then1() {
        int left = 1;
        int center = 1;
        int right = 1;
        int result = Max.max(left, center, right);
        int expected = 1;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax1And2AndMinus1And3Then3() {
        int first = 1;
        int second = 2;
        int third = -1;
        int fourth = 3;
        int result = Max.max(first, second, third, fourth);
        int expected = 3;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax0And0And0And0Then0() {
        int first = 0;
        int second = 0;
        int third = 0;
        int fourth = 0;
        int result = Max.max(first, second, third, fourth);
        int expected = 0;
        Assert.assertEquals(result, expected);
    }
}