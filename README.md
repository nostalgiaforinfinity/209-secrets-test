# Secret Manager Config Test

This is a demo project [this for issue](https://github.com/quarkiverse/quarkus-google-cloud-services/issues/209)

Here's how to reproduce:

* Create a Secret Manager secret called `209-test`
* Change `quarkus.google.cloud.project-id` to match your project
* Create a service account, download keyfile, and grand access to secret
* Build and run (see below)

Build as normal: 

```
./gradlew build
docker build -t 209-test -f src/main/docker/Dockerfile.jvm .
```

Run, and mount your SA keyfile, and the service will halt immediately with a `ContextNotActiveException`. E.g.:

```
docker run -i -v "/home/fungrim/Dev/Repo/fungrim/sm-test/key.json:/deployments/sa-key.json" -e "GOOGLE_APPLICATION_CREDENTIALS=/deployments/sa-key.json" 209-test
```

_Here's how to make it magically start working_: exclude the `io.quarkus:quarkus-smallrye-jwt` dependency. 
