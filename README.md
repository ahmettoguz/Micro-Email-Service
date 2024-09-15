-----------------------------------------------------------------------------------
Apache Maven 3.9.5 
java version: openjdk-21.0.2
-----------------------------------------------------------------------------------
to run in prod
create application-prod.properties file as copy of the dev.properties
change port to 80


to run local fill username and password of the sender
-----------------------------------------------------------------------------------
docker build -t micro-email-service-image .

docker run -d -p 8080:80 --name micro-email-service-container micro-email-service-image

docker ps -a

docker rm -f micro-email-service-container

mvnw spring-boot:run

swagger:
http://localhost/sw/swagger-ui/index.html
http://localhost/sw/v3/api-docs