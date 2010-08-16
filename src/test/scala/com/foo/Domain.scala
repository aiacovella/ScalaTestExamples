package com.foo

import scala.collection.mutable.Map
case class Person(firstName:String, lastName:String, id:Long)

object Company {
  private val _employees = Map[Long, Person]()

  def hire(user:Person) = _employees += (user.id -> user)
  def employeeCount = _employees.size
  def employees = _employees
}
