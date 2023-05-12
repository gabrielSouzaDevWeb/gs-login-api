FROM openjdk:17

WORKDIR /app

COPY . /app

CMD ["./mvnw", "spring-boot:run"]