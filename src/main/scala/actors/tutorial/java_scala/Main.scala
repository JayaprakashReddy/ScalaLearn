package actors.tutorial.java_scala

import akka.actor.ActorSystem
import akka.actor.Props

object Main {
  def main(args: Array[String]) {
    val system = ActorSystem("word-count-system")
    
    val m = system.actorOf(Props[WordCountMaster], name="master")
    m ! StartCounting("C:\\JP\\WS\\test1\\", 2)
  }
}
