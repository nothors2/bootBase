#!/bin/bash
# clone git
git clone https://github.com/ojwman/sbp-shopping-mall

# move
cd sbp-shopping-mall

# build
mvn package

# run
cd target
java -jar sbp-shopping-mall-0.0.1-SNAPSHOT.jar