## Student Management System with Hibernate

This project is a Student Management System built using Spring Boot and Hibernate. It provides basic CRUD (Create, Read, Update, Delete) operations for managing student records. The data is stored in an in-memory H2 database.

### Output of the Code :

```bash
"C:\Program Files\Java\jdk-21\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2024.1.4\lib\idea_rt.jar=52585:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2024.1.4\bin" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath D:\Projects\students-management-hibernate\target\classes;C:\Users\KAISH\.m2\repository\org\springframework\boot\spring-boot-starter-data-jpa\3.3.1\spring-boot-starter-data-jpa-3.3.1.jar;C:\Users\KAISH\.m2\repository\org\springframework\boot\spring-boot-starter-aop\3.3.1\spring-boot-starter-aop-3.3.1.jar;C:\Users\KAISH\.m2\repository\org\springframework\spring-aop\6.1.10\spring-aop-6.1.10.jar;C:\Users\KAISH\.m2\repository\org\aspectj\aspectjweaver\1.9.22\aspectjweaver-1.9.22.jar;C:\Users\KAISH\.m2\repository\org\springframework\boot\spring-boot-starter-jdbc\3.3.1\spring-boot-starter-jdbc-3.3.1.jar;C:\Users\KAISH\.m2\repository\com\zaxxer\HikariCP\5.1.0\HikariCP-5.1.0.jar;C:\Users\KAISH\.m2\repository\org\springframework\spring-jdbc\6.1.10\spring-jdbc-6.1.10.jar;C:\Users\KAISH\.m2\repository\org\hibernate\orm\hibernate-core\6.5.2.Final\hibernate-core-6.5.2.Final.jar;C:\Users\KAISH\.m2\repository\jakarta\persistence\jakarta.persistence-api\3.1.0\jakarta.persistence-api-3.1.0.jar;C:\Users\KAISH\.m2\repository\jakarta\transaction\jakarta.transaction-api\2.0.1\jakarta.transaction-api-2.0.1.jar;C:\Users\KAISH\.m2\repository\org\jboss\logging\jboss-logging\3.5.3.Final\jboss-logging-3.5.3.Final.jar;C:\Users\KAISH\.m2\repository\org\hibernate\common\hibernate-commons-annotations\6.0.6.Final\hibernate-commons-annotations-6.0.6.Final.jar;C:\Users\KAISH\.m2\repository\io\smallrye\jandex\3.1.2\jandex-3.1.2.jar;C:\Users\KAISH\.m2\repository\com\fasterxml\classmate\1.7.0\classmate-1.7.0.jar;C:\Users\KAISH\.m2\repository\net\bytebuddy\byte-buddy\1.14.17\byte-buddy-1.14.17.jar;C:\Users\KAISH\.m2\repository\org\glassfish\jaxb\jaxb-runtime\4.0.5\jaxb-runtime-4.0.5.jar;C:\Users\KAISH\.m2\repository\org\glassfish\jaxb\jaxb-core\4.0.5\jaxb-core-4.0.5.jar;C:\Users\KAISH\.m2\repository\org\eclipse\angus\angus-activation\2.0.2\angus-activation-2.0.2.jar;C:\Users\KAISH\.m2\repository\org\glassfish\jaxb\txw2\4.0.5\txw2-4.0.5.jar;C:\Users\KAISH\.m2\repository\com\sun\istack\istack-commons-runtime\4.1.2\istack-commons-runtime-4.1.2.jar;C:\Users\KAISH\.m2\repository\jakarta\inject\jakarta.inject-api\2.0.1\jakarta.inject-api-2.0.1.jar;C:\Users\KAISH\.m2\repository\org\antlr\antlr4-runtime\4.13.0\antlr4-runtime-4.13.0.jar;C:\Users\KAISH\.m2\repository\org\springframework\data\spring-data-jpa\3.3.1\spring-data-jpa-3.3.1.jar;C:\Users\KAISH\.m2\repository\org\springframework\data\spring-data-commons\3.3.1\spring-data-commons-3.3.1.jar;C:\Users\KAISH\.m2\repository\org\springframework\spring-orm\6.1.10\spring-orm-6.1.10.jar;C:\Users\KAISH\.m2\repository\org\springframework\spring-context\6.1.10\spring-context-6.1.10.jar;C:\Users\KAISH\.m2\repository\org\springframework\spring-tx\6.1.10\spring-tx-6.1.10.jar;C:\Users\KAISH\.m2\repository\org\springframework\spring-beans\6.1.10\spring-beans-6.1.10.jar;C:\Users\KAISH\.m2\repository\jakarta\annotation\jakarta.annotation-api\2.1.1\jakarta.annotation-api-2.1.1.jar;C:\Users\KAISH\.m2\repository\org\slf4j\slf4j-api\2.0.13\slf4j-api-2.0.13.jar;C:\Users\KAISH\.m2\repository\org\springframework\spring-aspects\6.1.10\spring-aspects-6.1.10.jar;C:\Users\KAISH\.m2\repository\org\springframework\boot\spring-boot-starter-web\3.3.1\spring-boot-starter-web-3.3.1.jar;C:\Users\KAISH\.m2\repository\org\springframework\boot\spring-boot-starter\3.3.1\spring-boot-starter-3.3.1.jar;C:\Users\KAISH\.m2\repository\org\springframework\boot\spring-boot-starter-logging\3.3.1\spring-boot-starter-logging-3.3.1.jar;C:\Users\KAISH\.m2\repository\ch\qos\logback\logback-classic\1.5.6\logback-classic-1.5.6.jar;C:\Users\KAISH\.m2\repository\ch\qos\logback\logback-core\1.5.6\logback-core-1.5.6.jar;C:\Users\KAISH\.m2\repository\org\apache\logging\log4j\log4j-to-slf4j\2.23.1\log4j-to-slf4j-2.23.1.jar;C:\Users\KAISH\.m2\repository\org\apache\logging\log4j\log4j-api\2.23.1\log4j-api-2.23.1.jar;C:\Users\KAISH\.m2\repository\org\slf4j\jul-to-slf4j\2.0.13\jul-to-slf4j-2.0.13.jar;C:\Users\KAISH\.m2\repository\org\yaml\snakeyaml\2.2\snakeyaml-2.2.jar;C:\Users\KAISH\.m2\repository\org\springframework\boot\spring-boot-starter-json\3.3.1\spring-boot-starter-json-3.3.1.jar;C:\Users\KAISH\.m2\repository\com\fasterxml\jackson\core\jackson-databind\2.17.1\jackson-databind-2.17.1.jar;C:\Users\KAISH\.m2\repository\com\fasterxml\jackson\core\jackson-annotations\2.17.1\jackson-annotations-2.17.1.jar;C:\Users\KAISH\.m2\repository\com\fasterxml\jackson\core\jackson-core\2.17.1\jackson-core-2.17.1.jar;C:\Users\KAISH\.m2\repository\com\fasterxml\jackson\datatype\jackson-datatype-jdk8\2.17.1\jackson-datatype-jdk8-2.17.1.jar;C:\Users\KAISH\.m2\repository\com\fasterxml\jackson\datatype\jackson-datatype-jsr310\2.17.1\jackson-datatype-jsr310-2.17.1.jar;C:\Users\KAISH\.m2\repository\com\fasterxml\jackson\module\jackson-module-parameter-names\2.17.1\jackson-module-parameter-names-2.17.1.jar;C:\Users\KAISH\.m2\repository\org\springframework\boot\spring-boot-starter-tomcat\3.3.1\spring-boot-starter-tomcat-3.3.1.jar;C:\Users\KAISH\.m2\repository\org\apache\tomcat\embed\tomcat-embed-core\10.1.25\tomcat-embed-core-10.1.25.jar;C:\Users\KAISH\.m2\repository\org\apache\tomcat\embed\tomcat-embed-el\10.1.25\tomcat-embed-el-10.1.25.jar;C:\Users\KAISH\.m2\repository\org\apache\tomcat\embed\tomcat-embed-websocket\10.1.25\tomcat-embed-websocket-10.1.25.jar;C:\Users\KAISH\.m2\repository\org\springframework\spring-web\6.1.10\spring-web-6.1.10.jar;C:\Users\KAISH\.m2\repository\io\micrometer\micrometer-observation\1.13.1\micrometer-observation-1.13.1.jar;C:\Users\KAISH\.m2\repository\io\micrometer\micrometer-commons\1.13.1\micrometer-commons-1.13.1.jar;C:\Users\KAISH\.m2\repository\org\springframework\spring-webmvc\6.1.10\spring-webmvc-6.1.10.jar;C:\Users\KAISH\.m2\repository\org\springframework\spring-expression\6.1.10\spring-expression-6.1.10.jar;C:\Users\KAISH\.m2\repository\org\springframework\boot\spring-boot-devtools\3.3.1\spring-boot-devtools-3.3.1.jar;C:\Users\KAISH\.m2\repository\org\springframework\boot\spring-boot\3.3.1\spring-boot-3.3.1.jar;C:\Users\KAISH\.m2\repository\org\springframework\boot\spring-boot-autoconfigure\3.3.1\spring-boot-autoconfigure-3.3.1.jar;C:\Users\KAISH\.m2\repository\com\h2database\h2\2.2.224\h2-2.2.224.jar;C:\Users\KAISH\.m2\repository\jakarta\xml\bind\jakarta.xml.bind-api\4.0.2\jakarta.xml.bind-api-4.0.2.jar;C:\Users\KAISH\.m2\repository\jakarta\activation\jakarta.activation-api\2.1.3\jakarta.activation-api-2.1.3.jar;C:\Users\KAISH\.m2\repository\org\springframework\spring-core\6.1.10\spring-core-6.1.10.jar;C:\Users\KAISH\.m2\repository\org\springframework\spring-jcl\6.1.10\spring-jcl-6.1.10.jar com.nuwaish.students_management_hibernate.StudentsManagementHibernateApplication

  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/

 :: Spring Boot ::                (v3.3.1)

2024-07-04T02:37:03.254+05:30  INFO 10736 --- [students-management-hibernate] [  restartedMain] s.StudentsManagementHibernateApplication : Starting StudentsManagementHibernateApplication using Java 21.0.3 with PID 10736 (D:\Projects\students-management-hibernate\target\classes started by KAISH in D:\Projects\students-management-hibernate)
2024-07-04T02:37:03.259+05:30  INFO 10736 --- [students-management-hibernate] [  restartedMain] s.StudentsManagementHibernateApplication : No active profile set, falling back to 1 default profile: "default"
2024-07-04T02:37:03.371+05:30  INFO 10736 --- [students-management-hibernate] [  restartedMain] .e.DevToolsPropertyDefaultsPostProcessor : Devtools property defaults active! Set 'spring.devtools.add-properties' to 'false' to disable
2024-07-04T02:37:03.371+05:30  INFO 10736 --- [students-management-hibernate] [  restartedMain] .e.DevToolsPropertyDefaultsPostProcessor : For additional web related logging consider setting the 'logging.level.web' property to 'DEBUG'
2024-07-04T02:37:04.736+05:30  INFO 10736 --- [students-management-hibernate] [  restartedMain] .s.d.r.c.RepositoryConfigurationDelegate : Bootstrapping Spring Data JPA repositories in DEFAULT mode.
2024-07-04T02:37:04.843+05:30  INFO 10736 --- [students-management-hibernate] [  restartedMain] .s.d.r.c.RepositoryConfigurationDelegate : Finished Spring Data repository scanning in 90 ms. Found 1 JPA repository interface.
2024-07-04T02:37:05.908+05:30  INFO 10736 --- [students-management-hibernate] [  restartedMain] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat initialized with port 8080 (http)
2024-07-04T02:37:05.932+05:30  INFO 10736 --- [students-management-hibernate] [  restartedMain] o.apache.catalina.core.StandardService   : Starting service [Tomcat]
2024-07-04T02:37:05.933+05:30  INFO 10736 --- [students-management-hibernate] [  restartedMain] o.apache.catalina.core.StandardEngine    : Starting Servlet engine: [Apache Tomcat/10.1.25]
2024-07-04T02:37:06.030+05:30  INFO 10736 --- [students-management-hibernate] [  restartedMain] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring embedded WebApplicationContext
2024-07-04T02:37:06.032+05:30  INFO 10736 --- [students-management-hibernate] [  restartedMain] w.s.c.ServletWebServerApplicationContext : Root WebApplicationContext: initialization completed in 2658 ms
2024-07-04T02:37:06.091+05:30  INFO 10736 --- [students-management-hibernate] [  restartedMain] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Starting...
2024-07-04T02:37:06.405+05:30  INFO 10736 --- [students-management-hibernate] [  restartedMain] com.zaxxer.hikari.pool.HikariPool        : HikariPool-1 - Added connection conn0: url=jdbc:h2:mem:testdb user=SA
2024-07-04T02:37:06.408+05:30  INFO 10736 --- [students-management-hibernate] [  restartedMain] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Start completed.
2024-07-04T02:37:06.428+05:30  INFO 10736 --- [students-management-hibernate] [  restartedMain] o.s.b.a.h2.H2ConsoleAutoConfiguration    : H2 console available at '/h2-console'. Database available at 'jdbc:h2:mem:testdb'
2024-07-04T02:37:06.668+05:30  INFO 10736 --- [students-management-hibernate] [  restartedMain] o.hibernate.jpa.internal.util.LogHelper  : HHH000204: Processing PersistenceUnitInfo [name: default]
2024-07-04T02:37:06.776+05:30  INFO 10736 --- [students-management-hibernate] [  restartedMain] org.hibernate.Version                    : HHH000412: Hibernate ORM core version 6.5.2.Final
2024-07-04T02:37:06.849+05:30  INFO 10736 --- [students-management-hibernate] [  restartedMain] o.h.c.internal.RegionFactoryInitiator    : HHH000026: Second-level cache disabled
2024-07-04T02:37:06.977+05:30 DEBUG 10736 --- [students-management-hibernate] [  restartedMain] org.hibernate.type.BasicTypeRegistry     : Adding type registration boolean -> org.hibernate.type.BasicTypeReference@4a50bc91
2024-07-04T02:37:06.977+05:30 DEBUG 10736 --- [students-management-hibernate] [  restartedMain] org.hibernate.type.BasicTypeRegistry     : Adding type registration boolean -> org.hibernate.type.BasicTypeReference@4a50bc91
2024-07-04T02:37:06.977+05:30 DEBUG 10736 --- [students-management-hibernate] [  restartedMain] org.hibernate.type.BasicTypeRegistry     : Adding type registration java.lang.Boolean -> org.hibernate.type.BasicTypeReference@4a50bc91
2024-07-04T02:37:06.978+05:30 DEBUG 10736 --- [students-management-hibernate] [  restartedMain] org.hibernate.type.BasicTypeRegistry     : Adding type registration numeric_boolean -> org.hibernate.type.BasicTypeReference@364d5de6
2024-07-04T02:37:06.978+05:30 DEBUG 10736 --- [students-management-hibernate] [  restartedMain] org.hibernate.type.BasicTypeRegistry     : Adding type registration org.hibernate.type.NumericBooleanConverter -> org.hibernate.type.BasicTypeReference@364d5de6
2024-07-04T02:37:06.978+05:30 DEBUG 10736 --- [students-management-hibernate] [  restartedMain] org.hibernate.type.BasicTypeRegistry     : Adding type registration true_false -> org.hibernate.type.BasicTypeReference@4e386587
2024-07-04T02:37:06.978+05:30 DEBUG 10736 --- [students-management-hibernate] [  restartedMain] org.hibernate.type.BasicTypeRegistry     : Adding type registration org.hibernate.type.TrueFalseConverter -> org.hibernate.type.BasicTypeReference@4e386587
2024-07-04T02:37:06.978+05:30 DEBUG 10736 --- [students-management-hibernate] [  restartedMain] org.hibernate.type.BasicTypeRegistry     : Adding type registration yes_no -> org.hibernate.type.BasicTypeReference@5f4db8c8
2024-07-04T02:37:06.978+05:30 DEBUG 10736 --- [students-management-hibernate] [  restartedMain] org.hibernate.type.BasicTypeRegistry     : Adding type registration org.hibernate.type.YesNoConverter -> org.hibernate.type.BasicTypeReference@5f4db8c8
2024-07-04T02:37:06.978+05:30 DEBUG 10736 --- [students-management-hibernate] [  restartedMain] org.hibernate.type.BasicTypeRegistry     : Adding type registration byte -> org.hibernate.type.BasicTypeReference@10363384
2024-07-04T02:37:06.979+05:30 DEBUG 10736 --- [students-management-hibernate] [  restartedMain] org.hibernate.type.BasicTypeRegistry     : Adding type registration byte -> org.hibernate.type.BasicTypeReference@10363384
2024-07-04T02:37:06.979+05:30 DEBUG 10736 --- [students-management-hibernate] [  restartedMain] org.hibernate.type.BasicTypeRegistry     : Adding type registration java.lang.Byte -> org.hibernate.type.BasicTypeReference@10363384
2024-07-04T02:37:06.979+05:30 DEBUG 10736 --- [students-management-hibernate] [  restartedMain] org.hibernate.type.BasicTypeRegistry     : Adding type registration binary -> org.hibernate.type.BasicTypeReference@4c48ee09
2024-07-04T02:37:06.979+05:30 DEBUG 10736 --- [students-management-hibernate] [  restartedMain] org.hibernate.type.BasicTypeRegistry     : Adding type registration byte[] -> org.hibernate.type.BasicTypeReference@4c48ee09
2024-07-04T02:37:06.979+05:30 DEBUG 10736 --- [students-management-hibernate] [  restartedMain] org.hibernate.type.BasicTypeRegistry     : Adding type registration [B -> org.hibernate.type.BasicTypeReference@4c48ee09
2024-07-04T02:37:06.979+05:30 DEBUG 10736 --- [students-management-hibernate] [  restartedMain] org.hibernate.type.BasicTypeRegistry     : Adding type registration binary_wrapper -> org.hibernate.type.BasicTypeReference@4151ae5a
2024-07-04T02:37:06.980+05:30 DEBUG 10736 --- [students-management-hibernate] [  restartedMain] org.hibernate.type.BasicTypeRegistry     : Adding type registration wrapper-binary -> org.hibernate.type.BasicTypeReference@4151ae5a
2024-07-04T02:37:06.980+05:30 DEBUG 10736 --- [students-management-hibernate] [  restartedMain] org.hibernate.type.BasicTypeRegistry     : Adding type registration image -> org.hibernate.type.BasicTypeReference@73e8d540
2024-07-04T02:37:06.980+05:30 DEBUG 10736 --- [students-management-hibernate] [  restartedMain] org.hibernate.type.BasicTypeRegistry     : Adding type registration blob -> org.hibernate.type.BasicTypeReference@526362aa
2024-07-04T02:37:06.980+05:30 DEBUG 10736 --- [students-management-hibernate] [  restartedMain] org.hibernate.type.BasicTypeRegistry     : Adding type registration java.sql.Blob -> org.hibernate.type.BasicTypeReference@526362aa
2024-07-04T02:37:06.980+05:30 DEBUG 10736 --- [students-management-hibernate] [  restartedMain] org.hibernate.type.BasicTypeRegistry     : Adding type registration materialized_blob -> org.hibernate.type.BasicTypeReference@5950f649
2024-07-04T02:37:06.981+05:30 DEBUG 10736 --- [students-management-hibernate] [  restartedMain] org.hibernate.type.BasicTypeRegistry     : Adding type registration materialized_blob_wrapper -> org.hibernate.type.BasicTypeReference@15bfa047
2024-07-04T02:37:06.981+05:30 DEBUG 10736 --- [students-management-hibernate] [  restartedMain] org.hibernate.type.BasicTypeRegistry     : Adding type registration short -> org.hibernate.type.BasicTypeReference@20c82565
2024-07-04T02:37:06.981+05:30 DEBUG 10736 --- [students-management-hibernate] [  restartedMain] org.hibernate.type.BasicTypeRegistry     : Adding type registration short -> org.hibernate.type.BasicTypeReference@20c82565
2024-07-04T02:37:06.981+05:30 DEBUG 10736 --- [students-management-hibernate] [  restartedMain] org.hibernate.type.BasicTypeRegistry     : Adding type registration java.lang.Short -> org.hibernate.type.BasicTypeReference@20c82565
2024-07-04T02:37:06.981+05:30 DEBUG 10736 --- [students-management-hibernate] [  restartedMain] org.hibernate.type.BasicTypeRegistry     : Adding type registration integer -> org.hibernate.type.BasicTypeReference@69f775e4
2024-07-04T02:37:06.981+05:30 DEBUG 10736 --- [students-management-hibernate] [  restartedMain] org.hibernate.type.BasicTypeRegistry     : Adding type registration int -> org.hibernate.type.BasicTypeReference@69f775e4
2024-07-04T02:37:06.982+05:30 DEBUG 10736 --- [students-management-hibernate] [  restartedMain] org.hibernate.type.BasicTypeRegistry     : Adding type registration java.lang.Integer -> org.hibernate.type.BasicTypeReference@69f775e4
2024-07-04T02:37:06.982+05:30 DEBUG 10736 --- [students-management-hibernate] [  restartedMain] org.hibernate.type.BasicTypeRegistry     : Adding type registration long -> org.hibernate.type.BasicTypeReference@37cb342d
2024-07-04T02:37:06.982+05:30 DEBUG 10736 --- [students-management-hibernate] [  restartedMain] org.hibernate.type.BasicTypeRegistry     : Adding type registration long -> org.hibernate.type.BasicTypeReference@37cb342d
2024-07-04T02:37:06.982+05:30 DEBUG 10736 --- [students-management-hibernate] [  restartedMain] org.hibernate.type.BasicTypeRegistry     : Adding type registration java.lang.Long -> org.hibernate.type.BasicTypeReference@37cb342d
2024-07-04T02:37:06.982+05:30 DEBUG 10736 --- [students-management-hibernate] [  restartedMain] org.hibernate.type.BasicTypeRegistry     : Adding type registration float -> org.hibernate.type.BasicTypeReference@5f1e170b
2024-07-04T02:37:06.982+05:30 DEBUG 10736 --- [students-management-hibernate] [  restartedMain] org.hibernate.type.BasicTypeRegistry     : Adding type registration float -> org.hibernate.type.BasicTypeReference@5f1e170b
2024-07-04T02:37:06.982+05:30 DEBUG 10736 --- [students-management-hibernate] [  restartedMain] org.hibernate.type.BasicTypeRegistry     : Adding type registration java.lang.Float -> org.hibernate.type.BasicTypeReference@5f1e170b
2024-07-04T02:37:06.983+05:30 DEBUG 10736 --- [students-management-hibernate] [  restartedMain] org.hibernate.type.BasicTypeRegistry     : Adding type registration double -> org.hibernate.type.BasicTypeReference@3e1cf280
2024-07-04T02:37:06.983+05:30 DEBUG 10736 --- [students-management-hibernate] [  restartedMain] org.hibernate.type.BasicTypeRegistry     : Adding type registration double -> org.hibernate.type.BasicTypeReference@3e1cf280
2024-07-04T02:37:06.983+05:30 DEBUG 10736 --- [students-management-hibernate] [  restartedMain] org.hibernate.type.BasicTypeRegistry     : Adding type registration java.lang.Double -> org.hibernate.type.BasicTypeReference@3e1cf280
2024-07-04T02:37:06.983+05:30 DEBUG 10736 --- [students-management-hibernate] [  restartedMain] org.hibernate.type.BasicTypeRegistry     : Adding type registration big_integer -> org.hibernate.type.BasicTypeReference@6c16e8f2
2024-07-04T02:37:06.983+05:30 DEBUG 10736 --- [students-management-hibernate] [  restartedMain] org.hibernate.type.BasicTypeRegistry     : Adding type registration java.math.BigInteger -> org.hibernate.type.BasicTypeReference@6c16e8f2
2024-07-04T02:37:06.983+05:30 DEBUG 10736 --- [students-management-hibernate] [  restartedMain] org.hibernate.type.BasicTypeRegistry     : Adding type registration big_decimal -> org.hibernate.type.BasicTypeReference@212c301
2024-07-04T02:37:06.983+05:30 DEBUG 10736 --- [students-management-hibernate] [  restartedMain] org.hibernate.type.BasicTypeRegistry     : Adding type registration java.math.BigDecimal -> org.hibernate.type.BasicTypeReference@212c301
2024-07-04T02:37:06.983+05:30 DEBUG 10736 --- [students-management-hibernate] [  restartedMain] org.hibernate.type.BasicTypeRegistry     : Adding type registration character -> org.hibernate.type.BasicTypeReference@2d1b3a07
2024-07-04T02:37:06.984+05:30 DEBUG 10736 --- [students-management-hibernate] [  restartedMain] org.hibernate.type.BasicTypeRegistry     : Adding type registration char -> org.hibernate.type.BasicTypeReference@2d1b3a07
2024-07-04T02:37:06.984+05:30 DEBUG 10736 --- [students-management-hibernate] [  restartedMain] org.hibernate.type.BasicTypeRegistry     : Adding type registration java.lang.Character -> org.hibernate.type.BasicTypeReference@2d1b3a07
2024-07-04T02:37:06.984+05:30 DEBUG 10736 --- [students-management-hibernate] [  restartedMain] org.hibernate.type.BasicTypeRegistry     : Adding type registration character_nchar -> org.hibernate.type.BasicTypeReference@74ca45d6
2024-07-04T02:37:06.984+05:30 DEBUG 10736 --- [students-management-hibernate] [  restartedMain] org.hibernate.type.BasicTypeRegistry     : Adding type registration string -> org.hibernate.type.BasicTypeReference@2fc062c5
2024-07-04T02:37:06.984+05:30 DEBUG 10736 --- [students-management-hibernate] [  restartedMain] org.hibernate.type.BasicTypeRegistry     : Adding type registration java.lang.String -> org.hibernate.type.BasicTypeReference@2fc062c5
2024-07-04T02:37:06.984+05:30 DEBUG 10736 --- [students-management-hibernate] [  restartedMain] org.hibernate.type.BasicTypeRegistry     : Adding type registration nstring -> org.hibernate.type.BasicTypeReference@3bdea6f7
2024-07-04T02:37:06.984+05:30 DEBUG 10736 --- [students-management-hibernate] [  restartedMain] org.hibernate.type.BasicTypeRegistry     : Adding type registration characters -> org.hibernate.type.BasicTypeReference@4fe16889
2024-07-04T02:37:06.984+05:30 DEBUG 10736 --- [students-management-hibernate] [  restartedMain] org.hibernate.type.BasicTypeRegistry     : Adding type registration char[] -> org.hibernate.type.BasicTypeReference@4fe16889
2024-07-04T02:37:06.985+05:30 DEBUG 10736 --- [students-management-hibernate] [  restartedMain] org.hibernate.type.BasicTypeRegistry     : Adding type registration [C -> org.hibernate.type.BasicTypeReference@4fe16889
2024-07-04T02:37:06.985+05:30 DEBUG 10736 --- [students-management-hibernate] [  restartedMain] org.hibernate.type.BasicTypeRegistry     : Adding type registration wrapper-characters -> org.hibernate.type.BasicTypeReference@69236056
2024-07-04T02:37:06.985+05:30 DEBUG 10736 --- [students-management-hibernate] [  restartedMain] org.hibernate.type.BasicTypeRegistry     : Adding type registration text -> org.hibernate.type.BasicTypeReference@45d9e1fd
2024-07-04T02:37:06.985+05:30 DEBUG 10736 --- [students-management-hibernate] [  restartedMain] org.hibernate.type.BasicTypeRegistry     : Adding type registration ntext -> org.hibernate.type.BasicTypeReference@bfe0eaf
2024-07-04T02:37:06.985+05:30 DEBUG 10736 --- [students-management-hibernate] [  restartedMain] org.hibernate.type.BasicTypeRegistry     : Adding type registration clob -> org.hibernate.type.BasicTypeReference@4f9f8a79
2024-07-04T02:37:06.985+05:30 DEBUG 10736 --- [students-management-hibernate] [  restartedMain] org.hibernate.type.BasicTypeRegistry     : Adding type registration java.sql.Clob -> org.hibernate.type.BasicTypeReference@4f9f8a79
2024-07-04T02:37:06.985+05:30 DEBUG 10736 --- [students-management-hibernate] [  restartedMain] org.hibernate.type.BasicTypeRegistry     : Adding type registration nclob -> org.hibernate.type.BasicTypeReference@3d4c620c
2024-07-04T02:37:06.985+05:30 DEBUG 10736 --- [students-management-hibernate] [  restartedMain] org.hibernate.type.BasicTypeRegistry     : Adding type registration java.sql.NClob -> org.hibernate.type.BasicTypeReference@3d4c620c
2024-07-04T02:37:06.985+05:30 DEBUG 10736 --- [students-management-hibernate] [  restartedMain] org.hibernate.type.BasicTypeRegistry     : Adding type registration materialized_clob -> org.hibernate.type.BasicTypeReference@3790ba51
2024-07-04T02:37:06.985+05:30 DEBUG 10736 --- [students-management-hibernate] [  restartedMain] org.hibernate.type.BasicTypeRegistry     : Adding type registration materialized_clob_char_array -> org.hibernate.type.BasicTypeReference@4ce0417a
2024-07-04T02:37:06.985+05:30 DEBUG 10736 --- [students-management-hibernate] [  restartedMain] org.hibernate.type.BasicTypeRegistry     : Adding type registration materialized_clob_character_array -> org.hibernate.type.BasicTypeReference@7f1fd6dd
2024-07-04T02:37:06.986+05:30 DEBUG 10736 --- [students-management-hibernate] [  restartedMain] org.hibernate.type.BasicTypeRegistry     : Adding type registration materialized_nclob -> org.hibernate.type.BasicTypeReference@211d9730
2024-07-04T02:37:06.986+05:30 DEBUG 10736 --- [students-management-hibernate] [  restartedMain] org.hibernate.type.BasicTypeRegistry     : Adding type registration materialized_nclob_character_array -> org.hibernate.type.BasicTypeReference@13edf370
2024-07-04T02:37:06.986+05:30 DEBUG 10736 --- [students-management-hibernate] [  restartedMain] org.hibernate.type.BasicTypeRegistry     : Adding type registration materialized_nclob_char_array -> org.hibernate.type.BasicTypeReference@5dc88be6
2024-07-04T02:37:06.986+05:30 DEBUG 10736 --- [students-management-hibernate] [  restartedMain] org.hibernate.type.BasicTypeRegistry     : Adding type registration Duration -> org.hibernate.type.BasicTypeReference@5c6007bc
2024-07-04T02:37:06.986+05:30 DEBUG 10736 --- [students-management-hibernate] [  restartedMain] org.hibernate.type.BasicTypeRegistry     : Adding type registration java.time.Duration -> org.hibernate.type.BasicTypeReference@5c6007bc
2024-07-04T02:37:06.986+05:30 DEBUG 10736 --- [students-management-hibernate] [  restartedMain] org.hibernate.type.BasicTypeRegistry     : Adding type registration LocalDateTime -> org.hibernate.type.BasicTypeReference@1189af17
2024-07-04T02:37:06.986+05:30 DEBUG 10736 --- [students-management-hibernate] [  restartedMain] org.hibernate.type.BasicTypeRegistry     : Adding type registration java.time.LocalDateTime -> org.hibernate.type.BasicTypeReference@1189af17
2024-07-04T02:37:06.986+05:30 DEBUG 10736 --- [students-management-hibernate] [  restartedMain] org.hibernate.type.BasicTypeRegistry     : Adding type registration LocalDate -> org.hibernate.type.BasicTypeReference@6d83b825
2024-07-04T02:37:06.986+05:30 DEBUG 10736 --- [students-management-hibernate] [  restartedMain] org.hibernate.type.BasicTypeRegistry     : Adding type registration java.time.LocalDate -> org.hibernate.type.BasicTypeReference@6d83b825
2024-07-04T02:37:06.986+05:30 DEBUG 10736 --- [students-management-hibernate] [  restartedMain] org.hibernate.type.BasicTypeRegistry     : Adding type registration LocalTime -> org.hibernate.type.BasicTypeReference@748d89c8
2024-07-04T02:37:06.986+05:30 DEBUG 10736 --- [students-management-hibernate] [  restartedMain] org.hibernate.type.BasicTypeRegistry     : Adding type registration java.time.LocalTime -> org.hibernate.type.BasicTypeReference@748d89c8
2024-07-04T02:37:06.987+05:30 DEBUG 10736 --- [students-management-hibernate] [  restartedMain] org.hibernate.type.BasicTypeRegistry     : Adding type registration OffsetDateTime -> org.hibernate.type.BasicTypeReference@280c3d02
2024-07-04T02:37:06.987+05:30 DEBUG 10736 --- [students-management-hibernate] [  restartedMain] org.hibernate.type.BasicTypeRegistry     : Adding type registration java.time.OffsetDateTime -> org.hibernate.type.BasicTypeReference@280c3d02
2024-07-04T02:37:06.987+05:30 DEBUG 10736 --- [students-management-hibernate] [  restartedMain] org.hibernate.type.BasicTypeRegistry     : Adding type registration OffsetDateTimeWithTimezone -> org.hibernate.type.BasicTypeReference@7421ce03
2024-07-04T02:37:06.987+05:30 DEBUG 10736 --- [students-management-hibernate] [  restartedMain] org.hibernate.type.BasicTypeRegistry     : Adding type registration OffsetDateTimeWithoutTimezone -> org.hibernate.type.BasicTypeReference@4931232
2024-07-04T02:37:06.987+05:30 DEBUG 10736 --- [students-management-hibernate] [  restartedMain] org.hibernate.type.BasicTypeRegistry     : Adding type registration OffsetTime -> org.hibernate.type.BasicTypeReference@1c4808a1
2024-07-04T02:37:06.987+05:30 DEBUG 10736 --- [students-management-hibernate] [  restartedMain] org.hibernate.type.BasicTypeRegistry     : Adding type registration java.time.OffsetTime -> org.hibernate.type.BasicTypeReference@1c4808a1
2024-07-04T02:37:06.987+05:30 DEBUG 10736 --- [students-management-hibernate] [  restartedMain] org.hibernate.type.BasicTypeRegistry     : Adding type registration OffsetTimeUtc -> org.hibernate.type.BasicTypeReference@5565d207
2024-07-04T02:37:06.987+05:30 DEBUG 10736 --- [students-management-hibernate] [  restartedMain] org.hibernate.type.BasicTypeRegistry     : Adding type registration OffsetTimeWithTimezone -> org.hibernate.type.BasicTypeReference@2f4e5f7e
2024-07-04T02:37:06.987+05:30 DEBUG 10736 --- [students-management-hibernate] [  restartedMain] org.hibernate.type.BasicTypeRegistry     : Adding type registration OffsetTimeWithoutTimezone -> org.hibernate.type.BasicTypeReference@3350da27
2024-07-04T02:37:06.987+05:30 DEBUG 10736 --- [students-management-hibernate] [  restartedMain] org.hibernate.type.BasicTypeRegistry     : Adding type registration ZonedDateTime -> org.hibernate.type.BasicTypeReference@6f81d1ec
2024-07-04T02:37:06.987+05:30 DEBUG 10736 --- [students-management-hibernate] [  restartedMain] org.hibernate.type.BasicTypeRegistry     : Adding type registration java.time.ZonedDateTime -> org.hibernate.type.BasicTypeReference@6f81d1ec
2024-07-04T02:37:06.988+05:30 DEBUG 10736 --- [students-management-hibernate] [  restartedMain] org.hibernate.type.BasicTypeRegistry     : Adding type registration ZonedDateTimeWithTimezone -> org.hibernate.type.BasicTypeReference@140fd3f1
2024-07-04T02:37:06.988+05:30 DEBUG 10736 --- [students-management-hibernate] [  restartedMain] org.hibernate.type.BasicTypeRegistry     : Adding type registration ZonedDateTimeWithoutTimezone -> org.hibernate.type.BasicTypeReference@49e7dba1
2024-07-04T02:37:06.988+05:30 DEBUG 10736 --- [students-management-hibernate] [  restartedMain] org.hibernate.type.BasicTypeRegistry     : Adding type registration date -> org.hibernate.type.BasicTypeReference@7cd3a158
2024-07-04T02:37:06.988+05:30 DEBUG 10736 --- [students-management-hibernate] [  restartedMain] org.hibernate.type.BasicTypeRegistry     : Adding type registration java.sql.Date -> org.hibernate.type.BasicTypeReference@7cd3a158
2024-07-04T02:37:06.988+05:30 DEBUG 10736 --- [students-management-hibernate] [  restartedMain] org.hibernate.type.BasicTypeRegistry     : Adding type registration time -> org.hibernate.type.BasicTypeReference@1d3c119f
2024-07-04T02:37:06.988+05:30 DEBUG 10736 --- [students-management-hibernate] [  restartedMain] org.hibernate.type.BasicTypeRegistry     : Adding type registration java.sql.Time -> org.hibernate.type.BasicTypeReference@1d3c119f
2024-07-04T02:37:06.988+05:30 DEBUG 10736 --- [students-management-hibernate] [  restartedMain] org.hibernate.type.BasicTypeRegistry     : Adding type registration timestamp -> org.hibernate.type.BasicTypeReference@7746c992
2024-07-04T02:37:06.988+05:30 DEBUG 10736 --- [students-management-hibernate] [  restartedMain] org.hibernate.type.BasicTypeRegistry     : Adding type registration java.sql.Timestamp -> org.hibernate.type.BasicTypeReference@7746c992
2024-07-04T02:37:06.988+05:30 DEBUG 10736 --- [students-management-hibernate] [  restartedMain] org.hibernate.type.BasicTypeRegistry     : Adding type registration java.util.Date -> org.hibernate.type.BasicTypeReference@7746c992
2024-07-04T02:37:06.988+05:30 DEBUG 10736 --- [students-management-hibernate] [  restartedMain] org.hibernate.type.BasicTypeRegistry     : Adding type registration calendar -> org.hibernate.type.BasicTypeReference@8b2e08
2024-07-04T02:37:06.988+05:30 DEBUG 10736 --- [students-management-hibernate] [  restartedMain] org.hibernate.type.BasicTypeRegistry     : Adding type registration java.util.Calendar -> org.hibernate.type.BasicTypeReference@8b2e08
2024-07-04T02:37:06.988+05:30 DEBUG 10736 --- [students-management-hibernate] [  restartedMain] org.hibernate.type.BasicTypeRegistry     : Adding type registration java.util.GregorianCalendar -> org.hibernate.type.BasicTypeReference@8b2e08
2024-07-04T02:37:06.988+05:30 DEBUG 10736 --- [students-management-hibernate] [  restartedMain] org.hibernate.type.BasicTypeRegistry     : Adding type registration calendar_date -> org.hibernate.type.BasicTypeReference@61b38620
2024-07-04T02:37:06.989+05:30 DEBUG 10736 --- [students-management-hibernate] [  restartedMain] org.hibernate.type.BasicTypeRegistry     : Adding type registration calendar_time -> org.hibernate.type.BasicTypeReference@1c7ed360
2024-07-04T02:37:06.989+05:30 DEBUG 10736 --- [students-management-hibernate] [  restartedMain] org.hibernate.type.BasicTypeRegistry     : Adding type registration instant -> org.hibernate.type.BasicTypeReference@5d358324
2024-07-04T02:37:06.989+05:30 DEBUG 10736 --- [students-management-hibernate] [  restartedMain] org.hibernate.type.BasicTypeRegistry     : Adding type registration java.time.Instant -> org.hibernate.type.BasicTypeReference@5d358324
2024-07-04T02:37:06.989+05:30 DEBUG 10736 --- [students-management-hibernate] [  restartedMain] org.hibernate.type.BasicTypeRegistry     : Adding type registration uuid -> org.hibernate.type.BasicTypeReference@4171de4
2024-07-04T02:37:06.989+05:30 DEBUG 10736 --- [students-management-hibernate] [  restartedMain] org.hibernate.type.BasicTypeRegistry     : Adding type registration java.util.UUID -> org.hibernate.type.BasicTypeReference@4171de4
2024-07-04T02:37:06.989+05:30 DEBUG 10736 --- [students-management-hibernate] [  restartedMain] org.hibernate.type.BasicTypeRegistry     : Adding type registration pg-uuid -> org.hibernate.type.BasicTypeReference@4171de4
2024-07-04T02:37:06.989+05:30 DEBUG 10736 --- [students-management-hibernate] [  restartedMain] org.hibernate.type.BasicTypeRegistry     : Adding type registration uuid-binary -> org.hibernate.type.BasicTypeReference@796809c0
2024-07-04T02:37:06.989+05:30 DEBUG 10736 --- [students-management-hibernate] [  restartedMain] org.hibernate.type.BasicTypeRegistry     : Adding type registration uuid-char -> org.hibernate.type.BasicTypeReference@1367305e
2024-07-04T02:37:06.990+05:30 DEBUG 10736 --- [students-management-hibernate] [  restartedMain] org.hibernate.type.BasicTypeRegistry     : Adding type registration class -> org.hibernate.type.BasicTypeReference@62baadb5
2024-07-04T02:37:06.990+05:30 DEBUG 10736 --- [students-management-hibernate] [  restartedMain] org.hibernate.type.BasicTypeRegistry     : Adding type registration java.lang.Class -> org.hibernate.type.BasicTypeReference@62baadb5
2024-07-04T02:37:06.990+05:30 DEBUG 10736 --- [students-management-hibernate] [  restartedMain] org.hibernate.type.BasicTypeRegistry     : Adding type registration currency -> org.hibernate.type.BasicTypeReference@5e7e643b
2024-07-04T02:37:06.990+05:30 DEBUG 10736 --- [students-management-hibernate] [  restartedMain] org.hibernate.type.BasicTypeRegistry     : Adding type registration Currency -> org.hibernate.type.BasicTypeReference@5e7e643b
2024-07-04T02:37:06.990+05:30 DEBUG 10736 --- [students-management-hibernate] [  restartedMain] org.hibernate.type.BasicTypeRegistry     : Adding type registration java.util.Currency -> org.hibernate.type.BasicTypeReference@5e7e643b
2024-07-04T02:37:06.990+05:30 DEBUG 10736 --- [students-management-hibernate] [  restartedMain] org.hibernate.type.BasicTypeRegistry     : Adding type registration locale -> org.hibernate.type.BasicTypeReference@6761403d
2024-07-04T02:37:06.990+05:30 DEBUG 10736 --- [students-management-hibernate] [  restartedMain] org.hibernate.type.BasicTypeRegistry     : Adding type registration java.util.Locale -> org.hibernate.type.BasicTypeReference@6761403d
2024-07-04T02:37:06.990+05:30 DEBUG 10736 --- [students-management-hibernate] [  restartedMain] org.hibernate.type.BasicTypeRegistry     : Adding type registration serializable -> org.hibernate.type.BasicTypeReference@4d2e694f
2024-07-04T02:37:06.990+05:30 DEBUG 10736 --- [students-management-hibernate] [  restartedMain] org.hibernate.type.BasicTypeRegistry     : Adding type registration java.io.Serializable -> org.hibernate.type.BasicTypeReference@4d2e694f
2024-07-04T02:37:06.990+05:30 DEBUG 10736 --- [students-management-hibernate] [  restartedMain] org.hibernate.type.BasicTypeRegistry     : Adding type registration timezone -> org.hibernate.type.BasicTypeReference@7a4ea25a
2024-07-04T02:37:06.991+05:30 DEBUG 10736 --- [students-management-hibernate] [  restartedMain] org.hibernate.type.BasicTypeRegistry     : Adding type registration java.util.TimeZone -> org.hibernate.type.BasicTypeReference@7a4ea25a
2024-07-04T02:37:06.991+05:30 DEBUG 10736 --- [students-management-hibernate] [  restartedMain] org.hibernate.type.BasicTypeRegistry     : Adding type registration ZoneOffset -> org.hibernate.type.BasicTypeReference@57bc4e94
2024-07-04T02:37:06.991+05:30 DEBUG 10736 --- [students-management-hibernate] [  restartedMain] org.hibernate.type.BasicTypeRegistry     : Adding type registration java.time.ZoneOffset -> org.hibernate.type.BasicTypeReference@57bc4e94
2024-07-04T02:37:06.991+05:30 DEBUG 10736 --- [students-management-hibernate] [  restartedMain] org.hibernate.type.BasicTypeRegistry     : Adding type registration url -> org.hibernate.type.BasicTypeReference@3ab19cf6
2024-07-04T02:37:06.991+05:30 DEBUG 10736 --- [students-management-hibernate] [  restartedMain] org.hibernate.type.BasicTypeRegistry     : Adding type registration java.net.URL -> org.hibernate.type.BasicTypeReference@3ab19cf6
2024-07-04T02:37:06.991+05:30 DEBUG 10736 --- [students-management-hibernate] [  restartedMain] org.hibernate.type.BasicTypeRegistry     : Adding type registration vector -> org.hibernate.type.BasicTypeReference@46bfefe
2024-07-04T02:37:06.991+05:30 DEBUG 10736 --- [students-management-hibernate] [  restartedMain] org.hibernate.type.BasicTypeRegistry     : Adding type registration row_version -> org.hibernate.type.BasicTypeReference@b38d05b
2024-07-04T02:37:06.996+05:30 DEBUG 10736 --- [students-management-hibernate] [  restartedMain] org.hibernate.type.BasicTypeRegistry     : Adding type registration object -> org.hibernate.type.JavaObjectType@685af031
2024-07-04T02:37:06.997+05:30 DEBUG 10736 --- [students-management-hibernate] [  restartedMain] org.hibernate.type.BasicTypeRegistry     : Adding type registration java.lang.Object -> org.hibernate.type.JavaObjectType@685af031
2024-07-04T02:37:06.998+05:30 DEBUG 10736 --- [students-management-hibernate] [  restartedMain] org.hibernate.type.BasicTypeRegistry     : Adding type registration null -> org.hibernate.type.NullType@43a338a9
2024-07-04T02:37:06.999+05:30 DEBUG 10736 --- [students-management-hibernate] [  restartedMain] org.hibernate.type.BasicTypeRegistry     : Adding type registration imm_date -> org.hibernate.type.BasicTypeReference@4d76df8
2024-07-04T02:37:06.999+05:30 DEBUG 10736 --- [students-management-hibernate] [  restartedMain] org.hibernate.type.BasicTypeRegistry     : Adding type registration imm_time -> org.hibernate.type.BasicTypeReference@469921de
2024-07-04T02:37:06.999+05:30 DEBUG 10736 --- [students-management-hibernate] [  restartedMain] org.hibernate.type.BasicTypeRegistry     : Adding type registration imm_timestamp -> org.hibernate.type.BasicTypeReference@1ca52fd4
2024-07-04T02:37:07.000+05:30 DEBUG 10736 --- [students-management-hibernate] [  restartedMain] org.hibernate.type.BasicTypeRegistry     : Adding type registration imm_calendar -> org.hibernate.type.BasicTypeReference@23222915
2024-07-04T02:37:07.000+05:30 DEBUG 10736 --- [students-management-hibernate] [  restartedMain] org.hibernate.type.BasicTypeRegistry     : Adding type registration imm_calendar_date -> org.hibernate.type.BasicTypeReference@4b00490e
2024-07-04T02:37:07.000+05:30 DEBUG 10736 --- [students-management-hibernate] [  restartedMain] org.hibernate.type.BasicTypeRegistry     : Adding type registration imm_calendar_time -> org.hibernate.type.BasicTypeReference@44981661
2024-07-04T02:37:07.000+05:30 DEBUG 10736 --- [students-management-hibernate] [  restartedMain] org.hibernate.type.BasicTypeRegistry     : Adding type registration imm_binary -> org.hibernate.type.BasicTypeReference@71f65aa9
2024-07-04T02:37:07.000+05:30 DEBUG 10736 --- [students-management-hibernate] [  restartedMain] org.hibernate.type.BasicTypeRegistry     : Adding type registration imm_serializable -> org.hibernate.type.BasicTypeReference@432ebf03
2024-07-04T02:37:07.473+05:30  INFO 10736 --- [students-management-hibernate] [  restartedMain] o.s.o.j.p.SpringPersistenceUnitInfo      : No LoadTimeWeaver setup: ignoring JPA class transformer
2024-07-04T02:37:07.576+05:30 DEBUG 10736 --- [students-management-hibernate] [  restartedMain] o.h.t.d.jdbc.spi.JdbcTypeRegistry        : addDescriptor(NCharTypeDescriptor) replaced previous registration(CharTypeDescriptor)
2024-07-04T02:37:07.576+05:30 DEBUG 10736 --- [students-management-hibernate] [  restartedMain] o.h.t.d.jdbc.spi.JdbcTypeRegistry        : addDescriptor(NVarcharTypeDescriptor) replaced previous registration(VarcharTypeDescriptor)
2024-07-04T02:37:07.577+05:30 DEBUG 10736 --- [students-management-hibernate] [  restartedMain] o.h.t.d.jdbc.spi.JdbcTypeRegistry        : addDescriptor(LongNVarcharTypeDescriptor) replaced previous registration(LongVarcharTypeDescriptor)
2024-07-04T02:37:07.579+05:30 DEBUG 10736 --- [students-management-hibernate] [  restartedMain] o.h.t.d.jdbc.spi.JdbcTypeRegistry        : addDescriptor(NClobTypeDescriptor(DEFAULT)) replaced previous registration(ClobTypeDescriptor(DEFAULT))
2024-07-04T02:37:07.582+05:30 DEBUG 10736 --- [students-management-hibernate] [  restartedMain] o.h.t.d.jdbc.spi.JdbcTypeRegistry        : addDescriptor(2005, ClobTypeDescriptor(STREAM_BINDING)) replaced previous registration(ClobTypeDescriptor(DEFAULT))
2024-07-04T02:37:07.589+05:30 DEBUG 10736 --- [students-management-hibernate] [  restartedMain] o.h.t.d.jdbc.spi.JdbcTypeRegistry        : addDescriptor(TimestampUtcDescriptor) replaced previous registration(TimestampUtcDescriptor)
2024-07-04T02:37:07.598+05:30 DEBUG 10736 --- [students-management-hibernate] [  restartedMain] org.hibernate.type.BasicTypeRegistry     : Adding type registration org.hibernate.type.DurationType -> basicType@1(java.time.Duration,3015)
2024-07-04T02:37:07.598+05:30 DEBUG 10736 --- [students-management-hibernate] [  restartedMain] org.hibernate.type.BasicTypeRegistry     : Adding type registration Duration -> basicType@1(java.time.Duration,3015)
2024-07-04T02:37:07.598+05:30 DEBUG 10736 --- [students-management-hibernate] [  restartedMain] org.hibernate.type.BasicTypeRegistry     : Adding type registration java.time.Duration -> basicType@1(java.time.Duration,3015)
2024-07-04T02:37:07.602+05:30 DEBUG 10736 --- [students-management-hibernate] [  restartedMain] o.h.type.spi.TypeConfiguration$Scope     : Scoping TypeConfiguration [org.hibernate.type.spi.TypeConfiguration@683c7517] to MetadataBuildingContext [org.hibernate.boot.internal.MetadataBuildingContextRootImpl@21b1851f]
2024-07-04T02:37:08.499+05:30  INFO 10736 --- [students-management-hibernate] [  restartedMain] o.h.e.t.j.p.i.JtaPlatformInitiator       : HHH000489: No JTA platform available (set 'hibernate.transaction.jta.platform' to enable JTA platform integration)
2024-07-04T02:37:08.500+05:30 DEBUG 10736 --- [students-management-hibernate] [  restartedMain] o.h.type.spi.TypeConfiguration$Scope     : Scoping TypeConfiguration [org.hibernate.type.spi.TypeConfiguration@683c7517] to SessionFactoryImplementor [org.hibernate.internal.SessionFactoryImpl@7023efd3]
Hibernate: 
    drop table if exists student cascade 
Hibernate: 
    drop sequence if exists student_seq
Hibernate: 
    create sequence student_seq start with 1 increment by 50
Hibernate: 
    create table student (
        id bigint not null,
        name varchar(255),
        passport_number varchar(255),
        primary key (id)
    )
2024-07-04T02:37:08.532+05:30 TRACE 10736 --- [students-management-hibernate] [  restartedMain] o.h.type.spi.TypeConfiguration$Scope     : Handling #sessionFactoryCreated from [org.hibernate.internal.SessionFactoryImpl@7023efd3] for TypeConfiguration
2024-07-04T02:37:08.533+05:30  INFO 10736 --- [students-management-hibernate] [  restartedMain] j.LocalContainerEntityManagerFactoryBean : Initialized JPA EntityManagerFactory for persistence unit 'default'
2024-07-04T02:37:08.707+05:30 DEBUG 10736 --- [students-management-hibernate] [  restartedMain] o.h.stat.internal.StatisticsInitiator    : Statistics initialized [enabled=true]
2024-07-04T02:37:08.763+05:30  INFO 10736 --- [students-management-hibernate] [  restartedMain] i.StatisticalLoggingSessionEventListener : Session Metrics {
    0 nanoseconds spent acquiring 0 JDBC connections;
    0 nanoseconds spent releasing 0 JDBC connections;
    0 nanoseconds spent preparing 0 JDBC statements;
    0 nanoseconds spent executing 0 JDBC statements;
    0 nanoseconds spent executing 0 JDBC batches;
    0 nanoseconds spent performing 0 L2C puts;
    0 nanoseconds spent performing 0 L2C hits;
    0 nanoseconds spent performing 0 L2C misses;
    0 nanoseconds spent executing 0 flushes (flushing a total of 0 entities and 0 collections);
    0 nanoseconds spent executing 0 pre-partial-flushes;
    0 nanoseconds spent executing 0 partial-flushes (flushing a total of 0 entities and 0 collections)
}
2024-07-04T02:37:08.768+05:30  INFO 10736 --- [students-management-hibernate] [  restartedMain] i.StatisticalLoggingSessionEventListener : Session Metrics {
    0 nanoseconds spent acquiring 0 JDBC connections;
    0 nanoseconds spent releasing 0 JDBC connections;
    0 nanoseconds spent preparing 0 JDBC statements;
    0 nanoseconds spent executing 0 JDBC statements;
    0 nanoseconds spent executing 0 JDBC batches;
    0 nanoseconds spent performing 0 L2C puts;
    0 nanoseconds spent performing 0 L2C hits;
    0 nanoseconds spent performing 0 L2C misses;
    0 nanoseconds spent executing 0 flushes (flushing a total of 0 entities and 0 collections);
    0 nanoseconds spent executing 0 pre-partial-flushes;
    0 nanoseconds spent executing 0 partial-flushes (flushing a total of 0 entities and 0 collections)
}
2024-07-04T02:37:08.881+05:30  INFO 10736 --- [students-management-hibernate] [  restartedMain] i.StatisticalLoggingSessionEventListener : Session Metrics {
    0 nanoseconds spent acquiring 0 JDBC connections;
    0 nanoseconds spent releasing 0 JDBC connections;
    0 nanoseconds spent preparing 0 JDBC statements;
    0 nanoseconds spent executing 0 JDBC statements;
    0 nanoseconds spent executing 0 JDBC batches;
    0 nanoseconds spent performing 0 L2C puts;
    0 nanoseconds spent performing 0 L2C hits;
    0 nanoseconds spent performing 0 L2C misses;
    0 nanoseconds spent executing 0 flushes (flushing a total of 0 entities and 0 collections);
    0 nanoseconds spent executing 0 pre-partial-flushes;
    0 nanoseconds spent executing 0 partial-flushes (flushing a total of 0 entities and 0 collections)
}
2024-07-04T02:37:09.075+05:30  WARN 10736 --- [students-management-hibernate] [  restartedMain] JpaBaseConfiguration$JpaWebConfiguration : spring.jpa.open-in-view is enabled by default. Therefore, database queries may be performed during view rendering. Explicitly configure spring.jpa.open-in-view to disable this warning
2024-07-04T02:37:09.710+05:30  INFO 10736 --- [students-management-hibernate] [  restartedMain] o.s.b.d.a.OptionalLiveReloadServer       : LiveReload server is running on port 35729
2024-07-04T02:37:09.760+05:30  INFO 10736 --- [students-management-hibernate] [  restartedMain] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat started on port 8080 (http) with context path '/'
2024-07-04T02:37:09.775+05:30  INFO 10736 --- [students-management-hibernate] [  restartedMain] s.StudentsManagementHibernateApplication : Started StudentsManagementHibernateApplication in 7.225 seconds (process running for 8.043)
Hibernate: 
    select
        s1_0.id,
        s1_0.name,
        s1_0.passport_number 
    from
        student s1_0 
    where
        s1_0.id=?
2024-07-04T02:37:09.901+05:30  INFO 10736 --- [students-management-hibernate] [  restartedMain] i.StatisticalLoggingSessionEventListener : Session Metrics {
    35800 nanoseconds spent acquiring 1 JDBC connections;
    0 nanoseconds spent releasing 0 JDBC connections;
    16862100 nanoseconds spent preparing 1 JDBC statements;
    6554000 nanoseconds spent executing 1 JDBC statements;
    0 nanoseconds spent executing 0 JDBC batches;
    0 nanoseconds spent performing 0 L2C puts;
    0 nanoseconds spent performing 0 L2C hits;
    0 nanoseconds spent performing 0 L2C misses;
    0 nanoseconds spent executing 0 flushes (flushing a total of 0 entities and 0 collections);
    0 nanoseconds spent executing 0 pre-partial-flushes;
    0 nanoseconds spent executing 0 partial-flushes (flushing a total of 0 entities and 0 collections)
}
2024-07-04T02:37:09.902+05:30  INFO 10736 --- [students-management-hibernate] [  restartedMain] mentHibernateApplication$$SpringCGLIB$$0 : Student id 10001 -> Optional[Student [id=10001, name=Nuwaira, passportNumber=E1234567]]
Hibernate: 
    select
        next value for student_seq
Hibernate: 
    insert 
    into
        student
        (name, passport_number, id) 
    values
        (?, ?, ?)
2024-07-04T02:37:09.996+05:30  INFO 10736 --- [students-management-hibernate] [  restartedMain] i.StatisticalLoggingSessionEventListener : Session Metrics {
    22700 nanoseconds spent acquiring 1 JDBC connections;
    0 nanoseconds spent releasing 0 JDBC connections;
    9087300 nanoseconds spent preparing 2 JDBC statements;
    3322400 nanoseconds spent executing 2 JDBC statements;
    0 nanoseconds spent executing 0 JDBC batches;
    0 nanoseconds spent performing 0 L2C puts;
    0 nanoseconds spent performing 0 L2C hits;
    0 nanoseconds spent performing 0 L2C misses;
    45913100 nanoseconds spent executing 1 flushes (flushing a total of 1 entities and 0 collections);
    0 nanoseconds spent executing 0 pre-partial-flushes;
    0 nanoseconds spent executing 0 partial-flushes (flushing a total of 0 entities and 0 collections)
}
2024-07-04T02:37:09.996+05:30  INFO 10736 --- [students-management-hibernate] [  restartedMain] mentHibernateApplication$$SpringCGLIB$$0 : Inserting -> Student [id=1, name=Kaish Alam, passportNumber=NK125376253]
Hibernate: 
    select
        s1_0.id,
        s1_0.name,
        s1_0.passport_number 
    from
        student s1_0 
    where
        s1_0.id=?
Hibernate: 
    update
        student 
    set
        name=?,
        passport_number=? 
    where
        id=?
2024-07-04T02:37:10.030+05:30  INFO 10736 --- [students-management-hibernate] [  restartedMain] i.StatisticalLoggingSessionEventListener : Session Metrics {
    89700 nanoseconds spent acquiring 1 JDBC connections;
    0 nanoseconds spent releasing 0 JDBC connections;
    5589800 nanoseconds spent preparing 2 JDBC statements;
    890600 nanoseconds spent executing 2 JDBC statements;
    0 nanoseconds spent executing 0 JDBC batches;
    0 nanoseconds spent performing 0 L2C puts;
    0 nanoseconds spent performing 0 L2C hits;
    0 nanoseconds spent performing 0 L2C misses;
    20728500 nanoseconds spent executing 1 flushes (flushing a total of 1 entities and 0 collections);
    0 nanoseconds spent executing 0 pre-partial-flushes;
    0 nanoseconds spent executing 0 partial-flushes (flushing a total of 0 entities and 0 collections)
}
2024-07-04T02:37:10.030+05:30  INFO 10736 --- [students-management-hibernate] [  restartedMain] mentHibernateApplication$$SpringCGLIB$$0 : Update 10003 -> Student [id=10001, name=Name-Updated, passportNumber=New-Passport]
Hibernate: 
    select
        s1_0.id,
        s1_0.name,
        s1_0.passport_number 
    from
        student s1_0 
    where
        s1_0.id=?
Hibernate: 
    delete 
    from
        student 
    where
        id=?
2024-07-04T02:37:10.050+05:30  INFO 10736 --- [students-management-hibernate] [  restartedMain] i.StatisticalLoggingSessionEventListener : Session Metrics {
    22500 nanoseconds spent acquiring 1 JDBC connections;
    0 nanoseconds spent releasing 0 JDBC connections;
    589800 nanoseconds spent preparing 2 JDBC statements;
    684700 nanoseconds spent executing 2 JDBC statements;
    0 nanoseconds spent executing 0 JDBC batches;
    0 nanoseconds spent performing 0 L2C puts;
    0 nanoseconds spent performing 0 L2C hits;
    0 nanoseconds spent performing 0 L2C misses;
    4332600 nanoseconds spent executing 1 flushes (flushing a total of 1 entities and 0 collections);
    0 nanoseconds spent executing 0 pre-partial-flushes;
    0 nanoseconds spent executing 0 partial-flushes (flushing a total of 0 entities and 0 collections)
}
Hibernate: 
    select
        s1_0.id,
        s1_0.name,
        s1_0.passport_number 
    from
        student s1_0
2024-07-04T02:37:10.255+05:30 DEBUG 10736 --- [students-management-hibernate] [  restartedMain] o.h.stat.internal.StatisticsImpl         : HHH000117: HQL: [CRITERIA] select s1_0.id,s1_0.name,s1_0.passport_number from student s1_0, time: 2ms, rows: 2
2024-07-04T02:37:10.256+05:30  INFO 10736 --- [students-management-hibernate] [  restartedMain] i.StatisticalLoggingSessionEventListener : Session Metrics {
    21700 nanoseconds spent acquiring 1 JDBC connections;
    0 nanoseconds spent releasing 0 JDBC connections;
    340700 nanoseconds spent preparing 1 JDBC statements;
    298100 nanoseconds spent executing 1 JDBC statements;
    0 nanoseconds spent executing 0 JDBC batches;
    0 nanoseconds spent performing 0 L2C puts;
    0 nanoseconds spent performing 0 L2C hits;
    0 nanoseconds spent performing 0 L2C misses;
    0 nanoseconds spent executing 0 flushes (flushing a total of 0 entities and 0 collections);
    9163975009101 nanoseconds spent executing 1 pre-partial-flushes;
    14100 nanoseconds spent executing 1 partial-flushes (flushing a total of 0 entities and 0 collections)
}
2024-07-04T02:37:10.256+05:30  INFO 10736 --- [students-management-hibernate] [  restartedMain] mentHibernateApplication$$SpringCGLIB$$0 : All Users -> [Student [id=1, name=Kaish Alam, passportNumber=NK125376253], Student [id=10001, name=Name-Updated, passportNumber=New-Passport]]

```
