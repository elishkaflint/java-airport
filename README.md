## Basic Project Set Up With Maven

Useful tutorial - https://dzone.com/articles/unit-testing-w-junit-using-maven-and-intellij-pt1

#### Set up boilerplate project (change groupId and artefactId)

``` 
$ mvn archetype:generate \-DgroupId=guru.springframework.unittest.quickstart -DartifactId=unittest -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false
```

### Update JUnit version in pom.xml file

```
<dependency>
     <groupId>junit</groupId>
     <artifactId>junit</artifactId>
     <version>4.12</version>
     <scope>test</scope>
</dependency>
```

### Open project in Intellij

- Import project 
- Select pom.xml file
- Select the Import Maven projects automatically checkbox to synchronize changes between the Maven and InteliiJ projects each time thepom.xml file changes
- Click next

### Add tests

- Create test folder under main
- Right click folder, Mark Directory As -> Test Sources Route
- Go to class to be tested, right click and create new test


