FROM gradle:jdk21
WORKDIR /app
COPY . .
RUN gradle bootJar --no-daemon
# Preimenuj jar fajl – uzmi bilo koji .jar u build/libs
RUN mv build/libs/*.jar app.jar
EXPOSE 8080
CMD ["java", "-jar", "app.jar"]
