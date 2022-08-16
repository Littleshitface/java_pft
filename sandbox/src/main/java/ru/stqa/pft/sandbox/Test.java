package ru.stqa.pft.sandbox;

public class Test {
  public static void main(String[] args){
    P1 a = new P1();
    P2 b = new P2();
    a.xa = 5;
    b.xb = 9;
    a.ya = 4;
    b.yb = 9;
    System.out.println("Расстояние между точкой A и B = " + distance(a, b));
  }

  public static double distance (P1 a, P2 b){
    return Math.sqrt((b.xb - a.xa) * (b.xb - a.xa) + (b.yb - a.ya) * (b.yb - a.ya));
  }
}
