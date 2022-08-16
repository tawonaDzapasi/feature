curl -X POST "http://localhost:8081/api/shop" -H "accept: */*" -H "Content-Type: application/json" -d "{ \"area\": { \"id\": 5 }, \"name\": \"Econet First Street\"}"
curl -X GET "http://localhost:8081/api/shop?area=HARARE%20CBD" -H "accept: */*"

---
**NOTE**

install docker and docker compose plugin inside the server
package the application into a jar 
run docker-compose up on terminal to download required images both openjdk & mysql and the database is accessible at port 3306
enter the url http://localhost:8081/swagger-ui.html on browser and use the try-it-out option to test end-points

--