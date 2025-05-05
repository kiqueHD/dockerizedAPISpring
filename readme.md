# Comandos Maven

Para usar los comandos sin instalar Maven, utiliza `mvnw.cmd` para Windows y `./mvnw` en Linux.

| Comando                  | Descripción                                      |
|--------------------------|--------------------------------------------------|
| `mvn clean`              | Limpia el directorio target                      |
| `mvn compile`            | Compila el código fuente                         |
| `mvn test`               | Ejecuta los tests                                |
| `mvn package`            | Empaqueta el proyecto en un JAR/WAR              |
| `mvn install`            | Instala el artefacto en tu repositorio local     |
| `mvn spring-boot:run`    | Inicia la aplicación Spring Boot                 |
| `mvn clean package`      | Empaqueta el jar                                 |

# Comandos Docker

| Comando                                   | Descripción                                 |
|--------------------------------------------|---------------------------------------------|
| `docker-compose up --build`                | Construye y levanta los contenedores        |
| `docker-compose down`                      | Detiene y elimina contenedores              |
| `docker-compose down -v`                   | Elimina contenedores y volúmenes            |
| `docker-compose logs -f`                   | Muestra logs en tiempo real                 |
| `docker ps`                                | Lista contenedores en ejecución             |
| `docker ps -a`                             | Lista todos los contenedores                |
| `docker images`                            | Lista imágenes locales                      |
| `docker rmi <imagen>`                      | Elimina una imagen                          |
| `docker exec -it <contenedor> bash`        | Accede al shell del contenedor              |
| `docker logs <contenedor>`                 | Muestra logs de un contenedor               |

## Al hacer cambios en la API

Genera el jar de nuevo y vuelve a levantar el docker compose:

mvn clean package # se puede añadir -DskipTests por si no esta preparado para tests
docker-compose up --build

Debug:

docker-compose logs -f app  # Ver logs de la aplicación
docker exec -it app bash    # Acceder al contenedor


Reiniciar:

docker-compose down -v
docker-compose up --build 