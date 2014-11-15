package com.jpreddy.scala.orderskybook2ed.ch10.inheritance

class LineElement(s : String) extends ArrayElement( Array[String](s)) {
  
  override def width = s.length
  override def height = 1

  
}