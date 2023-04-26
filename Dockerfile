FROM openjdk:11
EXPOSE 6565
ADD target/jenkins-demo.jar jenkins-demo.jar
ENTRYPOINT ["java","-jar","/jenkins-demo.jar"]