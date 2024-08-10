# NameApp

`NameApp` is a simple Java application that serializes a `User` object into JSON using the `Jackson` library and prints the result to the console. The project also includes a unit test for verifying the correct serialization behavior.

## Project Structure

```css
src/
├── main/
│   ├── java/
│   │   └── org/
│   │       └── example/
│   │           ├── NameApp.java
│   │           └── dto/
│   │               └── User.java
├── test/
│   └── java/
│       └── org/
│           └── example/
│               └── NameAppTest.java
pom.xml
```

## Dependencies
The project uses the following Maven dependencies:

- **Jackson Databind**: For converting Java objects to and from JSON.
- **JUnit 5**: For writing and executing unit tests.

## Plugins Used
The project uses the following Maven plugin:

- **Maven Shade Plugin**: For creating an executable "fat" JAR that includes all dependencies.

## Build the Project

### Prerequisites

- **Java Development Kit (JDK) 8 or higher**: Ensure that the JDK is installed and configured in your environment.
- **Maven**: This project uses Maven as the build tool.

### Steps to Build

To build the project, follow these steps:

1. **Clone the repository**:
```shell
git clone git@github.com:ruslanaprus/goit-academy-dev-hw01-maven.git
cd goit-academy-dev-hw01-maven
```
2. **Build the project**:
```shell
mvn clean package
```
This command will clean any existing builds and then compiles the source code, runs the tests, and packages the application into a fat JAR file named `myname.jar` located in the `target` directory. The JAR will contain all necessary dependencies, making it easy to run the application without needing to manually manage classpath dependencies.

## Running the Application
After building the project and creating the fat JAR, you can run the application using the following command:

```shell
java -jar target/myname.jar
```

This will execute the `NameApp` and output the serialized JSON string of the `User` object to the console.
