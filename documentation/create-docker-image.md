# Create Docker Image, Add the Tag, Push Docker Hub

- First of all, we need to add a tag to our image after than we would be push to Docker Hub
```
arbade@Ardas-MacBook-Pro ~ % docker tag gjc:0.0.1-SNAPSHOT ardabthn/arda-gjc:gjc

arbade@Ardas-MacBook-Pro ~ % docker images
REPOSITORY                                   TAG                 IMAGE ID            CREATED             SIZE
ardabthn/arda-gjc                            gjc                 11e9134d723f        41 years ago        293MB
gjc                                          0.0.1-SNAPSHOT      11e9134d723f        41 years ago        293MB
arbade@Ardas-MacBook-Pro ~ % docker push ardabthn/arda-gjc:gjc

The push refers to repository [docker.io/ardabthn/arda-gjc]
1dc94a70dbaa: Pushed
daef5cd88a02: Pushed
576e5f5696c6: Pushed
5f70bf18a086: Pushed
77b5572f295b: Pushed
e5547256cfc7: Pushed
f1cac88359f1: Pushed
6763b99e3792: Pushed
c2e9ddddd4ef: Pushed
108b6855c4a6: Pushed
ab39aa8fd003: Pushed
0b18b1f120f4: Pushed
57f571dad50d: Pushed
ec0381c8f321: Pushed
6b80fd077840: Pushed
eb0f7cd0acf8: Pushed
4a2b616128d5: Pushed
056f2eb4d343: Pushed
d2c61d3c6ec0: Pushed
9f10818f1f96: Pushed
27502392e386: Pushed
c95d2191d777: Pushed
gjc: digest: sha256:cf1a60bba269fb274c20ea4798ae41731e22f104f3be9ea637d539e769b176fc size: 5123
arbade@Ardas-MacBook-Pro ~ %

```
- After then, you would be pull the image and run on your local as following content like that :

```
arbade@Ardas-MacBook-Pro ~ % docker run -p 8080:8080 -i -t ardabthn/arda-gjc:gjc
   Setting Active Processor Count to 6
   Calculating JVM memory based on 7465596K available memory
   Calculated JVM Memory Configuration: -XX:MaxDirectMemorySize=10M -Xmx6834057K -XX:MaxMetaspaceSize=119538K -XX:ReservedCodeCacheSize=240M -Xss1M (Total Memory: 7465596K, Thread Count: 250, Loaded Class Count: 18691, Headroom: 0%)
   Adding 138 container CA certificates to JVM truststore
   Spring Cloud Bindings Enabled
   Picked up JAVA_TOOL_OPTIONS: -Djava.security.properties=/layers/paketo-buildpacks_bellsoft-liberica/java-security-properties/java-security.properties -agentpath:/layers/paketo-buildpacks_bellsoft-liberica/jvmkill/jvmkill-1.16.0-RELEASE.so=printHeapHistogram=1 -XX:ActiveProcessorCount=6 -XX:MaxDirectMemorySize=10M -Xmx6834057K -XX:MaxMetaspaceSize=119538K -XX:ReservedCodeCacheSize=240M -Xss1M -Dorg.springframework.cloud.bindings.boot.enable=true
   
     .   ____          _            __ _ _
    /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
   ( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
    \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
     '  |____| .__|_| |_|_| |_\__, | / / / /
    =========|_|==============|___/=/_/_/_/
    :: Spring Boot ::                (v2.4.2)
   
   2021-01-29 10:32:35.464  INFO 1 --- [           main] com.arbade.gjc.GjcApplication            : Starting GjcApplication v0.0.1-SNAPSHOT using Java 11.0.10 on 5f76d2daad60 with PID 1 (/workspace/BOOT-INF/classes started by cnb in /workspace)
   2021-01-29 10:32:35.471  INFO 1 --- [           main] com.arbade.gjc.GjcApplication            : No active profile set, falling back to default profiles: default
   2021-01-29 10:32:36.848  INFO 1 --- [           main] .s.d.r.c.RepositoryConfigurationDelegate : Multiple Spring Data modules found, entering strict repository configuration mode!
   2021-01-29 10:32:36.851  INFO 1 --- [           main] .s.d.r.c.RepositoryConfigurationDelegate : Bootstrapping Spring Data MongoDB repositories in DEFAULT mode.
   2021-01-29 10:32:36.959  INFO 1 --- [           main] .s.d.r.c.RepositoryConfigurationDelegate : Finished Spring Data repository scanning in 100 ms. Found 3 MongoDB repository interfaces.
   2021-01-29 10:32:37.840  INFO 1 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat initialized with port(s): 8080 (http)
   2021-01-29 10:32:37.860  INFO 1 --- [           main] o.apache.catalina.core.StandardService   : Starting service [Tomcat]
   2021-01-29 10:32:37.860  INFO 1 --- [           main] org.apache.catalina.core.StandardEngine  : Starting Servlet engine: [Apache Tomcat/9.0.41]
   2021-01-29 10:32:37.958  INFO 1 --- [           main] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring embedded WebApplicationContext
   2021-01-29 10:32:37.958  INFO 1 --- [           main] w.s.c.ServletWebServerApplicationContext : Root WebApplicationContext: initialization completed in 2392 ms
   2021-01-29 10:32:38.448  INFO 1 --- [           main] org.mongodb.driver.cluster               : Cluster created with settings {hosts=[127.0.0.1:27017], srvHost=cluster0.98odz.mongodb.net, mode=MULTIPLE, requiredClusterType=REPLICA_SET, serverSelectionTimeout='30000 ms', requiredReplicaSetName='atlas-sv9ob8-shard-0'}
   2021-01-29 10:32:38.531  INFO 1 --- [odz.mongodb.net] org.mongodb.driver.cluster               : Adding discovered server cluster0-shard-00-01.98odz.mongodb.net:27017 to client view of cluster
   2021-01-29 10:32:38.593  INFO 1 --- [odz.mongodb.net] org.mongodb.driver.cluster               : Adding discovered server cluster0-shard-00-02.98odz.mongodb.net:27017 to client view of cluster
   2021-01-29 10:32:38.595  INFO 1 --- [odz.mongodb.net] org.mongodb.driver.cluster               : Adding discovered server cluster0-shard-00-00.98odz.mongodb.net:27017 to client view of cluster
   2021-01-29 10:32:39.688  INFO 1 --- [ngodb.net:27017] org.mongodb.driver.connection            : Opened connection [connectionId{localValue:2, serverValue:45962}] to cluster0-shard-00-00.98odz.mongodb.net:27017
   2021-01-29 10:32:39.688  INFO 1 --- [ngodb.net:27017] org.mongodb.driver.connection            : Opened connection [connectionId{localValue:4, serverValue:52422}] to cluster0-shard-00-01.98odz.mongodb.net:27017
   2021-01-29 10:32:39.689  INFO 1 --- [ngodb.net:27017] org.mongodb.driver.connection            : Opened connection [connectionId{localValue:6, serverValue:45811}] to cluster0-shard-00-02.98odz.mongodb.net:27017
   2021-01-29 10:32:39.688  INFO 1 --- [ngodb.net:27017] org.mongodb.driver.connection            : Opened connection [connectionId{localValue:5, serverValue:45811}] to cluster0-shard-00-02.98odz.mongodb.net:27017
   2021-01-29 10:32:39.688  INFO 1 --- [ngodb.net:27017] org.mongodb.driver.connection            : Opened connection [connectionId{localValue:3, serverValue:45962}] to cluster0-shard-00-00.98odz.mongodb.net:27017
   2021-01-29 10:32:39.688  INFO 1 --- [ngodb.net:27017] org.mongodb.driver.connection            : Opened connection [connectionId{localValue:1, serverValue:52422}] to cluster0-shard-00-01.98odz.mongodb.net:27017
   2021-01-29 10:32:39.693  INFO 1 --- [ngodb.net:27017] org.mongodb.driver.cluster               : Monitor thread successfully connected to server with description ServerDescription{address=cluster0-shard-00-02.98odz.mongodb.net:27017, type=REPLICA_SET_SECONDARY, state=CONNECTED, ok=true, minWireVersion=0, maxWireVersion=9, maxDocumentSize=16777216, logicalSessionTimeoutMinutes=30, roundTripTimeNanos=624860400, setName='atlas-sv9ob8-shard-0', canonicalAddress=cluster0-shard-00-02.98odz.mongodb.net:27017, hosts=[cluster0-shard-00-00.98odz.mongodb.net:27017, cluster0-shard-00-02.98odz.mongodb.net:27017, cluster0-shard-00-01.98odz.mongodb.net:27017], passives=[], arbiters=[], primary='cluster0-shard-00-01.98odz.mongodb.net:27017', tagSet=TagSet{[Tag{name='nodeType', value='ELECTABLE'}, Tag{name='provider', value='AWS'}, Tag{name='region', value='EU_CENTRAL_1'}, Tag{name='workloadType', value='OPERATIONAL'}]}, electionId=null, setVersion=2, topologyVersion=TopologyVersion{processId=6012400e4623ba79acc33bf6, counter=5}, lastWriteDate=Fri Jan 29 10:32:39 UTC 2021, lastUpdateTimeNanos=47411639981204}
   2021-01-29 10:32:39.693  INFO 1 --- [ngodb.net:27017] org.mongodb.driver.cluster               : Monitor thread successfully connected to server with description ServerDescription{address=cluster0-shard-00-00.98odz.mongodb.net:27017, type=REPLICA_SET_SECONDARY, state=CONNECTED, ok=true, minWireVersion=0, maxWireVersion=9, maxDocumentSize=16777216, logicalSessionTimeoutMinutes=30, roundTripTimeNanos=651534900, setName='atlas-sv9ob8-shard-0', canonicalAddress=cluster0-shard-00-00.98odz.mongodb.net:27017, hosts=[cluster0-shard-00-00.98odz.mongodb.net:27017, cluster0-shard-00-02.98odz.mongodb.net:27017, cluster0-shard-00-01.98odz.mongodb.net:27017], passives=[], arbiters=[], primary='cluster0-shard-00-01.98odz.mongodb.net:27017', tagSet=TagSet{[Tag{name='nodeType', value='ELECTABLE'}, Tag{name='provider', value='AWS'}, Tag{name='region', value='EU_CENTRAL_1'}, Tag{name='workloadType', value='OPERATIONAL'}]}, electionId=null, setVersion=2, topologyVersion=TopologyVersion{processId=60123fee8222ccdb071ee300, counter=5}, lastWriteDate=Fri Jan 29 10:32:39 UTC 2021, lastUpdateTimeNanos=47411638144804}
   2021-01-29 10:32:39.693  INFO 1 --- [ngodb.net:27017] org.mongodb.driver.cluster               : Monitor thread successfully connected to server with description ServerDescription{address=cluster0-shard-00-01.98odz.mongodb.net:27017, type=REPLICA_SET_PRIMARY, state=CONNECTED, ok=true, minWireVersion=0, maxWireVersion=9, maxDocumentSize=16777216, logicalSessionTimeoutMinutes=30, roundTripTimeNanos=636894300, setName='atlas-sv9ob8-shard-0', canonicalAddress=cluster0-shard-00-01.98odz.mongodb.net:27017, hosts=[cluster0-shard-00-00.98odz.mongodb.net:27017, cluster0-shard-00-02.98odz.mongodb.net:27017, cluster0-shard-00-01.98odz.mongodb.net:27017], passives=[], arbiters=[], primary='cluster0-shard-00-01.98odz.mongodb.net:27017', tagSet=TagSet{[Tag{name='nodeType', value='ELECTABLE'}, Tag{name='provider', value='AWS'}, Tag{name='region', value='EU_CENTRAL_1'}, Tag{name='workloadType', value='OPERATIONAL'}]}, electionId=7fffffff0000000000000006, setVersion=2, topologyVersion=TopologyVersion{processId=601240002e5d6102b770a81e, counter=7}, lastWriteDate=Fri Jan 29 10:32:39 UTC 2021, lastUpdateTimeNanos=47411638380204}
   2021-01-29 10:32:39.697  INFO 1 --- [ngodb.net:27017] org.mongodb.driver.cluster               : Setting max election id to 7fffffff0000000000000006 from replica set primary cluster0-shard-00-01.98odz.mongodb.net:27017
   2021-01-29 10:32:39.698  INFO 1 --- [ngodb.net:27017] org.mongodb.driver.cluster               : Setting max set version to 2 from replica set primary cluster0-shard-00-01.98odz.mongodb.net:27017
   2021-01-29 10:32:39.698  INFO 1 --- [ngodb.net:27017] org.mongodb.driver.cluster               : Discovered replica set primary cluster0-shard-00-01.98odz.mongodb.net:27017
   2021-01-29 10:32:39.811  INFO 1 --- [           main] pertySourcedRequestMappingHandlerMapping : Mapped URL path [/v2/api-docs] onto method [springfox.documentation.swagger2.web.Swagger2Controller#getDocumentation(String, HttpServletRequest)]
   2021-01-29 10:32:39.972  INFO 1 --- [           main] o.s.s.concurrent.ThreadPoolTaskExecutor  : Initializing ExecutorService 'applicationTaskExecutor'
   2021-01-29 10:32:40.238  INFO 1 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat started on port(s): 8080 (http) with context path ''
   2021-01-29 10:32:40.240  INFO 1 --- [           main] d.s.w.p.DocumentationPluginsBootstrapper : Context refreshed
   2021-01-29 10:32:40.286  INFO 1 --- [           main] d.s.w.p.DocumentationPluginsBootstrapper : Found 1 custom documentation plugin(s)
   2021-01-29 10:32:40.360  INFO 1 --- [           main] s.d.s.w.s.ApiListingReferenceScanner     : Scanning for api listing references
   2021-01-29 10:32:40.606  INFO 1 --- [           main] .d.s.w.r.o.CachingOperationNameGenerator : Generating unique operation named: getLeaderboardListUsingGET_1
   2021-01-29 10:32:40.697  INFO 1 --- [           main] com.arbade.gjc.GjcApplication            : Started GjcApplication in 6.159 seconds (JVM running for 7.006)
   2021-01-29 10:32:44.935  INFO 1 --- [nio-8080-exec-1] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring DispatcherServlet 'dispatcherServlet'
   2021-01-29 10:32:44.935  INFO 1 --- [nio-8080-exec-1] o.s.web.servlet.DispatcherServlet        : Initializing Servlet 'dispatcherServlet'
   2021-01-29 10:32:44.937  INFO 1 --- [nio-8080-exec-1] o.s.web.servlet.DispatcherServlet        : Completed initialization in 2 ms

```


