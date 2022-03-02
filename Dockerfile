#FROM adoptopenjdk/openjdk11:latest
FROM 461902953491.dkr.ecr.eu-central-1.amazonaws.com/openjdk

EXPOSE 8080

ADD target/gjg.jar gjg.jar

#revertToChanges
#newPointAdded
ENTRYPOINT ["java","-jar","/gjg.jar"]
