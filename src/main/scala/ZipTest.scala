object ZipTest extends App {

  val ar1 = Array("JP ","Sammu ");
  val ar2 = Array("Suchi","Redddy");
  val  a3 = ar1 zip ar2
  for(s <- a3)
    println(s)
  val a4 = for( (line1,line2) <- a3) yield line1 + line2
  
  val a4String =a4 mkString "\n"
  println(a4String)
  
}