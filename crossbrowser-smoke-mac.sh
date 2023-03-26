#!/bin/sh
mvn test -D file=smoke-test-suite.xml -D browser=chrome
mvn test -D file=smoke-test-suite.xml -D browser=edge