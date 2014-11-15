package com.jpreddy.scala.orderskybook2ed.ch8.closures

object LongLinesDriver extends App {


	LongLines.processFile("resources/mydata.txt", 20)
//	funcLiterals()
//	closures()
//	echo("sammu","suchi","JP")
//    println(calulateInterest(100,.10f))
//    println(calulateInterest(100))
//    println(calulateInterest(200,rate = .10f))
    
    println(factorial(5))
	private def funcLiterals(){

		var incInt = (x : Int) => x +1
				println(incInt(3))

		var conciseIncInt = (_ : Int) + 1
		println(conciseIncInt(4))

		var sum = (a : Int,b: Int, c: Int) => a+b+c
		println(sum(1,2,3))

		var conciseIncInt1 = sum(2,_ : Int,3)
		println(conciseIncInt1(2))

		var myList = List ( 23,45,67,78,12)
		myList.foreach( (x: Int) => println(x+1) )

		myList.foreach( x => { print(x+1); print(" "); } )

		println
		var myListFiltered = myList.filter( _ > 30  )
		println(myListFiltered)

		myList.foreach( println _ )
		
		var myListFiltered1 = myList.foreach(
		    x =>
		    {
		     var y = x + 1
		     print(y)
		     print(" ")
		    })
	}
	
	private def closures(){
	  
	  var  more = 25;
	  val myFunc =  (x  :Int)=> x + more
	  println(myFunc(2))
	  
	
	}
	
	private def echo(args : String*)={
	 
	  for(arg <- args)
	    println(arg)
	}
	
	private def calulateInterest(principal :Int,rate : Float = .2f) : Float={
	  
	  val intr = principal * rate
	  
	  intr;
	}
	
	private def factorial(n : Int): Int ={
	  
	  if(n==1)
	    throw new Exception() //1
	  else
	     n * factorial(n-1)
	}

}