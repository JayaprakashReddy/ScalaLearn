package com.jpreddy.scala.orderskybook2ed.ch6.funcobjects

object TestApp {
  
  def main(args : Array[String])
  {
    val rational1 = new Rational(2,3);
    println(rational1);
    
//    val rational2 = new Rational(2,0);
    val rational2 = new Rational(2,4);
    println(rational2);
    
    println(rational1.add(rational2))
  }

}