#!/usr/bin/env groovy
   
	def filePath = readFile "Hello.csv"   
	def lines = filePath.readLines()
	 def linesbyline = filePath.readLines() 
      
	for (line in linesbyline) {                                            
                      
                        println "$line"
                        }  
  
 
   

