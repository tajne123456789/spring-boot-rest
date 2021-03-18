from openshift/openjdk-11

USER jhavelka
EXPOSE 8080/tcp
ADD spring-boot-rest-example-0.0.1-SNAPSHOT.jar
