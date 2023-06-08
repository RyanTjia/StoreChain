Setting the pom.xml
- https://maven.apache.org/guides/introduction/introduction-to-the-pom.html

MySQL Installation (Windows)
- https://dev.mysql.com/downloads/connector/j/

Dependency for accessing a MySQL database
- https://central.sonatype.com/artifact/mysql/mysql-connector-mxj-db-files/5.0.12

Commands using Maven
- `mvn package` build the project into the `target` directory as .jar files
- `mvn clean` removes the .jar files
- `mvn clean test package jetty:run` runs the server

Things to Note
- Configuration was set in the `build` section of the `pom.xml` so that it will
run Java 8 to allow certain features, such as lambda expressions
- `java version "1.8"` means that we are using Java 8
- `open -e .bash_profile` is a command on terminal which opens the `bash_profile.txt`
	- Used to set variables for the system
	- Must be from a new terminal
- `java -cp StoreChain-1.0.jar App` is a command to run a JAR without a manifest
	- `StoreChain-1.0.jar` is the .jar file to be executed
	- `App` is the main class