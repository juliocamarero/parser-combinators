package com.blogspot.miguelinlas3.phd.verification.test.parser

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
import com.blogspot.miguelinlas3.phd.verification.profiler.parser.EfficientByteCodeParser

@RunWith(classOf[JUnitSuiteRunner])
class ByteCodeParserRunner extends JUnit4(ByteCodeParserTests)

object ByteCodeParserTests extends Specification {

  //val basePath = "/home/migue/IdeaProjects/bytecode-profiler/src/com/blogspot/miguelinlas3/phd/verification/test/parser/sources/instructions/"
  val basePath = "/home/migue/development/workspaces/workspace-phd/bytecode-profiler/src/com/blogspot/miguelinlas3/phd/verification/test/parser/sources/instructions/"
  val extension = ".bytecode"
  val singleBytecodeFiles = List("iload", "istore", "imul", "isub", "ireturn", "iconst")
  val fourBytecodeFiles = List("ificmpgt", "iinc","goto")

  val bytecodeParser = new EfficientByteCodeParser

  "byte code parser" should {

    "parse ok single bytecode files" in {
      for (file <- singleBytecodeFiles) {
        val instructions = bytecodeParser.parse(basePath + file + extension)
        instructions.size must_== 2
      }
    }

    "parse ok multiple (4) bytecode files" in {
      for (file <- fourBytecodeFiles) {
        val instructions = bytecodeParser.parse(basePath + file + extension)
        instructions.size must_== 4
      }
    }
  }

}
