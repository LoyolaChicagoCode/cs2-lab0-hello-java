[![Build Status](https://travis-ci.org/LoyolaChicagoCode/hello-java.svg?branch=master)](https://travis-ci.org/LoyolaChicagoCode/hello-java)

This build will always fail because it has 2 examples of failing tests:
one based on the source code, and one based on an incorrect test.

# Learning Objectives

* Simple hello world example
* Experience with Git source code management
* Building with Gradle (using the Gradle wrapper)
* Automated unit testing with JUnit
* Continuous integration with Travis

# System requirements

* Java 6 SDK or later

# Running the Application

On Linux or Mac OS X:

    $ ./gradlew run
	
On Windows:
	
    > gradlew run

# Running the Tests

On Linux or Mac OS X:

    $ ./gradlew test
	
On Windows:
	
    > gradlew test

# Running the Application Outside Gradle

Unlike running the application using Gradle's `run` task,
this allows passing command-line arguments.

On Linux or Mac OS X:

    $ ./gradlew startScripts
    $ ./build/scripts/hello-java arg1 arg2 arg3

or

    $ ./gradlew jar
    $ java -jar build/lib/hello-java.jar arg1 arg2 arg3

On Windows:

    > gradlew startScripts
    > .\build\scripts\hello-java arg1 arg2 arg3

or

    > gradlew jar
    > java -jar build\lib\hello-java.jar arg1 arg2 arg3
