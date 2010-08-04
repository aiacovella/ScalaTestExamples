package com.foo
import org.junit.Test
import scala.collection.mutable.Map

class BasicTest{
  val company = Company

  @Test
  def addsCorrectly {

    val jSmith = Person("John", "Smith", 1)
    company.hire(jSmith)

    assert(company.employeeCount == 1)
    assert(company.employees(1) == jSmith)
  }
}


