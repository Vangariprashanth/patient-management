# Patient Management System

A comprehensive microservices-based healthcare management system built with Spring Boot and modern technologies.

## Overview

This project is a robust patient management system that consists of multiple microservices handling different aspects of healthcare management, including patient records, authentication, billing, and analytics.

## Services

1. **Patient Service**
    - Manages patient records and medical information
    - Handles CRUD operations for patient data
    - RESTful API endpoints for patient management

2. **Auth Service**
    - Handles user authentication and authorization
    - JWT-based security implementation
    - User management and role-based access control

3. **Analytics Service**
    - Processes and analyzes patient data
    - Kafka integration for event streaming
    - Generates insights and reports

4. **Billing Service**
    - Manages patient billing and payments
    - Handles billing account creation and management
    - Processes payment transactions

5. **API Gateway**
    - Central entry point for all client requests
    - Request routing and load balancing
    - Request filtering and security

## Technology Stack

- **Java Version**: JDK 21 (OpenJDK)
- **Framework**: Spring Boot
- **Database**: PostgreSQL
- **Message Broker**: Apache Kafka
- **API Documentation**: Swagger/OpenAPI
- **Service Discovery**: Eureka Server
- **API Gateway**: Spring Cloud Gateway
- **Testing**: JUnit, Integration Tests
- **Build Tool**: Maven

## Project Structure

```
patient-management/
├── analytics-service/
├── api-gateway/
├── auth-service/
├── billing-service/
├── patient-service/
├── integration-tests/
├── api-requests/
└── db_volumes/
```

## Getting Started

### Prerequisites

- JDK 21
- Maven
- Docker (for running databases and Kafka)
- PostgreSQL

### Running the Application

1. Start the databases and Kafka:
   ```bash
   docker-compose up -d
   ```

2. Build all services:
   ```bash
   mvn clean install
   ```

3. Start each service in the following order:
    - Patient Service DB
    - Kafka Service
    - Auth Service
    - Patient Service
    - Billing Service
    - Analytics Service


## Testing

- Unit tests are available for each service
- Integration tests are located in the `integration-tests` directory
- API request examples are provided in the `api-requests` directory

## Features

- Secure user authentication and authorization
- Complete patient record management
- Real-time analytics and reporting
- Integrated billing system
- Scalable microservices architecture
- Event-driven architecture using Kafka
- Centralized API gateway
- Database per service pattern


