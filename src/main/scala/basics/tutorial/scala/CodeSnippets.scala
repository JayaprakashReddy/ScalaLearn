package basics.tutorial.scala

object CodeSnippets {

	def main(args: Array[String]): Unit = {
			//			comparisonValVar
			//			usageDataTypes
//			usageFunctions
//			usageFuncAsParam
//			getFileLineCount
			stringInterpolation
	}

	private def comparisonValVar: Unit = {
					val a = 1+2
							println(a)

					/* val can not be reassigned */
					//    a= a+4;
					//    println(a)
					var b = 3+1
					println(b)
					b = b+3
					println(b)

			}
	private def usageDataTypes: Unit = {
						val a : Int = 24
								val amul = a* 3
								println(amul)

					val b = 1.+(2)  //Int 
					val c= 1.0 + 2 //Double
					println(b)
					println(c)


					}
	private def usageFunctions: Unit =
						{
						val d = inc(5)
								println(d)

						}
					def inc(x:Int): Int = { return x+1 }
					def inc1(x:Int) = { x+1 }
					def inc2 = (x : Int ) => { x+1  }
	private def usageFuncAsParam: Unit = 
	{
							val l= List(1,3,6).map(inc)
									println(l)

									val m =List(1,3,6).map(inc1)
									println(m)

									val n = List(1,3,6).map(inc2);
							println(n);
	}

	private def getFileLineCount: Unit =
	{

	 val src = scala.io.Source.fromFile("C:\\JP\\WS\\test\\test1.txt");
	 val cnt = src.getLines.map( x => 1).sum
	 println("total number of lines = "+ cnt)
}
	
	private def stringInterpolation: Unit =
	{
	  val name = "JPReddy"
	    val fname =s"Hello Mr. $name . How are you doing?"
	    println(fname)
	  
	  val height =1.65f
	  val nameF = f"This is $name%s. He is $height%2.2f meters tall"
	  println(nameF);
	  
	  val first :: rest = List(1, 2, 3)
	  println(first)
	  println(rest)
	}

}