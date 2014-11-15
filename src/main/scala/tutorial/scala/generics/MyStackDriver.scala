package tutorial.scala.generics

object MyStackDriver extends App{
  
  var stack = new MyStack[Int];
  stack.push(2);
  stack.push(45);
  stack.push('d');
  
  println(stack.pop());
  println(stack.pop());
  
  stack.push(3);
  println(stack.pop());
  println(stack.pop());

}