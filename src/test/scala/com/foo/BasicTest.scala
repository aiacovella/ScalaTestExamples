package com.foo

import org.junit.{Before, Test}
import org.junit.Assert.assertTrue

class BasicTest{
  var bankBalance:BankBalance = _

  @Before
  def setup() = {bankBalance = new BankBalance(100)}

  @Test
  def addsCorrectly {
    assertTrue(bankBalance.add(150) == 250)
  }
}

class BankBalance(private var balance:Double){
  def add(amt:Double):Double = {
    balance + amt
  }
}
