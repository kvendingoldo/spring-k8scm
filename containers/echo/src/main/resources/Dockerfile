FROM openjdk:11

ADD echo-service.jar /spring-k8scm/echo-service.jar

WORKDIR /spring-k8scm

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "echo-service.jar"]