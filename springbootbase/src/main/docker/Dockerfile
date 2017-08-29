FROM java:8

EXPOSE 8080

#install Spring Boot artifact
VOLUME /tmp
ADD /maven/springbootbase-0.0.1-SNAPSHOT.jar springbootbase.jar
RUN sh -c 'touch /springbootbase.jar'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/springbootbase.jar"]
