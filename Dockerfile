FROM openjdk:17
EXPOSE 8080
ADD target/swe645assignment3-v1.jar swe645assignment3-v1.jar
ENTRYPOINT ["java", "-jar", "/swe645assignment3-v1.jar"]