# Build
mvn clean package && docker build -t za.co.playit/hello-test .

# RUN

docker rm -f hello-test || true && docker run -d -p 8080:8080 -p 4848:4848 --name hello-test za.co.playit/hello-test 