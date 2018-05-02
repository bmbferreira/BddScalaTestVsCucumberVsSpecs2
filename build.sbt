name := "BddScalaTestVsCucumberVsSpecs2"

version := "1.0"

scalaVersion := "2.11.8"

libraryDependencies ++= Seq(
	"org.scala-lang" % "scala-reflect" % "2.11.8",
	"org.scala-lang.modules" % "scala-xml_2.11" % "1.0.4"
)

libraryDependencies += "info.cukes" % "cucumber-scala_2.11" % "1.2.4"
libraryDependencies += "info.cukes" % "cucumber-junit" % "1.2.4"
libraryDependencies += "junit" % "junit" % "4.12"
libraryDependencies += "info.cukes" % "cucumber-picocontainer" % "1.1.8"
libraryDependencies += "org.slf4j" % "slf4j-log4j12" % "1.2"
libraryDependencies += "com.novocode" % "junit-interface" % "0.11" % "test"
libraryDependencies += "org.scalactic" %% "scalactic" % "2.2.6"
libraryDependencies += "org.scalatest" %% "scalatest" % "2.2.6" % "test"
libraryDependencies += "org.specs2" %% "specs2-core" % "4.0.2" % "test"
libraryDependencies += "org.specs2" %% "specs2-gwt" % "4.0.2" % "test"

