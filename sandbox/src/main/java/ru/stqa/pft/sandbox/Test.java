package ru.stqa.pft.sandbox;

public class Test {
  public static void main(String[] args){
    Point p1 = new Point(5, 4);
    Point p2 = new Point(9, 9);
    System.out.println("Расстояние между точкой A и B = " + p1.distance(p2));
  }

  //public static double distance (Point p1, Point p2){
   // return Math.sqrt(Math.pow((p2.x - p1.x), 2) + Math.pow((p2.y - p1.y), 2));
  //}
}
