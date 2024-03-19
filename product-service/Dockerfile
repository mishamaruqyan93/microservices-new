FROM openjdk:17
COPY target/*.jar app.jar
EXPOSE 8083
ENV SPRING_DATA_MONGODB_URI=mongodb://localhost:27017/product-service
CMD ["java", "-jar", "app.jar"]
