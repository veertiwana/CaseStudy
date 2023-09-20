FROM openjdk
LABEL maintainer="abc@mail.com"
EXPOSE 8083
WORKDIR /app
COPY target/Course-0.0.1-SNAPSHOT.jar /app/Course-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar","Course-0.0.1-SNAPSHOT.jar"]