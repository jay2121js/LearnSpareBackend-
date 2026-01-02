<div align="center">

<h1>🎓 LearnSpare Backend</h1>

<p><strong>A robust and scalable RESTful API for an online learning platform</strong></p>

<p>
  Spring Boot · Java 17 · MySQL · JWT · OAuth2 · Docker
</p>

</div>

<hr/>

<h2>🌟 Overview</h2>

<p>
<strong>LearnSpare Backend</strong> is a Spring Boot–based RESTful API that powers an online learning management system.
It provides secure authentication, role-based access, course & video management, and cloud media storage.
</p>

<hr/>

<h2>✨ Features</h2>

<h3>🔐 Authentication & Security</h3>
<ul>
  <li>JWT-based authentication</li>
  <li>Google OAuth2 login</li>
  <li>Role-based access (ADMIN, INSTRUCTOR, STUDENT)</li>
  <li>BCrypt password encryption</li>
  <li>HTTP-only cookies, CORS & CSRF configuration</li>
</ul>

<h3>👥 User & Course Management</h3>
<ul>
  <li>User registration and profile management</li>
  <li>Instructor & student role separation</li>
  <li>Create, update, delete courses</li>
  <li>Public course listing and search</li>
</ul>

<h3>🎥 Video Management</h3>
<ul>
  <li>Upload and stream videos</li>
  <li>Cloudinary integration</li>
  <li>Update and delete video content</li>
</ul>

<h3>👨‍🎓 Student Features</h3>
<ul>
  <li>Course enrollment</li>
  <li>View enrolled courses</li>
  <li>Video playback access</li>
</ul>

<hr/>

<h2>🛠️ Tech Stack</h2>

<table border="1" cellpadding="8" cellspacing="0">
  <tr>
    <th>Category</th>
    <th>Technology</th>
  </tr>
  <tr>
    <td>Framework</td>
    <td>Spring Boot 3.4.2</td>
  </tr>
  <tr>
    <td>Language</td>
    <td>Java 17</td>
  </tr>
  <tr>
    <td>Database</td>
    <td>MySQL 8</td>
  </tr>
  <tr>
    <td>Security</td>
    <td>Spring Security, JWT</td>
  </tr>
  <tr>
    <td>OAuth2</td>
    <td>Google OAuth2</td>
  </tr>
  <tr>
    <td>Cloud Storage</td>
    <td>Cloudinary</td>
  </tr>
  <tr>
    <td>Build Tool</td>
    <td>Maven</td>
  </tr>
  <tr>
    <td>Container</td>
    <td>Docker</td>
  </tr>
</table>

<hr/>

<h2>🚀 Getting Started</h2>

<h3>Clone</h3>
<pre>
git clone https://github.com/jay2121js/LearnSpareBackend-.git
cd LearnSpareBackend
</pre>

<h3>Configure</h3>
<pre>
cp src/main/resources/application.properties.example \
   src/main/resources/application.properties
</pre>

<h3>Run</h3>
<pre>
mvn clean install
mvn spring-boot:run
</pre>

<h3>Docker</h3>
<pre>
docker build -t learnspare-backend .
docker run -p 8080:8080 learnspare-backend
</pre>

<p>API available at <code>http://localhost:8080</code></p>

<hr/>

<h2>🔐 Required Environment Variables</h2>

<pre>
SPRING_DATASOURCE_URL=jdbc:mysql://localhost:3306/smartlearn_db
SPRING_DATASOURCE_USERNAME=your_username
SPRING_DATASOURCE_PASSWORD=your_password

JWT_SECRET=your_jwt_secret

CLOUDINARY_CLOUD_NAME=your_cloud_name
CLOUDINARY_API_KEY=your_api_key
CLOUDINARY_API_SECRET=your_api_secret

GOOGLE_CLIENT_ID=your_client_id
GOOGLE_CLIENT_SECRET=your_client_secret
</pre>

<hr/>

<h2>🌐 API Overview</h2>

<h3>Authentication</h3>
<pre>
POST /api/auth/register
POST /api/auth/login
GET  /api/auth/google
POST /api/auth/logout
</pre>

<h3>Instructor</h3>
<pre>
POST /api/instructor/New-Course
GET  /api/instructor/My-Courses
POST /api/instructor/addVideo
DELETE /api/instructor/DeleteVideoFromCourses/{id}
</pre>

<h3>Student</h3>
<pre>
POST /api/student/Enroll-In/{id}
GET  /api/student/My-Courses
GET  /api/student/play/{id}
</pre>

<h3>Admin</h3>
<pre>
GET    /api/admin/All-Courses
GET    /api/admin/Students
DELETE /api/admin/username/{username}
</pre>

<h3>Public</h3>
<pre>
GET /Public/health
GET /api/Public/all/Course
GET /api/Public/course/{id}
</pre>

<hr/>

<h2>📁 Project Structure</h2>

<pre>
src/main/java/com/example/SmartLearn/
├── Controller
├── Service
├── Repository
├── Entity
├── DTO
├── Configuration
├── util
└── SmartLearnAppApplication.java
</pre>

<hr/>

<h2>🤝 Contributing</h2>

<ul>
  <li>Fork the repository</li>
  <li>Create a feature branch</li>
  <li>Write clean, documented code</li>
  <li>Submit a Pull Request</li>
</ul>

<hr/>

<h2>💬 Support</h2>

<ul>
  <li>Email: <a href="mailto:jay21213.js@gmail.com">jay21213.js@gmail.com</a></li>
  <li>GitHub Issues for bugs and feature requests</li>
</ul>

<hr/>

<div align="center">
  <p><strong>⭐ If you find this project useful, give it a star</strong></p>
  <p>Made by Jay Soni</p>
</div>
