mvnw.cmd clean package -DskipTests 

docker pull eclipse-temurin:17-jdk-jammy

docker-compose down -v --rmi all
docker-compose up --build