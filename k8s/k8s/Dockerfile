#FORM means Dockerfile is based on the image 使用到的Docker Image 名稱
FROM openjdk:17
#EXPOSE means listen on port 8080 指定對外開放的Port
EXPOSE 8080
#ADD means copy the jar file to the container 把Local的檔案複製到Docker Image中
ADD target/docker-demo.jar docker-demo.jar
#ENTRYPOINT means run the jar file 是Image運行時 Container 要運行的 Executable 指令
ENTRYPOINT ["java", "-jar", "docker-demo.jar"]