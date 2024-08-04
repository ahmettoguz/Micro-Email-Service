-----------------------------------------------------------------------------------
create application-prod.properties file as copy of the dev.properties
change port to 80

-----------------------------------------------------------------------------------
docker build -t micro-email-service-image .

docker run -d -p 8080:80 --name micro-email-service-container micro-email-service-image

docker ps -a

docker rm -f micro-email-service-container

mvnw spring-boot:run

swagger:
http://localhost/email/sw/swagger-ui/index.html
http://localhost/email/sw/v3/api-docs