1) Course is a model class for Mongo DB
2) Student is a model class for Mysql
3) Student consists of firstname,lastname,email
4) course consists of name, description,email(fk from student)
5) we have to send this json object in postman   
   {
   "firstName":"shrey",
   "lastName":"saxena",
   "email":"shreyyerhs07@gmail.com",
   "courses":[{
   "name":"docker",
   "description":"docker",
   "email":""
   },{
   "name":"kubernetes",
   "description":"kubernetes",
   "email":""
}]
}


# BETTER WAY
### Above method was implemented in com.multipledatabase pakage. But it is little complicated, so a simpler version is inside com.multipledatabase.test pakage

1) City is for MysQL Ans State is for Mongo db.

