package com.jpreddy.scala.orderskybook2ed.ch4.classes
import scala.collection.mutable.Map

class ChecksumAccumulator {

	private var sum=0;

	def add(byte : Byte):Unit= {
			sum+=byte
	}

	def checksum():Int ={

			return ~(sum & 0xFF) +1
	}

}

object ChecksumAccumulator {

	private val cache = Map[String,Int]();

	def calculate(s : String) :Int = {
			if(cache.contains(s))
				cache(s)
				else
				{
					val  acc = new ChecksumAccumulator()
					for(ch <- s)
						acc.add(ch.toByte)

						val cs  = acc.checksum()
						cache += (s -> cs)
						cs
				}
	}
}