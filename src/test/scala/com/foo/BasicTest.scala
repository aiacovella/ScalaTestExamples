package com.foo

import org.junit.{Before, Test}
import org.junit.Assert.assertTrue

class BasicTest{
  var bankAccount:BankAccount = _

  @Before
  def setup() = {bankAccount = new BankAccount(100)}

  @Test
  def addsCorrectly {
    assertTrue(bankAccount.add(150) == 250)
  }
}

class BankAccount(private var balance:Double){
  def add(amt:Double):Double = {
    balance + amt
  }
}
