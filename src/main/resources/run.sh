#!/usr/bin/env bash
java -Djava.security.egd=file:/dev/urandom -Dspring.profiles.active=${SPRING_ACTIVE_PROFILE} -Dgit.config.active.branch=${GIT_BRANCH_LABEL} -Duser.timezone=Asia/Kolkata -XX:+PrintFlagsFinal $JAVA_OPTIONS -jar ${APP_JAR_NAME}.jar
