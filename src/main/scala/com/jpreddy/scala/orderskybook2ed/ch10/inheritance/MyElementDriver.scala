package com.jpreddy.scala.orderskybook2ed.ch10.inheritance

object MyElementDriver extends App {

	val myEle = new MyElement("JPReddy")
	println(myEle.name)
	println(myEle.getFirstName())
	println(myEle.getFirstName)

	val ch : Char = 's'
	val line = ch.toString*10;
	println(line)
	Array.fill(2)(line)
}