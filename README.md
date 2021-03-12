# ms employee

Prerequisite
- Java JDK 1.8 or higher (verify by command : java -version)
- MAVEN 3.2 or higher (verify by command : mvn -vesion)
- MySQL DB
- Java IDE (Eclipse IDE, NetBeans or IntelliJ IDEA)



1. Clone source code to local.
2. Run Sql file Create create_table_pegawai.sql
3. Modify file application.properties under src/main/resources ( based on username and password MySql DB)
4. Build the source by command : mvn clean install
5. After build success, run app by command : mvn spring-boot:run
6. After application started, try to access url by curl command: 
   curl -X GET "http://localhost:8081/employee/find?userId=1"     (find Employee by userId)
