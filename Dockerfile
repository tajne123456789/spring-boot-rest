FROM openshift/openjdk-11

USER jhavelka
EXPOSE 8080/tcp
ADD spring-boot-rest-example.jar
