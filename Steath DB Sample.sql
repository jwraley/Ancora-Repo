/* (how to create db & tables)
DROP DATABASE StealthAircraft
GO
CREATE DATABASE StealthAircraft;
GO
USE StealthAircraft;
GO
CREATE TABLE Users
(
UserID int not null primary key,
FName varchar(32) not null,
LName varchar(32) not null,
UserName varchar(16) not null,
Password varchar(64) not null,
UpdateTime datetime not null,
);

CREATE TABLE Comments
(
CommentID int not null primary key,
ParentID int,                           /* Null = Top Comment          */
UserID int not null foreign key (UserID) references Users(UserID),
Comment varchar(512 ) not null,
Blocked int default 0,
UpdateTime datetime not null
);

CREATE TABLE Aircraft
(
AircraftID int not null primary key,
Make int not null,
Model varchar(32),
Year Date not null,
Wingspan float,              /* Meters */
NickName varchar(32),        /* EX: Enola Gaye   */
LastAction Date,
UpdateTime datetime not null,
);

   How to alter tables */

USE StealthAircraft;
Go
-- ALTER TABLE Aircraft ADD  NonFatalCrashes int;
-- ALTER TABLE Aircraft ADD FatalCrashes int;
-- ALTER TABLE Aircraft Alter Column NickName DateTime NOT NULL;
-- ALTER TABLE Aircraft Drop Column NickName;
ALTER TABLE Aircraft
ADD CONSTRAINT UserID FOREIGN KEY (Make)
REFERENCES Users (UserID);