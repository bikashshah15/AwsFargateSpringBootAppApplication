FROM openjdk:17
EXPOSE 8080
ADD target/AWSFargateSpringBootApp-0.0.1-SNAPSHOT.jar AWSFargateSpringBootApp-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "AWSFargateSpringBootApp-0.0.1-SNAPSHOT.jar"]
