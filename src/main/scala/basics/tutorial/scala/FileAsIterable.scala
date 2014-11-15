package basics.tutorial.scala

class FileAsIterable {
def iterator = scala.io.Source.fromFile("C:\\JP\\WS\\test\\test1.txt").getLines()
}