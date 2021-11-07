FROM openjdk:11-slim
EXPOSE 8090
COPY  build/libs/spring-boot-api-for-jenkins-0.0.1-SNAPSHOT.jar spring-boot-api-for-jenkins-0.0.1-SNAPSHOT.jar
CMD java -jar /spring-boot-api-for-jenkins-0.0.1-SNAPSHOT.jar