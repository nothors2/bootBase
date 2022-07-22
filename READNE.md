#docker 설정 

###프로젝트 경로에서 
cd /bootBase

###build
docker build -f Dockerfile -t boot-base .

###run
docker run --name boot-base -d -p 8000:8000 boot-base 