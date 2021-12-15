# credit-assignment2

In order to run this program you will need to first have Java 1.8 installed on your machine and have previously set up maven so that you can use the maven command.

Required Dependency: Maven shade plugin dependency

Add the Below dependency for Maven Build

<dependency>
  <groupId>org.apache.maven.plugins</groupId>
  <artifactId>maven-shade-plugin</artifactId>
  <version>3.2.4</version>
  <type>maven-plugin</type>
</dependency>

In the Eclipse IDE
1) Right Click on the the project
2) Select Maven--> maven clean--> maven build
Note: Set Goal as Package shade:shade
