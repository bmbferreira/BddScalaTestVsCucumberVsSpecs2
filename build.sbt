name := "BddScalaTestVsCucumberVsSpecs2"

version := "1.0"

scalaVersion := "2.12.6"

libraryDependencies ++= Seq("org.scala-lang" % "scala-reflect" % "2.12.6",
                            "org.scala-lang.modules" %% "scala-xml" % "1.0.6",
                            "junit" % "junit" % "4.12",
                            "org.slf4j" % "slf4j-log4j12" % "1.7.25",
                            "com.novocode" % "junit-interface" % "0.11",
                            "org.scalactic" %% "scalactic" % "3.0.5",
                            "org.scalatest" %% "scalatest" % "3.0.5",
                            "org.specs2" %% "specs2-core" % "4.0.2",
                            "org.specs2" %% "specs2-gwt" % "4.0.2",
                            "com.waioeka.sbt" %% "cucumber-runner" % "0.1.5").map(_ % Test)

val framework = new TestFramework("com.waioeka.sbt.runner.CucumberFramework")
testFrameworks += framework

// Configure the arguments.
testOptions in Test += Tests.Argument(framework, "--glue", "")
testOptions in Test += Tests.Argument(framework, "--plugin", "pretty")
unmanagedClasspath in Test += baseDirectory.value / "src/test/scala/bank/cucumber/features"

parallelExecution in Test := false
