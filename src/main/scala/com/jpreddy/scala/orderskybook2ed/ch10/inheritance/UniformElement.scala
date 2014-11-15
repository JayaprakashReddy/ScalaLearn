package com.jpreddy.scala.orderskybook2ed.ch10.inheritance

class UniformElement(val ch: Char,
                    override val height: Int,
                    override val width : Int) extends Element {
  
  val line = ch.toString * width
  override def contents = Array.fill(height)(line);

}