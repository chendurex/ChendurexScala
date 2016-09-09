import Array._

object Loop {
  def main(args: Array[String]) {
    var a = 0;

    // for loop execution with a range
    for( a <- 1 to 10){
      println( "Value of a: " + a );
    }

    // while loop execution
    while( a < 20 ){
      println( "Value of a: " + a );
      a = a + 1;
    }

    do {
      println( "Value of a: " + a );
      a = a + 1;
    }
    while( a < 20 )
    println(add(10, 20))
    delayed(time())
    printStrings("Hello", "Scala", "Python")
    println( factorial(3) )

    // closure
    val factor = 3
    val multiplier = (i:Int) => i * factor
    println( "multiplier(2) value = " +  multiplier(2) )

    val fs = printf("The value of the float variable is " +
      "%f, while the value of the integer " + "variable is %d, and the string" +
       "is %s", 2.3f, 4, "hello")

      println(fs)

    val name : String = "James"
    println(s"Hello, $name")
    println(s"1 + 1 = ${1 + 1}")

  }

  def add(a:Int, b:Int) : Int = {
    return a + b;
  }
 // return anything similar java void type
  def printMe( ) : Unit = {
    println("Hello, Scala!")
  }

  // return any type but real type is long
  def time() = {
    println("Getting time in nano seconds")
    System.nanoTime
  }
  // unknown type convert long type
  def delayed( t: => Long ) = {
    println("In delayed method")
    println("Param: " + t)
  }

  // args:String* is array similar java String ...args
  def printStrings( args:String* ) = {
    var i : Int = 0;

    for( arg <- args ){
      println("Arg value[" + i + "] = " + arg );
      i = i + 1;
    }
  }

  // define default value
  def addInt( a:Int = 5, b:Int = 7 ) : Int = {
    var sum:Int = 0
    sum = a + b

    return sum
  }

  def factorial(i: Int): Int = {
    def fact(i: Int, accumulator: Int): Int = {
      if (i <= 1)
        accumulator
      else
        fact(i - 1, i * accumulator)
    }
    fact(i, 1)
  }

  def array(): Unit = {
    var z:Array[String] = new Array[String](3)
   // or
    var f = new Array[String](3)

    val myList = Array(1.9, 2.9, 3.4, 3.5)

    // Print all the array elements
    for ( x <- myList ) {
      println( x )
    }

    // Summing all elements
    var total = 0.0;

    for ( i <- 0 to (myList.length - 1)) {
      total += myList(i);
    }
    println("Total is " + total);

    // Finding the largest element
    var max = myList(0);

    for ( i <- 1 to (myList.length - 1) ) {
      if (myList(i) > max) max = myList(i);
    }

    println("Max is " + max)

    val myMatrix = ofDim[Int](3,3)

    // build a matrix
    for (i <- 0 to 2) {
      for ( j <- 0 to 2) {
        myMatrix(i)(j) = j
      }
    }

    // Print two dimensional array
    for (i <- 0 to 2) {
      for ( j <- 0 to 2) {
        print(" " + myMatrix(i)(j))
      }
      println()
    }

    // concat array
    val myList1 = Array(1.9, 2.9, 3.4, 3.5)
    val myList2 = Array(8.9, 7.9, 0.4, 1.5)

    val myList3 =  concat( myList1, myList2)

    // Print all the array elements
    for ( x <- myList3 ) {
      println( x )
    }

  }

}
