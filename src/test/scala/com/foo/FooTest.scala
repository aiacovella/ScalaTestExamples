package com.foo

import org.junit.{Assert, Test}
import junit.framework.TestCase
import org.junit.runner.RunWith
import org.junit.runners.Suite

class FooTest{

  @Test { val expected = classOf[ IllegalArgumentException] }
  def shouldThrowException {  // note the lack of throws Exception
      Foo.methodThatThrowsException
  }

//  @Test{val expected = classOf[IllegalArgumentException]}
//  @Test { val expected = classOf[ IllegalArgumentException] }
//  def shouldNotThrowException {
//    expectException[NullPointerException]{
//      Foo.methodWithoutException
//
//    }
// }

//  private def expectException[T <% Exception](f: => Any) = {
//     try {
//       f
//       Assert.fail("Expected exception was not raised." )
//     }
//     catch {
//       case ex:T => println(">>>>>>>>>>>>>>>>>>>> YES CAUGHT EXCPECTED EXCEPTION")
//       case e@_ => Assert.fail("Invalid exception caught." + e.getMessage )
//     }
//   }
//}

  object Foo{
    def methodThatThrowsException() = throw new IllegalArgumentException
    def methodWithoutException(){}
  }
}