# BDD in Scala - ScalaTest vs Cucumber vs Specs2

[![Codacy Badge](https://api.codacy.com/project/badge/Grade/f275cafaf4d1467780924c8de9eb74c6)](https://www.codacy.com/app/bmbferreira/BddScalaTestVsCucumberVsSpecs2?utm_source=github.com&amp;utm_medium=referral&amp;utm_content=bmbferreira/BddScalaTestVsCucumberVsSpecs2&amp;utm_campaign=Badge_Grade)
[![Codacy Badge](https://api.codacy.com/project/badge/Coverage/f275cafaf4d1467780924c8de9eb74c6)](https://www.codacy.com/app/bmbferreira/BddScalaTestVsCucumberVsSpecs2?utm_source=github.com&utm_medium=referral&utm_content=bmbferreira/BddScalaTestVsCucumberVsSpecs2&utm_campaign=Badge_Coverage)
[![CircleCI](https://circleci.com/gh/codacy/codacy-metrics-radon.svg?style=svg)](https://circleci.com/gh/bmbferreira/BddScalaTestVsCucumberVsSpecs2)


Small SBT project with a simple Bank Account implementation 
making use of three different testing tools  (Cucumber, ScalaTest and Specs2)
in order to compare each one of them about how Behavioural Driven Development can be put in practice in Scala projects.

To compile the project run ```scripts/compile.sh```.

To run all the tests just run ``` sbt test ```, or ```scripts/test.sh```.

## ScalaTest
 
To run only the tests that are using ScalaTest:

``` sbt 'testOnly bank.scalatest.*' ``` 

## Cucumber

To run only the tests that are using Cucumber:

``` sbt 'testOnly bank.cucumber.*' ``` 


## Specs2 

To run only the tests that are using Specs2:

``` sbt 'testOnly bank.specs2.*' ``` 


