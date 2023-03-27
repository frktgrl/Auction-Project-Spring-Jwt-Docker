FROM openjdk:17
WORKDIR /app
ADD target/Angular-Spring-Boot-Auction-Project-0.0.1-SNAPSHOT.jar Angular-Spring-Boot-Auction-Project-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","-Dspring.profiles.active=docker","Angular-Spring-Boot-Auction-Project-0.0.1-SNAPSHOT.jar"]



