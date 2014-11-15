package com.jpreddy.scala.orderskybook2ed.ch9.controlabstraction

import java.io.File
import java.io.PrintWriter

object TestNewControlStructure extends App {
  
  
    def writeWithPrintwriter(file: File)(op: PrintWriter => Unit){
      val writer1 = new PrintWriter(file)
      
      try{
        op(writer1)
      }
      finally {
        writer1.close()
      }
      
    }
    
    val myfunc = writeWithPrintwriter(new File("resources/myfile.txt"))_
    myfunc( mywriter => mywriter.println(new java.util.Date()))
    

}