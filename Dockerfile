FROM openjdk:17
EXPOSE 8080

# Menyalin file JAR yang dihasilkan ke dalam container
ADD target/DevOpsProject.jar /DevOpsProject.jar

# Menjalankan aplikasi Java menggunakan JAR
ENTRYPOINT ["java", "-jar", "/DevOpsProject.jar"]
