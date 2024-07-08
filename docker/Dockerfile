#FROM ubuntu:latest
#LABEL authors="ahamedhsenid"

#FROM openjdk:21
#ARG
#COPY ./out/production/DockerApplication/ /tmp
#WORKDIR /tmp
#ENTRYPOINT ["java","HelloWorld"]

#ENTRYPOINT ["top", "-b"]


FROM openjdk:21
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/app.jar"]