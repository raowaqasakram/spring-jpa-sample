FROM openjdk:8u121-jdk-alpine

# Keep consistent with build.gradle
ENV APP_JAR_NAME spring-jpa-sample

# Install curl
RUN apk --update add curl bash && \
	rm -rf /var/cache/apk/*

RUN mkdir /app

ADD ${APP_JAR_NAME}.jar /app/
ADD run.sh /app/
RUN chmod +x /app/run.sh

WORKDIR /app

EXPOSE 8888

ENTRYPOINT ["/bin/bash","-c"]
CMD ["/app/run.sh"]
