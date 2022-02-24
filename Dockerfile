#FROM adoptopenjdk/openjdk11:latest
FROM amazoncorretto:11

EXPOSE 8080

ADD target/gjg.jar gjg.jar

#revertToChanges

ENTRYPOINT ["java","-jar","/gjg.jar"]
