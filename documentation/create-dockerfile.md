# Create DockerFile from Maven Wrapper

- We need to create dockerize to our application

- First step of dockerize, it would be need to create docker file 

```
FROM openjdk:11-jdk-alpine

EXPOSE 8080

ADD target/gjg.jar gjg.jar

ENTRYPOINT["java","-jar","/gjg.jar"]
```

- After then, you could be use the maven wrapper for build to docker image on local
```
arbade@Ardas-MacBook-Pro gjc % ls
Dockerfile      HELP.md         README.md       gjc.iml         mvnw            mvnw.cmd        pom.xml         src             target
arbade@Ardas-MacBook-Pro gjc % ./mvnw spring-boot:build-image

[INFO] Scanning for projects...
[INFO]
[INFO] ---------------------------< com.arbade:gjc >---------------------------
[INFO] Building gjc 0.0.1-SNAPSHOT
[INFO] --------------------------------[ jar ]---------------------------------
[INFO]
[INFO] >>> spring-boot-maven-plugin:2.4.2:build-image (default-cli) > package @ gjc >>>
[INFO]
[INFO] --- maven-resources-plugin:3.2.0:resources (default-resources) @ gjc ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] Using 'UTF-8' encoding to copy filtered properties files.
[INFO] Copying 1 resource
[INFO] Copying 0 resource
[INFO]
[INFO] --- maven-compiler-plugin:3.8.1:compile (default-compile) @ gjc ---
[INFO] Nothing to compile - all classes are up to date
[INFO]
[INFO] --- maven-resources-plugin:3.2.0:testResources (default-testResources) @ gjc ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] Using 'UTF-8' encoding to copy filtered properties files.
[INFO] skip non existing resourceDirectory /Users/arbade/Desktop/gjc/src/test/resources
[INFO]
[INFO] --- maven-compiler-plugin:3.8.1:testCompile (default-testCompile) @ gjc ---
[INFO] Nothing to compile - all classes are up to date
[INFO]
[INFO] --- maven-surefire-plugin:2.22.2:test (default-test) @ gjc ---
[INFO] Tests are skipped.
[INFO]
[INFO] --- maven-jar-plugin:3.2.0:jar (default-jar) @ gjc ---
[INFO] Building jar: /Users/arbade/Desktop/gjc/target/gjg.jar
[INFO]
[INFO] --- spring-boot-maven-plugin:2.4.2:repackage (repackage) @ gjc ---
[INFO] Replacing main artifact with repackaged archive
[INFO]
[INFO] <<< spring-boot-maven-plugin:2.4.2:build-image (default-cli) < package @ gjc <<<
[INFO]
[INFO]
[INFO] --- spring-boot-maven-plugin:2.4.2:build-image (default-cli) @ gjc ---
[INFO] Building image 'docker.io/library/gjc:0.0.1-SNAPSHOT'
[INFO]
[INFO]  > Pulling builder image 'docker.io/paketobuildpacks/builder:base' 0%
[INFO]  > Pulling builder image 'docker.io/paketobuildpacks/builder:base' 2%
[INFO]  > Pulling builder image 'docker.io/paketobuildpacks/builder:base' 2%
[INFO]  > Pulling builder image 'docker.io/paketobuildpacks/builder:base' 2%
[INFO]  > Pulling builder image 'docker.io/paketobuildpacks/builder:base' 3%
[INFO]  > Pulling builder image 'docker.io/paketobuildpacks/builder:base' 3%
[INFO]  > Pulling builder image 'docker.io/paketobuildpacks/builder:base' 4%
[INFO]  > Pulling builder image 'docker.io/paketobuildpacks/builder:base' 4%
[INFO]  > Pulling builder image 'docker.io/paketobuildpacks/builder:base' 4%
[INFO]  > Pulling builder image 'docker.io/paketobuildpacks/builder:base' 5%
[INFO]  > Pulling builder image 'docker.io/paketobuildpacks/builder:base' 5%
[INFO]  > Pulling builder image 'docker.io/paketobuildpacks/builder:base' 6%
[INFO]  > Pulling builder image 'docker.io/paketobuildpacks/builder:base' 6%
[INFO]  > Pulling builder image 'docker.io/paketobuildpacks/builder:base' 6%
[INFO]  > Pulling builder image 'docker.io/paketobuildpacks/builder:base' 6%
[INFO]  > Pulling builder image 'docker.io/paketobuildpacks/builder:base' 7%
[INFO]  > Pulling builder image 'docker.io/paketobuildpacks/builder:base' 7%
[INFO]  > Pulling builder image 'docker.io/paketobuildpacks/builder:base' 7%
[INFO]  > Pulling builder image 'docker.io/paketobuildpacks/builder:base' 7%
[INFO]  > Pulling builder image 'docker.io/paketobuildpacks/builder:base' 7%
[INFO]  > Pulling builder image 'docker.io/paketobuildpacks/builder:base' 8%
[INFO]  > Pulling builder image 'docker.io/paketobuildpacks/builder:base' 11%
[INFO]  > Pulling builder image 'docker.io/paketobuildpacks/builder:base' 12%
[INFO]  > Pulling builder image 'docker.io/paketobuildpacks/builder:base' 12%
[INFO]  > Pulling builder image 'docker.io/paketobuildpacks/builder:base' 13%
[INFO]  > Pulling builder image 'docker.io/paketobuildpacks/builder:base' 13%
[INFO]  > Pulling builder image 'docker.io/paketobuildpacks/builder:base' 14%
[INFO]  > Pulling builder image 'docker.io/paketobuildpacks/builder:base' 14%
[INFO]  > Pulling builder image 'docker.io/paketobuildpacks/builder:base' 15%
[INFO]  > Pulling builder image 'docker.io/paketobuildpacks/builder:base' 16%
[INFO]  > Pulling builder image 'docker.io/paketobuildpacks/builder:base' 16%
[INFO]  > Pulling builder image 'docker.io/paketobuildpacks/builder:base' 17%
[INFO]  > Pulling builder image 'docker.io/paketobuildpacks/builder:base' 17%
[INFO]  > Pulling builder image 'docker.io/paketobuildpacks/builder:base' 18%
[INFO]  > Pulling builder image 'docker.io/paketobuildpacks/builder:base' 19%
[INFO]  > Pulling builder image 'docker.io/paketobuildpacks/builder:base' 20%
[INFO]  > Pulling builder image 'docker.io/paketobuildpacks/builder:base' 21%
[INFO]  > Pulling builder image 'docker.io/paketobuildpacks/builder:base' 21%
[INFO]  > Pulling builder image 'docker.io/paketobuildpacks/builder:base' 22%
[INFO]  > Pulling builder image 'docker.io/paketobuildpacks/builder:base' 23%
[INFO]  > Pulling builder image 'docker.io/paketobuildpacks/builder:base' 23%
[INFO]  > Pulling builder image 'docker.io/paketobuildpacks/builder:base' 24%
[INFO]  > Pulling builder image 'docker.io/paketobuildpacks/builder:base' 25%
[INFO]  > Pulling builder image 'docker.io/paketobuildpacks/builder:base' 26%
[INFO]  > Pulling builder image 'docker.io/paketobuildpacks/builder:base' 27%
[INFO]  > Pulling builder image 'docker.io/paketobuildpacks/builder:base' 27%
[INFO]  > Pulling builder image 'docker.io/paketobuildpacks/builder:base' 27%
[INFO]  > Pulling builder image 'docker.io/paketobuildpacks/builder:base' 27%
[INFO]  > Pulling builder image 'docker.io/paketobuildpacks/builder:base' 28%
[INFO]  > Pulling builder image 'docker.io/paketobuildpacks/builder:base' 28%
[INFO]  > Pulling builder image 'docker.io/paketobuildpacks/builder:base' 29%
[INFO]  > Pulling builder image 'docker.io/paketobuildpacks/builder:base' 29%
[INFO]  > Pulling builder image 'docker.io/paketobuildpacks/builder:base' 30%
[INFO]  > Pulling builder image 'docker.io/paketobuildpacks/builder:base' 30%
[INFO]  > Pulling builder image 'docker.io/paketobuildpacks/builder:base' 31%
[INFO]  > Pulling builder image 'docker.io/paketobuildpacks/builder:base' 31%
[INFO]  > Pulling builder image 'docker.io/paketobuildpacks/builder:base' 32%
[INFO]  > Pulling builder image 'docker.io/paketobuildpacks/builder:base' 33%
[INFO]  > Pulling builder image 'docker.io/paketobuildpacks/builder:base' 34%
[INFO]  > Pulling builder image 'docker.io/paketobuildpacks/builder:base' 35%
[INFO]  > Pulling builder image 'docker.io/paketobuildpacks/builder:base' 36%
[INFO]  > Pulling builder image 'docker.io/paketobuildpacks/builder:base' 36%
[INFO]  > Pulling builder image 'docker.io/paketobuildpacks/builder:base' 38%
[INFO]  > Pulling builder image 'docker.io/paketobuildpacks/builder:base' 42%
[INFO]  > Pulling builder image 'docker.io/paketobuildpacks/builder:base' 56%
[INFO]  > Pulling builder image 'docker.io/paketobuildpacks/builder:base' 67%
[INFO]  > Pulling builder image 'docker.io/paketobuildpacks/builder:base' 79%
[INFO]  > Pulling builder image 'docker.io/paketobuildpacks/builder:base' 82%
[INFO]  > Pulling builder image 'docker.io/paketobuildpacks/builder:base' 84%
[INFO]  > Pulling builder image 'docker.io/paketobuildpacks/builder:base' 87%
[INFO]  > Pulling builder image 'docker.io/paketobuildpacks/builder:base' 88%
[INFO]  > Pulling builder image 'docker.io/paketobuildpacks/builder:base' 91%
[INFO]  > Pulling builder image 'docker.io/paketobuildpacks/builder:base' 100%
[INFO]  > Pulled builder image 'paketobuildpacks/builder@sha256:a2b5d388b1874f812e47c38d4e93c4757e9c0fe9a9d7a9371a47278d3a2e3978'
[INFO]  > Pulling run image 'docker.io/paketobuildpacks/run:base-cnb' 0%
[INFO]  > Pulling run image 'docker.io/paketobuildpacks/run:base-cnb' 22%
[INFO]  > Pulling run image 'docker.io/paketobuildpacks/run:base-cnb' 26%
[INFO]  > Pulling run image 'docker.io/paketobuildpacks/run:base-cnb' 27%
[INFO]  > Pulling run image 'docker.io/paketobuildpacks/run:base-cnb' 27%
[INFO]  > Pulling run image 'docker.io/paketobuildpacks/run:base-cnb' 100%
[INFO]  > Pulled run image 'paketobuildpacks/run@sha256:6e230c0a716723b1f253f55ca21c87d42411f4f28cf1323d7deabd9e9b6bb94b'
[INFO]  > Executing lifecycle version v0.10.2
[INFO]  > Using build cache volume 'pack-cache-1366e642f1b1.build'
[INFO]
[INFO]  > Running creator
[INFO]     [creator]     ===> DETECTING
[INFO]     [creator]     5 of 18 buildpacks participating
[INFO]     [creator]     paketo-buildpacks/ca-certificates   1.0.1
[INFO]     [creator]     paketo-buildpacks/bellsoft-liberica 6.2.0
[INFO]     [creator]     paketo-buildpacks/executable-jar    3.1.3
[INFO]     [creator]     paketo-buildpacks/dist-zip          2.2.2
[INFO]     [creator]     paketo-buildpacks/spring-boot       3.5.0
[INFO]     [creator]     ===> ANALYZING
[INFO]     [creator]     Previous image with name "docker.io/library/gjc:0.0.1-SNAPSHOT" not found
[INFO]     [creator]     ===> RESTORING
[INFO]     [creator]     ===> BUILDING
[INFO]     [creator]
[INFO]     [creator]     Paketo CA Certificates Buildpack 1.0.1
[INFO]     [creator]       https://github.com/paketo-buildpacks/ca-certificates
[INFO]     [creator]       Launch Helper: Contributing to layer
[INFO]     [creator]         Creating /layers/paketo-buildpacks_ca-certificates/helper/exec.d/ca-certificates-helper
[INFO]     [creator]         Writing profile.d/helper
[INFO]     [creator]
[INFO]     [creator]     Paketo BellSoft Liberica Buildpack 6.2.0
[INFO]     [creator]       https://github.com/paketo-buildpacks/bellsoft-liberica
[INFO]     [creator]       Build Configuration:
[INFO]     [creator]         $BP_JVM_VERSION              11.*            the Java version
[INFO]     [creator]       Launch Configuration:
[INFO]     [creator]         $BPL_JVM_HEAD_ROOM           0               the headroom in memory calculation
[INFO]     [creator]         $BPL_JVM_LOADED_CLASS_COUNT  35% of classes  the number of loaded classes in memory calculation
[INFO]     [creator]         $BPL_JVM_THREAD_COUNT        250             the number of threads in memory calculation
[INFO]     [creator]         $JAVA_TOOL_OPTIONS                           the JVM launch flags
[INFO]     [creator]       BellSoft Liberica JRE 11.0.10: Contributing to layer
[INFO]     [creator]         Downloading from https://github.com/bell-sw/Liberica/releases/download/11.0.10+9/bellsoft-jre11.0.10+9-linux-amd64.tar.gz
[INFO]     [creator]         Verifying checksum
[INFO]     [creator]         Expanding to /layers/paketo-buildpacks_bellsoft-liberica/jre
[INFO]     [creator]         Adding 138 container CA certificates to JVM truststore
[INFO]     [creator]         Writing env.launch/BPI_APPLICATION_PATH.default
[INFO]     [creator]         Writing env.launch/BPI_JVM_CACERTS.default
[INFO]     [creator]         Writing env.launch/BPI_JVM_CLASS_COUNT.default
[INFO]     [creator]         Writing env.launch/BPI_JVM_SECURITY_PROVIDERS.default
[INFO]     [creator]         Writing env.launch/JAVA_HOME.default
[INFO]     [creator]         Writing env.launch/MALLOC_ARENA_MAX.default
[INFO]     [creator]       Launch Helper: Contributing to layer
[INFO]     [creator]         Creating /layers/paketo-buildpacks_bellsoft-liberica/helper/exec.d/active-processor-count
[INFO]     [creator]         Creating /layers/paketo-buildpacks_bellsoft-liberica/helper/exec.d/java-opts
[INFO]     [creator]         Creating /layers/paketo-buildpacks_bellsoft-liberica/helper/exec.d/link-local-dns
[INFO]     [creator]         Creating /layers/paketo-buildpacks_bellsoft-liberica/helper/exec.d/memory-calculator
[INFO]     [creator]         Creating /layers/paketo-buildpacks_bellsoft-liberica/helper/exec.d/openssl-certificate-loader
[INFO]     [creator]         Creating /layers/paketo-buildpacks_bellsoft-liberica/helper/exec.d/security-providers-configurer
[INFO]     [creator]         Creating /layers/paketo-buildpacks_bellsoft-liberica/helper/exec.d/security-providers-classpath-9
[INFO]     [creator]         Writing profile.d/helper
[INFO]     [creator]       JVMKill Agent 1.16.0: Contributing to layer
[INFO]     [creator]         Downloading from https://github.com/cloudfoundry/jvmkill/releases/download/v1.16.0.RELEASE/jvmkill-1.16.0-RELEASE.so
[INFO]     [creator]         Verifying checksum
[INFO]     [creator]         Copying to /layers/paketo-buildpacks_bellsoft-liberica/jvmkill
[INFO]     [creator]         Writing env.launch/JAVA_TOOL_OPTIONS.append
[INFO]     [creator]         Writing env.launch/JAVA_TOOL_OPTIONS.delim
[INFO]     [creator]       Java Security Properties: Contributing to layer
[INFO]     [creator]         Writing env.launch/JAVA_SECURITY_PROPERTIES.default
[INFO]     [creator]         Writing env.launch/JAVA_TOOL_OPTIONS.append
[INFO]     [creator]         Writing env.launch/JAVA_TOOL_OPTIONS.delim
[INFO]     [creator]
[INFO]     [creator]     Paketo Executable JAR Buildpack 3.1.3
[INFO]     [creator]       https://github.com/paketo-buildpacks/executable-jar
[INFO]     [creator]         Writing env.launch/CLASSPATH.delim
[INFO]     [creator]         Writing env.launch/CLASSPATH.prepend
[INFO]     [creator]       Process types:
[INFO]     [creator]         executable-jar: java org.springframework.boot.loader.JarLauncher
[INFO]     [creator]         task:           java org.springframework.boot.loader.JarLauncher
[INFO]     [creator]         web:            java org.springframework.boot.loader.JarLauncher
[INFO]     [creator]
[INFO]     [creator]     Paketo Spring Boot Buildpack 3.5.0
[INFO]     [creator]       https://github.com/paketo-buildpacks/spring-boot
[INFO]     [creator]       Creating slices from layers index
[INFO]     [creator]         dependencies
[INFO]     [creator]         spring-boot-loader
[INFO]     [creator]         snapshot-dependencies
[INFO]     [creator]         application
[INFO]     [creator]       Launch Helper: Contributing to layer
[INFO]     [creator]         Creating /layers/paketo-buildpacks_spring-boot/helper/exec.d/spring-cloud-bindings
[INFO]     [creator]         Writing profile.d/helper
[INFO]     [creator]       Web Application Type: Contributing to layer
[INFO]     [creator]         Servlet web application detected
[INFO]     [creator]         Writing env.launch/BPL_JVM_THREAD_COUNT.default
[INFO]     [creator]       Spring Cloud Bindings 1.7.0: Contributing to layer
[INFO]     [creator]         Downloading from https://repo.spring.io/release/org/springframework/cloud/spring-cloud-bindings/1.7.0/spring-cloud-bindings-1.7.0.jar
[INFO]     [creator]         Verifying checksum
[INFO]     [creator]         Copying to /layers/paketo-buildpacks_spring-boot/spring-cloud-bindings
[INFO]     [creator]       4 application slices
[INFO]     [creator]       Image labels:
[INFO]     [creator]         org.opencontainers.image.title
[INFO]     [creator]         org.opencontainers.image.version
[INFO]     [creator]         org.springframework.boot.spring-configuration-metadata.json
[INFO]     [creator]         org.springframework.boot.version
[INFO]     [creator]     ===> EXPORTING
[INFO]     [creator]     Adding layer 'paketo-buildpacks/ca-certificates:helper'
[INFO]     [creator]     Adding layer 'paketo-buildpacks/bellsoft-liberica:helper'
[INFO]     [creator]     Adding layer 'paketo-buildpacks/bellsoft-liberica:java-security-properties'
[INFO]     [creator]     Adding layer 'paketo-buildpacks/bellsoft-liberica:jre'
[INFO]     [creator]     Adding layer 'paketo-buildpacks/bellsoft-liberica:jvmkill'
[INFO]     [creator]     Adding layer 'paketo-buildpacks/executable-jar:class-path'
[INFO]     [creator]     Adding layer 'paketo-buildpacks/spring-boot:helper'
[INFO]     [creator]     Adding layer 'paketo-buildpacks/spring-boot:spring-cloud-bindings'
[INFO]     [creator]     Adding layer 'paketo-buildpacks/spring-boot:web-application-type'
[INFO]     [creator]     Adding 5/5 app layer(s)
[INFO]     [creator]     Adding layer 'launcher'
[INFO]     [creator]     Adding layer 'config'
[INFO]     [creator]     Adding layer 'process-types'
[INFO]     [creator]     Adding label 'io.buildpacks.lifecycle.metadata'
[INFO]     [creator]     Adding label 'io.buildpacks.build.metadata'
[INFO]     [creator]     Adding label 'io.buildpacks.project.metadata'
[INFO]     [creator]     Adding label 'org.opencontainers.image.title'
[INFO]     [creator]     Adding label 'org.opencontainers.image.version'
[INFO]     [creator]     Adding label 'org.springframework.boot.spring-configuration-metadata.json'
[INFO]     [creator]     Adding label 'org.springframework.boot.version'
[INFO]     [creator]     Setting default process type 'web'
[INFO]     [creator]     *** Images (11e9134d723f):
[INFO]     [creator]           docker.io/library/gjc:0.0.1-SNAPSHOT
[INFO]
[INFO] Successfully built image 'docker.io/library/gjc:0.0.1-SNAPSHOT'
[INFO]
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  04:39 min
[INFO] Finished at: 2021-01-29T13:07:31+03:00
[INFO] ------------------------------------------------------------------------
arbade@Ardas-MacBook-Pro gjc %
arbade@Ardas-MacBook-Pro gjc` % docker images

REPOSITORY                                   TAG                 IMAGE ID            CREATED             SIZE
gjc                                          0.0.1-SNAPSHOT      11e9134d723f        2 seconds ago        293MB

```