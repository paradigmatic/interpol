organization := "org.streum"

name := "interpol"

version := "0.0.1"

scalaVersion := "2.10.0"

crossScalaVersions := Seq("2.9.2" )

libraryDependencies ++= Seq(
  "com.tristanhunt" %% "knockoff" % "0.8.1",	
  "com.typesafe" %% "scalalogging-slf4j" % "1.0.0",
  "org.scalatest" %% "scalatest" % "1.9.1" % "test"
)

scalacOptions ++= Seq("-deprecation", "-feature")

scalaSource in Compile <<= baseDirectory(_ / "src")

scalaSource in Test <<= baseDirectory(_ / "test")

