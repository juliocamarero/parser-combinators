package com.blogspot.miguelinlas3.phd.verification.main

import com.blogspot.miguelinlas3.phd.verification.profiler.visitor.ExecutionVisitor

/**
 * Created by IntelliJ IDEA.
 * User: migue
 * Date: 3/29/11
 * Time: 5:44 PM
 * To change this template use File | Settings | File Templates.
 */

object Profile{
  def main(args:Array[String]):Unit = {

      val result = new ExecutionVisitor().execute(args.head,args.tail)

      println("Result: " + result.result)
      println("Count: " + result.numOfExectutions)


  }
}