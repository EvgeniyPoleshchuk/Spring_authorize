FROM eclipse-temurin:17-jdk-jammy
ADD target/netology-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8080
CMD ["java","-jar","app.jar"]
