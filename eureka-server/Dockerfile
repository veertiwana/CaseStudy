FROM openjdk
LABEL maintainer="abc@mail.com"
EXPOSE 8761
WORKDIR /app
COPY target/demo-0.0.1-SNAPSHOT.jar /app/demo-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar","demo-0.0.1-SNAPSHOT.jar"]