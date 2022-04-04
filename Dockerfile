#FROM adoptopenjdk/openjdk11:latest
#FROM 060373812940.dkr.ecr.eu-central-1.amazonaws.com/openjdk:11
FROM amazoncorretto:11

EXPOSE 8080

ADD target/gjg.jar gjg.jar

##revertToChanges
ENTRYPOINT ["java","-jar","/gjg.jar"]
