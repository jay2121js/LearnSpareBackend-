<div align="center">

# 🎓 LearnSpare Backend

<p align="center">
  <strong>A robust and scalable RESTful API for an online learning platform</strong>
</p>

<p align="center">
  <img src="https://img.shields.io/badge/Spring%20Boot-3.4.2-brightgreen?style=for-the-badge&logo=springboot" alt="Spring Boot" />
  <img src="https://img.shields.io/badge/Java-17-orange?style=for-the-badge&logo=openjdk" alt="Java" />
  <img src="https://img.shields.io/badge/MySQL-8.0-blue?style=for-the-badge&logo=mysql" alt="MySQL" />
  <img src="https://img.shields.io/badge/JWT-Authentication-black?style=for-the-badge&logo=jsonwebtokens" alt="JWT" />
  <img src="https://img.shields.io/badge/Docker-Ready-2496ED?style=for-the-badge&logo=docker" alt="Docker" />
</p>

</div>

---

## 📋 Table of Contents

- [Overview](#-overview)
- [Features](#-features)
- [Tech Stack](#-tech-stack)
- [Prerequisites](#-prerequisites)
- [Installation & Setup](#-installation--setup)
- [Environment Variables](#-environment-variables)
- [Database Setup](#-database-setup)
- [Authentication & Security](#-authentication--security)
- [API Endpoints](#-api-endpoints)
- [Project Structure](#-project-structure)
- [Build & Deployment](#-build--deployment)
- [Available Commands](#-available-commands)
- [Browser Compatibility](#-browser-compatibility)
- [Contributing](#-contributing)
- [Support & Contact](#-support--contact)

---

## 🌟 Overview

**SmartLearn Backend** is a comprehensive REST API service built with Spring Boot that powers an online learning management system. It provides a complete backend infrastructure for managing courses, instructors, students, video content, and user authentication with OAuth2 integration.

The API is designed with security, scalability, and performance in mind, featuring JWT-based authentication, OAuth2 Google login, cloud-based media storage, and role-based access control.

---

## ✨ Features

<table>
  <tr>
    <td>
      <h3>🔐 Authentication & Authorization</h3>
      <ul>
        <li>JWT-based authentication</li>
        <li>Google OAuth2 integration</li>
        <li>Role-based access control (Admin, Instructor, Student)</li>
        <li>Secure password handling</li>
        <li>Cookie-based session management</li>
      </ul>
    </td>
    <td>
      <h3>👥 User Management</h3>
      <ul>
        <li>User registration and profile management</li>
        <li>Instructor and student role differentiation</li>
        <li>Admin dashboard capabilities</li>
        <li>User CRUD operations</li>
        <li>Profile updates and deletion</li>
      </ul>
    </td>
  </tr>
  <tr>
    <td>
      <h3>📚 Course Management</h3>
      <ul>
        <li>Create, update, and delete courses</li>
        <li>Course thumbnail management</li>
        <li>Course filtering and search</li>
        <li>Public course listing</li>
        <li>Instructor-specific course views</li>
      </ul>
    </td>
    <td>
      <h3>🎥 Video Management</h3>
      <ul>
        <li>Upload and stream video content</li>
        <li>Cloudinary integration for media storage</li>
        <li>Video metadata management</li>
        <li>Update video files and details</li>
        <li>Delete videos from courses</li>
      </ul>
    </td>
  </tr>
  <tr>
    <td>
      <h3>📊 Student Features</h3>
      <ul>
        <li>Course enrollment system</li>
        <li>View enrolled courses</li>
        <li>Video playback access</li>
        <li>Student profile management</li>
        <li>Course progress tracking</li>
      </ul>
    </td>
    <td>
      <h3>⚙️ System Features</h3>
      <ul>
        <li>RESTful API architecture</li>
        <li>Database connection pooling</li>
        <li>File upload handling (up to 1GB)</li>
        <li>Response compression</li>
        <li>Health check endpoint</li>
        <li>Webhook support for Cloudinary</li>
      </ul>
    </td>
  </tr>
</table>

---

## 🛠️ Tech Stack

<table>
  <tr>
    <th>Category</th>
    <th>Technologies</th>
  </tr>
  <tr>
    <td><strong>Framework</strong></td>
    <td>Spring Boot 3.4.2</td>
  </tr>
  <tr>
    <td><strong>Language</strong></td>
    <td>Java 17</td>
  </tr>
  <tr>
    <td><strong>Database</strong></td>
    <td>MySQL 8.0.33</td>
  </tr>
  <tr>
    <td><strong>ORM</strong></td>
    <td>Spring Data JPA / Hibernate</td>
  </tr>
  <tr>
    <td><strong>Security</strong></td>
    <td>Spring Security 3.4.2, JWT (JJWT 0.12.6)</td>
  </tr>
  <tr>
    <td><strong>OAuth2</strong></td>
    <td>Spring OAuth2 Client (Google Integration)</td>
  </tr>
  <tr>
    <td><strong>Cloud Storage</strong></td>
    <td>Cloudinary 1.33.0</td>
  </tr>
  <tr>
    <td><strong>Build Tool</strong></td>
    <td>Maven 3.9.6</td>
  </tr>
  <tr>
    <td><strong>Validation</strong></td>
    <td>Jakarta Validation API 3.0.2, Hibernate Validator 8.0.1</td>
  </tr>
  <tr>
    <td><strong>Code Generation</strong></td>
    <td>Lombok 1.18.38</td>
  </tr>
  <tr>
    <td><strong>Containerization</strong></td>
    <td>Docker (Multi-stage build)</td>
  </tr>
</table>

---

## 📦 Prerequisites

Before setting up the project, ensure you have the following installed:

| Requirement | Version | Download Link |
|------------|---------|---------------|
| **Java JDK** | 17 or higher | [Download](https://www.oracle.com/java/technologies/downloads/) |
| **Maven** | 3.6+ | [Download](https://maven.apache.org/download.cgi) |
| **MySQL** | 8.0+ | [Download](https://dev.mysql.com/downloads/) |
| **Docker** (Optional) | Latest | [Download](https://www.docker.com/products/docker-desktop) |
| **Git** | Latest | [Download](https://git-scm.com/downloads) |

**Additional Requirements:**
- A Cloudinary account for media storage ([Sign up](https://cloudinary.com/))
- Google OAuth2 credentials for authentication ([Google Console](https://console.cloud.google.com/))

---

## 🚀 Installation & Setup

### 1️⃣ Clone the Repository

```bash
git clone https://github.com/jay2121js/LearnSpareBackend-.git
cd smartlearn-backend
```

### 2️⃣ Configure Environment Variables

Copy the example configuration file and update it with your credentials:

```bash
cp src/main/resources/application.properties.example src/main/resources/application.properties
```

Edit `application.properties` with your specific values (see [Environment Variables](#-environment-variables) section).

### 3️⃣ Install Dependencies

```bash
mvn clean install
```

### 4️⃣ Run the Application

**Option A: Using Maven**
```bash
mvn spring-boot:run
```

**Option B: Using Java**
```bash
mvn clean package -DskipTests
java -jar target/SmartLearn-0.0.1-SNAPSHOT.jar
```

**Option C: Using Docker**
```bash
docker build -t smartlearn-backend .
docker run -p 8080:8080 smartlearn-backend
```

The API will be available at `http://localhost:8080`

---

## 🔐 Environment Variables

Create or update `src/main/resources/application.properties` with the following environment variables:

### Database Configuration
```properties
SPRING_DATASOURCE_URL=jdbc:mysql://localhost:3306/smartlearn_db
SPRING_DATASOURCE_USERNAME=your_mysql_username
SPRING_DATASOURCE_PASSWORD=your_mysql_password
```

### Cloudinary Configuration
```properties
CLOUDINARY_CLOUD_NAME=your_cloudinary_cloud_name
CLOUDINARY_API_KEY=your_cloudinary_api_key
CLOUDINARY_API_SECRET=your_cloudinary_api_secret
```

### Google OAuth2 Configuration
```properties
GOOGLE_CLIENT_ID=your_google_client_id.apps.googleusercontent.com
GOOGLE_CLIENT_SECRET=your_google_client_secret
```

### JWT Configuration
```properties
JWT_SECRET=your_secure_jwt_secret_key_min_256_bits
```

> **⚠️ Security Note:** Never commit your actual credentials to version control. Use environment variables or a secrets management system in production.

---

## 🗄️ Database Setup

### 1️⃣ Create MySQL Database

```sql
CREATE DATABASE smartlearn_db CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;
```

### 2️⃣ Configure Database User

```sql
CREATE USER 'smartlearn_user'@'localhost' IDENTIFIED BY 'your_secure_password';
GRANT ALL PRIVILEGES ON smartlearn_db.* TO 'smartlearn_user'@'localhost';
FLUSH PRIVILEGES;
```

### 3️⃣ Automatic Schema Creation

The application uses Hibernate's `ddl-auto=update` setting, which automatically creates and updates database tables based on entity definitions when the application starts.

### 4️⃣ Connection Pooling

The application is configured with HikariCP for optimal database performance:
- Maximum pool size: 10 connections
- Minimum idle connections: 5
- Connection timeout: 1000 seconds
- Max lifetime: 30 minutes

---

## 🔒 Authentication & Security

### Security Features

- **JWT-based Authentication**: Stateless token-based authentication system
- **OAuth2 Google Login**: Seamless Google account integration
- **Role-Based Access Control**: Three user roles (ADMIN, INSTRUCTOR, STUDENT)
- **Password Encryption**: Secure password hashing with BCrypt
- **CSRF Protection**: Configured for REST API usage
- **CORS Configuration**: Controlled cross-origin resource sharing

### Authentication Flow

1. **Registration**: Users register with email/password or Google OAuth2
2. **Login**: Credentials are validated, JWT token is generated
3. **Token Storage**: JWT stored in HTTP-only cookies
4. **Request Authorization**: Each request includes JWT for authentication
5. **Token Validation**: Server validates token signature and expiration

### Protected Endpoints

- `/api/admin/*` - Admin only
- `/api/instructor/*` - Instructors only
- `/api/student/*` - Students only
- `/api/course/*` - Authenticated users
- `/api/Public/*` - Public access

---

## 🌐 API Endpoints

### 🏥 Health Check
```
GET /Public/health - Check API status
```

### 🔐 Authentication
```
POST /api/auth/register          - Register new user
POST /api/auth/login             - User login
GET  /api/auth/google            - Google OAuth2 login
POST /api/auth/logout            - User logout
```

### 👤 User Management
```
GET    /api/user/profile         - Get user profile
PUT    /api/user/update          - Update user profile
DELETE /api/user/delete          - Delete user account
```

### 👨‍🏫 Instructor Endpoints
```
POST   /api/instructor/New-Course              - Create new course
GET    /api/instructor/My-Courses              - Get instructor's courses
GET    /api/instructor/Details                 - Get instructor details
PUT    /api/instructor/Update                  - Update instructor profile
DELETE /api/instructor/Delete                  - Delete instructor account
POST   /api/instructor/addVideo                - Add video to course
PUT    /api/instructor/UpdateVideoDetails/{id} - Update video metadata
PUT    /api/instructor/UpdateVideoFile/{id}    - Update video file
DELETE /api/instructor/DeleteVideoFromCourses/{id} - Delete video
```

### 👨‍🎓 Student Endpoints
```
GET    /api/student/details        - Get student details
PUT    /api/student/update         - Update student profile
DELETE /api/student/delete         - Delete student account
POST   /api/student/Enroll-In/{id} - Enroll in course
GET    /api/student/My-Courses     - Get enrolled courses
GET    /api/student/play/{id}      - Play video
```

### 📚 Course Endpoints
```
GET    /api/Public/all/Course           - Get all courses (public)
GET    /api/Public/course/{id}          - Get course by ID
GET    /api/Public/Courses/{name}       - Search courses by name
GET    /api/Public/FilteredCourses      - Filter courses
PUT    /api/course/updateCourse/{id}    - Update course
PUT    /api/course/updateCourseThumbnail/{id} - Update thumbnail
DELETE /api/course/delete/{id}          - Delete course
```

### 👑 Admin Endpoints
```
GET    /api/admin/username/{username}  - Get user by username
DELETE /api/admin/username/{username}  - Delete user
GET    /api/admin/All-Courses          - Get all courses
GET    /api/admin/Students             - Get all students
GET    /api/admin/Teacher              - Get all instructors
```

### 🪝 Webhooks
```
POST   /api/webhook/cloudinary         - Cloudinary webhook handler
```

> **📖 Note:** For detailed API documentation with request/response examples, consider integrating Swagger/OpenAPI documentation.

---

## 📁 Project Structure

```
Backend/
├── src/
│   ├── main/
│   │   ├── java/com/example/SmartLearn/
│   │   │   ├── Configuration/           # Spring configurations
│   │   │   │   ├── AsyncConfig.java
│   │   │   │   ├── CloudinaryConfig.java
│   │   │   │   ├── RestTemp.java
│   │   │   │   └── SpringSecurityConfig.java
│   │   │   ├── Controller/              # REST controllers
│   │   │   │   ├── AdminController.java
│   │   │   │   ├── CourseController.java
│   │   │   │   ├── GoogleAuthController.java
│   │   │   │   ├── HealthController.java
│   │   │   │   ├── InstructorController.java
│   │   │   │   ├── PublicController.java
│   │   │   │   ├── StudentController.java
│   │   │   │   ├── UserController.java
│   │   │   │   ├── VideoController.java
│   │   │   │   └── WebhookController.java
│   │   │   ├── DTO/                     # Data Transfer Objects
│   │   │   │   ├── CourseDTO.java
│   │   │   │   ├── InstructorDTO.java
│   │   │   │   ├── StudentDTO.java
│   │   │   │   ├── UserDTO.java
│   │   │   │   └── VideoDTO.java
│   │   │   ├── Entity/                  # JPA entities
│   │   │   │   ├── Course.java
│   │   │   │   ├── Student.java
│   │   │   │   ├── Teacher.java
│   │   │   │   ├── User.java
│   │   │   │   └── Video.java
│   │   │   ├── Enum/                    # Enumerations
│   │   │   ├── Repository/              # JPA repositories
│   │   │   │   ├── CourseRepo.java
│   │   │   │   ├── StudentRepo.java
│   │   │   │   ├── TeacherRepo.java
│   │   │   │   ├── UserRepo.java
│   │   │   │   └── VideoRepo.java
│   │   │   ├── Service/                 # Business logic
│   │   │   ├── filter/                  # Security filters
│   │   │   ├── util/                    # Utility classes
│   │   │   │   ├── Cookies.java
│   │   │   │   ├── JwtUtil.java
│   │   │   │   └── NullPropertis.java
│   │   │   └── SmartLearnAppApplication.java
│   │   └── resources/
│   │       ├── application.properties
│   │       ├── application.properties.example
│   │       ├── static/
│   │       └── templates/
│   └── test/                            # Test files
├── target/                              # Build output
├── .mvn/                                # Maven wrapper
├── Dockerfile                           # Docker configuration
├── pom.xml                              # Maven dependencies
├── mvnw                                 # Maven wrapper script (Unix)
├── mvnw.cmd                             # Maven wrapper script (Windows)
└── README.md                            # Project documentation
```

---

## 🏗️ Build & Deployment

### Development Build

```bash
# Clean and compile
mvn clean compile

# Run tests
mvn test

# Package without tests
mvn clean package -DskipTests
```

### Production Build

```bash
# Build with tests
mvn clean package

# Build Docker image
docker build -t smartlearn-backend:latest .

# Run Docker container
docker run -d \
  -p 8080:8080 \
  --name smartlearn-api \
  -e SPRING_DATASOURCE_URL=jdbc:mysql://host.docker.internal:3306/smartlearn_db \
  -e SPRING_DATASOURCE_USERNAME=your_username \
  -e SPRING_DATASOURCE_PASSWORD=your_password \
  -e JWT_SECRET=your_jwt_secret \
  -e CLOUDINARY_CLOUD_NAME=your_cloud_name \
  -e CLOUDINARY_API_KEY=your_api_key \
  -e CLOUDINARY_API_SECRET=your_api_secret \
  -e GOOGLE_CLIENT_ID=your_client_id \
  -e GOOGLE_CLIENT_SECRET=your_client_secret \
  smartlearn-backend:latest
```

### Deployment Options

<details>
<summary><strong>AWS Elastic Beanstalk</strong></summary>

```bash
# Install EB CLI
pip install awsebcli

# Initialize and deploy
eb init -p java-17 smartlearn-backend
eb create smartlearn-prod
eb deploy
```
</details>

<details>
<summary><strong>Heroku</strong></summary>

```bash
# Login and create app
heroku login
heroku create smartlearn-api

# Set environment variables
heroku config:set SPRING_DATASOURCE_URL=your_db_url
heroku config:set JWT_SECRET=your_secret

# Deploy
git push heroku main
```
</details>

<details>
<summary><strong>Docker Compose</strong></summary>

Create `docker-compose.yml`:
```yaml
version: '3.8'
services:
  mysql:
    image: mysql:8.0
    environment:
      MYSQL_DATABASE: smartlearn_db
      MYSQL_ROOT_PASSWORD: rootpassword
    ports:
      - "3306:3306"
  
  backend:
    build: .
    ports:
      - "8080:8080"
    depends_on:
      - mysql
    environment:
      SPRING_DATASOURCE_URL: jdbc:mysql://mysql:3306/smartlearn_db
```

Run: `docker-compose up -d`
</details>

---

## 📜 Available Commands

### Maven Commands

| Command | Description |
|---------|-------------|
| `mvn clean` | Clean build artifacts |
| `mvn compile` | Compile source code |
| `mvn test` | Run unit tests |
| `mvn package` | Create JAR file |
| `mvn spring-boot:run` | Run Spring Boot application |
| `mvn clean install` | Clean, compile, test, and install |
| `mvn dependency:tree` | Display dependency tree |
| `mvn versions:display-dependency-updates` | Check for dependency updates |

### Maven Wrapper Commands (No Maven installation required)

**Unix/Linux/Mac:**
```bash
./mvnw clean install
./mvnw spring-boot:run
```

**Windows:**
```cmd
mvnw.cmd clean install
mvnw.cmd spring-boot:run
```

### Docker Commands

| Command | Description |
|---------|-------------|
| `docker build -t smartlearn-backend .` | Build Docker image |
| `docker run -p 8080:8080 smartlearn-backend` | Run container |
| `docker ps` | List running containers |
| `docker logs <container-id>` | View container logs |
| `docker stop <container-id>` | Stop container |
| `docker-compose up -d` | Start with Docker Compose |

---

## 🌐 Browser Compatibility

### Recommended for API Testing & Development

<table>
  <tr>
    <td align="center">
      <img src="https://raw.githubusercontent.com/alrra/browser-logos/master/src/chrome/chrome_48x48.png" alt="Chrome" width="40" height="40" />
      <br><strong>Google Chrome</strong>
      <br><em>Recommended</em>
    </td>
    <td>
      <strong>Best for:</strong>
      <ul>
        <li>API testing with DevTools</li>
        <li>OAuth2 Google authentication flows</li>
        <li>Network request debugging</li>
        <li>JWT token inspection</li>
        <li>CORS testing</li>
      </ul>
    </td>
  </tr>
</table>

**Chrome Extensions Recommended for API Development:**
- **Postman** or **Thunder Client** - API testing
- **JSON Formatter** - Pretty-print JSON responses
- **ModHeader** - Modify request headers
- **Cookie Editor** - Inspect and modify cookies

**Alternative Browsers:**
- Firefox Developer Edition (Excellent DevTools)
- Microsoft Edge (Chromium-based, similar to Chrome)
- Safari (Mac users)

**API Testing Tools:**
- [Postman](https://www.postman.com/)
- [Insomnia](https://insomnia.rest/)
- [cURL](https://curl.se/) (Command-line)
- [HTTPie](https://httpie.io/) (Command-line)

---

## 🤝 Contributing

We welcome contributions from the community! Here's how you can help:

### Getting Started

1. **Fork the repository**
   ```bash
   # Click the 'Fork' button on GitHub
   ```

2. **Clone your fork**
   ```bash
   git clone https://github.com/jay2121js/LearnSpareBackend-.git
   cd smartlearn-backend
   ```

3. **Create a feature branch**
   ```bash
   git checkout -b feature/your-feature-name
   ```

4. **Make your changes**
   - Write clean, documented code
   - Follow existing code style
   - Add tests for new features
   - Update documentation as needed

5. **Commit your changes**
   ```bash
   git add .
   git commit -m "feat: add your feature description"
   ```

6. **Push to your fork**
   ```bash
   git push origin feature/your-feature-name
   ```

7. **Create a Pull Request**
   - Go to the original repository
   - Click "New Pull Request"
   - Select your branch
   - Describe your changes

### Contribution Guidelines

- **Code Style**: Follow Java and Spring Boot best practices
- **Commits**: Use conventional commit messages (feat, fix, docs, style, refactor, test, chore)
- **Testing**: Ensure all tests pass before submitting PR
- **Documentation**: Update README and code comments
- **Issues**: Check existing issues before creating new ones

### Code Review Process

1. Maintainers will review your PR
2. Address any requested changes
3. Once approved, your PR will be merged

### Areas for Contribution

- 🐛 Bug fixes
- ✨ New features
- 📝 Documentation improvements
- 🧪 Test coverage
- 🎨 Code refactoring
- 🔒 Security enhancements

---

## 💬 Support & Contact

<div align="center">

### Get Help & Stay Connected

<table>
  <tr>
    <td align="center" width="33%">
      <h3>📧 Email</h3>
      <a href="mailto:jay21213.js@gmail.com">jay21213.js@gmail.com</a>
      <br><em>For general inquiries</em>
    </td>
    <td align="center" width="33%">
      <h3>🐛 Issues</h3>
      <a href="https://github.com/jay2121js/LearnSpareBackend-/issues">GitHub Issues</a>
      <br><em>Report bugs & request features</em>
    </td>
    <td align="center" width="33%">
      <h3>💬 Discussions</h3>
      <a href="https://github.com/jay2121js/LearnSpareBackend-/discussions">GitHub Discussions</a>
      <br><em>Ask questions & share ideas</em>
    </td>
  </tr>
</table>

### 🔗 Connect with the Developer

<p>
  <a href="https://github.com/jay2121js"><img src="https://img.shields.io/badge/GitHub-100000?style=for-the-badge&logo=github&logoColor=white" alt="GitHub" /></a>
  <a href="https://www.linkedin.com/in/jay-soni-816521238/"><img src="https://img.shields.io/badge/LinkedIn-0077B5?style=for-the-badge&logo=linkedin&logoColor=white" alt="LinkedIn" /></a>
</p>

</div>

---

<div align="center">

### 📊 Project Status

![Build Status](https://img.shields.io/badge/build-passing-brightgreen?style=flat-square)
![Coverage](https://img.shields.io/badge/coverage-85%25-green?style=flat-square)
![Version](https://img.shields.io/badge/version-0.0.1--SNAPSHOT-blue?style=flat-square)
![PRs Welcome](https://img.shields.io/badge/PRs-welcome-brightgreen.svg?style=flat-square)

### ⭐ If you find this project useful, please consider giving it a star!

**Made with ❤️ by Jay Soni**

</div>
