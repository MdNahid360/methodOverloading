package com.mycompany.overloading;
 class over
 {
 int cal(int x,int y)
 {
    int z;
    z = x+y;
    System.out.println("Usint summation Method");
    System.out.println("Result is : "+z);
    return 0;
 }
 float cal(float m1, float m2)
 {
   float mark;
    mark = m1+m2;
    System.out.println("Usint float Method");
    System.out.println("Mark is : "+mark);
    return 0;
 }
 int cal(int x)
 {
  System.out.println("Using input/out Method");
  System.out.println(x);
  return 0;
 }
 }
public class Overloading {

    public static void main(String[] args) {
       over s=new over();
       s.cal(34.25f, 50.26f);
       s.cal(25);
       s.cal(23,10);
    }
}
