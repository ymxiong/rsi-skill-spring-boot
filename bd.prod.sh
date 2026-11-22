rm -rf core-starter/target/
mvn clean install -DskipTests
docker build -t apps.horsecoder.com:5000/s-4d3033a4c84f8af1d1a9fd20fd4d6d76-core:latest -f ./Dockerfile.prod .
docker push apps.horsecoder.com:5000/s-4d3033a4c84f8af1d1a9fd20fd4d6d76-core:latest
curl -X POST "http://apps.horsecoder.com:32871/task" -H "accept: application/json" -H "Content-Type: application/json" -d "{ \"image\": \"apps.horsecoder.com:5000/s-4d3033a4c84f8af1d1a9fd20fd4d6d76-core:latest\", \"name\": \"4d3033a4c84f8af1d1a9fd20fd4d6d76-core\", \"namespace\": \"horsecoder-test\", \"path\": \"/core/\", \"port\": 33477}"
