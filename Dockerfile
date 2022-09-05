#FROM anapsix/alpine-java:8
FROM openjdk:8-jdk-alpine
#EXPOSE 8081
RUN apk --no-cache add curl
RUN apk --no-cache add nmap
RUN apk --no-cache add bind-tools
ADD /target/App1.jar /application/App1.jar
CMD java -jar /application/App1.jar
#ENTRYPOINT ["java","-jar","-Xms512m","-Xmx512m","-Xmn200m","-Xss256k","/application/eureka.jar","--debug"]
#CMD java -jar -Xms512m -Xmx512m -Xmn200m -Xss256k /home/spring_cloud/eureka.jar --debug

