FROM openjdk:17

# Menyalin file JAR yang dihasilkan ke dalam container
ADD DevOpsProject.jar /DevOpsProject.jar

# Menjalankan aplikasi Java menggunakan JAR
ENTRYPOINT ["java", "-jar", "/DevOpsProject.jar"]
