--select * from course order by credits;
--select * from Person where Discriminator = 'Student' order by LastName, FirstName;
--select * from Enrollment;
--HOW TO JOIN TABLES IN ORDER TO GET SCHEDULE
/* select Enrollment.EnrollmentID, FirstName, LastName from Enrollment
	where join Person on Person.ID = Enrollment.StudentID;   */
--select * from Enrollment;
--select * from Person;
--select * from enrollment;
--select * from course;

select Enrollment.CourseID, Course.Title, Course.Credits from Enrollment
	join Course on Course.CourseID = Enrollment.CourseID;