#!/usr/bin/env groovy
@Library('csv')_

def call() {
  new File("Hello.csv").eachLine { line ->
    println line
}
