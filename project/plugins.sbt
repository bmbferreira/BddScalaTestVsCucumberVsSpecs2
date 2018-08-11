logLevel := Level.Warn

// Coverage
addSbtPlugin("org.scoverage" % "sbt-scoverage" % "1.5.1")
addSbtPlugin("com.codacy" % "sbt-codacy-coverage" % "1.3.12")

// Formating
addSbtPlugin("com.geirsson" % "sbt-scalafmt" % "1.6.0-RC3")