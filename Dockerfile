FROM eclipse-temurin:17.0.8_7-jre
EXPOSE 9000
WORKDIR /opt/app
COPY build/libs/*.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]