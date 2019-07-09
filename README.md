# Docker auto build
Simple Dockerfile to multi-stage Spring Boot builds
```
FROM gradle AS build
COPY . /build
WORKDIR /build
RUN gradle build

FROM openjdk:8-jdk-alpine AS final
COPY --from=build /build/build/libs/*.jar /app/
WORKDIR /app
CMD  java -jar $(ls)
EXPOSE 8080
```
If you link GitHub repository to DockerHub each time when you push changes, your application in the container will be rebuilt

https://hub.docker.com/r/taraj2/docker-auto-build
