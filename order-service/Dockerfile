FROM openjdk:17
COPY target/*.jar app.jar
EXPOSE 8081
ENV SPRING_DATASOURCE_URL=jdbc:mysql://mysql_db:3307/product_service
ENV SPRING_DATASOURCE_USERNAME=root
ENV SPRING_DATASOURCE_PASSWORD=root
CMD ["java", "-jar", "app.jar"]
