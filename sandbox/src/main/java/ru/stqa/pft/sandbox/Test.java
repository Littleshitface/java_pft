package ru.stqa.pft.sandbox;

public class Test {
  public static void main(String[] args){
    Point p1 = new Point(5, 4);
    Point p2 = new Point(9, 9);
    System.out.println("Расстояние между точкой A и B = " + distance(p1, p2));
  }

  public static double distance (Point p1, Point p2){
    return Math.sqrt((p2.x - p1.x) * (p2.x - p1.x) + (p2.y - p1.y) * (p2.y - p1.y));
  }
}
