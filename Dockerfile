FROM openjdk:8
ADD target/UserAccount-1.0.jar UserAccount.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "UserAccount.jar"]