FROM maven:3.3-jdk-8
WORKDIR my-vol
# ADD ./springboot-server-start.sh app.sh
ENTRYPOINT ["/bin/sh","springboot-server-start.sh"]