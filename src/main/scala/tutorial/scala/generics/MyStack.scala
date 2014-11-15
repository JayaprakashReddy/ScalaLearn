package tutorial.scala.generics

class MyStack[T] {
  
  var elems: List[T] = Nil
  def push(elem : T): Unit  ={ elems = elem:: elems}
  def pop(): T ={ 
    val  retEle :T =elems.head
    elems = elems.tail
  return  retEle
  }
  
}