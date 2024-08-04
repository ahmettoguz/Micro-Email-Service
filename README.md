docker build -t micro-backend-image .

docker run -d -p 8080:80 --name micro-backend-container micro-backend-image

docker ps -a

docker rm -f micro-backend-container

mvnw spring-boot:run


create application-prod.properties file as copy of the dev.properties
change port to 80