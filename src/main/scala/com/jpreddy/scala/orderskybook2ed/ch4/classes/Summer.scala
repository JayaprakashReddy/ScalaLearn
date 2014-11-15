package com.jpreddy.scala.orderskybook2ed.ch4.classes

import com.jpreddy.scala.orderskybook2ed.ch4.classes.ChecksumAccumulator.calculate

object Summer {
  
  def main(args : Array[String]): Unit ={
    
    for( arg <- args)
    {
      println( arg +":"+calculate(arg) )
    }
    
  }

}