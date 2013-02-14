package org.streum.interpol

object Main extends App {
  
  import Markdown._

  def farenheit( celsius: Int ) = ( celsius*9.0/5 + 32 ).toInt
    
  val location = "Anchorage, AK"
  val url = "http://en.wikipedia.org/wiki/Anchorage,_Alaska"
  val temp = -3

  println( md"**[$location]($url):** *$temp°C* (${farenheit(temp)}°F)" )

}
