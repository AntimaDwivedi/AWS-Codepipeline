FROM openjdk:17
EXPOSE 8080
ADD target/spring-boot-ecr-demo.jar spring-boot-ecr-demo.jar

ENTRYPOINT ["java", "-jar","/spring-boot-ecr-demo.jar"]