package com.foo
import org.junit.Test
import org.hamcrest.Matchers._
import org.hamcrest.MatcherAssert._

class HamcrestTest{
  val company = Company

  @Test
  def addsCorrectly {

    val jSmith = Person("John", "Smith", 1)
    company.hire(jSmith)

    assertThat(company.employeeCount, is(1))
    assertThat(company.employees(1), is(jSmith))

  }
}