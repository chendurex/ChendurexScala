package com.chendurex.sacla.basic

package society {
  package professional {
    class Executive {
      private[professional] var workDetails = null
      private[society] var friends = null
      private[this] val secrets = null

      def help2 (): Unit = {
        println(secrets)
      }
      def help(another : Executive) {
        println(another.workDetails)
        println(another.friends)
       // println(another.secrets) //ERROR
      }
    }

  }
}