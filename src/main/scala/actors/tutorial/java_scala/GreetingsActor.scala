package actors.tutorial.java_scala

import akka.actor.Actor
import akka.actor.ActorSystem
import akka.actor.Props
import akka.actor.actorRef2Scala

object GreetingsActor extends App {

case class Name(name: String)

class GreetingsActor extends Actor {
	def receive = {
	case Name(n) => println("Hello " + n)
	}
}
val system = ActorSystem("greetings")
val a = system.actorOf(Props[GreetingsActor], name = "greetings-actor")
a ! Name("Nilanjan")
Thread.sleep(50)
system.shutdown()



}