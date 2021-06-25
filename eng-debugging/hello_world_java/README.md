## Setup
1. If you don't have Java installed, visit https://java.com/en/download/help/download_options.html.
2. Cd into `hello_world_java` folder
3. run `mvn test`

## IDE support
If you are solving this exercise in your own environment, you are welcome to use an IDE. You should be able to import this as a Maven project according to your IDE's specific implementation.

## Commands
- `mvn test` To run all tests
- `mvn test -Dtest=HelloWorldTest#testCase1` To run just first test

## Tested on
Java 1.8, 11, 15, 16
Maven 3.8.1

#### IDE/Windows-specific bugs (skip unless you're having problems on Windows or with your IDE):
Make sure you have completed setup before proceeding!

IntelliJ:
- Error: `java: package org.apache.commons.lang3 does not exist`
    - Right-click `pom.xml` in the directory window > "Add as Maven Project"; this should reload the project with `org.apache.commons:commons-lang3:3.10` as a dependency now.
- Error: `java: cannot access <class>`
    - File > Invalidate Caches / Restart...

Visual Studio Code/Windows:
- `JAVA_HOME` not updating
    - Quit ALL VSCode windows, otherwise machine might not pick up updated `JAVA_HOME`
- VSCode Maven extension is not enough
    - Install in your home subdirectory - instructions: https://maven.apache.org/install.html
    - Update Windows PATH to include that subdirectory
