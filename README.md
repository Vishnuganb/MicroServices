# MicroServices
This repository hosts a microservices project designed for scalability and modularity, focusing on Customer, Fraud Detection, and Notification services. Leveraging advanced technologies, including Apache Kafka, OpenFeign, Eureka, and Kubernetes, we've crafted a resilient and efficient distributed system.

Key Technologies:

Apache Kafka: Facilitates real-time event streaming for seamless communication between microservices.
OpenFeign: Simplifies RESTful service communication through a declarative approach.
Eureka: Implements a service registry for dynamic load balancing and routing within the microservices ecosystem.
Kubernetes: Orchestrates containerized applications, automating deployment, scaling, and management.
Services Overview:

Customer Service: Manages customer-related functionalities, ensuring a personalized and responsive experience.
Fraud Detection Service: Utilizes advanced algorithms to detect and prevent fraudulent activities, enhancing system security.
Notification Service: Handles real-time notifications, ensuring timely communication with users.
How to Run:

Ensure Docker, Kubernetes, and dependencies are installed.
Run ./deploy.sh for deploying microservices on your Kubernetes cluster.
