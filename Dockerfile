FROM maven:3.3-jdk-8
ADD ./springboot-server-start.sh app.sh
VOLUME /my-vol
ENTRYPOINT ["/bin/sh","app.sh"]