package com.jpreddy.scala.orderskybook2ed.ch6.funcobjects

class Rational(n:Int, d:Int) {
  require(d != 0)
  var numerator :Int = n;
  var denominator:Int = d;
  override def toString()= n+"/"+d
  
  def add(rat1 : Rational):Rational ={
    
    val  result = new Rational( this.n+rat1.numerator, this.d+rat1.denominator)
    result
  }
      
  

}