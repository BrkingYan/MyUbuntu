#!/bin/bash

file=$1
javac $file -d /opt/tomcat/apache-tomcat-9.0.20/webapps/test/WEB-INF/classes
