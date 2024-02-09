#!/bin/bash
v1=/Users/spoole/.m2/repository/dev/gruff/hardstop-tests/v1/1.0.0/v1-1.0.0.jar
v2=/Users/spoole/.m2/repository/dev/gruff/hardstop-tests/v2/2.0.0/v2-2.0.0.jar

# try v1
java -cp .:${v1} dev.gruff.hardstop.testcases.apicheck.Main V1
java -cp .:${v2} dev.gruff.hardstop.testcases.apicheck.Main V2