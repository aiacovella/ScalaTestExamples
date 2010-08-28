package com.foo

import org.scalatest.matchers.ShouldMatchers._
import org.scalatest.matchers._
import org.junit.Test

class ScalaTestTest  {
  val company = Company

  @Test
  def addsCorrectly {

    val jSmith = Person("John", "Smith", 1L)
    company.hire(jSmith)

    company.employeeCount should be (1)
    company.employees should contain value (jSmith)
  }
}