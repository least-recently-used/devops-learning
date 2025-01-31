# devops-learning
Everything related to devOps complete workflow.

1. Created a Springboot Application.
2. CRUD operations, integration with Mysql DB.
3. Git Options: ci.yml configuration to trigger the build job with each push.
4. Introduced Docker: DockerFiler, docker-compose.yml to create the images and run containers.
5. Got understanding of volumes and networks.
     - volumes: where the data is stored, e.g to customize storage volume for mysql.
     - networks: different networks can be created e.g. frontend-nw, backend-nw
     - where fe nw will be having connectivity b/w frontend and backend app and backend-nw is for backend and db connectivity. this is for security purpose so that frontend-nw could not connect directly to db.
