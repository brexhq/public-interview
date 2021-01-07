### Setup
1. If you don't have JDK 8+ installed, run `brew cask install adoptopenjdk8`/`sudo apt-get install openjdk-8-jre`/`sudo yum install java-1.8.0-openjdk-devel`. Verify using `java -version`. If you get an error `Error: Cask 'adoptopenjdk8' is unavailable: No Cask with this name exists.`, first run `brew update` followed by `brew tap adoptopenjdk/openjdk` (more on mac installation [here](https://mkyong.com/java/how-to-install-java-on-mac-osx/))
2. Install Maven using `brew install maven`/`sudo apt install maven`/`sudo yum install maven`. Verify using `mvn -version`.
3. run `mvn install` inside this folder. This will run the tests too.
4. run `mvn test` to run all unit tests.
5. You can use a Java IDE of your choice to run and debug the tests.

---------------------------------------

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
