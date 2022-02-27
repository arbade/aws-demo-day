#FROM adoptopenjdk/openjdk11:latest
FROM public.ecr.aws/j1g4g9x2/openjdk:latest

EXPOSE 8080

ADD target/gjg.jar gjg.jar

#revertToChanges

ENTRYPOINT ["java","-jar","/gjg.jar"]
