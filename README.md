# Spring Boot TDD

* Base project for TDD Katas
* Frameworks
    * Spring Boot 1.4.0.RELEASE
    * JUnit 4.12
    * Rest Assured 3.0.1

# Table of Contents

* [Project Requirements](#project-requirements)
* [Gradle Commands](#gradle-commands)
* [Test Reports](#test-reports)
* [Hot Swapping](#hot-swapping)
* [Useful Links](#useful-links)

## Project Requirements

* Project is implemented with **Java 8** (see source and target compatibilities in _gradle.properties_), but that can be changed to other needs. See [Spring Boot - System Requirements](http://docs.spring.io/spring-boot/docs/current-SNAPSHOT/reference/htmlsingle/#getting-started-system-requirements)
* **Gradle 3.0** is being used, but it may work with other versions.

## Gradle Commands

* Running Unit Tests (JUnit):

    **_gradle clean test_**
        
* Running Integration Tests (Spring Integration Tests + Rest Assured):

    **_gradle clean integrationTest_**
        
* Running Acceptance Tests (JBehave + JBehave Web Selenium + FluentSelenium):

    **_gradle clean acceptanceTest_**
    
    _Notes_: System property **-Djava.awt.headless=false** if executed without Gradle should be set to avoid java.awt.HeadlessException
    
* Running all together:

    **_gradle clean check_**
    
* Running Unit and Integration Tests together:

    **_gradle clean test integrationTest_**
    
* For debugging which will listen in port 5005 by default:

    **_gradle \<task/s\> --debug-jvm_**
    
* For setting Log in debug or info:

    **_gradle \<task/s\> -d_** | **_gradle \<stage\> -i_**
    
Gradle configuration was implemented following this post: [Getting Started With Gradle: Integration Testing](https://www.petrikainulainen.net/programming/gradle/getting-started-with-gradle-integration-testing/)

## Test Reports

Reports can be found in **$buildDir/build/reports**:

* Unit Tests: $buildDir/build/reports/test/index.html

* Integration Tests: $buildDir/build/reports/integrationTest/index.html

* Acceptance Tests: $buildDir/build/reports/acceptanceTest/jbehave/view/reports.html


## Useful Links

* [TDD-Katas](https://github.com/garora/TDD-Katas)
* [Spring Boot](http://projects.spring.io/spring-boot/)
* [Rest Assured](http://rest-assured.io/)
