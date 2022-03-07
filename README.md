# SampleSpringBootAppMySQL
Sample Spring Boot application with MySQL DB connection

## MySQL DB Scripts
### 1. Create Database/Schema
create schema testdb

### 2. Create table
CREATE TABLE `employee` (
  `id` int NOT NULL,
  `name` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

## Postman Collection link to try out 
https://www.getpostman.com/collections/73b550cfd00f8df30291
