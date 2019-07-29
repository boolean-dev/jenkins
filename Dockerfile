FROM java:latest

ENV SERVER_PORT 8080
ENV CONSUL_SERVER 127.0.0.1
ENV JVM_MEMORY 512M

COPY ./target/*.jar /tmp

RUN cp -f ./tmp/*.jar /app.jar

EXPOSE 8080

CMD echo "The application is starting..." && \
    java -Xmx${JVM_MEMORY} -jar /app.jar