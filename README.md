Node 40 Intro to Dropwizard

- Clone repo locally via ZIP or from the command line
- Open up a terminal and navigate to the newly cloned directory
- Run the following command, which starts the project: 
  - `mvn package && java -jar target/hello-world-0.0.1-SNAPSHOT.jar server hello-world.yml`
- With the previous terminal still running, navigate to a new terminal tab and run `curl http://localhost:8080/hello-world` 
- **Expected output:** Hello! How are you today?

