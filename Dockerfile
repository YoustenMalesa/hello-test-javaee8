FROM airhacks/glassfish
COPY ./target/hello-test.war ${DEPLOYMENT_DIR}
