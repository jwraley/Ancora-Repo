-- NOTE: Remove this merge mark from Git.
-- NOTE: More info about where this came from:
-- NOTE: https://git-scm.com/docs/git-merge
--<<<<<<< HEAD
/* Purpose: (paragraph describing web site)
This site is intended to be a social network for the Catholic Community.  A place to meet new friends, see what events are happening in your community,
discuss latest news and events or to just share in the joy of the Gospel.  The goal of this site is to be a safe place to meet and exchange ideas without 
the negativity that is often found on some of the other social networks.
=======
NOTE: Please complete this assignment and turn in.
Purpose: (paragraph describing web site)
>>>>>>> 7e59f1a0c39abeeb74075b36fcb056982b30db96

Name: (unoffensive, short, memorable, and available domain netcheap.com)
CATHOLICBUDDIES.COM
Schema:

	5 tables (min) 3 columns or more of each
	
	Users:
		UserID Int 
		FName varchar(32) Not Null
		Lname varchar(32) Not Null
		email varchar(32) Not Null
		password varchar(64) Not Null

	UserLocation
		city varchar(32)
		UserState (varchar(2)
		diocese (varchar(32)
		UpdateTime datetime not null

	Comments
	   	UserID Int
		ParentID int
		CommentID Int Not Null
		Comment varchar(512) Not Null
		Offfensive boolean
		Blocked int default 0
		UpdateTime datetime Not Null

	Pictures
		UserID Int
		PhotoID Int
		Public Boolean
		TagID Int

	Messages
		SenderID Int
		RecipientID Int
		Message varchar(512) Not Null



Datatypes:

	Varchar:	variable length strings
	date:		Date
	DateTime:	Date and Time
	Boolean:	Yes and No
	Int:		whole numbers
	Money:		cha ching
	*/

--DROP DATABASE CatholicBuddies
--GO
CREATE DATABASE CatholicBuddies;
GO
USE CatholicBuddies;
GO
CREATE TABLE Users
(
UserID int not null primary key,
FName varchar(32) not null,
LName varchar(32) not null,
email varchar(32) not null,
Password varchar(64) not null
)									-- NOTE: Semicolon missing here but listed in other parts. Please fix.

CREATE TABLE UserLocation
(
UserID int not null primary key,
City varchar(32),
UserState varchar(2),
Diocese varchar(32),
UpdateTime datetime not null
);

CREATE TABLE Comments
(
CommentID int not null primary key,
ParentID int,                          
UserID int not null foreign key (UserID) references Users(UserID),
Comment varchar(512 ) not null,
Blocked int default 0,
UpdateTime datetime not null
);

CREATE TABLE Photos
(
PhotoID int not null primary key,
UserID int not null, foreign key (UserID) references Users(UserID),
Photo image not null,
UploadTime DateTime not null,
MakePublic char(1) not null,
TagID int not null
);

CREATE TABLE Messages
(
SenderID Int not null primary key,
RecipientID Int not null,
Message varchar(512) Not Null
);


