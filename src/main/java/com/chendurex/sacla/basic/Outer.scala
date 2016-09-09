package com.chendurex.sacla.basic

/**
  *
  * @author chen
  */
class Outer {
  class Inner {
    private def f() { println("f") }

    def k() { println("k") }
    class InnerMost {
      f() // OK
    }
  }
  (new Inner).k() // OK because now f() is public
  //(new Inner).f() // Error: f is not accessible
}
