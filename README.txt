section-oracle, section-sql, section-database
---------------------------------------------
* created a user
create user sowjanya identified by sow_secret;

* created table book

create table sowjanya.book (
  book_id number,
  book_name varchar2(100) not null unique,
  author_name varchar2(100),
  category varchar2(100),
  cost number,
  added_date TIMESTAMP WITH TIME ZONE default current_timestamp not null,
  
  constraint book_pk primary key (book_id) using index enable
);

create sequence sowjanya.book_seq start with 1 increment by 1;

* created table address

create table sowjanya.address (
  address_id number,
  address1 varchar2(100) not null,
  address2 varchar2(100),
  city  varchar2(100) not null,
  state varchar2(100) not null,
  postal_code varchar2(100) not null,
  
  constraint address_pk primary key (address_id) using index enable
);

create sequence sowjanya.address_seq start with 1 increment by 1;

* created table member

create table sowjanya.member (
  member_id number,
  member_name varchar2(100) not null,
  address_id number,
  phone varchar2(100),
  email varchar2(100),
  username varchar2(100) not null unique,  
  join_date TIMESTAMP WITH TIME ZONE default current_timestamp not null,
  
  constraint member_pk primary key (member_id) using index enable,
  constraint member_address_id_fk foreign key(address_id) references sowjanya.address(address_id)
);

create sequence sowjanya.member_seq start with 1 increment by 1;


      
* created table books borrowed

create table sowjanya.books_borrowed (
  book_id number,
  member_id number,
  borrowed_date TIMESTAMP WITH TIME ZONE default current_timestamp not null,
  due_date TIMESTAMP WITH TIME ZONE default current_timestamp not null,
  
  constraint bb_pk primary key (book_id,member_id) using index enable,
  constraint bb_book_id_fk foreign key(book_id) references sowjanya.book(book_id),
  constraint bb_member_id_fk foreign key(member_id) references sowjanya.member(member_id)
   
);

* created table books availability

create table sowjanya.books_available (
  book_id number not null,
  num_copies number not null,
  num_available number not null,
  
  constraint ba_book_id_fk foreign key(book_id) references sowjanya.book(book_id)
);

* created table admin

create table sowjanya.admin (
  admin_id number,
  admin_name varchar2(100) not null,
  username varchar2(100) not null,
  
  constraint admin_pk primary key (admin_id) using index enable
);

create sequence sowjanya.admin_seq start with 1 increment by 1;

* auth

create table sowjanya.auth (
  username varchar2(100) not null,
  password varchar2(100) not null,
  type  varchar2(100) not null,
  constraint auth_username unique (username) using index enable
);
 
 
* grant create session to sowjanya (I had to do this because testng/spring-test gave error when I tried to run unite tests)
 
 
 DML Statements
 ---------------
 
 * GRANT UNLIMITED TABLESPACE TO sowjanya
 
 * insert into sowjanya.book (book_id, book_name, author_name, category, cost, added_date) values
	(1, 'C Programming', 'Richard Dennis', 'Computers', 20, sysdate)
	
   insert into sowjanya.book (book_id, book_name, author_name, category, cost, added_date) values
	(2, 'Math-1-1', 'Monica Rele', 'Educational', 25, sysdate)
	
	insert into sowjanya.book (book_id, book_name, author_name, category, cost, added_date) values
	(3, 'Walking with fear', 'Rod Jonson', 'Horror', 15, sysdate)
	
	insert into sowjanya.book (book_id, book_name, author_name, category, cost, added_date) values
	(4, 'Lady with slipper', 'Ana Lewis', 'Fiction', 15, sysdate)
	
	insert into sowjanya.book (book_id, book_name, author_name, category, cost, added_date) values
	(5, 'Fridays with Moore', 'Ana Lewis', 'Fiction', 15, sysdate)
	
	insert into sowjanya.book (book_id, book_name, author_name, category, cost, added_date) values
	(6, 'Best laid plans', 'Sidney Sheldon', 'Drama', 32, sysdate)
	
	insert into sowjanya.book (book_id, book_name, author_name, category, cost, added_date) values
	(7, 'If tomorrow comes', 'Sidney Sheldon', 'Fiction', 22, sysdate)
	
	insert into sowjanya.book (book_id, book_name, author_name, category, cost, added_date) values
	(8, 'Java programming', 'Bala C', 'Computers', 12, sysdate)
	
	insert into sowjanya.book (book_id, book_name, author_name, category, cost, added_date) values
	(9, 'Love you forever', 'Robert Munsch', 'Kids', 12, sysdate)
	
	insert into sowjanya.book (book_id, book_name, author_name, category, cost, added_date) values
	(10, 'Patrik', 'Jeffory Heys', 'Kids', 12.95, sysdate)
	
* insert into sowjanya.address (address_id, address1, address2, city, state, postal_code) values 
   (1, 'Winter St', 'Suite 200', 'Boston', 'MA', '02191')

  insert into sowjanya.address (address_id, address1, address2, city, state, postal_code) values 
   (2, 'Summer St', 'Apt 19', 'Boston', 'MA', '02191')
   
   insert into sowjanya.address (address_id, address1, city, state, postal_code) values 
   (3, '5 Main St', 'Weymouth', 'MA', '02160')
   
   insert into sowjanya.address (address_id, address1, city, state, postal_code) values 
   (4, '251 Cross Rd', 'Weymouth', 'MA', '02160')
   
    insert into sowjanya.address (address_id, address1, address2, city, state, postal_code) values 
   (5, '19 Hey Blvd', 'Apt 23', 'Quincy', 'MA', '02210');

* insert into sowjanya.member (member_id, member_name, address_id, phone, email, username, join_date) values 
   (1, 'Dennis Moore', 5, '6237652211', 'dennis.moore@test.com', 'dennis_moore', sysdate) 
   
 insert into sowjanya.member (member_id, member_name, address_id, phone, email, username, join_date) values 
  (2, 'Anita Moore', 5, '6237652212', 'anita.moore@test.com', 'anita_moore', sysdate)
  
insert into sowjanya.member (member_id, member_name, address_id, phone, email, username, join_date) values 
 (3, 'Mike Lawson', 1, '7621112344', 'mike.lawson@test.com', 'mike_lawson', sysdate)

insert into sowjanya.member (member_id, member_name, address_id, phone, email, username, join_date) values 
 (4, 'Julia Snider', 2, '4102117654', 'julia.snider@test.com', 'julia_snider', sysdate)
 
 insert into sowjanya.member (member_id, member_name, address_id, phone, email, username, join_date) values 
 (5, 'Bipin Shaw', 3, '2123345213', 'bipin.shaw@test.com', 'bipin_shaw', sysdate)
 
* insert into sowjanya.books_available (book_id, num_copies, num_available) values (1, 10, 10);

insert into sowjanya.books_available (book_id, num_copies, num_available) values (2, 8, 8);

insert into sowjanya.books_available (book_id, num_copies, num_available) values (3, 22, 22);

insert into sowjanya.books_available (book_id, num_copies, num_available) values (4, 1, 1);

insert into sowjanya.books_available (book_id, num_copies, num_available) values (5, 3, 3);

insert into sowjanya.books_available (book_id, num_copies, num_available) values (6, 12, 12);

insert into sowjanya.books_available (book_id, num_copies, num_available) values (7, 4, 4);

insert into sowjanya.books_available (book_id, num_copies, num_available) values (8, 1, 1);

insert into sowjanya.books_available (book_id, num_copies, num_available) values (9, 2, 2);

insert into sowjanya.books_available (book_id, num_copies, num_available) values (10, 13, 13);

* insert into sowjanya.admin (admin_id, admin_name, username) values (1, 'Richard Headly', 'richard_headly');
insert into sowjanya.admin (admin_id, admin_name, username) values (2, 'Saina Rai', 'saina_rai');

* insert into sowjanya.auth (username, password, type) values ('dennis_moore', '161ebd7d45089b3446ee4e0d86dbcf92', 'member');
insert into sowjanya.auth (username, password, type) values ('anita_moore', '161ebd7d45089b3446ee4e0d86dbcf92', 'member');
insert into sowjanya.auth (username, password, type) values ('mike_lawson', '161ebd7d45089b3446ee4e0d86dbcf92', 'member');
insert into sowjanya.auth (username, password, type) values ('julia_snider', '161ebd7d45089b3446ee4e0d86dbcf92', 'member');
insert into sowjanya.auth (username, password, type) values ('bipin_shaw', '161ebd7d45089b3446ee4e0d86dbcf92', 'member');
insert into sowjanya.auth (username, password, type) values ('richard_headly', '161ebd7d45089b3446ee4e0d86dbcf92', 'admin');
insert into sowjanya.auth (username, password, type) values ('saina_rai', '161ebd7d45089b3446ee4e0d86dbcf92', 'admin');

Calculated the MD5 using the below snippet

	try {
		String plaintext = "P@ssw0rd";
		MessageDigest m = MessageDigest.getInstance("MD5");
		m.reset();
		m.update(plaintext.getBytes());
		byte[] digest = m.digest();
		BigInteger bigInt = new BigInteger(1,digest);
		String hashtext = bigInt.toString(16);
		// Now we need to zero pad it if you actually want the full 32 chars.
		while(hashtext.length() < 32 ){
		  hashtext = "0"+hashtext;
		}	
		System.out.println("hashtext:" + hashtext);		
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
-------------MYSQL-------------------

create table book (
  book_id NUMERIC,
  book_name varchar(100) not null unique,
  author_name varchar(100),
  category varchar(100),
  cost NUMERIC,
  added_date TIMESTAMP default current_timestamp not null,
  
  primary key (book_id)
);

GRANT ALL PRIVILEGES ON test.* TO 'sowjanya'@'localhost' WITH GRANT OPTION;

insert into test.book (book_id, book_name, author_name, category, cost, added_date) values
	(1, 'C Programming', 'Richard Dennis', 'Computers', 20, NOW());
	
	
	 GRANT ALL on test.* to 'sowjanya'@'localhost' identified by 'sowjanya';
		
		
----------------------------------------

pwd - /Users/sowjanya/personal/sow-codebase/workspace-template

* Create a java project using maven

  1) mvn archetype:generate -DgroupId=com.sow -DartifactId=biblioService -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false		
  2) Opened eclipse and imported the project as maven project.
  3) Added required dependencies to pom.xml. While doing this got error for jta dependency, to resolve this added <pluginRepositories>. (see towards end of pom.xml)
  4) mvn clean install
  5) Create the required classes
  
* Create a spring web project using maven

  1) mvn archetype:generate -DgroupId=com.sow -DartifactId=biblio-ui -DarchetypeArtifactId=maven-archetype-webapp -DinteractiveMode=false
  2) Imported the project into eclipse.
  3) Added welcome file entry in web.xml for index.jsp (the jsp is already created as part of step 1).
  4) Added server and added the webapp.
  5) Tested that the jsp is displayed in browser.
  3) In the src/main folder create java folder. (Or if it is already created then ignore it)
  4) Modified the web.xml to use 3.0 instead of 2.3
  5) Modified pom.xml to add compiler plugin.
  6) Added this to pom.xml
  		<dependency>    
            <groupId>javax.servlet</groupId>
            <artifactId>javax.servlet-api</artifactId>
            <version>3.0.1</version>
            <scope>provided</scope>
        </dependency>
  7) created a servlet and executed.
  
  For adding spring MVC support
  
   1) Added spring dependencies to pom.xml.
   3) Added 
   2) Created a spring controller.
   
   

   Hemato Project
   -----------------
   
   GitHub login details: kollis/S1
   
   https://github.com/kollis/sow-hemato
   
   https://guides.github.com/introduction/getting-your-project-on-github/index.html
   
   https://help.github.com/articles/adding-an-existing-project-to-github-using-the-command-line

   Commiting the initial project - 
   
   1) cd /Users/sowjanya/personal/sow-codebase/workspace-template/hemato
   2) git init
   3) git add .
   4) git commit -m 'First commit'
   5) git remote add origin https://github.com/kollis/sow-hemato.git
   6) git remote -v
   7) git push origin master
   
   Changed few files and then commited to remote respository - 
   
   git status   
   git add .
   git commit -a -m 'Second commit'
   git push
   
   To overwrite local file with file in repository - git checkout src/main/java/com/sow/hemato/mvc/controller/SampleController.java
   
   (for removing files from git use rm, for example to remove H.class - git rm H.class)
   
   
   Mongo
   -------
   
   http://docs.mongodb.org/manual/
   
   http://docs.mongodb.org/manual/tutorial/create-a-unique-index/
   
   1) Start mongo - /usr/local/mongodb/bin/mongod
   
   2) Opened mango shell by typing - mongo
   
   3) show dbs - this will show the available dbs
   
   4) use hematodb (if there is a hematodb it will be used, else a new one will be created)
   
   5) db - this will print the database that is being used
   
   6) show collections - this will print the collections inside the connected db
   
   7) db.inventory.insert( {group: "A+", quantity: 25, bloodBank: "Suraksha", city:"Hyderabad" } ) 
   
   8) db.inventory.find() - this will list all the documents in the collection "inventory"
   
   9)  db.inventory.remove() - this will remove all the documents in the collection "inventory"
   
   10) db.inventory.insert( { _id: 1, group: "A+", quantity: 25, bloodBank: "Suraksha", city:"Hyderabad" } ) 
	   db.inventory.insert( { _id: 2, group: "B-", quantity: 12, bloodBank: "Pranadatha", city:"Hyderabad" } ) 
	   db.inventory.insert( { _id: 3, group: "O+", quantity: 8, bloodBank: "NTR", city:"Hyderabad" } ) 
   
   11) db.donors.ensureIndex({mobileNumber:1}, {unique:true}) - This will make sure mobileNumber is unique in a collection.
   
   12) db.inventory.find({},{bloodBank:1, _id:0}) - This is equal to select bloodBank from inventory;
