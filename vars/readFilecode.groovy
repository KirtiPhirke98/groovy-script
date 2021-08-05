#!/usr/bin/env groovy
@Library('csv')_

def call(string name) {
  echo "Hii ${name}"
  new File("https://github.com/KirtiPhirke98/file/blob/1bd64515b0cf031528b4a01b4509ef9f725b2896/vars/Hello.csv").eachLine { line ->
    println line}
}
