FROM java:8
MAINTAINER zwj
ADD demo-0.0.1-SNAPSHOT.jar  /app.jar
EXPOSE 8080
ENTRYPOINT ["/usr/bin/java","-jar","app.jar"]
