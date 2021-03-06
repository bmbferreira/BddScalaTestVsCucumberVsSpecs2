# BDD in Scala - ScalaTest vs Cucumber vs Specs2

[![Codacy Badge](https://app.codacy.com/project/badge/Grade/8c8c4915dcc74f86ba7c2136bef50c74)](https://www.codacy.com/gh/bmbferreira/BddScalaTestVsCucumberVsSpecs2/dashboard?utm_source=github.com&amp;utm_medium=referral&amp;utm_content=bmbferreira/BddScalaTestVsCucumberVsSpecs2&amp;utm_campaign=Badge_Grade)
[![Codacy Badge](https://app.codacy.com/project/badge/Coverage/8c8c4915dcc74f86ba7c2136bef50c74)](https://www.codacy.com/gh/bmbferreira/BddScalaTestVsCucumberVsSpecs2/dashboard?utm_source=github.com&utm_medium=referral&utm_content=bmbferreira/BddScalaTestVsCucumberVsSpecs2&utm_campaign=Badge_Coverage)
[![CircleCI](https://circleci.com/gh/codacy/codacy-metrics-radon.svg?style=svg)](https://circleci.com/gh/bmbferreira/BddScalaTestVsCucumberVsSpecs2)


Small SBT project with a simple Bank Account implementation 
making use of three different testing tools  (Cucumber, ScalaTest and Specs2)
in order to compare each one of them about how Behavioural Driven Development can be put in practice in Scala projects.
The conclusions drawn from this experiment are described in this [blog post](https://www.codacy.com/blog/putting-bdd-in-practice-using-scala/).

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


