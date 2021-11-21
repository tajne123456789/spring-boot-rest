FROM registry.access.redhat.com/ubi8/openjdk-11
EXPOSE 8080/tcp
ADD target/app.jar app.jar
CMD [ "sh", "-c", "java $JAVA_OPTS -DconfigBase=. -jar ./app.jar" ]
