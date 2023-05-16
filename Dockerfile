FROM amazoncorretto:17-al2-jdk

MAINTAINER Mauro

COPY target/Portfolio-0.0.1-SNAPSHOT.jar app.jar

ENTRYPOINT ["java","-jar","/app.jar"]

 