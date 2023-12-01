FROM openJDK:17- alpine
ADD target/Example.jar Example.jar
ENTRYPOINT["JAVA","-JAR","Example.jar"]
EXPOSE 8080