#!/usr/bin/env groovy
@Library('csv')_

def call(string name) {
  echo "Hii ${name}"
  new File("Hello.csv").eachLine { line ->
    println line}
}
