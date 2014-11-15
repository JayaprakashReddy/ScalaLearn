package basics.tutorial.scala

object FileAsIterableMain extends App {

	val newIterator = new FileAsIterable with Iterable[String]
			newIterator.foreach { line => println(line) }
}