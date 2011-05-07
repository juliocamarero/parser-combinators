package com.blogspot.miguelinlas3.phd.verification.test.variables

/**
 *  Unit test suite for our execution variables table
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
import com.blogspot.miguelinlas3.phd.verification.stack.VariablesTable

@RunWith(classOf[JUnitSuiteRunner])
class VariablesTableRunner extends JUnit4(VariablesTableTests)

object VariablesTableTests extends Specification {

  val variablesTable = new VariablesTable[Int](10)

  "variablesTable " should {
    "has ten elementos" in {
      variablesTable.size must_== 10
    }

    "store value 0 at position 0" in {
      variablesTable.store(0, 0)
      variablesTable.retrieve(0) must_== 0
    }

    "store value 1 at position 1" in {
      variablesTable.store(1, 1)
      variablesTable.retrieve(1) must_== 1
    }

    "store value 2 at position 2" in {
      variablesTable.store(2, 2)
      variablesTable.retrieve(2) must_== 2
    }

    "store value 9 at position 9" in {
      variablesTable.store(9, 9)
      variablesTable.retrieve(9) must_== 9
    }
  }

}
