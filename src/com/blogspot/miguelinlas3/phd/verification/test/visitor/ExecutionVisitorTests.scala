package com.blogspot.miguelinlas3.phd.verification.test.visitor

/**
 *  Unit test suite for our execution visitor
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
import com.blogspot.miguelinlas3.phd.verification.types.IntType
import com.blogspot.miguelinlas3.phd.verification.profiler.visitor.ExecutionVisitor

@RunWith(classOf[JUnitSuiteRunner])
class ExecutionVisitorRunner extends JUnit4(ExecutionVisitorTests)

object ExecutionVisitorTests extends Specification {

  //val basePath = "/home/migue/IdeaProjects/bytecode-profiler/src/com/blogspot/miguelinlas3/phd/verification/test/parser/sources/execution/"
  val basePath = "/home/migue/development/workspaces/workspace-phd/bytecode-profiler/src/com/blogspot/miguelinlas3/phd/verification/test/parser/sources/execution/"
  val extension = ".bytecode"

  val executionVisitor = new ExecutionVisitor

  "executionVisitor" should {
    "sum one plus two correctly" in {
      val args:Array[String] = Array("1","2")
      executionVisitor.execute(basePath + "a" + extension,args).result must_== 3
    }

    "sum zero plus ten correctly" in {
      val args:Array[String] = Array("0","10")
      executionVisitor.execute(basePath + "a" + extension,args).result must_== 11
    }

    "sum one plus 100 correctly" in {
      val args:Array[String] = Array("1","100")
      executionVisitor.execute(basePath + "a" + extension,args).result must_== 101
    }

    "calculate the factorial of number three correctly" in {
      val args:Array[String] = Array("3")
      executionVisitor.execute(basePath + "factorial" + extension,args).result must_== 6
    }

    "calculate the factorial of number 5 correctly" in {
      val args:Array[String] = Array("5")
      executionVisitor.execute(basePath + "factorial" + extension,args).result must_== 120
    }

    "calculate the factorial of number 11 correctly" in {
      val args:Array[String] = Array("11")
      executionVisitor.execute(basePath + "factorial" + extension,args).result must_== 39916800
    }

    "determine that numer 2 is pair" in {
      val args:Array[String] = Array("2")
      executionVisitor.execute(basePath + "pair" + extension,args).result must_== 1
    }

     "determine that numer 3 is NO pair" in {
      val args:Array[String] = Array("0")
      executionVisitor.execute(basePath + "pair" + extension,args).result must_== 0
    }

    "decrement n" in {
      val args:Array[String] = Array("11")
      executionVisitor.execute(basePath + "q1" + extension,args)
    }

    "execute correctly" in {
      val args:Array[String] = Array("2","3")
      executionVisitor.execute(basePath + "q2" + extension,args).result must_== 12
    }

    "execute correctly" in {
      val args:Array[String] = Array("2","4")
      executionVisitor.execute(basePath + "q2" + extension,args).result must_== 20
    }

    "execute correctly" in {
      val args:Array[String] = Array("10","4")
      executionVisitor.execute(basePath + "q2" + extension,args).result must_== 100
    }

  }
}
