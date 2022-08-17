package ru.stqa.pft.sandbox;


import org.junit.Test;
import org.testng.Assert;

public class PointTest {
  @Test
  public void testDistance() {
    Point p1 = new Point(5, 4);
    Point p2 = new Point(9, 9);
    Assert.assertEquals(p1.distance(p2), 6.4031242374328485);
  }
}
