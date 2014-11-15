package basics.tutorial.scala

import scala.language.dynamics
class MyMap extends Dynamic {
def selectDynamic(fieldName: String) = map.get(fieldName)
private val map = Map("foo" -> "1", "bar" -> 2)
}
