#!/usr/bin/env groovy
@Library('csv')_

def call() {
  new File("/vars/Hello.csv").eachLine { line ->
    println line
}
