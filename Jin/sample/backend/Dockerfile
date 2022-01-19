# jdk 8 버전의 환경을 구축
FROM openjdk:8-jdk-alpine
# gradle이 build된 파일이 생성되는 build/libs에 있는 jar파일을 JAR_FILE이라는 변수로 선언
ARG JAR_FILE=build/libs/*.jar
# 위에서 선언한 JAR_FILE을 app.jar로 복사
COPY ${JAR_FILE} app.jar
# jar파일을 실행하는 명령어 (cmd > java -jar -jarfilename.jar )
ENTRYPOINT ["java", "-jar", "/app.jar"]