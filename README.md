Setup Instructions
1. Clone the Repository
2. Database Setup
MySQL is used as the database in this project.
Create a database named training-centre
Update application.properties with MySQL username and password.
3. Run the Project
Open the project in an IDE.
Run the application.
4. Testing
To create a training center, use the POST API:
POST /api/training-centers
Request Body Format:
{
  "centerName": "",
  "centerCode": "",
  "address": {
    "detailedAddress": "",
    "city": "",
    "state": "",
    "pincode": ""
  },
  "studentCapacity": ,
  "coursesOffered": [],
  "contactEmail": "",
  "contactPhone": ""
}


To get the list of all the training centers, use the GET API:
GET /api/training-centers

