package com.blogspot.miguelinlas3.phd.verification.instruction

import com.blogspot.miguelinlas3.phd.verification.stack.ExecutionContext

/**
 * Created by IntelliJ IDEA.
 * User: migue
 * Date: 3/20/11
 * Time: 10:58 PM
 * To change this template use File | Settings | File Templates.
 */

class ISumInstruction(n: String) extends BytecodeInstruction(n) {
  def execute(context: ExecutionContext[Double]): Unit = {
    val a = context.pop
    val b = context.pop
    // store the result in the top of the stack
    context.push(a + b)
    context.nextInstruction
    context.countNewInstruction()
  }
}