#!/bin/bash
echo "start spring boot server"

# clone git
git clone https://github.com/nothors2/bootBase

# move
cd sbp-shopping-mall

# build
mvn package

# run
cd target
java -jar bootBase-1.0-SNAPSHOT.jar

echo "boot"
