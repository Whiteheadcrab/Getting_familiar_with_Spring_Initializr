This is Spring application created by using Spring Initializr .
Link: https://start.spring.io/

As a database for this object we book/authors database using h2 technologies.

Information about database 
Database : H2
Relation : ManyToMany
Tables : Author , Book , Author_Book (this table is showing relations ManyToMany between Book and Author)
Variables : Author : ID , First_Name , Last_Name
	    Book : ID , ISBN , PUBLISHER , TITLE	
	    Authors : BOOK_ID , AUTHOR_ID


Used Technologies : Web , JPA , H2 , Thymeleaf , Actuator