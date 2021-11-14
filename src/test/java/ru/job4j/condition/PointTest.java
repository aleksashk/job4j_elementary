package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void when00to20then2() {
        double expected = 2;
        Point point1 = new Point(0, 0);
        Point point2 = new Point(2, 0);
        double out = point1.distance(point2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when11to23then2dot23() {
        double expected = 2.23;
        Point point1 = new Point(1, 1);
        Point point2 = new Point(2, 3);
        double out = point1.distance(point2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when44to12then3dot6() {
        double expected = 3.6;
        Point point1 = new Point(4, 4);
        Point point2 = new Point(1, 2);
        double out = point1.distance(point2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when12to21then1dot41() {
        double expected = 1.41;
        Point point1 = new Point(1, 2);
        Point point2 = new Point(2, 1);
        double out = point1.distance(point2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when00to330then4dot24() {
        double expected = 4.24;
        Point point1 = new Point(0, 0);
        Point point2 = new Point(3, 3);
        double out = point1.distance(point2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when24to42then2dot82() {
        double expected = 2.82;
        Point point1 = new Point(2, 4);
        Point point2 = new Point(4, 2);
        double out = point1.distance(point2);
        Assert.assertEquals(expected, out, 0.01);
    }
}