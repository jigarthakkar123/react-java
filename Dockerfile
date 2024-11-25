FROM openjdk:11-ea-17-jdk
VOLUME /tmp
COPY target/spring-boot-react-0.0.1-SNAPSHOP.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]