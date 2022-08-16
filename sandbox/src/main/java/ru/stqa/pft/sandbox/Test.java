package ru.stqa.pft.sandbox;

public class Test {
  public static void main(String[] args){
    Point p1 = new Point();
    Point p2 = new Point();
    p1.x = 5;
    p2.x = 9;
    p1.y = 4;
    p2.y = 9;
    System.out.println("Расстояние между точкой A и B = " + distance(p1, p2));
  }

  public static double distance (Point p1, Point p2){
    return Math.sqrt((p2.x - p1.x) * (p2.x - p1.x) + (p2.y - p1.y) * (p2.y - p1.y));
  }
}
