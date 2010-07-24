package com.foo

import org.junit.{Assert, Test}

class FooTest{

  @Test { val expected = classOf[ IllegalArgumentException] }
  def shouldThrowException {
      Foo.methodThatThrowsException
  }

  object Foo{
    def methodThatThrowsException() = throw new NullPointerException
  }
}