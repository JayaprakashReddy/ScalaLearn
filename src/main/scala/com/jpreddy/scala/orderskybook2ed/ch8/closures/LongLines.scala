package com.jpreddy.scala.orderskybook2ed.ch8.closures

import scala.io.Source
object LongLines {

	def processFile(fileName : String, width : Int){

		def processLine(line : String){
			if(line.length() > width)
				println(fileName +":"+line.trim())
		}

		val fileSource = Source.fromFile(fileName)
				for(line <- fileSource.getLines())
					processLine(line)
	}



}