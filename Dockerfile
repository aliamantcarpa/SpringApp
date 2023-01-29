FROM openjdk:17
ARG JAR_FILE=target/SocialWeb-0.0.1-SNAPSHOT.jar
ADD ${JAR_FILE} SocialWebApp.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","SocialWebApp.jar"]