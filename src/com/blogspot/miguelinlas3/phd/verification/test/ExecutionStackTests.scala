package com.blogspot.miguelinlas3.phd.verification.test

/**
 *  Unit test suite for our execution Stack
 *
 * Created by IntelliJ IDEA.
 * User: migue
 * Date: 3/18/11
 * Time: 11:59 PM
 * To change this template use File | Settings | File Templates.
 */


import org.specs._
import org.specs.runner._
import org.junit.runner.RunWith
import com.blogspot.miguelinlas3.phd.verification.stack.ExecutionStack

@RunWith(classOf[JUnitSuiteRunner])
class ExecutionStackRunner extends JUnit4(ExecutionStackTests)

object ExecutionStackTests extends Specification {

  val executionStack = new ExecutionStack[Double]

  "executionStack" should {
    "be empty" in {
      executionStack.size must_== 0
    }

    "have one element" in {
      executionStack.push(1)
      executionStack.size must_== 1
    }

    "have two element" in {
      executionStack.push(1)
      executionStack.push(2)
      executionStack.size must_== 2
    }

    "have three element" in {
      executionStack.push(1)
      executionStack.push(2)
      executionStack.push(3)
      executionStack.size must_== 3
    }

    "have on top" in {
      val top = 1
      executionStack.push(top)
      executionStack.top must_== top
    }

    "have on top" in {
      val top = 11
      executionStack.push(top)
      executionStack.pop must_== top
    }

    "be empty after pop operation" in {
      executionStack.push(11)
      executionStack.pop
      executionStack.size must_== 0
    }


  }

}
