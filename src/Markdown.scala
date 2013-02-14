package org.streum.interpol


object Markdown {
  
  implicit class MDContext( val context: StringContext ) extends AnyVal {
    import com.tristanhunt.knockoff.DefaultDiscounter._ 
    def md( args: Any* ) = {
      val interpolated = context.s(args:_*)
      toXHTML( knockoff( interpolated ) )
    }
  }


}
