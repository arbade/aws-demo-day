# GJG REST API DEMO
![Spring Boot 2.4.2](https://img.shields.io/badge/spring--boot-2.4.2-green)
![Java 11](https://img.shields.io/badge/Java-11-green)
![Maven](https://img.shields.io/badge/maven-3.6.3-blue)
![Docker](https://img.shields.io/badge/docker%20build-passing-green)
![Image Size](https://img.shields.io/badge/image%20size-293%20MB-blue)
![Dependency](https://img.shields.io/badge/dependency-up--to--date-green)
![Google Cloud](https://img.shields.io/badge/google--cloud-registery-blue)
![GKE](https://img.shields.io/badge/google--cloud-kubernetes-blue)
![Spring-Fox](https://img.shields.io/badge/spring--fox-swagger-orange)
![JUnit](https://img.shields.io/badge/Junit-v5-blue)
![Mongo](https://img.shields.io/badge/MongoDB-cluster-brightgreen)

## Overall

Design a REST API endpoint that manages a game that uses a leaderboard with players submitting new scores from around the world. The service will only be responsible for submitting player scores and returning leaderboard data either globally or country-specific.
Players gain points by submitting scores and they are placed on the leaderboard by their scores. The player with the highest score will be at the top.

## Pre-requirements

- Maven 3.6.3

- Spring Boot 2.4.2

- Docker 19.03.13

- MongoDB Cluster

- Swagger

- Lombok

- Java 11

- JPA Repository

- Google Cloud Registery

- Google Cloud Kubernetes Engine

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
- Google CLoud Kubernetes Engine CLuster

- - ```
    Cluster basics
    
    Name	                          nginx-1-cluster		
    Location type	                  Zonal		
    Master zone	                  europe-west3-c		
    Default node zones                europe-west3-c
    Total size	                  3		
    Endpoint	                  35.234.117.244
    	
    
    	
    Automation
   	
    Vertical Pod Autoscaling	   Enabled		
    Node auto-provisioning	           Disabled		
    Autoscaling profile	           Balanced	
    	
    Networking
   	
    Pod address range	          10.96.0.0/14		
    Maximum pods per node	          110		
    Service address range	          10.100.0.0/20		
    
    ```
    
### Nodes
| Name                                           | Status | CPU Request | CPU allocotable | Memory Request | Memory allocatable |   |   |   |
|------------------------------------------------|--------|-------------|-----------------|----------------|--------------------|---|---|---|
| gke-nginx-1-cluster-default-pool-fb23667d-2qqw |  Ready |   609 mCPU  |       940 mCPU  |      699.4 MB  |           2.97 GB  |   |   |   |
| gke-nginx-1-cluster-default-pool-fb23667d-fw7c |  Ready |   473 mCPU  |       940 mCPU  |     398.46 MB  |           2.97 GB  |   |   |   |
| gke-nginx-1-cluster-default-pool-fb23667d-n4mz |  Ready |   323 mCPU  |       940 mCPU  |     272.63 MB  |           2.97 GB  |   |   |   |    

        
        
It could be following the links for[`kubernetes-deployment`](/kubernetes.yml)

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

- Another way to run docker image pulling from Google Cloud Registery

- - `docker pull gcr.io/deneme-232309/gjc:latest`

- - ` docker run -dp 8080:8080 gcr.io/deneme-232309/gjc`



## Table of Content

You will be able to see some specific documentation like as; creating DockerFile,DockerImage and API Endpoints 

| Content             | Context |   |   |   |
|---------------------|---------|---|---|---|
| Create Docker File  |[`build dockerfile`](documentation/create-dockerfile.md)         |   |   |   |
| Create Docker Image |[`build docker image`](documentation/create-docker-image.md)         |   |   |   |
| RESTFul API Methods |[`API References`](documentation/table-of-api-reference.md)         |   |   |   |

