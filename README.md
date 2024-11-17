# News Fetcher Spring Boot Application

This project is a Spring Boot application that provides an API to fetch news from an external website using an API key. The `NewsController` retrieves the latest news and returns it in JSON format.

### File Structure
'''bash
├── HELP.md
├── mvnw
├── mvnw.cmd
├── pom.xml
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com
│   │   │       └── AggregatorAPI
│   │   │           └── demo
│   │   │               ├── config
│   │   │               │   ├── JWTConfig.java
│   │   │               │   └── WebSecurtyConfig.java
│   │   │               ├── controller
│   │   │               │   ├── NewsController.java
│   │   │               │   ├── PreferenceController.java
│   │   │               │   └── SubscriberController.java
│   │   │               ├── DemoApplication.java
│   │   │               ├── entity
│   │   │               │   ├── MemberModel.class
│   │   │               │   └── MemberModel.java
│   │   │               ├── filter
│   │   │               │   └── JWTFilter.java
│   │   │               ├── model
│   │   │               │   ├── Member.java
│   │   │               │   ├── Preference.java
│   │   │               │   └── SignIn.java
│   │   │               ├── repository
│   │   │               │   ├── PreferenceRepository.java
│   │   │               │   └── SubscriberRepository.java
│   │   │               └── service
│   │   │                   ├── NewsService.java
│   │   │                   ├── PreferenceService.java
│   │   │                   └── SubscriberService.java
│   │   └── resources
│   │       ├── application.properties
│   │       ├── static
│   │       └── templates
│   └── test
│       └── java
│           └── com
│               └── AggregatorAPI
│                   └── demo
│                       └── DemoApplicationTests.java
└── target
    ├── classes
    │   ├── application.properties
    │   └── com
    │       └── AggregatorAPI
    │           └── demo
    │               ├── config
    │               │   ├── JWTConfig.class
    │               │   └── WebSecurtyConfig.class
    │               ├── controller
    │               │   ├── NewsController.class
    │               │   ├── PreferenceController.class
    │               │   └── SubscriberController.class
    │               ├── DemoApplication.class
    │               ├── entity
    │               │   └── MemberModel.class
    │               ├── filter
    │               │   └── JWTFilter.class
    │               ├── model
    │               │   ├── Member.class
    │               │   ├── Preference.class
    │               │   └── SignIn.class
    │               ├── repository
    │               │   ├── PreferenceRepository.class
    │               │   └── SubscriberRepository.class
    │               └── service
    │                   ├── PreferenceService.class
    │                   └── SubscriberService.class
    ├── demo-0.0.1-SNAPSHOT.jar
    ├── demo-0.0.1-SNAPSHOT.jar.original
    ├── generated-sources
    │   └── annotations
    ├── generated-test-sources
    │   └── test-annotations
    ├── maven-archiver
    │   └── pom.properties
    ├── maven-status
    │   └── maven-compiler-plugin
    │       ├── compile
    │       │   └── default-compile
    │       │       ├── createdFiles.lst
    │       │       └── inputFiles.lst
    │       └── testCompile
    │           └── default-testCompile
    │               ├── createdFiles.lst
    │               └── inputFiles.lst
    ├── surefire-reports
    │   ├── com.AggregatorAPI.demo.DemoApplicationTests.txt
    │   └── TEST-com.AggregatorAPI.demo.DemoApplicationTests.xml
    └── test-classes
        └── com
            └── AggregatorAPI
                └── demo
                    └── DemoApplicationTests.class
'''

