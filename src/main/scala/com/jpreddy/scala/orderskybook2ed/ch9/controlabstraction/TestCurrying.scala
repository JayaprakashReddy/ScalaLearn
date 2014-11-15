package com.jpreddy.scala.orderskybook2ed.ch9.controlabstraction

object TestCurrying extends App {
  
  private def  action(a : Int)(x: Int, y: Int): Int = {
    
    var data : Int = 0
    if(a == 0)
        data = x + y
    else
        data =  x -y
        data
    
  }
  
  val sum = action(0)_
  println(sum(5,3))
  
  val diff = action(1)_
  println(diff(5,3))
  
  
  

}