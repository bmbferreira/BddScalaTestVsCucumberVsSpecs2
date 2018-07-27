name := "BddScalaTestVsCucumberVsSpecs2"

version := "1.0"

scalaVersion := "2.12.6"

libraryDependencies ++= Seq(
  "org.scala-lang" % "scala-reflect" % "2.12.6",
	"org.scala-lang.modules" %% "scala-xml" % "1.1.0"
)

libraryDependencies += "junit" % "junit" % "4.12"
libraryDependencies += "org.slf4j" % "slf4j-log4j12" % "1.7.25"
libraryDependencies += "com.novocode" % "junit-interface" % "0.11"
libraryDependencies += "org.scalactic" %% "scalactic" % "3.0.5"
libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.5"
libraryDependencies += "org.specs2" %% "specs2-core" % "4.0.2"
libraryDependencies += "org.specs2" %% "specs2-gwt" % "4.0.2"
libraryDependencies += "com.waioeka.sbt" %% "cucumber-runner" % "0.1.5"


val framework = new TestFramework("com.waioeka.sbt.runner.CucumberFramework")
testFrameworks += framework

// Configure the arguments.
testOptions in Test += Tests.Argument(framework,"--glue","")
testOptions in Test += Tests.Argument(framework,"--plugin","pretty")
parallelExecution in Test := false