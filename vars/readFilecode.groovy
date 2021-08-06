#!/usr/bin/env groovy
   def call(string str)
{
def filePath = readFile "${str}"   
	def lines = filePath.readLines()
	 def linesbyline = filePath.readLines() 
      
	for (line in linesbyline) {                                            
                      
                        println "$line"
                        }  
}
  
 
   

