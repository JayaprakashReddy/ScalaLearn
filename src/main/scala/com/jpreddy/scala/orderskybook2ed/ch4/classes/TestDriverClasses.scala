package com.jpreddy.scala.orderskybook2ed.ch4.classes

object TestDriverClasses extends App {
  val checksumAccumulator = new ChecksumAccumulator;
  checksumAccumulator.add(4);
  checksumAccumulator.add(6);
  println(  checksumAccumulator.checksum());
  
  checksumAccumulator.add(10);
  println(  checksumAccumulator.checksum());
  
  println( ChecksumAccumulator.calculate("Hello"))
  

}