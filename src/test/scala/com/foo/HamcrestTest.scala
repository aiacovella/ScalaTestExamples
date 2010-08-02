package com.foo

import org.junit.Test
import scala.collection.mutable.Map

class BasicTest{
  val company = Company

  @Test
  def addsCorrectly {

    val jSmith = Person("John", "Smith", 1)
    company.hire(jSmith)

    assert(company.employeCount == 1)
    assert(company.employees.contains(jSmith))
  }
}

case class Person(firstName:String, lastName:String, id:Long)

object Company {
  private val _employees = Map[Long, Person]()

  def hire(user:Person) = _employees + (user.id -> user)
  def employeCount = _employees.size
  def employees = _employees.values
}