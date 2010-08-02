package com.foo

import org.junit.Test
import org.hamcrest.Matchers._
import org.hamcrest.MatcherAssert._

class ScalaTestTest{
  val company = Company

  @Test
  def addsCorrectly {

    val jSmith = Person("John", "Smith", 1)
    company.hire(jSmith)

    assertThat(company.employeCount, is(1))
    assertThat(company.employees(1), is(jSmith))

  }
}