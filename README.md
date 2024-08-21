![image](https://github.com/user-attachments/assets/29b326f0-4484-48d8-978a-940b7a4ef80d)Spring Boot Application

This Spring Boot application connects to a PostgreSQL database using JDBC and uses JOOQ to generate Java models directly from the database schema.

Key Features
    
    JDBC to PostgreSQL: Connects directly to your PostgreSQL database using JDBC.
    JOOQ for Model Generation: Automatically generates Java models based on your database schema with JOOQ.

Getting Started
Prerequisites

    Java 17
    PostgreSQL: Ensure your PostgreSQL database is running and you have the necessary credentials.
    Maven

Setup

    Configure Database:

        Update the application.properties or application.yml with your PostgreSQL details:

        properties

        spring.datasource.url=jdbc:postgresql://localhost:5432/your_database
        spring.datasource.username=your_username
        spring.datasource.password=your_password

    Build the Project:
        Run mvn clean install to build the project and generate JOOQ models.

 Empty Database
 ![image](https://github.com/user-attachments/assets/6c258f9c-cbdb-490d-bd6f-3239b3d3921e)
Spring Boot App Running
![image](https://github.com/user-attachments/assets/b801476c-d53d-40d7-b1a7-85d69aec4c9d)
After running the project at: 
	
 	https://github.com/ConnorL344/csv-processing/tree/master
  Console output -
  ![image](https://github.com/user-attachments/assets/e66600b5-3eb5-4e36-b75e-441517c6d7e9)

  DB Populated:
  ![image](https://github.com/user-attachments/assets/963d4b3d-cba2-445f-bb8f-4ef7639b7bcc)



Notes

    The JOOQ models are generated automatically during the build process and can be found in target/generated-sources.
    Make sure your PostgreSQL and database settings are correct before running the app.
