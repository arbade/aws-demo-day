# AWS DEMO DAY REST API 
![Spring Boot 2.4.2](https://img.shields.io/badge/spring--boot-2.4.2-green)
![Java 11](https://img.shields.io/badge/Java-11-green)
![Maven](https://img.shields.io/badge/maven-3.6.3-blue)
![Docker](https://img.shields.io/badge/docker%20build-passing-green)
![Image Size](https://img.shields.io/badge/image%20size-293%20MB-blue)
![Dependency](https://img.shields.io/badge/dependency-up--to--date-green)
![AWS ECR](https://img.shields.io/badge/aws-ecr-orange)
![AWS Fargate](https://img.shields.io/badge/aws-fargate-orange)
![AWS ECS](https://img.shields.io/badge/aws-ecs-orange)
![AWS ELB](https://img.shields.io/badge/aws-elb-orange)
![AWS CodeBuild](https://img.shields.io/badge/aws-codebuild-orange)
![AWS CodeDeploy](https://img.shields.io/badge/aws-codedeploy-orange)
![AWS CodePipeline](https://img.shields.io/badge/aws-codepipeline-orange)
![AWS Coretto](https://img.shields.io/badge/aws-coretto-orange)
![Spring-Fox](https://img.shields.io/badge/spring--fox-swagger-orange)
![JUnit](https://img.shields.io/badge/Junit-v5-blue)
![Mongo](https://img.shields.io/badge/MongoDB-cluster-brightgreen)


## AWS Community Day 2022

[![AWS Community Day 2022](https://img.youtube.com/vi/Oil8oJBBDIQ/sddefault.jpg)](https://youtu.be/Oil8oJBBDIQ "AWS Community Day 2022")
## Overall

Design a REST API endpoint that manages a game that uses a leaderboard with players submitting new scores from around the world. The service will only be responsible for submitting player scores and returning leaderboard data either globally or country-specific.
Players gain points by submitting scores and they are placed on the leaderboard by their scores. The player with the highest score will be at the top.

## Tech-Stack

- Maven 3.6.3

- Spring Boot 2.4.2

- Docker 19.03.13

- MongoDB Cluster (AWS)

- Swagger

- Lombok

- Java 11

- Amazon Corretto 11

- JPA Repository

- Amazon Web Service Elastic Contanier Registry (AWS ECR)

- Amazon Web Service Elastic Container Service (AWS ECS) via Fargate

- Amazon Web Service Application Load Balancer (AWS ALB)

- Amazon Web Service CodeBuild

- Amazon Web Service CodeDeploy

- Amazon Web Service CodePipeline

## Installation

- First of all, you need to clone the project from git on your local ``git clone https://github.com/arbade/gjg-restapi-demo.git``

- Clone and open in Intellij Idea IDE

- Apache Lombok for IntelliJ IDEA

- Install maven dependencies using IDE auto import or using the command `mvn clean install `

- Run the app using for Spring Side `mvn spring-boot:run` or or on Terminal for Jar files `java -jar target/gjc.jar`

- Browse the Swagger UI `http://localhost:8080/swagger-ui.html`


## Clusters Information

- It would be deployed to application and database on the cloud cluster.Cluster information is the available at the following content :

- MongoDB Cluster

- -  ```
     CLUSTER TIER -- M0 Sandbox (General)
     REGION -- AWS / Frankfurt (eu-central-1)
     TYPE -- Replica Set - 3 nodes
     ```

    


## Running the application locally

There are several ways to run a Spring Boot application on your local machine. One way is to execute the `main` method in the `com.arbade.gjc.GjcApplication` class from your IDE

First of all, you need to using the downloads plugin and you can use Maven Commands like so:

`mvn clean install`

After than, you will be able to see success message on your console like so:

```
[INFO] --- maven-install-plugin:2.5.2:install (default-install) @ gjc ---
[INFO] Installing /Users/arbade/Desktop/gjc/target/gjg.jar to /Users/arbade/.m2/repository/com/arbade/gjc/0.0.1-SNAPSHOT/gjc-0.0.1-SNAPSHOT.jar
[INFO] Installing /Users/arbade/Desktop/gjc/pom.xml to /Users/arbade/.m2/repository/com/arbade/gjc/0.0.1-SNAPSHOT/gjc-0.0.1-SNAPSHOT.pom
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  7.594 s
[INFO] Finished at: 2021-01-29T21:24:45+03:00
[INFO] ------------------------------------------------------------------------

```
Alternatively you can use the Spring Boot Maven plugin like so:

`mvn spring-boot:run`

After than you will be able to see that started message

`2021-01-29 21:24:43.877  INFO 13749 --- [  restartedMain] com.arbade.gjc.GjcApplication            : Starting GjcApplication using Java 11.0.7 on Ardas-MacBook-Pro.local with PID 13749 (/Users/arbade/Desktop/gjc/target/classes started by arbade in /Users/arbade/Desktop/gjc)`

## Running the application locally from Docker Image

There is a severaly on the way to run docker image on your local

- First way to run docker image pulling from docker hub

- - `docker pull ardabthn/arda-gjc:gjc`

- - ```
    arbade@Ardas-MacBook-Pro ~ % docker pull ardabthn/arda-gjc:gjc
    gjc: Pulling from ardabthn/arda-gjc
    Digest: sha256:cf1a60bba269fb274c20ea4798ae41731e22f104f3be9ea637d539e769b176fc
    Status: Downloaded newer image for ardabthn/arda-gjc:gjc
    docker.io/ardabthn/arda-gjc:gjc
    ```
- - ```
    arbade@Ardas-MacBook-Pro ~ % docker run -dp 8080:8080 ardabthn/arda-gjc:gjc
    e9e51844ed388490ea60024246a0f3888c4156f258a641792aff0417a50e99fb

    ```
- - you would be able to reach `localhost:8080/swagger-ui.html` for REST API Controller UI

- Another way to run docker image pulling from AWS ECR

- - `docker pull aws_account_id.dkr.ecr.us-west-2.amazonaws.com//gjc:latest`

- - ` docker run -dp 8080:8080 aws_account_id.dkr.ecr.us-west-2.amazonaws.com/deneme-232309/gjc`



## Table of Content

You will be able to see some specific documentation like as; creating DockerFile,DockerImage and API Endpoints 

| Content             | Context |   |   |   |
|---------------------|---------|---|---|---|
| Create Docker File  |[`build dockerfile`](documentation/create-dockerfile.md)         |   |   |   |
| Create Docker Image |[`build docker image`](documentation/create-docker-image.md)         |   |   |   |
| RESTFul API Methods |[`API References`](documentation/table-of-api-reference.md)         |   |   |   |

