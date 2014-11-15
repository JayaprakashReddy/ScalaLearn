package tutorial.java_scala

import java.util.{Date, Locale}
import java.text.DateFormat
//import java.text.DateFormat._
object FrenchDate {
def main(args: Array[String]) {
val now = new Date
val df = DateFormat.getDateInstance(DateFormat.LONG, Locale.FRENCH)
println(df format now)
}
}