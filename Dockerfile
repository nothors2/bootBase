FROM maven:3.3-jdk-8
WORKDIR my-vol
ADD ./springboot-server-start.sh springboot-server-start.sh
ENTRYPOINT ["/bin/sh","springboot-server-start.sh"]